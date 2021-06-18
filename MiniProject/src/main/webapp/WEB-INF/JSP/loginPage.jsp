<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>

<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
	integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u"
	crossorigin="anonymous">
<style>

.error {
	color: red;
	font-size: medium;
}
body{
background: rgb(174, 238, 236);
	background: radial-gradient(circle, rgba(174, 238, 236, 1) 0%,
		rgba(169, 148, 233, 1) 100%);
}
.container {
	position: relative;
	left:5%;
	top :150px;
}
.container h1{
	text-align: center;
	font-size: 35px;
}
.heading{
	padding: 0;
	margin: 0;
	height : 80px;
 	text-align: center;
 	align-content :center;
 	font-weight: bolder;
 	font-family: serif;
 	font-size: 50px;
 	color: #b71c1c;
 	background-color: #90caf9;
}
</style>
</head>
<body>

	<h1 class="heading">Employee Management System</h1>
	<div class="container">
		<div class="row">
			<div class="col-md-6 col-md-offset-3">

				<h1>Login</h1>
				<form:form  action="login"  modelAttribute ="empModel" method="post">

					<%-- <!-- error message -->
					<div th:if="${param.error}">
						<div class="alert alert-danger">Invalid username or
							password.</div>
					</div>

					<!-- logout message -->
					<div if="${param.logout}">
						<div class="alert alert-info">You have been logged out.</div>
					</div> --%>

					<div class="form-group">
						<label for="username"> UserName </label> :
						 <form:input type="text" path="userName"  
							class="form-control" id="username" 
							placeholder="Enter username" autofocus="autofocus"></form:input>
							<form:errors path="userName" cssClass="error"></form:errors>
					</div>

					<div class="form-group">
						<label for="password">Password</label>: 
						<form:input type="password"  path="password"  
							id="password" class="form-control"
							placeholder="Enter Password" ></form:input>
							<form:errors path="password" cssClass="error"></form:errors>
					</div>

					<div class="form-group">
						<div class="row">
							<div class="col-sm-6 col-sm-offset-3">
								<input type="submit" name="login-submit" id="login-submit"
									class="form-control btn btn-primary" value="Log In" />
							</div>
						</div>
					</div>
				</form:form>
				
			</div>
		</div>
	</div>
</body>
</html>