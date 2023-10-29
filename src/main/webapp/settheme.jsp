<%--
  Created by IntelliJ IDEA.
  User: Armmy
  Date: 29/10/2566
  Time: 14:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Select your Theme</title>
</head>
<body style="background-color: ${cookie.bgColorCookie.value}">
    <H2>Select your Theme</H2>
<form action="SetThemeColor" method="post">
    <p>
        <input type="radio" name="bg" value="mediumpurple">
        <button style="background-color: mediumpurple">mediumpurple</button>
    </p>
    <p>
        <input type="radio" name="bg" value="green">
        <button style="background-color: green">green</button>
    </p>
    <p>
        <input type="radio" name="bg" value="blue">
        <button style="background-color: blue">blue</button>
    </p>
    <input type="submit" value="ok">
</form>
</body>
</html>
