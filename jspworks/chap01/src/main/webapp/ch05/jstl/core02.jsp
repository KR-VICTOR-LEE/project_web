<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>학점 처리</title>
<script>
	// 점수를 입력하지 않았거나, 문자인 경우 처리
	function checkScore() {
		let word =  /[가-힣ㄱ-ㅎㅏ-ㅣ]/;
		let form = document.form;
		let score = form.score;
		
		if (score.value == "" || isNaN(score.value) || score.value.trim() == '') {
			alert("점수를 입력하세요!!");
			form.score.focus();
			return false;
		}else if(score.value < 0 || score.value > 100){
			alert("1~100점수입력");
			form.score.select();
			return false;
		}else if(!word.test(score)){
			alert("숫자를 입력하세요");
			form.score.focus();
			return false;
		}else{
			form.submit();
		}
	}
</script>
</head>
<body>
	<h2>점수를 입력해 주세요</h2>
	<form action="scoreTest.jsp" method="get" name="form">
		<p>
			점수 : <input type="text" name="score"> <input type="button"
				value="학점출력" onclick="checkScore()">
		</p>
	</form>
</body>
</html>