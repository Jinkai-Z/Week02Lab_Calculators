<%-- 
    Document   : ArithmeticCalculator
    Created on : 27-Sep-2020, 12:51:15 PM
    Author     : 782290
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Arithmetic Calculator</title>
</head>
<body>
<h1>Arithmetic Calculator</h1>
<form method="post" action="arithmetic">
    <label>First: </label>
    <input type="text" name="first" value="${first}">
    <br>
    <label>Second: </label>
    <input type="text" name="Second" value="${second}">
    <br>
    <input type="submit" name="add" value="+">
    <input type="submit" name="sub" value="-">
    <input type="submit" name="mul" value="*">
    <input type="submit" name="div" value="/">
</form>
${message}

<br>
<a href="/age">Age Calculator</a>
</body>
</html>
