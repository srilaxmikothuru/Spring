<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form action="loginTrainee" method="post" >
<table cellpadding="6",cellspacing="2",align="left">
<tr>
<td>UserName</td>
<td><input type="text" name="name"/></td>

</tr>
<tr>
<td>Password</td>
<td><input type="password" name = "password"/></td>

</tr>
<tr>
<input type="submit" value= "Login"/>


</table>
</form:form>
</body>
</html>