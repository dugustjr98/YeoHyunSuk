<!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7" crossorigin="anonymous">

<!-- Optional theme -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap-theme.min.css" integrity="sha384-fLW2N01lMqjakBkx3l/M9EahuwpSfeNvV63J5ezn3uZzapT0u7EYsXMjQV+0En5r" crossorigin="anonymous"> 

<!-- Latest compiled and minified JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js" integrity="sha384-0mSbJDEHialfmuBBQP6A4Qrprq5OVfW37PRR3j5ELqxss1yVqOtnepnHVP9aJ7xS" crossorigin="anonymous"></script>
<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<html><head>
<title>글작성</title>
</head>
<body>
<div class="container">
<form>
   <div class="form-group">
    <label for="exampleInputID">ID 입력</label>
    <input type="email" class="form-control" id="exampleInputID" placeholder="ID">
  </div>
<div class="form-group">
    <label for="exampleInputPassword">Password 입력</label>
    <input type="password" class="form-control" id="exampleInputPassword" placeholder="Password">
  </div>
  <div class="form-group">
    <label for="exampleInputTitle">글 제목</label>
    <input type="text" class="form-control" id="exampleInputTitle" placeholder="title">
  </div>
  <div class="form-group">
    <label for="exampleInputcontent">글 내용</label>
    <textarea class="form-control" rows="5" id="exampleInputcontent" placeholder="contents"></textarea>
  </div>
  <button type="submit" class="btn btn-default">Submit</button>
<button type="cancel" class="btn btn-default">Cancel</button>
</form>
</div>
</body>
</html>

