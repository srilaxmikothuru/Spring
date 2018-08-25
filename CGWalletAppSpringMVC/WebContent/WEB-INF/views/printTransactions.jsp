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
		</div>

		<form action="printTransaction" method="post" name="printTransferFrm">
			<table>
				<tr>
					<td>Enter Mobile Number</td>
					<td><input type="text" name="mobileNo1" /></td>
				</tr>
				<tr>
					<td><input type="submit" value="Print"></td>
				</tr>				
			</table>
		</form>

	</center>
</body>
</html>