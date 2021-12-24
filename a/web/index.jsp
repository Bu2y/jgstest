<%--
  Created by IntelliJ IDEA.
  User: 泷琦
  Date: 2021/7/17
  Time: 14:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>标题</title>
  </head>
  <body>

    <%
      request.setCharacterEncoding("utf-8");
//      session.invalidate();
      String a = (String )session.getAttribute("username");
      String b = request.getParameter("pwd");
      String[] c = request.getParameterValues("ah");
      out.print(a+""+b);

      if (a== null){
          response.sendRedirect("bd.jsp");
      }

    %>
  </body>
</html>
