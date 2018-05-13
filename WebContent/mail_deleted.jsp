<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
		<link rel="shortcut icon" href="../favicon.ico">
		<link rel="stylesheet" type="text/css" href="css/normalize.css" />
		<link rel="stylesheet" type="text/css" href="css/demo.css" />
		<link rel="stylesheet" type="text/css" href="css/component.css" />
		<link rel="stylesheet" type="text/css" href="css/css/style.css" />
	<link rel="stylesheet" type="text/css" href="css/css/WdatePicker.css" />
	<link rel="stylesheet" type="text/css" href="css/css/skin_/form.css" />
<style type="text/css">
	#btn1{
		margin-top:15px;
		font-size:15px;
		
	}
	#tab tr th,td{
		padding:10px;
	}
	.container{
		margin-left:-250px;
		margin-top:-30px;
	}			
</style>
</head>
<body>
<div id="container">
	<div id="hd">
    </div>
    <div id="bd">
    	<div id="main">
            <h2 class="subfild">
            	<span>已删除</span>
            </h2>
        </div>
    </div>
    
</div>
	<div class="container">
			<div class="component">
				<div><button onclick="del()">彻底删除</button>&nbsp;&nbsp;<button>转发</button>&nbsp;&nbsp;<button>全部标为已读</button>&nbsp;&nbsp;<button>标记为已读邮件</button>&nbsp;&nbsp;&nbsp;&nbsp;</div>
				<table id="tab" style="font-size:18px;font-family: 楷体;">
					<thead>
						<tr>
							<th><input type="checkbox" onclick="swapCheck()"/></th>
							<th>状态</th>
							<th>发件人</th>
							<th>主题</th>
							<th>时间</th>
						</tr>
					</thead>
					<tbody>
						
					</tbody>
				</table>			</div>
			
		</div><!-- /container -->
<script src="${pageContext.request.contextPath}/js/jquery-1.8.3.min.js"></script>
<script type="text/javascript">
	$(function(){
		upload();
	   	

	});
	
	function del(){
        var values = new Array();
        $(".check").each(function(){
        	if($(this).is(":checked")){
        		values.push($(this).val());
        	}
        });
        alert(JSON.stringify(values));

		$.ajax({
			url:"${pageContext.request.contextPath}/del.do",
			type:"post",
			data:{"values":JSON.stringify(values)},
			success:function(){
				alert("删除成功");
			}
		});
	};
	
	
	
	function upload(){
		$.ajax({
			url:"${pageContext.request.contextPath}/selectAll.do",
			type:"post",
			dataType:"json",
			success:function(data){
				function getzf(num){
					if(parseInt(num)<10){
						num = '0'+num;
					}
					return num;
				}
				
 				$(data).each(function(){
 					var str=this.RecordTime;
					var oDate = new Date(str);
					oYear = oDate.getFullYear();
					oMonth = oDate.getMonth()+1;
					oDay = oDate.getDate();
					oHour = oDate.getHours();
					oMinutes = oDate.getMinutes();
					oSen = oDate.getSeconds();
					oTime = getzf(oYear)+'-'+getzf(oMonth)+'-'+getzf(oDay)+' '+getzf(oHour)+':'+getzf(oMinutes)+':'+getzf(oSen);

					$("#tab tbody").append((this.IfDel==1&&this.IfPublish==1?"<tr><td><input type='checkbox' value='"+this.EamilId+"' class='check'/></td><td>"+(this.IfRead==0?"<a href='selectDetails.do?eamilId="+this.EamilId+"'><img src='images/rmail.png' /></a>":"<a href='selectDetails.do?eamilId="+this.EamilId+"'><img src='images/rmail1.png' /></a>")+"</td><td>"+this.Name+"</td><td>"+this.Title+"</td><td>"+oTime+"</td></tr>":""));
					
 				});
			}
		});
		
		
	}
	
	var isCheckAll = false;  
    function swapCheck() {  
        if (isCheckAll) {  
            $("input[type='checkbox']").each(function() {  
                this.checked = false;  
            });  
            isCheckAll = false;  
        } else {  
            $("input[type='checkbox']").each(function() {  
                this.checked = true;  
            });  
            isCheckAll = true;  
        }  ;
    }  ;
	

	
</script>	
<script src="js/jquery.ba-throttle-debounce.min.js"></script>
<script src="js/jquery.stickyheader.js"></script>
	

</body>
</html>