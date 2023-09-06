<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>View Employees</title>
</head>
<body>
  <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
	<h1>Employees List</h1>

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

		<c:forEach items="${lists}" var="u">
			<tr>
				<td>${u.getEmpNo()}</td>
				<td>${u.getFirstName()}</td>
				<td>${u.getLastName()}</td>
				<td>${u.getPhoneNo()}</td>
				<td>${u.getSex()}</td>
				<td>${u.getMidinit()}</td>
				<td>${u.getJob()}</td>
				<td>${u.getSalary()}</td>
				<td>${u.getBonus()}</td>
				<td>${u.getEdLevel()}</td>
				<td>${u.getComm()}</td>
				<td>${u.getWorkDept()}</td>
				<td>${u.getBirthDate()}</td>
				<td>${u.getHireDate()}</td>
			</tr>
		</c:forEach>
	</table>

</body>
</html>
