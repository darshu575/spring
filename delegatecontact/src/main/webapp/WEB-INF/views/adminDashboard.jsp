<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>

<!DOCTYPE html>
<html>

<head>

<title>Admin Dashboard | DelegateContact</title>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">

<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.0/css/all.min.css">

<style>

body{
    background:#f4f6fb;
    font-family:Arial;
}

/* Sidebar */

.sidebar{
    height:100vh;
    background:linear-gradient(180deg,#4da6ff,#1a75ff);
    padding:20px;
    color:white;
}

.sidebar h4{
    font-weight:bold;
}

.sidebar a{
    display:block;
    color:white;
    text-decoration:none;
    padding:12px;
    border-radius:8px;
    margin-bottom:5px;
}

.sidebar a:hover{
    background:white;
    color:#1a75ff;
}

/* Topbar */

.topbar{
    background:white;
    padding:15px 20px;
    box-shadow:0 5px 20px rgba(0,0,0,0.05);
}

/* Cards */

.card{
    border:none;
    border-radius:15px;
    box-shadow:0 10px 25px rgba(0,0,0,0.08);
    transition:0.3s;
}

.card:hover{
    transform:translateY(-5px);
}

/* Stats */

.stat-icon{
    font-size:35px;
    margin-bottom:10px;
}

</style>

</head>

<body>

<div class="container-fluid">

<div class="row">

<!-- Sidebar -->

<div class="col-md-2 sidebar">

<h4 class="text-center">
<i class="fa-solid fa-address-book"></i> DelegateContact
</h4>

<hr>

<a href="#">
<i class="fa fa-home"></i> Dashboard
</a>

<a href="${pageContext.request.contextPath}/events">
<i class="fa fa-calendar"></i> Manage Events
</a>

<a href="${pageContext.request.contextPath}/responses">
<i class="fa fa-envelope"></i> View Responses
</a>

<a href="${pageContext.request.contextPath}/logout">
<i class="fa fa-sign-out-alt"></i> Logout
</a>

</div>


<!-- Main Content -->

<div class="col-md-10">

<!-- Topbar -->

<div class="topbar d-flex justify-content-between align-items-center">

<h4>Admin Dashboard</h4>

<span class="text-primary fw-bold">
<i class="fa fa-user"></i> Welcome, ${sessionScope.admin}
</span>

</div>


<div class="container mt-4">

<!-- Statistics Cards -->

<div class="row g-4">

<div class="col-md-4">

<div class="card p-4 text-center">

<i class="fa fa-calendar stat-icon text-primary"></i>

<h6>Total Events</h6>

<h2 class="fw-bold">${totalEvents}</h2>

</div>

</div>


<div class="col-md-4">

<div class="card p-4 text-center">

<i class="fa fa-users stat-icon text-success"></i>

<h6>Total Delegates</h6>

<h2 class="fw-bold">${totalDelegates}</h2>

</div>

</div>


<div class="col-md-4">

<div class="card p-4 text-center">

<i class="fa fa-envelope stat-icon text-danger"></i>

<h6>Total Responses</h6>

<h2 class="fw-bold">${totalResponses}</h2>

</div>

</div>

</div>


<!-- Events Table -->

<div class="card mt-5 p-4">

<h5 class="mb-3">
<i class="fa fa-list"></i> Recent Events
</h5>

<table class="table table-hover">

<thead class="table-dark">

<tr>

<th>Event Name</th>
<th>Date</th>
<th>Target</th>
<th>Status</th>

</tr>

</thead>

<tbody>

<c:forEach var="event" items="${eventLists}">

<tr>

<td>${event.eventTitle}</td>

<td>${event.eventDate}</td>

<td>${event.targetCount}</td>

<td>

<c:choose>

<c:when test="${event.eventDate > today}">
<span class="badge bg-warning">Pending</span>
</c:when>

<c:when test="${event.eventDate == today}">
<span class="badge bg-success">Active</span>
</c:when>

<c:otherwise>
<span class="badge bg-secondary">Completed</span>
</c:otherwise>

</c:choose>

</td>

</tr>

</c:forEach>


<c:if test="${empty eventLists}">

<tr>

<td colspan="4" class="text-center text-danger">

No Events Available

</td>

</tr>

</c:if>

</tbody>

</table>

</div>

</div>

</div>

</div>

</div>

</div>

</body>

</html>