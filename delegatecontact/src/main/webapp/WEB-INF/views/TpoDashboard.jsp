<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>

<head>

<title>TPO Dashboard | Delegate System</title>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">

<link rel="stylesheet"
href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.0/css/all.min.css">

<style>

body{
background:#f4f6fb;
}

/* sidebar */

.sidebar{
height:100vh;
background:#212529;
color:white;
padding:20px;
}

.sidebar a{
display:block;
color:white;
text-decoration:none;
padding:12px;
margin-bottom:5px;
border-radius:8px;
}

.sidebar a:hover{
background:#495057;
}

/* main */

.main{
padding:20px;
}

.card{
border:none;
border-radius:15px;
box-shadow:0 10px 25px rgba(0,0,0,0.08);
}

.card:hover{
transform:translateY(-5px);
transition:0.3s;
}

</style>

</head>

<body>

<div class="container-fluid">

<div class="row">

<!-- Sidebar -->

<div class="col-md-2 sidebar">

<h4 class="text-center">
<i class="fa fa-university"></i> TPO Panel
</h4>

<hr>

<a href="#">
<i class="fa fa-home"></i> Dashboard
</a>

<a href="${pageContext.request.contextPath}/tpo/reviewEvents">
<i class="fa fa-calendar"></i> Received Events
</a>

<a href="${pageContext.request.contextPath}/tpo/registerStudent">
<i class="fa fa-calendar"></i>Register Student
</a>

<a href="${pageContext.request.contextPath}/tpo/responses">
<i class="fa fa-users"></i> Student Responses
</a>

<a href="logout">
<i class="fa fa-sign-out-alt"></i> Logout
</a>

</div>

<!-- Main Content -->

<div class="col-md-10 main">

<!-- top bar -->

<div class="d-flex justify-content-between mb-4">

<h4>TPO Dashboard</h4>

<span class="fw-bold text-primary">
Welcome , ${sessionScope.tpoemail}
</span>

</div>

<!-- statistics -->

<div class="row g-4">

<div class="col-md-4">

<div class="card p-4 text-center">

<i class="fa fa-calendar fa-3x text-primary"></i>

<h6 class="mt-2">Events Received</h6>

<h3>${totalEvents}</h3>

</div>

</div>

<div class="col-md-4">

<div class="card p-4 text-center">

<i class="fa fa-envelope fa-3x text-success"></i>

<h6 class="mt-2">Emails Sent</h6>

<h3>${emailsSent}</h3>

</div>

</div>

<div class="col-md-4">

<div class="card p-4 text-center">

<i class="fa fa-users fa-3x text-danger"></i>

<h6 class="mt-2">Student Responses</h6>

<h3>${totalResponses}</h3>

</div>

</div>

</div>

<!-- event table -->

<div class="card mt-5 p-4">

<h5>Received Events</h5>

<table class="table table-hover mt-3">

<thead class="table-dark">

<tr>

<th>Event</th>
<th>Date</th>
<th>Location</th>
<th>Action</th>

</tr>

</thead>

<tbody>

<c:forEach var="event" items="${events}">

<tr>

<td>${event.eventTitle}</td>

<td>${event.eventDate}</td>

<td>${event.eventLocation}</td>

<td>

<a href="${pageContext.request.contextPath}/tpo/sendToStudents?id=${event.id}"

class="btn btn-success btn-sm">

Send To Students

</a>

</td>

</tr>

</c:forEach>

</tbody>

</table>

</div>

</div>

</div>

</div>

</body>
</html>