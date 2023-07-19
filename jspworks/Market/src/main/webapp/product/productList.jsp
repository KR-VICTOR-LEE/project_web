<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품 목록</title>
<link rel="stylesheet" href="resources/css/bootstrap.css">
<script src="resources/js/bootstrap.js"></script>
</head>
<body>
	<jsp:include page="../header.jsp" />
	<div class="container my-3">
		<h2 class="text-left mx-4 my-4">상품 목록</h2>
		<div class="row mx-5" align="center">
			<c:forEach items="${productList}" var="product">
				<div class="col-4">
					<img src="./upload/${product.productImage}" style="width: 100%">
					<h3>기종 : ${product.pname}</h3>
					<p>설명 : ${product.description}</p>
					<p>가격 : ${product.unitPrice}원</p>
					<p>
						<a href="/productInfo.do?productId=${product.productId}"
							class="btn btn-secondary">상세정보</a>
					</p>
				</div>
			</c:forEach>
		</div>
	</div>
</body>
</html>