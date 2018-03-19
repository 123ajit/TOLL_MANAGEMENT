<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Search Admin Page</title>
<style>
div {
	background-color: #e6f2ef;
	margin: auto;
	width: 80%;
	border: 3px solid grey;
	border-radius: 10px;
	padding: 10px;
}
select {
    padding: 16px 20px;
    border: 2px solid grey;
    border-radius: 4px;
    background-color: #f1f1f1;
}
input[type=text],input[type=email] {
    padding: 12px 20px;
    margin: 8px 0;
    border: 2px solid grey;
    border-radius: 4px;
    box-sizing: border-box;
    width: 40%;
    height: 3%;
}
input[type=submit],input[type=reset] {
    padding: 12px 20px;
    margin: 8px 0;
    border: 2px solid grey;
    border-radius: 4px;
    box-sizing: border-box;
    width: 10%;
    height: 3%;
}
h1 {
	text-align: center;
}
</style>
</head>
<body>
	
	<div align="center">
	<h1>Search Details Page</h1>
	<hr>
		<form action="search.toll" method="post">
		${msg} 
			<br> Name:<input type="text" name="username"><br>
			<br> Email:<input type="email" name="email"><br>
			<br> Choose Toll:<select name="choosetoll">
				<option value="Noida">Noida</option>
				<option value="HauzKhas">HauzKhas</option>
				<option value="Saket">Saket</option>
				<option value="Gurgaon">Gurgaon</option>
			</select><br>
			
			<input type="submit" value="Add">&nbsp;<input type="reset" value="Clear"><br>
			<br>
		</form>
		<hr>
	<h5> Toll Managemeny System</h5>
	</div>
</body>
</html> 