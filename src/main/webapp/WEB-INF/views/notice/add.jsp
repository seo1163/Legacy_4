<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Notice Add Page</h1>
	
	<form action="./add" method="post">
		Title<input type="text" name="title">
		Writer<input type="text" name="writer">
		Contents<textarea name="contents" rows="" cols=""></textarea>
		<button type="submit">ADD</button>
	
	</form>
</body>
</html>