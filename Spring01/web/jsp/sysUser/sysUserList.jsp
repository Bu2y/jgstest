<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>查询用户列表</h1>
<form action="${pageContext.request.contextPath }/user/list" method="post">
	用户名称：<input type="text" name="realName" value=""/>
	<input type="submit" name="查询"/> 
</form>

<c:forEach var="sysUser" items="${queryUserList }">
	<div>
		id: ${sysUser.id } ---
		用户编码: ${sysUser.account } ---
		用户名称: ${sysUser.realName } ---
		用户密码: ${sysUser.password } ---
		用户生日: ${sysUser.birthday } ---
		用户地址: ${sysUser.address } ---
	</div>
</c:forEach>
</body>
</html>