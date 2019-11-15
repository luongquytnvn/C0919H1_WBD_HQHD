<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 11/14/2019
  Time: 4:36 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Create Product</title>
</head>
<body>
<p>
    <c:if test='${requestScope["message"] != null}'>
        <span class="message">${requestScope["message"]}</span>
    </c:if>
</p>
<p>
<a href="/products">Back to customer list</a>
</p>
<form method="post">
<fieldset>
<legend>Pruduct information</legend>
<table>
    <tr>
        <td>Name: </td>
        <td><input type="text" name="name" id="name"></td>
    </tr>
    <tr>
        <td>Price: </td>
        <td><input type="number" name="price" id="price"></td>
    </tr>
    <tr>
        <td>Description: </td>
        <td><input type="text" name="description" id="description"></td>
    </tr>
    <tr>
        <td>Manufacturer: </td>
        <td><input type="text" name="manufacturer" id="manufacturer"></td>
    </tr>
    <tr>
        <td></td>
        <td><input type="submit" value="Create product"></td>
    </tr>
</table>
</fieldset>
</form>
</body>
</html>
