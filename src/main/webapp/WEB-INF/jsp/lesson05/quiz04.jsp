<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c"   uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
	
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSTL fn 라이브러리</title>
<script src="https://code.jquery.com/jquery-3.6.4.js" integrity="sha256-a9jBBRygX1Bh5lt8GZjXDzyOB+bWve9EiO7tROUtj/E=" crossorigin="anonymous"></script>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css" integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-Fy6S3B9q64WdZWQUiU+q4/2Lc9npb8tCaSX9FK7E8HnRr0Jz8D6OP9dO5Vg3Q9ct" crossorigin="anonymous"></script>
</head>
<body>
	<h1>회원 정보 리스트</h1>
	<table class="table text-center">
		<thead>
			<tr>
				<th>No</th>
				<th>이름</th>
				<th>전화번호</th>
				<th>국적</th>
				<th>이메일</th>
				<th>자기소개</th>
			</tr>
		</thead>
		
		<tbody>
		<c:forEach var="member" items="${members}" varStatus="status">
			<tr>
				<td>${status.count}</td>
				<td>${member.name}</td>
				
				<td>
					<c:choose>
						<c:when test="${fn:startsWith(member.phoneNumber,'010-')}">
							${member.phoneNumber}
						</c:when>
						
						<c:otherwise>
							유효하지 않은 전화번호
						</c:otherwise>
					</c:choose>
				</td>
				
				<td>
					<c:set var="A" value="삼국시대"/>
					<c:if test="${fn:substring(member.nationality, 0, 4) eq A}">
						삼국-												
					</c:if>
					${fn:split(member.nationality, " ")[1]}
				</td>
				
				<td>
				<span class="font-weight-bold">${fn:split(member.email, "@")[0]}</span>
				@ ${fn:split(member.email, "@")[1]}
				</td>
				
				<td>
					<c:choose>
						<c:when test="${fn:length(member.introduce) <= 15}">
							${member.introduce}		
						</c:when>
						
						<c:otherwise>
							${fn:substring(member.introduce, 0, 15)} ...
						</c:otherwise>
					</c:choose>
				</td>
			</tr>
		</c:forEach>
		</tbody>
	</table>
</body>
</html>