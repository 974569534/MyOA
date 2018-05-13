<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
            	<span>邮件信息</span>
            </h2>
            
            <div class="subfild-content base-info">
            	<div class="kv-item ue-clear">
                	<label style="font-size:16px;">${map.Title }</label>

                </div>
            	<div class="kv-item ue-clear">
                	<label>发件人</label>
                	<span>${map.Name }<${map.Email }></span>
                </div>
                <div class="kv-item ue-clear time">
                	<label>时间</label>
                	<span>${map.RecordTime }</span>
                </div>
                
                <div class="kv-item ue-clear time">
                	<label>收件人</label>
                	袁康 <425770425@qq.com>
                </div>
                
            </div>
            
			<hr/>
            
            <div class="subfild-content remarkes-info">
            	<div class="kv-item ue-clear">
                	<div class="kv-item-content" style="width:200px;height:auto;">
                		<div style="height:auto;">${map.EamilContent }</div>
                	 </div>

                </div>
            </div>
            <hr/>
            <div id="fastDiv">
            <input type="text" style="width:1300px;" id="fast"  placeholder="快捷回复给: ℡ ~ 无名氏~ "/><br>
            <div class="subfild-content remarkes-info" id="fastWhite" style="display:none;">
            	<div class="kv-item ue-clear">
                	<div class="kv-item-content">
                    	<textarea name="content" placeholder="文章内容" id="content" style="width:800px;height:240px;"></textarea>
                    </div>

                </div>
            </div>
            </div>
            <br><br><br>
                <button onclick="history.back();">返回</button>&nbsp;&nbsp;&nbsp;<input type="submit" name="add" value="发送" />&nbsp;&nbsp;&nbsp;<input type="button" value="转发" />&nbsp;&nbsp;&nbsp;<input type="button" value="删除" />&nbsp;&nbsp;&nbsp;<input type="button" value="彻底删除" />
        </div>
    </div>
    
</div>
</body>
<script type="text/javascript">
	$('select').select();
	showRemind('input[type=text],textarea','color5');
	UM.getEditor('content');
</script>
<script src="${pageContext.request.contextPath}/js/jquery-1.8.3.min.js"></script>
<script type="text/javascript">
	
	$(function(){
		
		$("#fast").click(function(){
			$("#fast").hide();	
			$("#fastWhite").show();
		});
		
		function del(){
			alert("${map.EamilId }");
			/* $.ajax({
				url:"${pageContext.request.contextPath}/del.do",
				type:"post",
				data:{"eamilId":"${map.EamilId }"},
				success:function(){
					alert("删除成功");
					location.href="mail_inbox.jsp";
				}
			}); */
			
		}
		
	});
	
</script>
</html>