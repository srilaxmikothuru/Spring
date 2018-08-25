<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table>
	<tr>
				<th>Trainee ID</th>
				<th>Trainee Name</th>
				<th>Trainee Location</th>
				<th>Trainee Domain</th>
			</tr>

	<c:forEach items="${trainee}" var="detail">
	<tr>
	<td>${detail.traineeId}</td>
	<td>${detail.traineeName}</td>
	<td>${detail.traineeLocation}</td>
	<td>${detail.traineeDomain}</td>
	</tr>
	</c:forEach>

	</table>
</body>
</html>