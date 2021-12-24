<%--
  Created by IntelliJ IDEA.
  User: 泷琦
  Date: 2021/8/25
  Time: 13:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
    <script type="text/javascript" src="class/jquery.js"></script>
    <script type="text/javascript">
        $(document).ready(function () {
            var $input = $("#form").find(":input");
            $("#button").click(function () {
                var xlh = $input.serializeArray();
                var param = $.param(xlh);

                var flag = $("#button").val();
                var data = param+"&flag="+flag;

                $.ajax({
                    "url":"/flower/a",
                    "data":data,
                    "type":"get",
                    "dataType":"text",
                    "success":function (data) {

                        if (data=="true"){

                            $("#span").html("添加成功")
                        }else {

                            $("#span").html("添加失败")
                        }
                    }


                });
            });


        });
    </script>
    <span id="span"></span><br>

    <form action="" id="form">
        名字<input name="name" type="text"><br>
        别名<input name="othername" type="text"><br>
        科属<input name="property" type="text"><br>
        价格<input name="pirice" type="text"><br>
        产地<input name="production" type="text"><br>
        <input type="button" id="button" value="add">
    </form>
</body>
</html>
