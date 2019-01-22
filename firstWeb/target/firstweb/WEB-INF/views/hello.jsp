<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>list</title>
    <meta charset="utf-8">

    <!-- Latest compiled and minified CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

    <!-- jQuery library -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

    <!-- Latest compiled JavaScript -->
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
<h1 style="text-align: center; margin-top:50px;">현석's 게시판</h1>
<div style="width:50%; margin:0 auto; padding-top:50px;">
    <a class="'btn btn-default" href = "writeform.jsp" id=""
       style='width:15%; float:right;'>글쓰기</a>

count : ${requestScope.count}<br>
list : ${requestScope.list}<br data-tomark-pass>

<c:if test="${requestScope.count > 50}">
    <h1>hello!!!</h1>
</c:if>

<c:forEach items="${requestScope.list}" var="board">
    ${board.title} , ${board.name} <br data-tomark-pass>
</c:forEach>
</body>
</html>