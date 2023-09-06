<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Db2 Employee Project</title>
</head>
<body>
<form action="Employee/getById" method="GET">
        <label for="employeeId">Employee ID:</label>
        <input type="text" id="employeeId" name="id">
        <input type="submit" value="View Details">
    </form>
</body>
</html>