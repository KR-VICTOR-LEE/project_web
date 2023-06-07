<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="gugudan" class="bean.GuguBean" />

<h3>구구단 출력하기</h3>
<%
	int dan = Integer.parseInt(request.getParameter("dan"));

	// int[] result = gugudan.times(dan);  //반환된 결과값을 배열에 저장함
	// result[i-1]
			
	
	for(int i=1; i<10; i++){
		out.println(dan + "x" + i + "=" + (dan*i) + "<br>");
	}
%>

