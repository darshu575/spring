<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<title>Manage Events | DelegateContact</title>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">

<style>
body{
    background:#f4f6fb;
}

.card{
    border-radius:20px;
    box-shadow:0 10px 30px rgba(0,0,0,0.1);
}

.badge-custom{
    background:#4da6ff;
    padding:6px 12px;
    border-radius:20px;
}

.topbar{
    background:white;
    padding:15px;
    box-shadow:0 5px 20px rgba(0,0,0,0.05);
}
</style>

</head>
<body>

<div class="container mt-5">

<div class="topbar d-flex justify-content-between mb-4">
    <h4>All Events</h4>
    <a href="${pageContext.request.contextPath}/admin/dashboard" class="btn btn-secondary">
        Back to Dashboard
    </a>
</div>

<div class="card p-4">

<table class="table table-hover table-bordered align-middle">

<thead class="table-primary text-center">
<tr>
<th>Event Name</th>
<th>Date</th>
<th>Target</th>
<th>Organizer Name</th>
<th>TPO Emails</th>
</tr>
</thead>

<tbody>

<c:forEach var="event" items="${eventList}">

<tr>

<td>${event.eventTitle}</td>
<td>${event.eventDate}</td>
<td>${event.targetCount}</td>
<td>
${event.organizerName}
</td>

<td>

<c:if test="${not empty event.tpoEmailList}">
    <c:forEach var="tpo" items="${event.tpoEmailList}">
        <span class="badge badge-custom text-dark mb-1">
            ${tpo.tpoEmailList}
        </span><br>
    </c:forEach>
</c:if>

<c:if test="${empty event.tpoEmailList}">
    <span class="text-danger">No TPO Added</span>
</c:if>

</td>

</tr>

</c:forEach>

<c:if test="${empty eventList}">
<tr>
<td colspan="5" class="text-center text-danger">
    No Events Available
</td>
</tr>
</c:if>

</tbody>
</table>

</div>

</div>

</body>
</html>