<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Admin</title>

<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
	integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u"
	crossorigin="anonymous">
<style type="text/css">
body {
	background: rgb(174, 238, 236);
	background: radial-gradient(circle, rgba(174, 238, 236, 1) 0%,
		rgba(169, 148, 233, 1) 100%);
}
.container {
	position: relative;
	left: 2%;
	top:200px;
}
h1{
	position: relative;
	top:180px;
	text-align: center;
	padding-bottom: 10px;
	font-weight: bolder;
}
</style>
</head>
<body>
	<h1>Add New Admin</h1>
	<div class="container">
		<div class="row">
			<div class="col-md-6 col-md-offset-3">


				<form:form action="saveAdmin" modelAttribute="loginModel"
					method="post">

					<div class="form-group">
						<label for="username"> UserName </label> :
						<form:input type="text" path="userName" class="form-control"
							id="username" placeholder="Enter username" autofocus="autofocus"></form:input>
					</div>
					<div class="form-group">
						<label for="password">Password</label>:
						<form:input type="password" path="password" id="password"
							class="form-control" placeholder="Enter Password"></form:input>

					</div>

					<div class="form-group">
						<div class="row">
							<div class="col-sm-6 col-sm-offset-3">
								<input type="submit" name="addadmin" id="login-submit"
									class="form-control btn btn-primary" value="ADD ADMIN" />
							</div>
						</div>
					</div>
				</form:form>
			</div>
		</div>
	</div>
</body>
</html>

