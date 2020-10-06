<%@page import="com.durga.beans.Student"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.durga.dao.StudentDao"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<table border="1">
<tr>
<td>Name</td>
<td>Email</td>
<td>Address</td>
</tr>
<%
ArrayList<Student> studentlist=StudentDao.selectStudent();
for(Student s:studentlist)
{
		
%>
<tr>
<td><% out.print(s.getName()); %></td>
<td><% out.print(s.getEmail()); %></td>
<td><% out.print(s.getAddress()); %></td>
</tr>
<%} %>
</table>
</body>
</html>