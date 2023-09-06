<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Db2 Employee Project</title>
</head>
<body>
 <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
 <%@page import ="com.entity.Employee,com.service.EmployeeServiceClass" %>
     <% Employee employee = (Employee) request.getAttribute("employee"); %>
    
	<h1>Employee Information</h1>

	<table border="1" width="100%">
		<tr>
			<th>EmpNo</th>
			<th>FirstName</th>
			<th>LastName</th>
			<th>PhoneNo</th>
			<th>Sex</th>
			<th>Midinit</th>
			<th>Job</th>
			<th>Salary</th>
			<th>Bonus</th>
			<th>EdLevel</th>
			<th>Comm</th>
			<th>WorkDept</th>
			<th>BirthDate</th>
			<th>HireDate</th>
		</tr>
		<tr>
				<td>${employee.getEmpNo()}</td>
				<td>${employee.getFirstName()}</td>
				<td>${employee.getLastName()}</td>
				<td>${employee.getPhoneNo()}</td>
				<td>${employee.getSex()}</td>
				<td>${employee.getMidinit()}</td>
				<td>${employee.getJob()}</td>
				<td>${employee.getSalary()}</td>
				<td>${employee.getBonus()}</td>
				<td>${employee.getEdLevel()}</td>
				<td>${employee.getComm()}</td>
				<td>${employee.getWorkDept()}</td>
				<td>${employee.getBirthDate()}</td>
				<td>${employee.getHireDate()}</td>
			</tr>
		</table>
</body>
</html>