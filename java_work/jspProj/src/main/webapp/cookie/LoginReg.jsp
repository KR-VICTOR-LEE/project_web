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
	Member m = new Member("aaa", "장동건", "1111");

	m = new Member("bbb", "장서건", "2222");
	m = new Member("ccc", "장동건", "3333");
	m = new Member("ddd", "장남건", "1111");
	m = new Member("eee", "북두신건", "3333");

	//String dbid = "aaa" , dbpw = "1234", dbPname="장동건";
	String pid = request.getParameter("pid");
	String pw = request.getParameter("pw");
	String msg = "로그인 실패";

	for (Member a : m) {
		if (pid.equals(a.getPid()) && pw.equals(a.getPw())) {
			msg = "로그인 성공";
			response.addCookie(new Cookie("pid", a.getPid()));
			response.addCookie(new Cookie("pw", a.getPw()));
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