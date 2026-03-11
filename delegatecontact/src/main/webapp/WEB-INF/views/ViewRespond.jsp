<%@ page contentType="text/html;charset=UTF-8"%>
<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>

<head>

<title>Delegate Responses</title>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">

</head>

<body class="bg-light">

<div class="container mt-5">

<h3>Delegate Responses</h3>

<table class="table table-bordered table-hover">

<thead class="table-dark">

<tr>
<th>Event Id</th>
<th>Delegate Name</th>
<th>Email</th>
<th>Phone Number</th>
<th>Status</th>

</tr>

</thead>

<tbody>

<c:forEach var="res" items="${responses}">

<tr>
<td>${res.eventId}</td>

<td>${res.name}</td>
<td>${res.email}</td>
<td>${res.phoneNumber}</td>
<td>${res.response}</td>

</tr>

</c:forEach>

</tbody>

</table>

</div>

</body>

</html>