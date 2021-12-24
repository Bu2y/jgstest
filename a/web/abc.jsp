<%--
  Created by IntelliJ IDEA.
  User: 泷琦
  Date: 2021/7/23
  Time: 8:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        Cookie[] c = request.getCookies();
        if (c!=null){
            for (int i = 0; i<c.length; i++){
                if (c[i].getName().equals("un")) {
                    response.sendRedirect("hy.jsp");
                }
            }
        }
    %>
    <form method="post" action="hy.jsp">
        用户名<input type="text" name="un">
        <input type="submit" value="登录">
    </form>
</body>
</html>
