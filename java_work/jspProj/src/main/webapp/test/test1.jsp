<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
</head>
<body>
	<form action="test2.jsp" method="post">
		<table border="1" >
			<tr>
				<td>이름</td>
				<td>국어</td>
				<td>영어</td>
				<td>수학</td>
			</tr>
			<% for(int i =1; i<=5; i++){ %>
			<tr>
				<td>
					<input type="text" name="name" id="name">
				</td>
				<td>
					<input type="number" name="kor" id="kor" value="<%=(int)(Math.random()*100)+10	%>" >
				</td>
				<td>
					<input type="number" name="eng" id="eng" value="<%=(int)(Math.random()*100)+10	%>" >
				</td>
				<td>
					<input type="number" name="met" id="met" value="<%=(int)(Math.random()*100)+10	%>" >
				</td>
			</tr>
			<%}%>
			<tr>
				<td colspan="4" align="center">
					<button type="submit">계산</button>
				</td>
			</tr>
			
			
			
			
		</tr>
	</table>
	</form>
</body>
</html>