<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ page import="com.test.util.PageBean" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ include file="elements/head.jsp"  %>
<body>
<div id="main">
	<div class="mainbox">
		<div class="title myMessage png"></div>
		<div class="menu">
			<span>当前用户：<a href="main.jsp">${list}</a></span>
			<span><a href="/Userinfoservlet?action=findUsers">发短消息</a></span>
			<span><a href="/Userinfoservlet?action=logout">退出</a></span>
		</div>
		<div id="error">${error}</div>
		<div class="content messageList">
			<ul>
				<c:forEach var="msg" items="${msgList}">
				<c:if test="${msg.state == 0}">
				<li class="unReaded">
					</c:if>
					<c:if test="${msg.state == 1}">
				<li>
					</c:if>
					<em><c:out value="${msg.msg_create_date}"/></em>
					<em><a href=${"/Userinfoservlet?action=findUsers&sendto="}${msg.username}${"&state="}${msg.state}>回信</a></em>
					<em><a href=${"/Msgservlet?action=del&msgid="}${msg.msgid}>删除</a></em>
					<p>
						<strong><a href="/Msgservlet?action=read&msgid=${msg.msgid}&state=${msg.state}"><c:out value="${msg.title}"/></a></strong>
						<c:if test="${fn:length(msg.msgcontent) > 8}">
							<c:out value="${fn:substring(msg.msgcontent,0,7)}"/>....
						</c:if>
						<c:if test="${fn:length(msg.msgcontent) <= 8}">
							<c:out value="${msg.msgcontent}"/>
						</c:if>
					</p>
					</c:forEach>
			</ul>
			[${page.pageIndex}/${totalpage}]
			<a href="/Msgservlet?pageIndex=1&action=select">首页</a>
			<a href="/Msgservlet?pageIndex=${page.pageIndex-1}&action=select">上一页</a>
			<a href="/Msgservlet?pageIndex=${page.pageIndex+1}&action=select">下一页</a>
			<a href="/Msgservlet?pageIndex=${totalpage}&action=select">尾页</a>

		</div>
	</div>
</div>
</body>
</html>
