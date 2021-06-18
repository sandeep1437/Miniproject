<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html lang="en" xmlns:th="http://www.thymeleaf.org">
<head>
<meta charset="ISO-8859-1">
<title>Employee Management System</title>

<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
<style type="text/css">
body {
	background: rgb(174, 238, 236);
	background: radial-gradient(circle, rgba(174, 238, 236, 1) 0%,
		rgba(169, 148, 233, 1) 100%);
}

.container {
	position: relative;
	left: 27%;
}
h1{
	text-align: center;
	padding-bottom: 10px;
	font-weight: bolder;
}
h2{
	text-align: center;
	font-weight: bold;
	text-decoration: underline;
	
}
</style>
</head>
<body>
	<h1>Employee Management System</h1>
	<h2>Update Employee</h2>
	<div class="container">


		<form:form action="edit" modelAttribute="employeeModel1" method="get">

			<!-- Add hidden form field to handle update -->
			<form:input type="hidden" path="id" />

			<form:input type="text" path="name" class="form-control mb-4 col-4" />

			<form:input type="text" path="email" class="form-control mb-4 col-4" />

			<form:input type="text" path="designation"
				class="form-control mb-4 col-4" />
			<form:input type="text" path="phoneNumber"
				class="form-control mb-4 col-4" />
			<form:input type="text" path="experience"
				class="form-control mb-4 col-4" />

			<input type="submit" value="UpdateEmployee"
				class="btn btn-info col-2" />
		</form:form>


	</div>
</body>
</html>