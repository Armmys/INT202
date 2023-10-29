<%--
  Created by IntelliJ IDEA.
  User: Armmy
  Date: 28/10/2566
  Time: 23:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body style="background-color: ${cookie.bgColorCookie.value}">
    <h1>Your score is ${requestScope.score}</h1>
    <a href="ResetQuizServlet">Reset</a>
</body>
</html>
