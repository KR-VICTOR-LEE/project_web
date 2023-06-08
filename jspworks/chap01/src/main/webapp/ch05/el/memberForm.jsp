<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입 폼</title>
<style>
	#container{width: 80%; margin: 30px auto; text-align: center;}
	fieldset{width: 450px; margin: 0 auto;}
	label{width: 100px; float: left;}
</style>
</head>
<body>
	<div id="container">
		<h2>회원 가입</h2>
		<form action=" Process01_el.jsp" method="post">
			<fieldset>
				<p>
					<label for="userid">아이디 </label> <input type="text" name="userid"
						id="userid">
				</p>
				<p>
					<label for="passwd">비밀번호 </label> <input type="password"
						name="userpw" id="userpw">
				</p>
				<p>
					<label for="name">이름 </label> <input type="text" name="uname"
						id="uname">
				</p>
				<p>
					<input type="submit" value="가입하기"> <input type="reset"
						value="다시쓰기">
				</p>
			</fieldset>
		</form>
	</div>
</body>
</html>