<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Get All Customers</title>
</head>
<body>
	<div style="background-color: green">
		<h2>Customers Whose Balance Less Than 1000 are:</h2>
		<br>
	</div>
	<table style="width: 100%">
		
			<tr>
				<td><h3>Name</h3></td>
				<td><h3>Mobile Number</h3></td>
				<td><h3>Balance</h3></td>
			</tr>
			<c:forEach items="${customer}" var="detail">
				<tr>
					<td><c:out value="${detail.name}"/></td>					
					<td><c:out value="${detail.mobileNo}"/></td>
					<td><c:out value="${detail.wallet.balance}"/></td>
				</tr>
			</c:forEach>
		
	</table>
</body>
</html>