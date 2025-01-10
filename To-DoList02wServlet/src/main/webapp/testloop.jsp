<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<!--The array of integer saved in the session scope attribute "${sa}" will iterate over one by one,
& save into the page scope attribute "psa". -->
	<c:forEach var="psa" items="${sa}" varStatus="x">
<!-- 	Print the attribute value. -->
		${x.count}. ${psa} <br />
	</c:forEach>
</body>
</html>