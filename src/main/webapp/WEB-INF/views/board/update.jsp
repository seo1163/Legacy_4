<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
		<h1>${board} Update Page</h1>
		
		<form action="./update" method="POST">
			<input type="hidden" readonly="readonly" name="num" value="${dto.num}">
			<input type="text" name="title" value="${dto.title}">
			<input type="text" name="writer" value="${dto.writer}">
			<textarea rows="" cols="" name="contents">${dto.contents}</textarea>			
			
		
			
			<input type="submit" value="ADD">
			<button type="button">ADD</button>
		</form>
</body>
</html>