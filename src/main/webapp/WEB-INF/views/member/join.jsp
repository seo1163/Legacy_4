<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Member Join Page</h1>
	
	<div>
		<form action="./join" method="post" id="frm">
			<fieldset>
				<legend>ID</legend>
				<input type="text" name="id" id="id">
				<div id="idResult"></div>
			</fieldset>
			
			<fieldset>
				<legend>Password</legend>
				<input type="password" id="pw" name="pw" placeholder="8글자 이상 12글자 이하">
				<div id="pwResult"></div>
			</fieldset>
			
			<fieldset>
				<legend>Password 확인</legend>
				<input type="password" id="pw2" name="pw2" placeholder="8글자 이상 12글자 이하">
				<div id="pwResult2"></div>
			</fieldset>
			
			<fieldset>
				<legend>Name</legend>
				<input type="text" name="name" id="name">
				<div id="nameResult"></div>
			</fieldset>
			
			<fieldset>
				<legend>Phone</legend>
				<input type="text" name="phone" id="phone">
				<div id="phResult"></div>
			</fieldset>
			
			<fieldset>
				<legend>Email</legend>
				<input type="text" name="email" id="email">
				<div id="emailResult"></div>
			</fieldset>
			
			<fieldset>
				<button type="button" id="btn">JOIN</button>
			</fieldset>
		
			
		</form>
	</div>

	<script type="text/javascript" src="../resources/js/join2.js"></script>
</body>
</html>