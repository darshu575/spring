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
background:linear-gradient(135deg,#eef2f7,#ffffff);
font-family:'Segoe UI',sans-serif;
}

/* Dashboard title */

.dashboard-title{
font-weight:600;
}

/* Stats Cards */

.stats-card{
border:none;
border-radius:15px;
color:white;
padding:20px;
box-shadow:0 8px 25px rgba(0,0,0,0.1);
}

.bg-blue{background:linear-gradient(135deg,#4da6ff,#007bff);}
.bg-green{background:linear-gradient(135deg,#28a745,#5cd65c);}
.bg-purple{background:linear-gradient(135deg,#9b59b6,#6f42c1);}

/* Event Cards */

.event-card{
border:none;
border-radius:18px;
box-shadow:0 10px 30px rgba(0,0,0,0.08);
transition:0.3s;
}

.event-card:hover{
transform:translateY(-8px);
box-shadow:0 15px 40px rgba(0,0,0,0.15);
}

.event-header{
background:#4da6ff;
color:white;
padding:10px;
border-radius:12px;
}

.badge-custom{
background:#e6f2ff;
color:#004085;
padding:6px 10px;
border-radius:20px;
}

.section-title{
font-weight:600;
color:#555;
}

.search-box{
border-radius:25px;
padding:8px 15px;
border:1px solid #ddd;
}

.action-btn{
border-radius:20px;
font-size:13px;
padding:5px 12px;
}

</style>

</head>

<body>

<div class="container mt-4">

<!-- Dashboard Title -->

<div class="d-flex justify-content-between mb-4">

<h3 class="dashboard-title">Manage Events</h3>

<a href="${pageContext.request.contextPath}/admin/dashboard"
class="btn btn-dark">
Dashboard
</a>

</div>

<!-- Statistics -->

<div class="row mb-4">

<div class="col-md-4">
<div class="stats-card bg-blue">
<h5>Total Events</h5>
<h3>${eventList.size()}</h3>
</div>
</div>

<div class="col-md-4">
<div class="stats-card bg-green">
<h5>Total Organizers</h5>
<h3>${eventList.size()}</h3>
</div>
</div>

<div class="col-md-4">
<div class="stats-card bg-purple">
<h5>Upcoming Events</h5>
<h3>${eventList.size()}</h3>
</div>
</div>

</div>

<!-- Search -->

<div class="mb-4">

<input type="text" id="searchInput" class="form-control search-box"
placeholder="Search Event Title...">

</div>

<!-- Event Cards -->

<div class="row" id="eventContainer">

<c:forEach var="event" items="${eventList}">

<div class="col-lg-4 col-md-6 mb-4 event-item">

<div class="card event-card p-3">

<div class="event-header">
<strong>${event.eventTitle}</strong>
</div>

<div class="card-body">

<p><span class="section-title">Organizer:</span>
${event.organizerName}</p>

<p><span class="section-title">Organization:</span>
${event.organizationName}</p>

<p><span class="section-title">Email:</span>
${event.officialEmail}</p>

<p><span class="section-title">Event Type:</span>
${event.eventType}</p>

<p><span class="section-title">Delegate Type:</span>
${event.delegateType}</p>

<p><span class="section-title">Target:</span>
${event.targetCount}</p>

<p><span class="section-title">Mode:</span>
${event.eventMode}</p>

<p><span class="section-title">Date:</span>
${event.eventDate}</p>

<p><span class="section-title">Location:</span>
${event.eventLocation}</p>

<p><span class="section-title">Description:</span>
${event.eventDescription}</p>

<!-- TPO Emails -->

<p class="section-title">TPO Emails</p>

<c:forEach var="tpo" items="${event.tpoEmailList}">
<span class="badge badge-custom">${tpo}</span>
</c:forEach>

<!-- Meeting Link -->

<c:if test="${not empty event.meetingLink}">
<div class="mt-2">

<a href="${event.meetingLink}" target="_blank"
class="btn btn-primary btn-sm action-btn">
Join Meeting
</a>

</div>
</c:if>

<!-- Action Buttons -->
<div class="mt-3">
<a href="${pageContext.request.contextPath}/admin/editEvent?id=${event.eventTitle}"
class="btn btn-warning btn-sm action-btn">
Edit
</a>

<a href="${pageContext.request.contextPath}/admin/deleteEvent?id=${event.eventTitle}"
class="btn btn-danger btn-sm action-btn"
onclick="return confirm('Delete this event?')">
Delete
</a>

</div>

</div>

</div>

</div>

</c:forEach>

</div>

</div>

<!-- Search Script -->

<script>
document.getElementById("searchInput").addEventListener("keyup", function() {

let value = this.value.toLowerCase();
let cards = document.querySelectorAll(".event-item");

cards.forEach(function(card){

let text = card.innerText.toLowerCase();

card.style.display = text.includes(value) ? "" : "none";
});

});

</script>

</body>
</html>