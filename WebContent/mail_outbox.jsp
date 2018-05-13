<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="css/css/style.css" />
<link rel="stylesheet" type="text/css" href="css/css/WdatePicker.css" />
<link rel="stylesheet" type="text/css" href="css/css/skin_/form.css" />
<link href="umeditor/themes/default/_css/umeditor.css" type="text/css" rel="stylesheet">
<script type="text/javascript" src="js/js/jquery.js"></script>
<script type="text/javascript" src="js/js/global.js"></script>
<script type="text/javascript" src="js/js/jquery.select.js"></script>
<script type="text/javascript" src="js/js/WdatePicker.js"></script>
<script type="text/javascript">
window.UMEDITOR_HOME_URL = 'umeditor/';  // 请换成绝对路径
</script>
<script type="text/javascript" src="js/js/umeditor.config.js"></script>
<script type="text/javascript" src="js/js/editor_api.js"></script>
<script type="text/javascript" src="umeditor/lang/zh-cn/zh-cn.js"></script>
<title>Insert title here</title>
</head>
<body>
<div id="container">
	<div id="hd">
    </div>
    <div id="bd">
    	<div id="main">
            <h2 class="subfild">
            	<span>写信</span>
            </h2>
            <form action="addEamil.do" method="post">
            <div class="subfild-content base-info">
            	<div class="kv-item ue-clear">
                	<label><span class="impInfo">*</span>收件人</label>
                	<div class="kv-item-content">
                    	<input type="text" name="people" placeholder="收件人" />
                    </div>

                </div>
                <div class="kv-item ue-clear time">
                	<label><span class="impInfo">*</span>主题</label>
                	<div class="kv-item-content">
                    	<input type="text" name="title" placeholder="主题" />
                        <i class="time-icon"></i>
                    </div>

                </div>
                
                <div class="kv-item ue-clear time">
                	<label><span class="impInfo">*</span>邮件类型</label>
                	<div class="kv-item-content">
                    	<input type="text" name="title" placeholder="邮件类型" />
                        <i class="time-icon"></i>
                    </div>

                </div>
                
                <div class="kv-item ue-clear">
                	<label><span class="impInfo">*</span>附件</label>
                	<div class="kv-item-content file">
						<span class="text"></span>
                        <input type="file" name="file"/>
                        <input type="button" class="button normal long2" value="浏览.." />
                    </div>

                </div>
            </div>
            

            
            <div class="subfild-content remarkes-info">
            	<div class="kv-item ue-clear">
                	<label><span class="impInfo">*</span>正文内容</label>
                	<div class="kv-item-content">
                    	<textarea name="content" placeholder="文章内容" id="content" style="width:800px;height:240px;"></textarea>
                    </div>

                </div>
            </div>
            
            
                <input type="submit" name="add" value="确认发送" />&nbsp;&nbsp;&nbsp;<input type="button" value="定时发送" />&nbsp;&nbsp;&nbsp;<input type="submit" name="draft" value="存草稿" />&nbsp;&nbsp;&nbsp;<input type="button" value="关闭" />
            </form>
        </div>
    </div>
    
</div>
</body>
<script type="text/javascript">
	$('select').select();
	showRemind('input[type=text],textarea','color5');
	UM.getEditor('content');
</script>
</html>