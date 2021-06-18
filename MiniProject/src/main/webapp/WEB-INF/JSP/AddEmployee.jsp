<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html lang="en" xmlns:th="http://www.thymeleaf.org">
<head>
<style type="text/css">
.form {
	text-align: center;
}
</style>
<meta charset="ISO-8859-1">
<title>Employee Management System</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
	integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO"
	crossorigin="anonymous">

<style type="text/css">
body {
	background: rgb(174, 238, 236);
	background: radial-gradient(circle, rgba(174, 238, 236, 1) 0%,
		rgba(169, 148, 233, 1) 100%);
		overflow: hidden;
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
	<h2>ADD EMPLOYEE</h2>
	<div class="container">


		<form:form action="saveEmployee" modelAttribute="employeeModel"
			method="get" cssClass="posi">
			<form:label path="name">Employee Name:</form:label>
			<form:input type="text" path="name" placeholder=" Name"
				class="form-control mb-4 col-4" />

			<form:label path="designation">Employee Designation:</form:label>
			<form:input type="text" path="designation" placeholder=" designation"
				class="form-control mb-4 col-4" />

			<form:label path="email">Employee Email Id:</form:label>
			<form:input type="text" path="email" placeholder=" Email"
				class="form-control mb-4 col-4" />

			<form:label path="phoneNumber">Employee Phone Number:</form:label>
			<form:input type="text" path="phoneNumber"
				placeholder=" Phone number" class="form-control mb-4 col-4" />

			<form:label path="experience">Employee Experience:</form:label>
			<form:input type="text" path="experience" placeholder="Experience"
				class="form-control mb-4 col-4" />

			<input type="submit" value="Add Employee" class="btn btn-info col-2" />
		</form:form>
	</div>



</body>
</html>