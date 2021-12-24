<%--
  Created by IntelliJ IDEA.
  User: 黑桃J
  Date: 2021/9/10
  Time: 9:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
  <head>
    <style>
    </style>
    <title>$Title$</title>
  </head>
  <body>
  <script type="text/javascript"src="js/jquery-1.12.4.js"></script>
  <script type="text/javascript">
    $(document).ready(function () {
        $("tr:even").css("background-color","red")
    })
      if(${url==null}){
          location.href='/work?work=getall';
      }
  </script>

  <form action="/work?work=getall"method="post"style="margin: 10% 40%">
    <h1 style="padding-left: 25%">工作笔记</h1>
    <a href="add.jsp"style="padding-left: 72%">添加笔记</a>

    <table border="1">
      <tr >
        <td>笔记标题</td>
        <td>笔记分类</td>
        <td>编写时间</td>
        <td>操作</td>

      </tr>
      <c:forEach items="${list}" var="list" varStatus="b">
        <tr>
          <td>${list.title}</td>
          <td>
            <c:if test="${list.type==1}">技术</c:if>
            <c:if test="${list.type==2}">行政</c:if>
            <c:if test="${list.type==3}">人事</c:if>
              </td>
          <td>${list.createDate}</td>
          <td><a href="/work?work=getid&id=${list.id}">查看</a></td>
        </tr>
      </c:forEach>

    </table>

  </form>
  </body>
</html>
