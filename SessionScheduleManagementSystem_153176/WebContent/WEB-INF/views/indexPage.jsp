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
	<h1>Welcome to Faculty training portal</h1>
	<div align="center">
		<form:form action="list" method="post">
			<input type="submit" value="ScheduledSessionPage">
		</form:form>
	</div>
</body>
</html>