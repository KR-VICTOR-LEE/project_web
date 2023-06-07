<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
   	// 아이디와 비밀번호를 받아와서 인증 처리 및 발금
   	String id = request.getParameter("userid");
   	String pw = request.getParameter("userpw");
   	
   	if(id.equals("admin") && pw.equals("admin1234")){
   		// 세션 발급 후 welecome.jsp로 이동(포워딩)
   		session.setAttribute("userID", id); // (세션이름, 세션값)
   		response.sendRedirect("welcome.jsp");
   	}else{
   		out.println("아이디와 비밀번호가 일치하지 않습니다.");
   	}

%>