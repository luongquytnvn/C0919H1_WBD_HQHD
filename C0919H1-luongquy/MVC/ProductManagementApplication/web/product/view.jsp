<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 11/14/2019
  Time: 10:01 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Product details</title>
</head>
<body>
<form>
    <fieldset>
        <legend><h2>Product details</h2></legend>
        <table>
            <tr>
                <td>Name:</td>
                <td>${product.getName()}</td>
            </tr>
            <tr>
                <td>Price:</td>
                <td>${product.getPrice()}</td>
            </tr>
            <tr>
                <td>Description:</td>
                <td>${product.getDescription()}</td>
            </tr>
            <tr>
                <td>Manufacturer:</td>
                <td>${product.getManufacturer()}</td>
            </tr>
            <tr>
                <td><a href="/products">Back to customer list</a></td>
                <td></td>
            </tr>
        </table>
    </fieldset>
</form>
</body>
</html>
