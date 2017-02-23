<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
    <head>
        <title>文件上传demo</title>
    </head>
    <body>
        <h2>所有文件</h2>
        <c:forEach items="${list}" var="uploader">
            <p>
                <a href="/file/download?filename=${uploader.fileName}" target="_blank">${uploader.fileName}</a>
            </p>
        </c:forEach>

        <h2>文件上传</h2>
        <form action="/file/upload" enctype="multipart/form-data" method="post">
            <table>
                <tr>
                    <td>文件描述:</td>
                    <td>
                        <input type="text" name="description"/>
                    </td>
                </tr>

                <tr>
                    <td>请选择文件:</td>
                    <td>
                        <input type="file" name="file"/>
                    </td>
                </tr>

                <tr>
                    <td><input type="submit" value="上传"/></td>
                </tr>
            </table>
        </form>
    </body>
</html>
