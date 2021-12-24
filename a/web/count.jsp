<%--
  Created by IntelliJ IDEA.
  User: 泷琦
  Date: 2021/7/21
  Time: 15:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        Integer count = (Integer)application.getAttribute("count");
        out.print("共有"+count+"个");
    %>
</body>
</html>
