<%@ page language="java" contentType="text/html; charset=UTF-8"%>

<!DOCTYPE html>
<html>

<head>

<title>Student Responses</title>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">

</head>

<body class="bg-light">

<div class="container mt-5">

<div class="card p-4 shadow">

<h4>Student Responses</h4>

<table class="table table-bordered">

<thead class="table-dark">

<tr>

<th>Name</th>
<th>Email</th>
<th>Phone</th>
<th>Status</th>

</tr>

</thead>

<tbody>

<c:forEach var="res" items="${responses}">

<tr>

<td>${res.studentName}</td>

<td>${res.email}</td>

<td>${res.phone}</td>

<td>

<span class="badge bg-success">
${res.status}
</span>

</td>

</tr>

</c:forEach>

</tbody>

</table>

</div>

</div>

</body>

</html>