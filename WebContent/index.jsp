<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="css/base.css" />
<link rel="stylesheet" type="text/css" href="css/jquery.dialog.css" />
<link rel="stylesheet" href="css/index.css" />
<title>Insert title here</title>
</head>
<body>
<div id="container">
	<div id="hd">
    	<div class="hd-wrap ue-clear">
        	<div class="top-light"></div>
            <h1 class="logo"></h1>
            <div class="login-info ue-clear">
                <div class="welcome ue-clear"><span>欢迎您,</span><a href="javascript:;" class="user-name">Admin</a></div>
                <div class="login-msg ue-clear">
                    <a href="javascript:;" class="msg-txt">消息</a>
                    <a href="javascript:;" class="msg-num">10</a>
                </div>
            </div>
            <div class="toolbar ue-clear">
                <a href="javascript:;" date-src="home.jsp"  class="home-btn">首页</a>
                <a href="javascript:;" class="quit-btn exit"></a>
            </div>
        </div>
    </div>
    <div id="bd">
    	<div class="wrap ue-clear">
        	<div class="sidebar">
            	<h2 class="sidebar-header"><p>功能导航</p></h2>
                <ul class="nav">
                	 <li class="office current">
                    	<div class="nav-header"><a href="javascript:;" date-src="home.jsp" class="ue-clear"><span>组织机构管理</span><i class="icon"></i></a></div>
                        <ul class="subnav">
                        	<li><a href="javascript:;" date-src="info-depart.jsp" id="depart">部门管理</a></li>
                            <li><a href="javascript:;" date-src="info-reg.jsp">员工管理</a></li>
                        </ul>
                    
                    </li>
                       <li class="email">
                       	<div class="nav-header"><a href="javascript:;"  date-src="home.jsp" class="ue-clear"><span>邮件管理</span><i class="icon"></i></a></div>
                       	 <ul class="subnav">
                        	<li><a href="javascript:;" date-src="mail_sent.jsp">已发送</a></li>
                            <li><a href="javascript:;" date-src="mail_inbox.jsp">收件箱</a></li>
                            <li><a href="javascript:;" date-src="mail_outbox.jsp">写邮件</a></li>
                            <li><a href="javascript:;" date-src="mail_deleted.jsp">已删除</a></li>
                            <li><a href="javascript:;" date-src="mail_draftbox.jsp">草稿箱</a></li>
                        </ul>
                       	
                       </li>
                       
                                <li class="konwledge">
                                	<div class="nav-header"><a href="javascript:;" date-src="home.jsp" class="ue-clear"><span>公文收发</span><i class="icon"></i></a></div>
                                		 <ul class="subnav">
                        	<li><a href="javascript:;" date-src="info-det.jsp">公文审核</a></li>
                            <li><a href="javascript:;" date-src="form.jsp">公文列表</a></li>
                            <li><a href="javascript:;" date-src="form.jsp">公文草拟</a></li>
                        </ul>
                                	
                               </li>
                       
                	<li class="agency">
                		<div class="nav-header"><a href="javascript:;" date-src="home.jsp" class="ue-clear"><span>文档中心</span><i class="icon"></i></a></div>
                				 <ul class="subnav">
                        	<li><a href="javascript:;" date-src="form.jsp">资料中心</a></li>
                            <li><a href="javascript:;" date-src="form.jsp">回收站</a></li>
                    
                        </ul>
                		
                	</li>
                	
                	 
                     
                     
                       <li class="datestyle">
                    	<div class="nav-header"><a href="javascript:;" date-src="home.jsp" class="ue-clear"><span>事务管理</span><i class="icon"></i></a></div>
                        <ul class="subnav">
                        	<li><a href="javascript:;" date-src="date.jsp">日程管理</a></li>
                          
                        </ul>
                    </li>
                	
           
                   
                      <li class="nav-info"><div class="nav-header"><a href="javascript:;" date-src="home.jsp" class="ue-clear"><span>个人设置</span><i class="icon"></i></a></div></li>
                     
                    
                 
                    <li class="system">
                    	<div class="nav-header"><a href="javascript:;" date-src="home.jsp" class="ue-clear"><span>系统管理</span><i class="icon"></i></a></div>
                    	 <ul class="subnav">
                        	<li><a href="javascript:;" date-src="info-mgt.jsp">角色管理</a></li>
                        	<li><a href="javascript:;" date-src="date.jsp">分配角色</a></li>
                                      
                        </ul>
                    	
                    </li>
                     
                  
               
              </ul>
            </div>
            <div class="content">
            	<iframe src="home.jsp" id="iframe" width="100%" height="100%" frameborder="0"></iframe>
            </div>
        </div>
    </div>
    <div id="ft" class="ue-clear">
    	<div class="ft-left">
            <span>OA办公管理</span>
            <em>Office&nbsp;System</em>
        </div>
        <div class="ft-right">
            <span>Automation</span>
            <em>V2.0&nbsp;2014</em>
        </div>
    </div>
</div>
<div class="exitDialog">
	<div class="dialog-content">
    	<div class="ui-dialog-icon"></div>
        <div class="ui-dialog-text">
        	<p class="dialog-content">你确定要退出系统？</p>
            <p class="tips">如果是请点击“确定”，否则点“取消”</p>
            
            <div class="buttons">
                <input type="button" class="button long2 ok" value="确定" />
                <input type="button" class="button long2 normal" value="取消" />
            </div>
        </div>
        
    </div>
</div>
</body>
<script type="text/javascript" src="js/jquery.js"></script>
<script type="text/javascript" src="js/common.js"></script>
<script type="text/javascript" src="js/core.js"></script>
<script type="text/javascript" src="js/jquery.dialog.js"></script>
<script type="text/javascript" src="js/index.js"></script>
</html>