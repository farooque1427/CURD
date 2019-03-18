<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration</title>
</head>
<body>
<form action="registration" method="post">
	<div align="center">
		<div style="width:50%;" align="center">
			<h1>::Registration::</h1>
			
			<div align="right" style="width:50%; " >
				First Name::<input type="text" name="fname"/><br><br>
				Last Name ::<input type="text" name="lname"/><br><br>
				D.O.B.::<input type="text" name="dob"/><br><br>
				Mobile no.::<input type="number" name="mno"/><br><br>
				Password ::<input type="password" name="pass"/><br><br>
			</div>
		<input type="submit" value="Registration"/>
		
		</div>
	</div>
</form>
</body>
</html>