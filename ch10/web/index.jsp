<%--
  Created by IntelliJ IDEA.
  User: 泷琦
  Date: 2021/8/18
  Time: 15:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
    <script type="text/javascript" src="JS/jquery.js"></script>
    <script type="text/javascript">
        $(document).ready(function () {

            $("#username").blur(function () {
                var name = $("#username").val();
                $.ajax({
                    "url":"/user/a",
                    "data":"username="+name,
                    "type":"post",
                    "dataType":"text",
                    "success":function (data) {
                        if (data=="true"){
                            $("#span").html("该用户不可用")
                        }else {
                            $("#span").html("该用户可用")
                        }
                    }
                });

            });
        });


//      function vigil() {
//          var name = $("#username").val();
//          var a = new XMLHttpRequest();
//
//          a.onreadystatechange=callback;
          //get方法
//          var url = "/user/a?username="+name;
//          a.open("GET",url);
//          a.send(null);

          //post方法
//          var url = "/user/a"
//          a.open("post",url);
//          a.setRequestHeader("Content-Type","application/x-www-form-urlencoded");
//          var b = "username="+name;
//          a.send(b);



//          function callback() {
//              if (a.status==200 && a.readyState==4){
//                  var text = a.responseText;
//                  alert(text);
//                  if (text=="true"){
//                      $("#span").html("该用户不可用")
//                  }else {
//                      $("#span").html("该用户可用")
//                  }
//              }
//          }
//
//
//
//      }


    </script>
    用户:<input type="text" id="username"><span id="span"></span>
  </body>
</html>
