<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 11/13/2019
  Time: 2:42 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
  <head>
    <title>Calculator</title>
  </head>
  <body>
  <h1>Simple Calculator</h1>
  <form action="/index" method="get">
  <table style="border: 1px solid">
    <th>
      <td>Calculator</td>
    </th>
    <tr>
      <td>First operand:</td>
      <td><input type="text" name="firstnum"></td>
    </tr>
    <tr>
      <td>Operator:</td>
      <td><select name="operator">
        <option value="+">+</option>
        <option value="-">-</option>
        <option value="*">*</option>
        <option value="/">/</option>
      </select></td>
    </tr>
    <tr>
      <td>Second operand:</td>
      <td><input type="text" name="secondnum"></td>
    </tr>
    <tr>
      <td></td>
      <td><input type="submit" value="Calculator"></td>
    </tr>
  </table>
  </form>
  ${firstNumber}
  ${operator}
  ${secondNumber}
  ${result}
  ${loi}
  </body>
</html>
