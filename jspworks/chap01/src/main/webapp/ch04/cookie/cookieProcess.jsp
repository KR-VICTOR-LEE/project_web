<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	// 아이디와 비밀번호를 받아서 쿠키를 생성
	String id = request.getParameter("userid");
   	String pw = request.getParameter("userpw");
   	
   	if(id.equals("admin") && pw.equals("0000")){
   		// Cookie()의 객체 생성
   		Cookie cookieId = new Cookie("userId", id);
   		Cookie cookiePw = new Cookie("userPw", pw);
   		
   		// 쿠키 생성
   		response.addCookie(cookieId);
   		response.addCookie(cookiePw);
   		out.println("쿠키생성 성공");
   	}else{
   		out.println("쿠키생성 실패");
   	}
%>
