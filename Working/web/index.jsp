<%--
  Created by IntelliJ IDEA.
  User: 泷琦
  Date: 2021/9/12
  Time: 10:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <script type="text/javascript" src="/class/jquery-1.12.4.min.js"></script>
  <script type="text/javascript">
      $(document).ready(function () {
          $("table tr:even").css("background-color","red");
//        $.ajax({
//            "url":"/a",
//            "data":"flag=all",
//            "dataType":"text",
//            "success":function () {
//            }
//        })
      })
  </script>
  <h1>工作笔记</h1>
  <a href="tianjia.jsp">添加笔记</a>
  <table  border="1">
    <tr>
      <td>笔记标题</td>
      <td>笔记分类</td>
      <td>编写时间</td>
      <td>操作</td>
    </tr>
    <c:forEach items="${list}" var="cx">
      <tr>
        <td>${cx.title}</td>
        <td><c:if test="${cx.type==1}">技术</c:if>
          <c:if test="${cx.type==2}">行政</c:if>
          <c:if test="${cx.type==3}">人事</c:if></td>
        <td>${cx.createDate}</td>
        <td><a href="/a?flag=getid&id=${cx.id}">查看</a></td>
      </tr>
    </c:forEach>

  </table>
  </body>
</html>
