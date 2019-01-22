<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <meta charset="utf-8">

    <!-- Latest compiled and minified CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

    <!-- jQuery library -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

    <!-- Latest compiled JavaScript -->
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

    <style type="text/css">
        #wrap {
            width: 800px;
            margin: 0 auto 0 auto;
        }

        #detailBoard{
            text-align :center;
        }

        #title{
            height : 16;
            font-family :'돋움';
            font-size : 12;
            text-align :center;
        }
    </style>

</head>
<body>
<div id = "wrap">
    <br><br>
    <div id = "board">
        <table id="detailBoard" width="800" border="3" bordercolor="lightray">
            <tr>
                <td id="regdate">작성일</td>
                <td>${board.regdate}</td>
            </tr>
            <tr>
                <td id="name">작성자</td>
                <td>${board.name}</td>
            </tr>
            <tr>
                <td id="title">제목</td>
                <td>${board.title}</td>
            </tr>
            <tr>
                <td id="content">내용</td>
                <td>${board.content}</td>
            </tr>
            <tr>
                <td id="readCount">조회수</td>
                <td>${board.readCount}</td>
            </tr>
        </table>
    <div id = "view-bottom">
        <button type="button" class="btn btn-default col-md-2 col-md-offset-6 col-xs-2 col-xs-offset-5" id = "btn-update" onClick="location.href='writeForm.jsp'">수 정</button>
        <button type="button" class="btn btn-default col-md-2 col-xs-2" id = "btn-delete"onClick="location.href='/delete?id=${board.id}'" >삭 제</button>
        <button type="button" class="btn btn-default col-md-2 col-xs-2" id = "btn-list" onClick="location.href='/list'">목 록</button>

    </div>
</div>
</div>

</body>
</html>