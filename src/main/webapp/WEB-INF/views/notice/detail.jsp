<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Notice Detail Page</h1>
	
	<h3>Title : ${dto.title}</h3>
	<h3>Writer : ${dto.writer}</h3>
	<h3>Contents : ${dto.contents}</h3>
	
	<a href="./list">List</a>
	<a href="./update?num=${dto.num}">Update</a>
	<a href="./delete?num=${dto.num}">Delete</a>
</body>
</html>