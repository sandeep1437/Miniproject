<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Employee Management</title>
<link href='<c:url value="/resources/css/homepage.css" />'
	rel="stylesheet">
<link rel="preconnect" href="https://fonts.gstatic.com">
<link
	href="https://fonts.googleapis.com/css2?family=Open+Sans+Condensed:ital,wght@0,300;1,300&display=swap"
	rel="stylesheet">
<style type="text/css">
</style>
</head>
<body>
	<div class="top">
		<div class="center">
			<div class="nav">

				<ul>
					<h1>Employee Resources</h1>
					<li><a href="home">Home</a></li>
					<li><a href="addEmployee">Add Employee</a></li>
					<li><a href="addAdmin">Admin Access</a></li>
					<li><a href="logout" class="right">Logout</a></li>

				</ul>
			</div>
			<div class="sort">
				<form  action="SearchByDesignation">
					Search By Designation <input type="text" name="design"
						align="middle"> <input type="submit" value="Search"
						class="btn">
				</form>
			</div>

				<h1 class="heading">Employee List</h1>
				<table>
					<th>ID</th>
					<th>Name</th>
					<th>Email</th>
					<th>designation</th>
					<th>phoneNumber</th>
					<th>Experience</th>
					<th>Action</th>

					<c:forEach var="employee" items="${listEmployee}">

						<!-- construct an "update" link with customer id -->
						<c:url var="updateLink" value="/updateForm">
							<c:param name="employeeId" value="${employee.id}" />
						</c:url>

						<!-- construct an "delete" link with customer id -->
						<c:url var="deleteLink" value="/delete">
							<c:param name="employeeId" value="${employee.id}" />
						</c:url>
						<tr>
							<td>${employee.id}</td>
							<td>${employee.name}</td>
							<td>${employee.email}</td>
							<td>${employee.designation}</td>
							<td>${employee.phoneNumber}</td>
							<td>${employee.experience}</td>

							<td>
								<!-- display the update link --> <a href="${updateLink}">Update</a>
								| <a href="${deleteLink}"
								onclick="if (!(confirm('Are you sure you want to delete this customer?'))) return false">Delete</a>
							</td>
						</tr>
					</c:forEach>
				</table>
		</div>
	</div>

</body>
</html>