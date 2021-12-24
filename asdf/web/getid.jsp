<%--
  Created by IntelliJ IDEA.
  User: 泷琦
  Date: 2021/9/11
  Time: 16:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div id="div">
    <c:forEach items="${work}" var="work">
    <p>我的工作笔记</p>
    <table>
        <tr>
            <td>标题：</td>
            <td>${work.title}</td>
        </tr>
        <tr>
            <td>内容：</td>
            <td>${work.content}</td>
        </tr>
        <tr>
            <td>类别：</td>
            <td>
                <c:if test="${work.type==1}">技术</c:if>
                <c:if test="${work.type==2}">行政</c:if>
                <c:if test="${work.type==3}">人事</c:if>
            </td>
        </tr>
        <tr>
            <td>日期：</td>
            <td>${work.createDate}</td>
        </tr>
        <tr>
            <td><input style="text-align: center" type="button" value="返回" onclick="location .href='/a?flag=getall'"></td>
        </tr>
    </table>
</div>
</c:forEach>
</body>
</html>
