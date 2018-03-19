<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
  <title>Matrimonial</title>
</head>
<body bgcolor="cyan">
<h1>Sign up for matrimony!!!!!!!1</h1>
<h2><font color="red" >${marrige}</font>
<font color="blue">${signupDTO.age}</font> </h2>

<form action="shaadi.bot" method="post">
<pre>
<h3>
Religion  :<input type="text" name="religion">
Gender    :<input type="radio" name="gender" value="Male">Male<input type="radio" name="gender" value="Female">Female<input type="radio" name="gender" value="others">Others
Age       :<input type="text" name="age">
Height    :<input type="text" name="height">
Salary    :<input type="text" name="salary">
Experience:<textarea rows="3" cols="21" name="experience"></textarea>
<input type="submit" value="submit"><input type="reset" value="clear">
</h3>
</pre>
</form>
</body>
</html>