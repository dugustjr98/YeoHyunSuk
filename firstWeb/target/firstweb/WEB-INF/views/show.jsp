<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7" crossorigin="anonymous">

<!-- Optional theme -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap-theme.min.css" integrity="sha384-fLW2N01lMqjakBkx3l/M9EahuwpSfeNvV63J5ezn3uZzapT0u7EYsXMjQV+0En5r" crossorigin="anonymous">

<!-- Latest compiled and minified JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js" integrity="sha384-0mSbJDEHialfmuBBQP6A4Qrprq5OVfW37PRR3j5ELqxss1yVqOtnepnHVP9aJ7xS" crossorigin="anonymous"></script>
<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <link href="/css/view.css" type="text/css" rel="stylesheet">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
<div id = "container">
    <div id = "view-top" class="page-header">
        <div id = "view-title" class="col-md-6 col-xs-6">${board.title}</div>
        <div id = "view-date" class="col-md-2 col-md-offset-2 col-xs-2 col-xs-offset-2">${board.regdate}</div>
        <div id = "view-writer" class="col-md-2 col-xs-2">${board.name}</div>
    </div>
    <div id = "content">
        ${board.content}
    </div>
    <div id = "view-bottom">
        <button type="button" class="btn btn-default col-md-2 col-md-offset-6 col-xs-2 col-xs-offset-5" id = "btn-update" onClick="location.href='writeform.jsp'">수 정</button>
        <button type="button" class="btn btn-default col-md-2 col-xs-2" id = "btn-delete"onClick="location.href='delete.html'" >삭 제</button>
        <button type="button" class="btn btn-default col-md-2 col-xs-2" id = "btn-list" onClick="location.href='board.html'">목 록</button>
    </div>
</div>
</div>

</body>
</html>
