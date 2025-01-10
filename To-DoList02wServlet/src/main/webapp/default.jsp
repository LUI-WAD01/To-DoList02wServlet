<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		//Create an array (filled).
		int[] x = {1,2,3,4};
		//Save the array in session scope: ("attribute name", variable name).
		session.setAttribute("sa",x);
	%>
	
	<a href="testloop.jsp">Link for testing</a>
</body>
</html>