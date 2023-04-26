<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSTL fmt 라이브러리</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css" integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-Fy6S3B9q64WdZWQUiU+q4/2Lc9npb8tCaSX9FK7E8HnRr0Jz8D6OP9dO5Vg3Q9ct" crossorigin="anonymous"></script>
<script src="https://code.jquery.com/jquery-3.6.4.js" integrity="sha256-a9jBBRygX1Bh5lt8GZjXDzyOB+bWve9EiO7tROUtj/E=" crossorigin="anonymous"></script>
</head>
<body>
	<h1>1.후보자 득표율</h1>
	<table class="table text-center">
		<thead>
			<tr>
				<th>기호</th>
				<th>득표 수</th>
				<th>득표 율</th>
			</tr>
		</thead>
		
		<tbody>
		<c:forEach var="candidate" items="${candidate}" varStatus="status">
			<tr>
				<td>${status.count}</td>
				<td><fmt:formatNumber value="${candidate}" type="number"/></td>
				<td>
				<fmt:formatNumber value="${candidate / total}" type="percent"/>
				</td> 
			</tr>
		</c:forEach>
		</tbody>
	</table>	
</body>
</html>