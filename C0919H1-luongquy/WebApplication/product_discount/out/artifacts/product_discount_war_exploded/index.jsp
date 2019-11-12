<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 11/12/2019
  Time: 4:19 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Calculate Discount</title>
  </head>
  <body>
  <form method="post" action="/display-discount">
  <h2>Product Description</h2>
    <input type="text" name="Description" placeholder="Description"><br/>
    <h2>List Price</h2>
    <input type="text" name="Price" placeholder="USD"><br/>
    <h2>Discount Percent</h2>
    <input type="text" name="Percent" placeholder="%"><br/><br/>
    <input type="submit" value="Calculate Discount">
  </form>
  </body>
</html>
