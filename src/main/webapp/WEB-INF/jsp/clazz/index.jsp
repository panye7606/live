<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
    <head>
        <link rel="stylesheet" type="text/css" href="/static/css/style.css">
        <script type="text/javascript" src="/static/js/jquery-3.1.1.min.js"></script>
        <meta charset="UTF-8">
        <title>班级列表</title>
    </head>
    <body>
        <c:forEach items="${list}" var="clazz">
            <p>
                id: ${clazz.id},
                code: ${clazz.code},
                <c:forEach items="${clazz.students}" var="student">
                    student: ${student.toString()},
                </c:forEach>
            </p>
        </c:forEach>
    </body>


</html>