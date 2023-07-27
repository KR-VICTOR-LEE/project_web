<%@page import="java.util.Arrays"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>numReg</title>
</head>
<body>
	<%
		String [] noArr = request.getParameterValues("no");
		
		String no = request.getParameter("no");
		
		int result = Integer.parseInt(no);
	%>
		noArr : <%=Arrays.toString(noArr) %><br/>
	<%
		
		int a = 0;
		int b = 0;
		int sum = 0;
		for(String str : noArr){
			int c = Integer.parseInt(str);
			if(c%2 == 0){
				a += c;
			}else{
				b += c;
			}
			sum += c;
		}
		out.print("홀수의 합 : " + b + "<br/>");
		out.print("짝수의 합 : " + a + "<br/>");
		out.print("수의 합 : " +sum + "<br/>");
	%>
		
	

</body>
</html>