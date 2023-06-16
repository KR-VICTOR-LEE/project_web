<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 가입</title>
<link rel="stylesheet" href="resources/css/style.css">
<script src="https://code.jquery.com/jquery-3.7.0.js" integrity="sha256-JlqSTELeR4TLqP0OG9dxM7yDPqX1ox/HfgiSLBj8+kM=" crossorigin="anonymous"></script>
<script src="../resources/js/memberForm.js"></script>
<script>
	function checkID() {
	let memberId = $('#memberId').val();
	$.ajax({
		type: "get",
		url: "http://localhost:8080/checkid",
		dataType: "text",
		data: {id: memberId},  //서블릿쪽으로 id 보냄
		success: function(data){ //서블릿에서 응답 받음
			console.log(data);
			if($.trim(data)=='usable'){ //$.trim() 공백을 없애줌
				$("#check").text("사용 가능한 ID입니다.");
				$("#check").css({"color": "blue", "padding-top": "5px"});
			}else{
				$("#check").text("이미 가입된 ID입니다.");
				$("#check").css({"color": "red", "padding-top": "5px"});
			}
		},
		error: function(){
			alert("에러 발생!!");
		}
	});
}
</script>
</head>
<body>
	<jsp:include page="../header.jsp" />
	<div id="container">
		<section id="register">
			<h2>회원 가입</h2>
			<form action="/addMember.do" method="post" name="member">
				<fieldset>
					<ul>
						<li><label for="memberId">아이디 </label> <input type="text"
							id="memberId" name="memberId" placeholder="아이디는 4~15자까지 입력하세요!!">
							<button type="button" onclick="checkID()" class="btn_check">ID 중복체크</button>
							<p id="check"></p></li>
						<li><label for="passwd1">비밀번호 </label> <input type="password"
							id="passwd1" name="passwd1" placeholder="8자이상 특수문자 포함입니다.">
						</li>
						<li><label for="passwd2">비밀번호 확인</label> <input
							type="password" id="passwd2" name="passwd2"></li>
						<li><label for="name">이름 </label> <input type="text"
							id="name" name="name"></li>
						<li><label for="name">성별 </label> <label class="radio">
								<input type="radio" name="gender" value="남" checked>남
						</label> <label class="radio"> <input type="radio" name="gender"
								value="여">여
						</label></li>
					</ul>
				</fieldset>
				<div class="button">
					<input type="button" value="가입" onclick="checkMember()"> 
					<input type="reset" value="취소">
				</div>
			</form>
		</section>
	</div>
	<jsp:include page="../footer.jsp" />
</body>
</html>