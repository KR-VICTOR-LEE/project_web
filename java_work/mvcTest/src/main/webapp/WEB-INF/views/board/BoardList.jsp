<%@page import="java.util.ArrayList"%>
<%@page import="model.BoardDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>BoardList</title>
</head>
<body>
	<table border="">
		<tr align="center">
			<td>번호</td>
			<td>제목</td>
			<td>작성자</td>
			<td>작성일</td>
			<td>조회수</td>
		</tr>
		<%
			int i =0;
		for(BoardDTO dto : (ArrayList<BoardDTO>) request.getAttribute("mainData")){
			i++;
		
		%>
		<tr align="center">
			<td><%=i %></td>
			<td><%=dto.getTitle()%></td>
			<td><%=dto.getPname() %></td>
			<td><%=dto.getReg_date() %></td>
			<td><%=dto.getCnt() %></td>
		</tr>
		<%} %>
		<tr>
			<td colspan="5" align="center"></td>
		</tr>
		<tr>
			<td colspan="5" align="right"><a href="#">글쓰기</a></td>
		</tr>
	</table>
</body>
</html>