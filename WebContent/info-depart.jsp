<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="${pageContext.request.contextPath }/css/base.css" />
<link rel="stylesheet" href="${pageContext.request.contextPath }/css/info-mgt.css" />
<link rel="stylesheet" href="${pageContext.request.contextPath }/css/WdatePicker.css" />
<title>Insert title here</title>
</head>
<body>
<div class="table-operate ue-clear">
	<a href="javascript:;" class="add">添加</a>
</div>
<div class="table-box">
	<table>
    	<thead>
        	<tr align="center">
            	<th class="num">序号</th>
                <th class="name">部门名称</th>
                <th class="process">主管名称</th>
                <th class="node">办公室电话</th>
                <th class="node">私人电话</th>
                <th class="node">传真号码</th>
                <th class="operate">操作</th>
            </tr>
        </thead>
        <tbody id="tab">
<!--         	<tr> -->
<!--             	<td class="num">1</td> -->
<!--                 <td class="name">开发部</td> -->
<!--                 <td class="process">张三</td> -->
<!--                 <td class="node">838118888</td> -->
<!--                 <td class="node">17671751234</td> -->
<!--                 <td class="node">838118888</td> -->
<!--                 <td class="operate"> -->
<!--                 	<a href="javascript:;">查看</a> -->
<!--                 	&nbsp;&nbsp;&nbsp;&nbsp; -->
<!--                 	<a href="javascript:;">删除</a> -->
<!--                 	&nbsp;&nbsp;&nbsp;&nbsp; -->
<!--                 	<a href="javascript:;">编辑</a> -->
<!--                 </td> -->
<!--             </tr> -->
        </tbody>
    </table>
</div>
<!-- <div class="pagination ue-clear"></div> -->
</body>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/common.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath }/js/WdatePicker.js"></script>
<!-- <script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery.pagination.js"></script> -->
<script type="text/javascript">
$(function(){
	//加载信息
	upload();
	
});

//加载信息
function upload(){
	$.ajax({
		url:"${pageContext.request.contextPath }/findAllByDepartinfo.do",
		type:"post",
		dataType:"json",
		success:function(data){
			var tab="";
		  $.each(data,function(index,k){
		          //把数据以数据表的方式呈现
		          tab+="<table>";
				  tab+="<tr>";
				  tab+="<td class='num'>"+(index+1)+"</td>";
				  tab+="<td class='name'>"+k.DepartName+"</td>";	
				  tab+="<td class='process'>"+k.Name+"</td>";
				  tab+="<td class='node'>"+k.ConnectTelNo+"</td>";
				  tab+="<td class='node'>"+k.ConnectMobileTelNo+"</td>";
				  tab+="<td class='node'>"+k.Faxes+"</td>";
				  tab+="<td class='operate'>";
				  tab+="<a href='javascript:;' onclick='myDel("+k.DepartId+")'>删除</a>";
				  tab+="&nbsp;&nbsp;&nbsp;&nbsp";
				  tab+="<a href='javascript:;' onclick='myUpdate("+k.DepartId+")'>修改</a>";
				  tab+="</td>";
				  tab+="</tr>";
				 }); 
		  tab+="</table>";
	      $("#tab").html(tab);
	      $("tbody").find("tr:odd").css("backgroundColor","#eff6fa");
		}
	});
}

//删除
function myDel(data){
	$.ajax({
		url:"${pageContext.request.contextPath }/delByDepartinfo.do?departid="+data,
		type:"post",
		dataType:"json",
		success:function(data){
			alert("删除成功");
			upload();//刷新
		}
	});
}

//修改
function myUpdate(date){
	$.ajax({
		url:"${pageContext.request.contextPath }/updateByDepartinfo.do",
		type:"post",
		dataType:"json",
		success:function(data){
			alert("修改成功");
			upload();//刷新
		}
	});
}

$(".select-title").on("click",function(){
	$(".select-list").hide();
	$(this).siblings($(".select-list")).show();
	return false;
})
$(".select-list").on("click","li",function(){
	var txt = $(this).text();
	$(this).parent($(".select-list")).siblings($(".select-title")).find("span").text(txt);
})

// $('.pagination').pagination(100,{
// 	callback: function(page){
// 		alert(page);	
// 	},
// 	display_msg: true,
// 	setPageNo: true
// });

$("tbody").find("tr:odd").css("backgroundColor","#eff6fa");
showRemind('input[type=text], textarea','placeholder');
</script>
</html>