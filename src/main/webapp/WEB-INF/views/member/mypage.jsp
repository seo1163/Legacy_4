<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>Mypage</h1>

	<h3>${dto.id}</h3>
	<h3>${dto.name}</h3>
	<h3>${dto.phone}</h3>
	<h3>${dto.email}</h3>
	<img alt="" src="../resources/upload/member/${dto.memberFileDTO.fileName}">
	<a href="./photoDown?fileNum=${dto.memberFileDTO.fileNum}">${dto.memberFileDTO.oriName}</a>
	<h3>${dto.memberFileDTO.oriName}</h3>
</body>
</html>