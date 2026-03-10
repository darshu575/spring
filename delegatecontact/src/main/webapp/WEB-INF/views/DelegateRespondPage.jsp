<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>

<title>Event Response | Delegate Portal</title>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">

<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.2/css/all.min.css">

<style>

body{
background:linear-gradient(135deg,#eef2f7,#f9fbff);
font-family:'Segoe UI',sans-serif;
}

/* Card */
.response-card{
max-width:650px;
margin:auto;
margin-top:70px;
border-radius:15px;
border:none;
box-shadow:0 10px 25px rgba(0,0,0,0.08);
}

/* Header */
.header{
background:linear-gradient(135deg,#0d6efd,#0047b3);
color:white;
padding:18px;
border-radius:15px 15px 0 0;
text-align:center;
font-size:20px;
font-weight:600;
letter-spacing:.5px;
}

/* Event info */
.event-info{
background:#f8f9fa;
border-radius:10px;
padding:15px;
margin-bottom:20px;
font-size:14px;
}

/* Button */
.submit-btn{
width:100%;
padding:10px;
font-weight:600;
font-size:16px;
}

/* Labels */
label{
font-weight:600;
}

</style>

</head>

<body>

<c:if test="${saved == true}">
<div class="container mt-4">
<div class="alert alert-success text-center shadow-sm">
<i class="fa fa-check-circle"></i>
Response submitted successfully. Thank you for your participation!
</div>
</div>
</c:if>

<div class="card response-card">

<div class="header">
<i class="fa fa-calendar-check"></i> Event Participation Response
</div>

<div class="card-body">

<!-- Event Info Section -->
<div class="event-info">

<b>Event ID:</b> ${eventId} <br>

<b>Purpose:</b> Confirm your participation in the upcoming  Event.

</div>

<form action="${pageContext.request.contextPath}/delegate/saveResponse" method="post">

<input type="hidden" name="eventId" value="${eventId}">

<div class="row">

<div class="col-md-6 mb-3">
<label class="form-label">Full Name</label>
<input type="text" name="name" class="form-control" placeholder="Enter your name" required>
</div>

<div class="col-md-6 mb-3">
<label class="form-label">Email Address</label>
<input type="email" name="email" class="form-control" placeholder="Enter your email" required>
</div>

<div class="col-md-6 mb-3">
<label class="form-label">Phone Number</label>
<input type="text" name="phoneNumber" class="form-control" placeholder="Enter your name" required>
</div>


<div class="col-md-6 mb-3">
<label class="form-label">Address</label>
<input type="text" name="address" class="form-control" placeholder="Enter your Address" required>
</div>


<div class="mb-3">

<label class="form-label">Will you attend this event?</label>

<select name="response" class="form-select">

<option value="YES">✔ Yes, I will attend</option>

<option value="NO">✖ No, I cannot attend</option>

</select>

</div>

<div class="mb-3">

<label class="form-label">Message (Optional)</label>

<textarea name="message" class="form-control" rows="3" placeholder="Add any message if needed"></textarea>

</div>

<button class="btn btn-success submit-btn">

<i class="fa fa-paper-plane"></i> Submit Response

</button>

</form>

</div>

</div>

<div class="text-center mt-4 text-muted" style="font-size:13px;">
© 2026 Placement Coordination Portal
</div>

</body>
</html>