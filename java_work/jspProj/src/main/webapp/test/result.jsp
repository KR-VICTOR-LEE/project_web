<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>result</title>
</head>
<body>
<%
	String num1 = request.getParameter("num1");
	String num2 = request.getParameter("num2");
	
	int result1 = Integer.parseInt(num1);
	int result2 = Integer.parseInt(num2);
%>
<%
	out.println("합계" + (result1 + result2));
%>	
</body>
</html>