<%@ page import="com.news.entity.test" %>
<%@ page import="com.news.dao.textdao" %>
<%@ page import="com.news.dao.impl.textdaoImpl" %><%--
  Created by IntelliJ IDEA.
  User: 泷琦
  Date: 2021/7/24
  Time: 15:30
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
        test test = new test(name,pwd);
        textdao textdao = new textdaoImpl();
        int count = textdao.cx(test);
        if (count == 1){
            response.sendRedirect("a2.jsp");
        }else {
            response.sendRedirect("index.jsp");
        }
    %>
    <textarea name=""></textarea>

</body>
</html>
