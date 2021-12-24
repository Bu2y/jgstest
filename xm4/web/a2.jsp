<%@ page import="com.news.dao.textdao" %>
<%@ page import="com.news.dao.impl.textdaoImpl" %>
<%@ page import="java.util.List" %>
<%@ page import="com.news.entity.zhuti" %><%--
  Created by IntelliJ IDEA.
  User: 泷琦
  Date: 2021/7/24
  Time: 15:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>欢迎</h1>
    <%
        textdao textdao = new textdaoImpl();
        List<zhuti> zt = textdao.bdgs();
        for (int i =0;i<zt.size();i++){
            out.print("<a>"+zt.get(i).getZt()+"</a>");
            out.print("<a>修改</a>");
            out.print("<a>删除</a><br />");
        }
    %>
</body>
</html>
