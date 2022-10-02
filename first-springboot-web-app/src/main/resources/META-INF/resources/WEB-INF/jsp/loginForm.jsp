<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Login Form</title>
	</head>
<body>
	<div class="container">
	<h1>Welcome</h1>
	<form method="post">
	<font color="red">${incorrect} </font>
		Name : <input type="text" name="name">
		Password : <input type="password" name="password">
		<input type="submit" name="submit" value="submit">
	</form>
	</div>
</body>
</html>