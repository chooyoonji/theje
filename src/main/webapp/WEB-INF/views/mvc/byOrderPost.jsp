<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>POST</h1>

	<table border="">
		<tr>
			<td>id</td>
			<td>제품명</td>
			<td>수량</td>
			<td>가격</td>
			<td>금액</td>
		</tr>
<c:forEach var="pro" items="${byOrder.proList}">
		
		<tr>
			<td>${pro.id}</td>
			<td>${pro.name}</td>
			<td>${pro.cnt}</td>
			<td>${pro.price}</td>
			<td>${pro.total}</td>
		</tr>
	
</c:forEach>
		<tr>
			
			<td colspan="5" align="right">합계: ${byOrder.sum}</td>
		</tr>
		<tr>
			<td rowspan="3">배송지</td>
			<td>우편번호</td>
			<td>${byOrder.addr.zipcode}</td>
		</tr>
		<tr>
			<td>기본주소</td>
			<td>${byOrder.addr.addr1}</td>
		</tr>
		<tr>
			<td>상세주소</td>
			<td>${byOrder.addr.addr2}</td>
		</tr>
		
	</table>

</body>
</html>