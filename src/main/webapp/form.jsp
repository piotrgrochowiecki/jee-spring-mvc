<%--
  Created by IntelliJ IDEA Ultimate.
  User: piotr
  Date: 10.04.2022
  Time: 12:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page isELIgnored="false" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>First Form handled by Spring!</title>
</head>
<body>
<form action="/form" method="post">
    Name:
    <input type="text" name="paramName">
    Date:
    <input type="date" name="paramDate">
    <input type="submit" name="submit">
</form>
</body>
</html>
