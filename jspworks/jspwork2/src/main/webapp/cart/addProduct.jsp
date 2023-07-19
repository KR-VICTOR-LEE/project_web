<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
	request.setCharacterEncoding("utf-8");
	String product = request.getParameter("product");
%>

<script>
	alert("<%=product %>가(이) 추가되었습니다.");
	history.go(-1);
</script>