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
    <title>글 상세보기</title>
    <style>
        #container {
            width: 70%;
            margin: 0 auto;     /* 가로로 중앙에 배치 */
            padding-top: 10%;   /* 테두리와 내용 사이의 패딩 여백 */
        }

        #list {
            text-align: center;
        }

        #write {
            text-align: right;
        }

        /* Bootstrap 수정 */
        .table > thead {
            background-color: #b3c6ff;
        }
        .table > thead > tr > th {
            text-align: center;
        }
        .table-hover > tbody > tr:hover {
            background-color: #e6ecff;
        }
        .table > tbody > tr > td {
            text-align: center;
        }
        .table > tbody > tr > #title {
            text-align: left;
        }

        div > #paging {
            text-align: center;
        }

        .hit {
            animation-name: blink;
            animation-duration: 1.5s;
            animation-timing-function: ease;
            animation-iteration-count: infinite;
            /* 위 속성들을 한 줄로 표기하기 */
            /* -webkit-animation: blink 1.5s ease infinite; */
        }

        /* 애니메이션 지점 설정하기 */
        /* 익스플로러 10 이상, 최신 모던 브라우저에서 지원 */
        @keyframes blink {
            from {color: white;}
            30% {color: yellow;}
            to {color: red; font-weight: bold;}
            /* 0% {color:white;}
            30% {color: yellow;}
            100% {color:red; font-weight: bold;} */
        }
    </style>
</head>
<body>
<div>
    <table border="1" style="width:600px" class="table table-striped table-bordered table-hover">
    <caption>글 상세보기</caption>
        <colgroup>
            <col width='*%'/>
        </colgroup>
        <thead>
                <tr>
                    <td>${board.title}</td>
                </tr>

        </thead>
        <tbody>
        <tr>

                <td> ${board.content}</td>
        </tr>
        </tbody>
    </table>
</div>
<div>
<a href="/board/main">목록</a>
    <a href="/board/main">목록</a>

</div>
</body>
</html>
