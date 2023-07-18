<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품 정보</title>
</head>
<body>
	<h2>상품 정보</h2>
	<hr>
	<table>
		<ul>
			<li>상품코드 : ${product.pid}</li>
			<li>상품이름 : ${product.pname}</li>
			<li>제조사 : ${product.maker}</li>
			<li>가격 : ${product.price}</li>
			<li>등록일 : ${product.date}</li>
		</ul>
	</table>

</body>
</html>