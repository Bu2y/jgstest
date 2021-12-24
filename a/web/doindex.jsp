<%--
  Created by IntelliJ IDEA.
  User: 泷琦
  Date: 2021/7/21
  Time: 14:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        String b = request.getParameter("pwd");
        String a = request.getParameter("username");
        session.setAttribute("username",a);
        session.setAttribute("pwd",b);
        if (a.equals("asdf") || b.equals("1234")) {
            response.sendRedirect("newhyy.jsp");
        }else{
            response.sendRedirect("doindex.jsp");
        }
    %>
</body>
</html>
