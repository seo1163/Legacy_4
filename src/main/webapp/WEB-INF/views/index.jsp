<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
	<c:import url="./template/header_css.jsp"></c:import>
	<script type="text/javascript"></script>
</head>
<body>
	<c:import url="./template/header.jsp"></c:import>
	<div>
		<img alt="" src="./resources/images/KakaoTalk_20220118_180408662.jpg">
	</div>
	
	<h1>Index Page</h1>
	<h3>${member.name} 님 환영합니다 
	<span class="material-icons-outlined">
		account_circle
	</span> 

	</h3>
	
	
	<div>
		<c:if test="${not empty member}">
			<a class="my" href="./member/mypage">MyPage</a>
			<a href="./member/logout">Logout</a>
		</c:if>
		
		<c:if test="${empty member}">
			<a href="./member/login">Login</a>
			<a href="./member/join">Join</a>
		</c:if>
	
	</div>
	
	<img alt="" src="./resources/upload/member/3231efc4-47c8-42cd-aee2-b185c44ffbf0_KakaoTalk_20220308_154117058.jpg">
</body>
</html>