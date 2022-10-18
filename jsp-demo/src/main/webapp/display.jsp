<%@page import="com.jspDemo.*"%>
<%@page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Display Page</title>
</head>
<body>
	<%
	
	CrudOperations op = new CrudOperations();
	List<Student> batch = op.getAll();
	
	out.println("Username:			Password:");
	for(Student s:batch){
		out.println(s.getName()+"			"+s.getPassword());
	}%>
</body>
</html>