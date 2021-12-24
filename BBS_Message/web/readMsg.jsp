<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ include file="elements/head.jsp"  %>
<html>
  <head>    
    <title>读短消息</title>	    
  </head>
	<body>
		<div id="main">
			<div class="mainbox">
				<div class="title readMessage png"></div>
				<div class="menu">
					<span>当前用户：<a href="main.jsp">${list}</a></span>
					<span><a href="/Msgservlet?action=select">返回</a></span>
					<span><a href="/Userinfoservlet?action=findUsers">发短消息</a></span>
					<span><a href="/Userinfoservlet?action=logout">退出</a></span>
				</div>
				<div class="content">
					<div class="message">
<%--						<c:forEach var="msg" items="${sessionScope.msg}">--%>
							<div class="tmenu">
								<ul class="clearfix">
									<li>题目：${msg.title} </li>
									<li>来自：${msg.sendto}</li>
									<li>时间：${msg.msg_create_date}</li>
								</ul>
							</div>
					  	 	<div class="view">
								<p>${msg.msgcontent}</p>
							</div>
<%--				  	 	</c:forEach>--%>
					</div>
				</div>
			</div>
		</div>
	</body>
</html>
