<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7" crossorigin="anonymous">

<!-- Optional theme -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap-theme.min.css" integrity="sha384-fLW2N01lMqjakBkx3l/M9EahuwpSfeNvV63J5ezn3uZzapT0u7EYsXMjQV+0En5r" crossorigin="anonymous">

<!-- Latest compiled and minified JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js" integrity="sha384-0mSbJDEHialfmuBBQP6A4Qrprq5OVfW37PRR3j5ELqxss1yVqOtnepnHVP9aJ7xS" crossorigin="anonymous"></script>
<!DOCTYPE html>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%><html>
<head>
<title>게시판</title>
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
<h1 style="text-align:center; margin-top:50px;">게시판 만들기 </h1>
<div>
<table border="1" style="width:600px; margin:auto;text-align:center;" class="table table-striped table-bordered table-hover">
    <colgroup>
        <col width='8%' />
        <col width='*%' />
        <col width='15%' />
        <col width='15%' />
    </colgroup>
    <thead>
        <tr>
        <th>번호</th> 
        <th>제목</th>
        <th>ID</th>
        <th>등록일</th>
        </tr>
    </thead>
    <tbody>
        <c:forEach items="${boards}" var="board">
           <tr>
            <td> ${board.id}</td>
               <td> <a href="/board/show?id=${board.id}">${board.title}</a></td>
            <td> ${board.name}</td>
            <td> ${board.regdate}</td>
           </tr>
        </c:forEach>
    </tbody>
</table>
</div>
<div class="text-center" style="width:50%; margin:0 auto; margin-top:50px;">
    </br>
    <ul class = "pagination">
        <li><a href="#">«</a></li>
        <li><a href="#">1</a></li>
        <li><a href="#">2</a></li>
        <li><a href="#">3</a></li>
        <li><a href="#">4</a></li>
        <li><a href="#">5</a></li>
        <li><a href="#">6</a></li>
        <li><a href="#">7</a></li>
        <li><a href="#">8</a></li>
        <li><a href="#">9</a></li>
        <li><a href="#">10</a></li>
        <li><a href="#">»</a></li>
    </ul>
</div>
<div style="text-align:center;">
<a class="btn btn-default" href="/board/formtag" id="" style="'width:15%; float:right; margin:auto;">글쓰기</a>
    <a class="btn btn-default" href="/board/formtag" id=" " style="'width:15%; float:right; margin:auto;">수정</a>
</div>
<div class="box1" style="width:40%; margin:3% auto 10%;">
    <div class="form-group" style="width:17%; margin-right:2%; float:left;">
        <label class="sr-only" for="sop">sop</label>
        <select name=sop class="form-control">
            <option value=제목>제목</option>
            <option value=내용>내용</option>
            <option value=작성자>작성자</option>
        </select>
    </div>
    <div class="form-group" style="width:60%; float:left;">
        <label class="sr-only" for="stx">stx</label>
        <input name=stx maxlength=15 size=10 itemname="검색어" required value='' class="form-control">
    </div>
    <div class="form-group" >
        <button class="btn " style="float: right; width:17%;">검색</button>
    </div>
</div>
</body>
</html>


