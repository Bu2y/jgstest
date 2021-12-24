<%--
  Created by IntelliJ IDEA.
  User: 泷琦
  Date: 2021/7/21
  Time: 14:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--<%@include file="index.jsp"%>--%>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        Integer count = (Integer)application.getAttribute("count");
        if(count!=null){
            count=count+1;
        }else {
            count=1;
        }
        application.setAttribute("count",count);
        response.sendRedirect("count.jsp");
    %>

</body>
</html>
