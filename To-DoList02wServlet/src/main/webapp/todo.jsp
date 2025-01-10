<%@ page language="java" contentType="text/html; charset=BIG5"
    pageEncoding="BIG5"%>
<!-- Need to add jstl library in order to use those c tag. -->
<%-- <%@taglib prefix="c" uri="jakarta.tags.core"%> --%>
<%-- <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> --%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="BIG5">
<title>Todo List</title>
</head>
<body>
	<h1>Todo List</h1>
	<ul>
		<c:forEach items="${requestScope.todoList}" var="todo" varStatus="status">
			<li>${status.index + 1}. ${todo.description}
				<c:if test="${todo.completed}"> - Completed</c:if>
				<form action="ToDoServlet" method="post">
					<input type="hidden" name="action" value="complete">
					<input type="hidden" name="index" value="${status.index}">
					<input type="submit" value="Complete">
				</form>
			</li>
		</c:forEach>
	</ul>
	<br>
	<a href="index.html">Back to Home</a>
</body>
</html>