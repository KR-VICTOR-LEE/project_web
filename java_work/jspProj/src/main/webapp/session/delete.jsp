<%@page import="basic_p.Stud"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>session/delete</title>
</head>
<body>
<h1>session/delete</h1>
<%
	//session.removeAttribute("no");
	//session.removeAttribute("st");

	session.invalidate(); // 모든세션 종료
	
%>
</body>
</html>