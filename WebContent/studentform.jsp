<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="./addstudent" method="post">
<input type="text" name="name" placeholder="Enter the name of student" value=""/><br><br>
<input type="email" name="email" placeholder="Enter your email" value=""/><br><br>
<input type="text" name="address" placeholder="Enter your address" value=""/><br><br>
<input type="submit" value="add student"/>
</form>
</body>
</html>