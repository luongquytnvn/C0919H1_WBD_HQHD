<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 11/13/2019
  Time: 11:29 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
  <head>
    <title>Customer List</title>
  </head>
  <body>
  <h1 style="text-align: center">Danh sách khách hàng</h1>
  <table border="1">
    <tr>
      <td>Tên</td>
      <td>Ngày sinh</td>
      <td>Địa chỉ</td>
      <td>Ảnh</td>
    </tr>
  <c:forEach items="${customers}" var="customer">
    <tr>
      <td><c:out value="${customer.name}"></c:out></td>
      <td>${customer.dateOfBirth}</td>
      <td>${customer.address}</td>
      <td><img src="${customer.image}" height="100" width="100"></td>
    </tr>
  </c:forEach>
  </table>
  </body>
</html>
