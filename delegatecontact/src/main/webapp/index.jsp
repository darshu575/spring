<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<!DOCTYPE html>
<html>
<head>
<title>DelegateContact | Smart Event Delegate Management</title>

<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

<!-- Bootstrap -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
<link href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.1/font/bootstrap-icons.css" rel="stylesheet">

<!-- Google Font -->
<link href="https://fonts.googleapis.com/css2?family=Poppins:wght@300;500;700&display=swap" rel="stylesheet">
<style>

body{
    background: linear-gradient(-45deg, #e3f2fd, #f4f6fb, #e0f7fa, #eef3ff);
    background-size: 400% 400%;
    animation: gradientBG 12s ease infinite;
}

@keyframes gradientBG {
    0%{background-position:0% 50%;}
    50%{background-position:100% 50%;}
    100%{background-position:0% 50%;}
}

.navbar{
    background:linear-gradient(90deg,#4da6ff,#3399ff);
    padding:6px 0;          /* reduced from 15px */
    min-height:60px;        /* fixed clean height */
}

.navbar-brand{
    font-weight:700;
    color:black !important;
    font-size:18px;         /* smaller text */
    display:flex;
    align-items:center;
}

.navbar-brand img{
    height:32px;            /* smaller logo */
    margin-right:8px;
}

.nav-link{
    color:black !important;
    margin-left:18px;
    font-weight:500;
    font-size:15px;         /* reduced size */
}

.nav-link:hover{
    color:#003366 !important;
}

.navbar .btn{
    padding:5px 18px;       /* smaller button */
    font-size:14px;
}
/* HERO */
.hero{
height:100vh;
background:
linear-gradient(rgba(0,0,0,0.75),rgba(0,0,0,0.75)),
url('https://images.unsplash.com/photo-1521737604893-d14cc237f11d?auto=format&fit=crop&w=1600&q=80');
background-size:cover;
background-position:center;
display:flex;
align-items:center;
justify-content:center;
text-align:center;
color:white;
}

.hero h1{
font-size:55px;
font-weight:700;
}
.hero span{
color:#00d4ff;
}
.btn-main{
padding:12px 30px;
border-radius:30px;
}

/* SECTION COMMON */
section{
padding:90px 0;
}
.section-title{
text-align:center;
margin-bottom:50px;
}
.section-title h2{
font-weight:700;
}

/* ABOUT */
#about{
    background:
    linear-gradient(135deg,#ffffff,#e6f0ff);
    position:relative;
    overflow:hidden;
}

#about::before{
    content:"";
    position:absolute;
    width:300px;
    height:300px;
    background:rgba(0,123,255,0.08);
    border-radius:50%;
    top:-100px;
    left:-100px;
}
.feature-card:hover{
transform:translateY(-8px);
}

/* EVENTS */
#events{
    background:
    linear-gradient(rgba(255,255,255,0.92),rgba(255,255,255,0.92)),
    url('https://images.unsplash.com/photo-1511578314322-379afb476865?auto=format&fit=crop&w=1600&q=80');
    background-size:cover;
    background-position:center;
}
.event-card{
background:white;
border-radius:20px;
padding:25px;
box-shadow:0 15px 40px rgba(0,0,0,0.08);
transition:0.3s;
}
.event-card:hover{
transform:translateY(-8px);
}

