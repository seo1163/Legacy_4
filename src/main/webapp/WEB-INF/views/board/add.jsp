<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>${board} Add Page</h1>
	
	<form action="./add" method="post" enctyp="multipart/form-data">
		Title<input type="text" name="title" id="title">
		Writer<input type="text" name="writer" id="writer">
		Contents<textarea name="contents" rows="" cols="" id="contents"></textarea>
		
		<div>
			<input type="file" name="files">
			<input type="file" name="files">
			<input type="file" name="files">
		</div>
		<button type="submit">ADD</button>
	
	</form>

	<script src="../resources/js/notijoin.js"></script>
</body>
</html>