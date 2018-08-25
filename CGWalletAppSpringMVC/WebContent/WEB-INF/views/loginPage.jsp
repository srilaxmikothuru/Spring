<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
<style>
.error {
	color: red;
	font-weight: bold;
}
</style>
</head>
<body>
	<center>
		<div style="background-color: green">
			<h3>Login here</h3>
		</div>
		<form action="loginCustomer" method="post" name="customerFrm">
			<table>
				<tr>
					<td>Enter Mobile Number</td>
					<td><input type="text" name="mobileNo" /></td>
				</tr>
				<tr>
					<td><input type="submit" value="Login"></td>
				</tr>
			</table>
		</form>

		<div>
			<font color="red"> <c:if test="${not empty errorMessage}">
		  ${errorMessage}
		</c:if>
			</font>

		</div>

	</center>
</body>
</html>