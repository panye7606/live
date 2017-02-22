<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" type="text/css" href="/static/css/style.css">
        <script type="text/javascript" src="/static/js/jquery-3.1.1.min.js"></script>
        <meta charset="UTF-8">
        <title>学生列表</title>
        <script type="text/javascript">
            $(function() {
                $.ajax({
                    type: "POST",
                    dataType: "JSON",
                    url: "/json/getStudentJson",
                    contentType: "application/json; charset=utf-8",
                    data: JSON.stringify({id: 1, name: "james", sex: "male", age: 20}),
                    async: true,
                    success: function(data) {
                        alert(data.msg);
                    }
                });
            });
        </script>
    </head>
    <body>

        <c:forEach items="${list}" var="student">
            <p>
                id: ${student.id},
                name: ${student.name},
                age: ${student.age},
                sex: ${student.sex}
            </p>
        </c:forEach>

    </body>


</html>