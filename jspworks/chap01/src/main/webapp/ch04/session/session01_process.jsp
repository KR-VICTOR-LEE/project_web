<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	String userId = request.getParameter("id");
	String userPw = request.getParameter("passwd");
	
	if(userId.equals("today") && userPw.equals("1234")){
		session.setAttribute("userId", userId);
		session.setAttribute("userPw", userPw);
		out.println("세션 설정이 성공했습니다.");
	}else{
		out.println("<script>");
		out.println("alert('아이디나 비밀번호 확인')");
		out.println("history.go(-1)");
		out.println("</script>");
	}
%>
<!-- 세션 가져오기 -->
<p><%=session.getAttribute("userId") %>님이 로그인 했습니다. </p>