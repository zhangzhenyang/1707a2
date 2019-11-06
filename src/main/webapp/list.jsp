<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href="<%=request.getContextPath()%>/css/css.css" rel="stylesheet">
<script type="text/javascript" src="js/jquery-1.8.2.min.js"></script>
</head>
<script type="text/javascript">
$(function(){
	$("#qx").toggle(function(){
		$("[name='yid']").attr("checked",true);
	},function(){
		$("[name='yid']").attr("checked",false);
	})
	
})

</script>
<body>
<form action="list" method="post">
电影名称：<input name="yname"><br><br>
导演：<input name="dy"><br><br>
电影年代：<input name="years"><br><br>
上映时间：<input type="date" name="startdate">至<input type="date" name="enddate"><br><br>
价格：<input name="minprice">-<input name="maxprice"><br><br>
电影时长：<input name="mintime">-<input name="maxtime"><br><br>
<input type="submit" value="查询">
</form>
<table>
	<tr>
		<td><input type="checkbox" id="qx">
		<td>影视名</td>
		<td>导演</td>
		<td>票价</td>
		<td>上映时间</td>
		<td>时长 </td>
		<td>类型</td>
		<td>年代</td>
		<td>区域</td>
		<td>状态</td>
		<td>操作</td>
	</tr>
	<c:forEach items="${page.list }" var="y">
		<tr>
			<td><input type="checkbox" value="${y.yid }" name="yid"></td>
			<td>${y.yname }</td>
			<td>${y.dy }</td>
			<td>${y.price }</td>
			<td>${y.startdate }</td>
			<td>${y.time }</td>
			<td>${y.type }</td>
			<td>${y.years }</td>
			<td>${y.address }</td>
			<td>${y.lable == 0 ? '正在热映':'已经下架' }</td>
			<td>
				<input type="button" value="详情">
				<input type="button" value="编辑">
				<c:if test="${y.lable==0 }">
				<a href="update?lable=${y.yid }"><input type="button" value="下架"></a>
				</c:if>
				<c:if test="${y.lable==1 }">
				<a href="update?lable=${y.yid }"><input type="button" value="上架"></a>
				</c:if>
			</td>
		</tr>
	</c:forEach>
	<tr>
		<td colspan="11">
		
			<input type="button" value="批量删除" onclick="del()">
		</td>
	</tr>
	<tr>
		<td colspan="11">  
			<a href="?pageNum=1">首页</a>
			<a href="?pageNum=${page.pageNum-1 <1 ?page.pageNum: page.pageNum-1 }">上一页</a>
			<a href="?pageNum=${page.pageNum+1 > page.pages ?page.pageNum: page.pageNum+1 }">下一页</a>
			<a href="?pageNum=${page.pages }">尾页</a>
		</td>
	</tr>
</table>
<script type="text/javascript">
function del(){
	var id="";
	$("[name='yid']:checked").each(function(){
		id+=","+$(this).val();
	})
	$.post("delAll",{id:id.substring(1)},function(data){
		if (data) {
			alert("确定要删除？")
			location="list";
		} 
	},"json")
	
}
</script>
</body>
</html>