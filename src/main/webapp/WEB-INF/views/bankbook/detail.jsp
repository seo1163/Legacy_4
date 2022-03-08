<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<c:import url="../template/header_css.jsp"></c:import>
</head>
<body>
	<h1>Bankbook Detail Page</h1>
	<h3>Name : ${dto.bookName}</h3>
	<h3>Contents : ${dto.bookContents}</h3>

	<a href="./list">List</a>
	<a href="./update?bookNumber=${dto.bookNumber}">update</a>
	<a href="./delete?bookNumber=${dto.bookNumber}">Delete</a>
</body>
</html>