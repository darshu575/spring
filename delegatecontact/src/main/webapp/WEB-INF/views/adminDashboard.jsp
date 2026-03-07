<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<title>Admin Dashboard | DelegateContact</title>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">

<style>
body{
    background:#f4f6fb;
}

.sidebar{
    height:100vh;
    background:linear-gradient(180deg,#4da6ff,#3399ff);
    padding:20px;
    color:white;
}

.sidebar a{
    display:block;
    color:white;
    text-decoration:none;
    padding:10px 0;
}

.sidebar a:hover{
    color:#000;
}

.card{
    border-radius:20px;
    box-shadow:0 10px 30px rgba(0,0,0,0.1);
}

.topbar{
    background:white;
    padding:15px;
    box-shadow:0 5px 20px rgba(0,0,0,0.05);
}
</style>

</head>
<body>

<div class="container-fluid">
<div class="row">

<!-- Sidebar -->
<div class="col-md-2 sidebar">
    <h4>DelegateContact</h4>
    <hr>
    <a href="#">Dashboard</a>
    <a href="${pageContext.request.contextPath}/events">
        Manage Events
    </a>
    <a href="#">View Responses</a>
    <a href="logout">Logout</a>
</div>

<!-- Main Content -->
<div class="col-md-10">

<div class="topbar d-flex justify-content-between">
    <h4>Admin Dashboard</h4>
    <span>Welcome, ${sessionScope.admin}</span>
</div>

<div class="container mt-4">

<!-- Stats Cards -->
<div class="row g-4">

<div class="col-md-4">
<div class="card p-4 text-center">
<h5>Total Events</h5>
<h2>${totalEvents}</h2>
</div>
</div>

<div class="col-md-4">
<div class="card p-4 text-center">
<h5>Total Delegates</h5>
<h2>${totalDelegates}</h2>
</div>
</div>

<div class="col-md-4">
<div class="card p-4 text-center">
<h5>Total Responses</h5>
<h2>${totalResponses}</h2>
</div>
</div>

</div>

<!-- Events Table -->
<div class="card mt-5 p-4">
<h5>Recent Events</h5>
<table class="table table-striped mt-3">
<thead>
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
Pending
</c:when>

<c:when test="${event.eventDate == today}">
Active
</c:when>

<c:otherwise>
Completed
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