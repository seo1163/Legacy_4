<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<c:import url="../template/header_css.jsp"></c:import>
<link rel="stylesheet" href="../resources/css/table.css">
<link rel="stylesheet" href="../resources/css/list.css">
</head>
<body>
	<c:import url="../template/header.jsp"></c:import>
	<h1 class="title">Qna List Page</h1>
	
	<div>
			<form action="./list" method="get">
				<fieldset>
					<select name="kind">
						<option value="col1">제목</option>
						<option value="col2">본문</option>
						<option value="col3">작성자</option>
					</select>
					<input type="text" name="search" value="${pager.search}">
					<button type="submit">검색</button>
				</fieldset>
			</form>
		</div>

	<table class="table-basic">
		<tr>
			<td>Num</td><td>Title</td><td>Writer</td><td>Date</td><td>Hit</td>
		</tr>
		<c:forEach items="${list}" var="dto">
			<tr>
				<td>${dto.num}</td>
				<td><a href="./detail?num=${dto.num}">${dto.title}</a></td>
				<td>${dto.writer}</td>
				<td>${dto.regDate}</td>
				<td>${dto.hit}</td>
			</tr>

		</c:forEach>
	</table>
	<div>
		<c:if test="${pager.pre}">
			<a href="./list?page=${pager.startNum-1}">PREVIEW</a>
		</c:if>

		<c:forEach begin="${pager.startNum}" end="${pager.lastNum}" var="i">
			<a href="./list?page=${i}">${i}</a>
		</c:forEach>

		<c:if test="${pager.next}">
			<a href="./list?page=${pager.lastNum+1}">NEXT</a>
		</c:if>
	</div>
	<a href="./add">ADD</a>
</body>
</html>