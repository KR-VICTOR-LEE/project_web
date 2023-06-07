<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>쿠키 생성하기</title>
</head>
<body>
	<form action="cookieProcess.jsp" method="post">
		<p>
			<label for="id">아이디: </label>
			<input type="text" id="userid" name="userid">
		</p>
		<p>
			<label for="passwd">패스워드: </label>
			<input type="password" id="userpw" name="userpw">
		</p>
		<p><input type="submit" value="전송"></p>
	</form>
</body>
</html>