/* REGISTER */
.form-section{
    background:
    linear-gradient(120deg,#dbe9ff,#f0f4ff);
}

form{
    background:rgba(255,255,255,0.95);
    backdrop-filter:blur(8px);

padding:40px;
border-radius:25px;
box-shadow:0 20px 60px rgba(0,0,0,0.1);
}
.form-control,.form-select{
border-radius:12px;
}



/* CONTACT FLOAT BUTTON */
.floating-contact{
position:fixed;
bottom:30px;
right:30px;
width:60px;
height:60px;
background:linear-gradient(45deg,#007bff,#00d4ff);
color:white;
border-radius:50%;
display:flex;
align-items:center;
justify-content:center;
font-size:24px;
text-decoration:none;
box-shadow:0 6px 20px rgba(0,0,0,0.3);
z-index:999;
}




/* FOOTER */
footer{
background:#111;
color:#aaa;
text-align:center;
padding:25px 0;
}

</style>

</head>

<body>

<!-- NAVBAR -->
<nav class="navbar navbar-expand-lg fixed-top">
<div class="container">

<a class="navbar-brand" href="#">
<img src="Logo.png">
DelegateContact
</a>

<button class="navbar-toggler" data-bs-toggle="collapse" data-bs-target="#navmenu">
<span class="navbar-toggler-icon"></span>
</button>

<div class="collapse navbar-collapse justify-content-end" id="navmenu">
<ul class="navbar-nav">
<li class="nav-item"><a class="nav-link" href="#home">Home</a></li>
<li class="nav-item"><a class="nav-link" href="#about">About</a></li>
<li class="nav-item"><a class="nav-link" href="#events">Events</a></li>
<a class="nav-link" href="loginForm">Admin Login</a>
<li class="nav-item">
<a class="btn btn-dark ms-3 px-4" href="#register">Register</a>

        </li>
</ul>
</div>

</div>
</nav>

<!-- HERO -->
<section id="home" class="hero">
<div>
<h1>Smart <span>Delegate Management</span></h1>
<p class="mt-3">Connecting Clients, Students & HR Professionals Seamlessly</p>
<a href="#register" class="btn btn-info btn-main mt-3">Get Started</a>
<a href="#events" class="btn btn-outline-light btn-main mt-3 ms-3">Explore Events</a>
</div>
</section>

<!-- ABOUT -->
<section id="about">
<div class="container">
<div class="section-title">
<h2>Why Choose DelegateContact?</h2>
</div>

<div class="row g-4">

<div class="col-md-4">
<div class="feature-card text-center">
<i class="bi bi-calendar-event fs-1 text-primary"></i>
<h4 class="mt-3">Smart Event Coordination</h4>
<p>Create and manage events easily with target audience, delegate type, and scheduled dates. Streamline communication between organizers, HRs, and college TPOs efficiently.</p>
</div>
</div>

<div class="col-md-4">
<div class="feature-card text-center">
<i class="bi bi-envelope-paper fs-1 text-primary"></i>
<h4 class="mt-3">Automated Email Workflow</h4>
<p>Automatically send event details to TPOs or HRs. Delegates receive structured response forms and confirmations, reducing manual follow-ups and saving time.</p>
</div>
</div>

<div class="col-md-4">
<div class="feature-card text-center">
<i class="bi bi-bar-chart-line fs-1 text-primary"></i>
<h4 class="mt-3">Real-Time Response Tracking</h4>
<p>Track delegate registrations in real time. Admin and TPO dashboards provide clear insights into participation numbers and engagement levels.</p>
</div>
</div>

</div>
</div>
</section>

<!-- EVENTS -->

<section id="events" style="background:#f8f9fa;">
<div class="container">
<div class="section-title">
<h2>Upcoming Events</h2>
</div>

<div class="row g-4">

<c:forEach var="event" items="${eventList}">
<div class="col-md-4">
<div class="event-card">
<h4>${event.eventName}</h4>
<p>${event.description}</p>
<p><b>Date:</b> ${event.eventDate}</p>
<p><b>Target:</b> ${event.delegateType}</p>
</div>
</div>
</c:forEach>

</div>
</div>
</section>


<!-- EVENT CREATION -->
<section id="register" class="form-section">
<div class="container">
<div class="section-title">
<h2>Create New Event</h2>
<p class="text-muted">Fill the details to initiate delegate coordination process</p>
</div>

<div class="row justify-content-center">
<div class="col-md-8">

<form action="createEvent" method="post" enctype="multipart/form-data">

<!-- Organizer Info -->
<div class="mb-3">
<label class="form-label">Organizer Name</label>
<input type="text" name="organizerName" class="form-control" required>
</div>

<div class="mb-3">
<label class="form-label">Official Email</label>
<input type="email" name="officialEmail" class="form-control" required>
</div>

<div class="mb-3">
<label class="form-label">Organization / Company Name</label>
<input type="text" name="organizationName" class="form-control" required>
</div>

<!-- Event Details -->
<div class="mb-3">
<label class="form-label">Event Title</label>
<input type="text" name="eventTitle" class="form-control" required>
</div>

<div class="mb-3">
<label class="form-label">Event Type</label>
<select name="eventType" class="form-select" required>
<option value="">Select Type</option>
<option value="Seminar">Seminar</option>
<option value="Workshop">Workshop</option>
<option value="Placement Drive">Placement Drive</option>
<option value="Conference">Conference</option>
<option value="Webinar">Webinar</option>
</select>
</div>

<div class="mb-3">
<label class="form-label">Target Delegate Type</label>
<select name="delegateType" class="form-select" required>
<option value="">Select</option>
<option value="Students">Students</option>
<option value="HR">HR Professionals</option>
<option value="Developers">Developers</option>
<option value="Faculty">Faculty</option>
</select>
</div>

<div class="mb-3">
<label class="form-label">Target Number of Delegates</label>
<input type="number" name="targetCount" class="form-control" required>
</div>

<div class="mb-3">
<label class="form-label">College TPO / HR Email</label>
<input type="email" name="tpoEmail" class="form-control" required>
</div>

<div class="mb-3">
<label class="form-label">Event Mode</label>
<select name="eventMode" id="eventMode" class="form-select" required onchange="toggleEventFields()">
<option value="">Select Mode</option>
<option value="Online">Online</option>
<option value="Offline">Offline</option>
</select>
</div>

<div class="mb-3">
<label class="form-label">Event Date</label>
<input type="date" name="eventDate" class="form-control" required>
</div>


<!-- Location Field -->
<div class="mb-3" id="locationField" style="display:none;">
<label class="form-label">Event Location</label>
<input type="text" name="eventLocation" class="form-control" placeholder="Enter venue address">
</div>

<!-- Meeting Link Field -->
<div class="mb-3" id="meetingField" style="display:none;">
<label class="form-label">Meeting Link</label>
<input type="url" name="meetingLink" class="form-control" placeholder="Zoom / Google Meet Link">
</div>

<div class="mb-3">
<label class="form-label">Event Description</label>
<textarea name="eventDescription" class="form-control" rows="4"></textarea>
</div>

<div class="mb-3">
<label class="form-label">Upload Event Brochure (PDF/Image)</label>
<input type="file" name="brochure" class="form-control">
</div>

<div class="text-center">
<button type="submit" class="btn btn-dark px-5">Create Event</button>
</div>

</form>

</div>
</div>
</div>
</section>

<!-- CONTACT US -->
<section id="contact" style="background:#ffffff; padding:90px 0;">
<div class="container">

<div class="section-title text-center mb-5">
<h2>Contact Us</h2>
<p>We’d love to hear from you. Reach out for collaborations, support, or event inquiries.</p>
</div>

<div class="row g-5">

<!-- Contact Form -->
<div class="col-md-7">

<form action="contactSubmit" method="post">

<div class="row">
<div class="col-md-6 mb-3">
<label>Your Name</label>
<input type="text" class="form-control" name="name" required>
</div>

<div class="col-md-6 mb-3">
<label>Your Email</label>
<input type="email" class="form-control" name="email" required>
</div>
</div>

<div class="mb-3">
<label>Subject</label>
<input type="text" class="form-control" name="subject">
</div>

<div class="mb-3">
<label>Message</label>
<textarea class="form-control" rows="5" name="message" required></textarea>
</div>

<button type="submit" class="btn btn-dark px-4">Send Message</button>

</form>

</div>

<!-- Contact Details -->
<div class="col-md-5">

<div class="mb-4 p-4 shadow-sm rounded bg-light">
<h5><i class="bi bi-geo-alt-fill text-primary"></i> Address</h5>
<p>DelegateContact Pvt Ltd,<br>
Rajajinagar,5th cross,Bengalore<br>
Karnataka,India - 560001</p>
</div>

<div class="mb-4 p-4 shadow-sm rounded bg-light">
<h5><i class="bi bi-envelope-fill text-primary"></i> Email</h5>
<p>support@delegatecontact.com</p>
</div>

<div class="mb-4 p-4 shadow-sm rounded bg-light">
<h5><i class="bi bi-telephone-fill text-primary"></i> Phone</h5>
<p>+91 9019828925</p>
</div>

</div>

</div>
</div>


</section>
<!-- Fixed Contact Button -->
<a href="#contact" class="floating-contact">
    <i class="bi bi-headset"></i>
</a>

<!-- FOOTER -->
<footer>
© 2026 DelegateContact | Smart Event & Delegate Management System
</footer>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>

<script>
window.addEventListener("scroll",function(){
document.querySelector(".navbar").classList.toggle("scrolled",window.scrollY>50);
});

function toggleEventFields() {
    var mode = document.getElementById("eventMode").value;
    var locationField = document.getElementById("locationField");
    var meetingField = document.getElementById("meetingField");

    if (mode === "Online") {
        meetingField.style.display = "block";
        locationField.style.display = "none";
    }
    else if (mode === "Offline") {
        locationField.style.display = "block";
        meetingField.style.display = "none";
    }
    else {
        locationField.style.display = "none";
        meetingField.style.display = "none";
    }
}
</script>
</body>
</html>