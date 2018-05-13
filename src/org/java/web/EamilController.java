package org.java.web;


import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Random;

import org.java.entity.Eamil;
import org.java.entity.Emailtouser;
import org.java.service.impl.EamilServiceImpl;
import org.java.service.impl.EamilToUserServiceImpl;
import org.java.util.Mail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;



@Controller
public class EamilController {
	
	private static final ServletResponse HttpServletResponse = null;

	@Autowired
	private EamilServiceImpl eamilController;
	
	@Autowired
	private EamilToUserServiceImpl eamilToUserController;
	
	@Autowired 
	private HttpServletRequest req;
	
	
	private Eamil eamil = new Eamil();
	
	private Mail mail = new Mail();
	
	private Random rand = new Random();
	
	/**
	 * 发送一份新邮件
	 * @param people 	收件人
	 * @param title  	标题
	 * @param content	内容
	 * @param add		
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/addEamil")
	public String insert(String people, String title, String content,String add, String draft) throws Exception{
		
		
		int eamilId = rand.nextInt(100000000);
		
		String str = title.substring(0,title.lastIndexOf(","));
		String[] c = content.split("/p>");
		String con = "";
		for (int i = 0; i < c.length; i++) {
			String cont = c[i].substring(3,c[i].lastIndexOf("<"));
			con+=cont;
		}
		
		
		Emailtouser emailtouser = new Emailtouser();
		
		eamil.setEamilid(eamilId);
		eamil.setFromuserid("b097ded0-a229-1036-9fec-66e96024916e");
		eamil.setTitle(str);
		eamil.setEamilcontent(con);
		eamil.setRecordtime(new Date());
		
		emailtouser.setEamilid(eamilId);
		emailtouser.setUserid("b098710c-a229-1036-9fec-66e96024916e");
		emailtouser.setIfdel(0);
		emailtouser.setIfread(0);
		
		System.out.println(add);
		System.out.println(draft);
		if(add!=null){
			eamil.setIfpublish(1);
		}
		if(draft!=null){
			eamil.setIfpublish(2);
		}
		
		
		mail.setReceiveMailAccount(people);

		// 1. 创建参数配置, 用于连接邮件服务器的参数配置
        Properties props = new Properties();                    // 参数配置
        props.setProperty("mail.transport.protocol", "smtp");   // 使用的协议（JavaMail规范要求）
        props.setProperty("mail.smtp.host", mail.getMyEmailSMTPHost());   // 发件人的邮箱的 SMTP 服务器地址
        props.setProperty("mail.smtp.auth", "true");            // 需要请求认证

        // PS: 某些邮箱服务器要求 SMTP 连接需要使用 SSL 安全认证 (为了提高安全性, 邮箱支持SSL连接, 也可以自己开启),
        //     如果无法连接邮件服务器, 仔细查看控制台打印的 log, 如果有有类似 “连接失败, 要求 SSL 安全连接” 等错误,
        //     打开下面 /* ... */ 之间的注释代码, 开启 SSL 安全连接。
        /*
        // SMTP 服务器的端口 (非 SSL 连接的端口一般默认为 25, 可以不添加, 如果开启了 SSL 连接,
        //                  需要改为对应邮箱的 SMTP 服务器的端口, 具体可查看对应邮箱服务的帮助,
        //                  QQ邮箱的SMTP(SLL)端口为465或587, 其他邮箱自行去查看)
        final String smtpPort = "465";
        props.setProperty("mail.smtp.port", smtpPort);
        props.setProperty("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        props.setProperty("mail.smtp.socketFactory.fallback", "false");
        props.setProperty("mail.smtp.socketFactory.port", smtpPort);
        */

        // 2. 根据配置创建会话对象, 用于和邮件服务器交互
        Session session = Session.getInstance(props);
        session.setDebug(true);                                 // 设置为debug模式, 可以查看详细的发送 log

        // 3. 创建一封邮件
        MimeMessage message = createMimeMessage(session, mail.getMyEmailAccount(), mail.getReceiveMailAccount());

        // 4. 根据 Session 获取邮件传输对象
        Transport transport = session.getTransport();

        // 5. 使用 邮箱账号 和 密码 连接邮件服务器, 这里认证的邮箱必须与 message 中的发件人邮箱一致, 否则报错
        // 
        //    PS_01: 成败的判断关键在此一句, 如果连接服务器失败, 都会在控制台输出相应失败原因的 log,
        //           仔细查看失败原因, 有些邮箱服务器会返回错误码或查看错误类型的链接, 根据给出的错误
        //           类型到对应邮件服务器的帮助网站上查看具体失败原因。
        //
        //    PS_02: 连接失败的原因通常为以下几点, 仔细检查代码:
        //           (1) 邮箱没有开启 SMTP 服务;
        //           (2) 邮箱密码错误, 例如某些邮箱开启了独立密码;
        //           (3) 邮箱服务器要求必须要使用 SSL 安全连接;
        //           (4) 请求过于频繁或其他原因, 被邮件服务器拒绝服务;
        //           (5) 如果以上几点都确定无误, 到邮件服务器网站查找帮助。
        //
        //    PS_03: 仔细看log, 认真看log, 看懂log, 错误原因都在log已说明。
        transport.connect(mail.getMyEmailAccount(), mail.getMyEmailPassword());

