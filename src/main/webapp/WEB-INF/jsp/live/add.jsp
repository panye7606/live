<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
    <head>
        <title>新建直播</title>
    </head>
    <body>
        <form action="/lives" method="post">
            平台: <input type="text" name="platform" /></br>
            主播: <input type="text" name="anchor" /></br>
            直播间url: <input type="text" name="url" /></br>
            封面url: <input type="text" name="imgUrl" /></br>
            观看人数<input type="text" name="num" /></br>
            <input type="submit" name="保存">
        </form>
    </body>
</html>
