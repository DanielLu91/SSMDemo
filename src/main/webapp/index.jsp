
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Demo</title>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
    <script>
        $(document).ready(function () {
            $("button").click(function () {
                var data={};
                data.name=$('#name').val();
                data.number=$('#number').val();
                $.post("/json",
                    data,
                    function (data) {
                        alert(data.name+"\t"+data.number);
                    }
                );
            });
        });
    </script>
</head>
<body>
<h2>Hello World!</h2>

<%--<form action="${pageContext.request.contextPath}/students/submit" enctype="multipart/form-data" method="post">--%>
    <%--<input type="text" name="number">--%>
    <%--<input type="file" name="file">--%>
    <%--<input type="submit" value="submit">--%>
<%--</form>--%>

<input id="name" type="text" name="name" value="daniel"/>
<input id="number" type="number" name="number">
<button>Send a json request</button>
</body>
</html>
