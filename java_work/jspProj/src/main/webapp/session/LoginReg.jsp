<%@page import="login.Member"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>로그인 처리</title>
</head>
<body>
	<h1>로그인 처리</h1>
	<%
	Member[] members = {
		new Member("aaa", "장동건", "1111"),
		new Member("ccc", "장동건","3333"),
		new Member("bbb", "장서건","3333"),
		new Member("eee", "장남건","3333"),
		new Member("ddd", "장일건","1111")
		
	};

	String pid = request.getParameter("pid");
	String pw = request.getParameter("pw");
	String msg = "로그인 실패";
	
	for(Member a : members){
		if(pid.equals(a.getPid()) && pw.equals(a.getPw())){
			msg = "로그인성공";
			session.getAttribute("")
		}
	}
	
	%>
	<script type="text/javascript">
		alert("<%=msg%>
		")
		location.href = "logMain.jsp"
	</script>
</body>
</html>