        // 6. 发送邮件, 发到所有的收件地址, message.getAllRecipients() 获取到的是在创建邮件对象时添加的所有收件人, 抄送人, 密送人
        transport.sendMessage(message, message.getAllRecipients());

        // 7. 关闭连接
        transport.close();
        
		int n = eamilController.insert(eamil);
		int nn = eamilToUserController.insert(emailtouser);
		if(n==1&&nn==1){
			System.out.println("添加成功!");
		}else{
			System.out.println("添加失败!");
		}
	    
		return "/mail_inbox";
	}
	
	/**
     * 创建一封只包含文本的简单邮件
     *
     * @param session 和服务器交互的会话
     * @param sendMail 发件人邮箱
     * @param receiveMail 收件人邮箱
     * @return
     * @throws Exception
     */
    public MimeMessage createMimeMessage(Session session, String sendMail, String receiveMail) throws Exception {
        // 1. 创建一封邮件
        MimeMessage message = new MimeMessage(session);

        // 2. From: 发件人（昵称有广告嫌疑，避免被邮件服务器误认为是滥发广告以至返回失败，请修改昵称）
        message.setFrom(new InternetAddress(sendMail, eamil.getFromuserid(), "UTF-8"));

        // 3. To: 收件人（可以增加多个收件人、抄送、密送）
        message.setRecipient(MimeMessage.RecipientType.TO, new InternetAddress(receiveMail, "小李子", "UTF-8"));

        // 4. Subject: 邮件主题（标题有广告嫌疑，避免被邮件服务器误认为是滥发广告以至返回失败，请修改标题）
        message.setSubject(eamil.getTitle(), "UTF-8");
        
//        MimeMultipart mainPart = new MimeMultipart(); 
//        
//        MimeBodyPart html = new MimeBodyPart();
        
        // 5. Content: 邮件正文（可以使用html标签）（内容有广告嫌疑，避免被邮件服务器误认为是滥发广告以至返回失败，请修改发送内容）
        message.setContent(eamil.getEamilcontent(), "text/html;charset=UTF-8");
        
//        html.setContent(eamil.getEamilcontent(),"text/html;charset=UTF-8");
//        
//        mainPart.addBodyPart(html);
//        
//        if(mail.getAttachFileNames()!=null){
//        	List<String> attachFileNames = mail.getAttachFileNames();
//        	for (String path : attachFileNames) {
//				html = new MimeBodyPart();
//				FileDataSource fds = new FileDataSource(path);
//				html.setDataHandler(new DataHandler(fds));
//				String fileName = MimeUtility.encodeText(fds.getName());
//				html.setFileName(fileName);
//				mainPart.addBodyPart(html);
//			}
//        }
        
       //将MiniMultipart对象设置为邮件内容
       // message.setContent(mainPart);
        
        // 6. 设置发件时间
        message.setSentDate(eamil.getRecordtime());

        // 7. 保存设置
        message.saveChanges();

        return message;
    }
    
    
    
    
    //查看所有邮件
    @RequestMapping("/selectAll")
    @ResponseBody
    public List<Map<String, Object>> selectAll(){
    	System.out.println(">>>>>查看所有邮件");
    	List<Map<String, Object>> map = eamilController.selectAll("b097ded0-a229-1036-9fec-66e96024916e");
    	
    	System.out.println(map);
    	
    	return map;
    }
    
    
    private Emailtouser record = new Emailtouser();
    //查看邮件详细信息
    @RequestMapping("/selectDetails")
    public String selectDetails(Integer eamilId,Model model){
    	
    	
    	record.setEamilid(eamilId);
    	record.setUserid("b098710c-a229-1036-9fec-66e96024916e");
    	
    	int n = eamilToUserController.updateByEmailId(record);
    	if(n==1){
    		System.out.println("修改成功");
    	}else{
    		System.out.println("修改失败");
    	}

    	Map<String, Object> map = eamilController.selectByDetails("b097ded0-a229-1036-9fec-66e96024916e",eamilId);
    	model.addAttribute("map", map);
    	

    	return "/mail_detail";
    }
    
   
    //是否删除邮件
    @RequestMapping("del")
    public @ResponseBody String del(Integer eamilId) throws Exception{
    	
    	System.out.println(eamilId);
    	if(eamilId!=null){
    		record.setEamilid(eamilId);
			record.setUserid("b098710c-a229-1036-9fec-66e96024916e");
			int n = eamilToUserController.updateDelEamilId(record);
	    	if(n==1){
	    		System.out.println("删除成功");
	    	}else{
	    		System.out.println("删除失败");
	    	}
	    	return "/mail_draftbox";
    	}else{
    	String values = req.getParameter("values");
    	System.out.println(values);
    	String str = values.substring(1,values.lastIndexOf("]"));
    	String [] val=str.split(",");
    	for (int i = 0; i < val.length; i++) {
			int j = Integer.parseInt(val[i].substring(1,val[i].length()-1));
			System.out.println(j);
			record.setEamilid(j);
			record.setUserid("b098710c-a229-1036-9fec-66e96024916e");
			int n = eamilToUserController.updateDelEamilId(record);
	    	if(n==1){
	    		System.out.println("删除成功");
	    	}else{
	    		System.out.println("删除失败");
	    	}
		}
    		return "/mail_inbox";
    	}
    	
    }
    
}
