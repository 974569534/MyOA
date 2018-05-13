package org.java.util;

import java.util.List;

public class Mail {
	
	// 发件人的 邮箱 和 密码（替换为自己的邮箱和密码）
    // PS: 某些邮箱服务器为了增加邮箱本身密码的安全性，给 SMTP 客户端设置了独立密码（有的邮箱称为“授权码”）, 
    //     对于开启了独立密码的邮箱, 这里的邮箱密码必需使用这个独立密码（授权码）。
    public String myEmailAccount = "james_ykx@163.com";
    public String myEmailPassword = "wa1326547";

    // 发件人邮箱的 SMTP 服务器地址, 必须准确, 不同邮件服务器地址不同, 一般(只是一般, 绝非绝对)格式为: smtp.xxx.com
    // 网易163邮箱的 SMTP 服务器地址为: smtp.163.com
    public String myEmailSMTPHost = "smtp.163.com";

    @Override
	public String toString() {
		return "Mail [myEmailAccount=" + myEmailAccount + ", myEmailPassword="
				+ myEmailPassword + ", myEmailSMTPHost=" + myEmailSMTPHost
				+ ", receiveMailAccount=" + receiveMailAccount + ", toAddress="
				+ toAddress + ", attachFileNames=" + attachFileNames + "]";
	}

	public String getMyEmailAccount() {
		return myEmailAccount;
	}

	public void setMyEmailAccount(String myEmailAccount) {
		this.myEmailAccount = myEmailAccount;
	}

	public String getMyEmailPassword() {
		return myEmailPassword;
	}

	public void setMyEmailPassword(String myEmailPassword) {
		this.myEmailPassword = myEmailPassword;
	}

	public String getMyEmailSMTPHost() {
		return myEmailSMTPHost;
	}

	public void setMyEmailSMTPHost(String myEmailSMTPHost) {
		this.myEmailSMTPHost = myEmailSMTPHost;
	}

	// 收件人邮箱（替换为自己知道的有效邮箱）
    public String receiveMailAccount;
    
    public List<String> toAddress;
    
    // 附件的文件名
    public List<String> attachFileNames;
	
    public List<String> getAttachFileNames() {
		return attachFileNames;
	}

	public void setAttachFileNames(List<String> attachFileNames) {
		this.attachFileNames = attachFileNames;
	}

	public String getReceiveMailAccount() {
		return receiveMailAccount;
	}

	public void setReceiveMailAccount(String receiveMailAccount) {
		this.receiveMailAccount = receiveMailAccount;
	}

	public List<String> getToAddress() {
		return toAddress;
	}

	public void setToAddress(List<String> toAddress) {
		this.toAddress = toAddress;
	}
	
	
	

}
