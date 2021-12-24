<%@ page import="com.news.entity.Newsuser" %>
<%@ page import="com.news.dao.Newsuserdao" %>
<%@ page import="com.news.dao.Impl.NewsuserImpl" %><%--
  Created by IntelliJ IDEA.
  User: 泷琦
  Date: 2021/7/23
  Time: 11:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        String name = request.getParameter("username");
        String pwd = request.getParameter("pwd");
        Newsuser newsuser = new Newsuser(name,pwd);
        Newsuserdao newsuserdao = new NewsuserImpl();
        int count = newsuserdao.cz(newsuser);
        if (count > 0){
            response.sendRedirect("dl.jsp");
        }else {
            response.sendRedirect("index.jsp");
        }
    %>
</body>
</html>
