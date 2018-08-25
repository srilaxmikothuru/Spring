<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
<head>
<style>
h1 {
	background-color: orange;
	color: purple;
}

body {
	background-color: lightyellow;
}
</style>
</head>
<body>
	<h1>Scheduled Sessions</h1>
	<table>
		<tr>
			<th>Session id</th>
			<th>SessionName</th>
			<th>Duration(Days)</th>
			<th>Faculty</th>
			<th>Mode</th>
		</tr>
		<c:forEach items="${list}" var="detail">
			<tr>
				<td><c:out value="${detail.id}" /></td>
				<td><c:out value="${detail.name}" /></td>
				<td><c:out value="${detail.duration}" /></td>
				<td><c:out value="${detail.faculty}" /></td>
				<td><c:out value="${detail.mode1}" /></td>
				<td><a href="EnrollMe/${detail.name}">EnrollMe</a></td>

			</tr>
		</c:forEach>
	</table>

	<div>
		<font color='red'><c:if test="${not empty errorMessage}">
	${errorMessage}
	</c:if> </font>
	</div>


</body>
</html>