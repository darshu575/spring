<%@ page language="java" contentType="text/html; charset=UTF-8"%>

<!DOCTYPE html>
<html>

<head>

<title>Student Response</title>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">

</head>

<body class="bg-light">

<div class="container mt-5">

<div class="card p-4 shadow">

<h4>Event Response Form</h4>

<form action="submitResponse" method="post">

<input type="hidden" name="eventId" value="${eventId}">

<div class="mb-3">

<label>Student Name</label>

<input type="text" name="studentName"
class="form-control" required>

</div>

<div class="mb-3">

<label>Email</label>

<input type="email" name="email"
class="form-control" required>

</div>

<div class="mb-3">

<label>Phone</label>

<input type="text" name="phone"
class="form-control">

</div>

<div class="mb-3">

<label>Response</label>

<select name="status" class="form-control">

<option>Interested</option>

<option>Maybe</option>

<option>Not Interested</option>

</select>

</div>

<button class="btn btn-primary">

Submit Response

</button>

</form>

</div>

</div>

</body>

</html>