<%--
  Created by IntelliJ IDEA.
  User: 泷琦
  Date: 2021/9/10
  Time: 9:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <script type="text/javascript" src="/class/jquery.js"></script>
  <script type="text/javascript">
    $(document).ready(function () {
       $("#form").submit(function () {
          var title = $("#title").val();
          var content = $("#content").val();
          var type = $("#type").val();
          if (title == ""){
              alert("标题不能为空");
              return false;
          }else if (type==0){
              alert("请选择类别");
              return false;
          }else {
            return true;
          }

       });

       $("#title").blur(function () {
           var title = $("#title").val();
           $.ajax({
               "url":"/a",
               "data":"flag=bytitle&title="+title,
               "dataType":"text",
               "success":function (data) {
                   if(data=="true"){
                       $("#span").html("标题已存在");
                   }else{
                       $("#span").html("标题合理");
                   }
               }
           })
       });
    });
  </script>

    <h1>我的工作笔记</h1>
    <form action="/a?flag=add" id="form" name="form" method="post">
      标题：<input type="text" name="title" id="title"><span id="span"></span><br>
      内容：<textarea name="content" id="content"></textarea><br>
      类别：<select id="type" name="type">
              <option value="0">--请选择--</option>
              <option value="1">--技术--</option>
              <option value="2">--行政--</option>
              <option value="3">--人事--</option>
            </select><br>
      <input type="submit" name="add" id="add" value="提交">
    </form>
  </body>
</html>