<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" type="text/css" href="/static/css/style.css">
    <meta charset="UTF-8">
    <title>直播列表</title>
</head>
    <body>

        <div class="wrap">
            <p>
                <a href="/lives/new">新增直播</a>
            </p>
            <div class="live">
                <ul>
                    <c:forEach items="${lives}" var="live">
                        <li>
                            <a href="${live.url}" target="_blank">
                                <img src="${live.imgUrl}" alt="" />
                            </a>
                            <a href="/lives/${live.id}/edit">编辑</a>
                            <div class="mes">
                                <div class="nick">${live.anchor}</div>
                                <div class="platform">${live.platform}</div>
                                <div class="num">${live.num}人</div>
                            </div>
                        </li>
                    </c:forEach>
                </ul>
            </div>
        </div>

    </body>
</html>