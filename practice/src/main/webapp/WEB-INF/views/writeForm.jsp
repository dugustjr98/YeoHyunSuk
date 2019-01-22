<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7" crossorigin="anonymous">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap-theme.min.css" integrity="sha384-fLW2N01lMqjakBkx3l/M9EahuwpSfeNvV63J5ezn3uZzapT0u7EYsXMjQV+0En5r" crossorigin="anonymous">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js" integrity="sha384-0mSbJDEHialfmuBBQP6A4Qrprq5OVfW37PRR3j5ELqxss1yVqOtnepnHVP9aJ7xS" crossorigin="anonymous"></script>
<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<html><head>
    <title>글쓰기</title>
</head>
<body>
<form action="/write" method="post">
<div class="container">
        <div class="form-group">
            <label for="id">ID 입력</label>
            <input type="text" class="form-control" name="id" id="id" placeholder="id">
        </div>

        <div class="form-group">
            <label for="title">글 제목</label>
            <input type="text" class="form-control" name="title"  id="title" placeholder="title">
        </div>
        <div class="form-group">
            <label for="contents">글 내용</label>
            <textarea class="form-control" rows="5" id="contents"name="contents" placeholder="contents"></textarea>
        </div>
        <input type="submit" class="btn btn-default" value="Submit"/>
        <button type="cancel" class="btn btn-default">Cancel</button>

</div>
</form>
</body>
</html>