<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Billing Page</title>
</head>
<body>
<form action="bill.toll"method="post">
<pre>
   Vehicle Number:<input type="text" name=vehicleNo>
   Vehicle Type:<select name="vechileType">
   <option value="Two Wheeler">Two Wheeler</option>
   <option value="Two Wheeler">Three Wheeler</option>
   <option value="Two Wheeler">Four Wheeler</option>
   
   </select>
   Select Way:<input type="checkbox" name="way">1 way &nbsp;<input type="checkbox" name="way">2 Way
   Amount: <select name="amount">
   <option value="150">150</option>
   <option value="200">200</option>
   <option value="300">300</option>
   
   </select>
   <input type="submit" value="pay">&nbsp;&nbsp;<input type="reset" value="clear">
   
</pre>

</form>
</body>
</html>