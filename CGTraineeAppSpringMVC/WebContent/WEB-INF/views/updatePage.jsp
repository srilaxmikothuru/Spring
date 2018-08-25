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
<center>
		<div>
			<h3>ADD Trainee</h3>
		</div>
		<table>
			<form:form action="updateTrainee" method="post" modelAttribute="trainee">

				<tr>
					<td><form:label path= "traineeId"> Trainee Id</form:label></td>
					<td><form:input path="traineeId" size="30" /></td>
					<td><form:errors path="traineeId" cssClass="error" /></td>
				</tr>
					<tr>
					<td><form:label path= "traineeName"> Trainee Name</form:label></td>
					<td><form:input path="traineeName" size="30" /></td>
					<td><form:errors path="traineeName" cssClass="error" /></td>
				</tr>
			
				<tr>
					<td><form:label path="traineeLocation">Trainee Location</form:label></td>
					<td>
					<form:radiobutton path = "traineeLocation" value="Chennai" label="Chennai"/>
					<form:radiobutton path = "traineeLocation" value="Mumbai" label="Mumbai"/>
					<form:radiobutton path = "traineeLocation" value="Pune" label="Pune"/>
					<td><form:errors path="traineeLocation" cssClass="error" /></td>
					</td>
				</tr>
			
			<tr>
			<td><form:label path="traineeDomain">Trainee Domain</form:label></td>
			<td>
			<form:select path="traineeDomain">
			<form:option value ="JEE">JEE</form:option>
			<form:option value ="SAP">SAP</form:option>
			<form:option value =".Net">.NET</form:option>
			</form:select>
			</td>
			</tr>

				<tr>
					<td><input type="submit" value="Add Trainee"></td>
				</tr>
			</form:form>
		</table>
	</center>
</body>
</html>