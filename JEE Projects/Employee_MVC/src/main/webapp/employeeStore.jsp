<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Employee store</h2>
<form action="EmployeeController" method="post">
<label>Id</label>
<input type="text" name="id"/><br/>
<label>Name</label>
<input type="text" name="name"/><br/>
<label>Salary</label>
<input type="text" name="salary"/><br/>
<input type="submit" value="Store Rec">
<input type="reset" value="reset"> 
</form>
</body>
</html>