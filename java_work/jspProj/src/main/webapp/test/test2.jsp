<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>test2</title>
</head>
<body>
	<%
		int cnt = 5;
		String[] nameArr = new String[cnt]; 
		int[] korArr = new int[cnt];
		int[] engArr = new int[cnt];
		int[] metArr = new int[cnt];
		
		for(int i=0; i<cnt; i++){
			nameArr[i] = request.getParameter("name"+i);
			// 오류 부분. 
			korArr[i] = Integer.parseInt(request.getParameter("kor"+i));
			engArr[i] = Integer.parseInt(request.getParameter("eng"+i));
			metArr[i] = Integer.parseInt(request.getParameter("kor"+i));
		}
	%>


	<table border="1">
		<tr>
			<td>이름</td>
			<td>국어</td>
			<td>영어</td>
			<td>수학</td>
			<td>총점</td>
			<td>평균</td>
		</tr>
		<% for(int i =1; i<=cnt; i++){ %>
			<% 
			int sum = korArr[i]+engArr[i]+metArr[i];
			double avg = sum/3;
			%>	
		<tr>
			<td><%=nameArr[i]%></td>
			<td><%=korArr[i]%></td>
			<td><%=engArr[i]%></td>
			<td><%=metArr[i]%></td>
			<td><%=sum %></td>
			<td><%=avg %></td>
		</tr>
		
		<%}%>
	</table>
</body>
</html>