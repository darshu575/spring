<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>

<%@ page isELIgnored="false" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>

<head>

<title>Manage Events | DelegateContact</title>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">

<link rel="stylesheet"
href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.0/css/all.min.css">

<style>

body{
background:#f4f6fb;
font-family:'Segoe UI',sans-serif;
}

/* Top bar */

.topbar{
background:white;
padding:15px 25px;
box-shadow:0 5px 20px rgba(0,0,0,0.05);
margin-bottom:25px;
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
box-shadow:0 10px 25px rgba(0,0,0,0.08);
transition:0.3s;
}

.event-card:hover{
transform:translateY(-8px);
box-shadow:0 15px 40px rgba(0,0,0,0.15);
}

.event-header{
background:#007bff;
color:white;
padding:10px 15px;
border-radius:12px;
font-weight:600;
}

/* small badges */

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

/* search */

.search-box{
border-radius:25px;
padding:10px 15px;
border:1px solid #ddd;
}

/* buttons */

.action-btn{
border-radius:20px;
font-size:13px;
padding:5px 12px;
}

</style>

</head>

<body>

<!-- Top Bar -->

<div class="topbar d-flex justify-content-between">

<h4><i class="fa fa-calendar"></i> Manage Events</h4>

<a href="${pageContext.request.contextPath}/admin/dashboard"
class="btn btn-dark">
<i class="fa fa-home"></i> Dashboard
</a>

</div>


<div class="container">

<c:if test="${not empty message}">

<div class="alert alert-success">

<strong>Email Sent!</strong> ${message}

</div>

</c:if>


<!-- Statistics -->

<div class="row mb-4">

<div class="col-md-4">

<div class="stats-card bg-blue">

<h6>Total Events</h6>

<h3>${eventList.size()}</h3>

</div>

</div>


<div class="col-md-4">

<div class="stats-card bg-green">

<h6>Total Organizers</h6>

<h3>${eventList.size()}</h3>

</div>

</div>


<div class="col-md-4">

<div class="stats-card bg-purple">

<h6>Upcoming Events</h6>

<h3>${eventList.size()}</h3>

</div>

</div>

</div>


<!-- Search -->

<div class="mb-4">

<input type="text"

id="searchInput"

class="form-control search-box"

placeholder="🔎 Search Event Title...">

</div>


<!-- Events -->

<div class="row" id="eventContainer">

<c:forEach var="event" items="${eventList}">

<div class="col-lg-4 col-md-6 mb-4 event-item">

<div class="card event-card p-3">


<div class="event-header d-flex justify-content-between">

${event.eventTitle}

<c:if test="${event.emailSent}">

<span class="badge bg-success">

<i class="fa fa-check"></i> Email Sent

</span>

</c:if>

</div>


<div class="card-body">

<p><span class="section-title">Organizer:</span>
${event.organizerName}</p>

<p><span class="section-title">Organization:</span>
${event.organizationName}</p>

<p><span class="section-title">Official Email:</span>
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

<a href="${event.meetingLink}"

target="_blank"

class="btn btn-primary btn-sm action-btn">

<i class="fa fa-video"></i> Join Meeting

</a>

</div>

</c:if>


<!-- Actions -->

<div class="mt-3">

<a href="${pageContext.request.contextPath}/admin/editEvent?id=${event.id}"

class="btn btn-warning btn-sm action-btn">

<i class="fa fa-edit"></i> Edit

</a>


<a href="${pageContext.request.contextPath}/admin/deleteEvent?id=${event.id}"

class="btn btn-danger btn-sm action-btn"

onclick="return confirm('Delete this event?')">

<i class="fa fa-trash"></i> Delete

</a>


<c:choose>

<c:when test="${event.emailSent}">

<button class="btn btn-secondary btn-sm action-btn" disabled>

Email Sent

</button>

</c:when>

<c:otherwise>

<form action="${pageContext.request.contextPath}/admin/sendEventEmail"

method="post"

style="display:inline;">

<input type="hidden" name="eventId" value="${event.id}">

<button type="submit"

class="btn btn-success btn-sm action-btn">

<i class="fa fa-paper-plane"></i> Send Email

</button>

</form>

</c:otherwise>

</c:choose>

</div>

</div>

</div>

</div>

</c:forEach>

</div>

</div>


<!-- Search Script -->

<script>

document.getElementById("searchInput").addEventListener("keyup", function(){

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