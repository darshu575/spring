<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>

<title>Received Events | TPO Panel</title>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">

<link rel="stylesheet"
href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.0/css/all.min.css">

<style>

body{
background:#f4f6fb;
}

.header{
background:white;
padding:20px;
border-radius:10px;
box-shadow:0 5px 15px rgba(0,0,0,0.05);
margin-bottom:20px;
}

.event-card{
border:none;
border-radius:18px;
box-shadow:0 10px 25px rgba(0,0,0,0.08);
transition:0.3s;
}

.event-card:hover{
transform:translateY(-5px);
box-shadow:0 15px 35px rgba(0,0,0,0.15);
}

.event-header{
background:#007bff;
color:white;
padding:10px 15px;
border-radius:12px;
font-weight:600;
}

.badge-custom{
background:#e6f2ff;
color:#004085;
padding:6px 10px;
border-radius:20px;
}

.info-label{
font-weight:600;
color:#555;
}

</style>

</head>

<body>

<div class="container mt-5">

<!-- Header -->

<div class="header d-flex justify-content-between align-items-center">

<h4>
<i class="fa fa-calendar"></i> Received Events
</h4>

<a href="${pageContext.request.contextPath}/tpo/dashboard"
class="btn btn-secondary">

<i class="fa fa-arrow-left"></i> Back to Dashboard

</a>

</div>

<!-- Events -->
<div class="row g-3">

<c:forEach var="event" items="${events}">

<div class="col-lg-4 col-md-6 mb-4">

<div class="card event-card">

<div class="event-header">

${event.eventTitle}

</div>

<div class="card-body">

<p><b>Organizer:</b> ${event.organizerName}</p>

<p><b>Organization:</b> ${event.organizationName}</p>

<p><b>Email:</b> ${event.officialEmail}</p>

<p>
<b>Event Type:</b>
<span class="badge badge-custom">${event.eventType}</span>
</p>

<p>
<b>Delegate:</b>
<span class="badge badge-custom">${event.delegateType}</span>
</p>

<p><b>Target Delegate:</b> ${event.targetCount}</p>

<p><b>Mode:</b> ${event.eventMode}</p>

<p><b>Date:</b> ${event.eventDate}</p>

<p><b>Location:</b> ${event.eventLocation}</p>

<p>

<b> Description:</b> ${event.eventDescription}
</p>


<!-- Meeting Link -->

<c:if test="${not empty event.meetingLink}">

<div class="mt-2">

<a href="${event.meetingLink}"

target="_blank"

class="btn btn-primary btn-sm">

<i class="fa fa-video"></i> Join Meeting

</a>

</div>

</c:if>

<!-- Brochure -->

<c:if test="${not empty event.brochurePath}">

<div class="mt-2">

<a href="${pageContext.request.contextPath}/brochures/${event.brochurePath}"

class="btn btn-outline-primary btn-sm">

<i class="fa fa-download"></i> Brochure

<form action="${pageContext.request.contextPath}/tpo/contactDelegate" method="post">

<input type="hidden" name="eventId" value="${event.id}">

<button type="submit" class="btn btn-success btn-sm">

<i class="fa fa-paper-plane"></i> Send To Delegates

</button>

</form>

</div>

</c:if>

</div>

</div>

</div>

</c:forEach>

</div>

</div>

</body>
</html>