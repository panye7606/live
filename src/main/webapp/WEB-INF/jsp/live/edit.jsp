<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
    <head>
        <title>编辑直播</title>
    </head>
    <body>
        <form action="/lives/${live.id}" method="post">
            <input type="hidden" name="_method" value="put" />
            平台: <input type="text" name="platform" value="${live.platform}" /></br>
            主播: <input type="text" name="anchor" value="${live.anchor}" /></br>
            直播间url: <input type="text" name="url" value="${live.url}" /></br>
            封面url: <input type="text" name="imgUrl" value="${live.imgUrl}" /></br>
            观看人数<input type="text" name="num" value="${live.num}" /></br>
            <input type="submit" name="保存">
        </form>
    </body>
</html>
