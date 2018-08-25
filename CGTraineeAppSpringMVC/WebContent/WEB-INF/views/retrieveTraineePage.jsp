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
<table>
			<form:form action="retrieveTrainee" method="post" modelAttribute="trainee">

				<tr>
					<td><form:label path= "traineeId"> Trainee Id</form:label></td>
					<td><form:input path="traineeId" size="30" /></td>
					<td><form:errors path="traineeId" cssClass="error" /></td>
				</tr>
				<tr>
					<td><input type="submit" value="retrieve"></td>
				</tr>
				</form:form>
				</table>
</body>
</html>