<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>

<%@ page isELIgnored="false" %>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>

<title>Register Delegate | DelegateContact</title>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">

<link rel="stylesheet"
href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.0/css/all.min.css">

<style>

body{
background:#f4f6fb;
font-family:'Segoe UI',sans-serif;
}

.card{
border-radius:18px;
border:none;
box-shadow:0 10px 30px rgba(0,0,0,0.1);
}

.form-label{
font-weight:600;
color:#555;
}

.page-title{
font-weight:600;
color:#333;
}

.btn-primary{
padding:10px 25px;
border-radius:25px;
}

</style>

</head>

<body>

<div class="container mt-5">

<div class="row justify-content-center">

<div class="col-md-8">

<div class="card p-4">

<h4 class="page-title mb-4">
<i class="fa fa-user-plus text-primary"></i>
Register Delegate
</h4>

<form action="registerStudent" method="post">

<div class="row">

<!-- Full Name -->

<div class="col-md-6 mb-3">

<label class="form-label">Full Name</label>

<input type="text"
name="fullName"
class="form-control"
placeholder="Enter full name"
required>

</div>

<!-- Email -->

<div class="col-md-6 mb-3">

<label class="form-label">Email</label>

<input type="email"
name="email"
class="form-control"
placeholder="Enter email address"
required>

</div>

<!-- Age -->

<div class="col-md-6 mb-3">

<label class="form-label">Age</label>

<input type="number"
name="age"
class="form-control"
placeholder="Enter age">

</div>

<!-- Phone -->

<div class="col-md-6 mb-3">

<label class="form-label">Phone Number</label>

<input type="text"
name="phoneNumber"
class="form-control"
placeholder="Enter phone number">

</div>

<!-- Delegate Type -->

<div class="col-md-12 mb-3">

<label class="form-label">Delegate Type</label>

<select name="delegateType" class="form-control">

<option value="">Select Delegate Type</option>
<option value="Students">Student</option>
<option value="HR">HR</option>
<option value="Faculty">Faculty</option>
<option value="Guest">Guest</option>

</select>

</div>

</div>

<!-- Submit -->

<div class="mt-3">

<button type="submit" class="btn btn-primary">

<i class="fa fa-save"></i>
Register Delegate

</button>

</div>
<c:if test="${not empty saved}">
<div class="alert alert-success">
<i class="fa fa-check-circle"></i>
${saved}
</div>
</c:if>

<c:if test="${not empty error}">
<div class="alert alert-danger">
<i class="fa fa-exclamation-circle"></i>
${error}
</div>
</c:if>

</form>

</div>

</div>

</div>

</div>

</body>
</html>