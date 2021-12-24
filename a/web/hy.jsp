<%--
  Created by IntelliJ IDEA.
  User: 泷琦
  Date: 2021/7/23
  Time: 8:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        String a = request.getParameter("un");
        Cookie name = new Cookie("un",a);
        //name.setMaxAge(2);
        response.addCookie(name);

    %>
    <h1>登录成功</h1>
</body>
</html>
