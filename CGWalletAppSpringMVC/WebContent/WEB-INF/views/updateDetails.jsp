<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<center>
		<div style="background-color: green">
			<h3>Update Here</h3>
		</div>

		<form action="updateCustomerDetails" method="post" name="fundTransferFrm">
			<table>
			    <tr>
					<td>Enter Your Mobile Number To Update Name</td>
					<td><input type="text" name="mobileNo" /></td>
				</tr>	
				<tr>
					<td>Enter Name</td>
					<td><input type="text" name="name" /></td>
				</tr>
							
				<tr>
					<td><input type="submit" value="Update"></td>
				</tr>
			</table>
		</form>

	</center>
</body>
</html>