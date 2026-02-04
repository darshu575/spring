<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>

<html>
<head>
    <title>My Application</title>

    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">

    <!-- Bootstrap Icons -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.1/font/bootstrap-icons.css" rel="stylesheet">
        <style>
            .member-card {
                max-width: 500px;
                border-radius: 14px;
            }
            .member-card .card-header {
                padding: 12px;
            }
            .member-card .card-body {
                padding: 20px;
            }
            .member-card label {
                font-size: 0.85rem;
                font-weight: 500;
            }
            .member-card .form-control {
                font-size: 0.9rem;
                padding: 6px 10px;
            }
        </style>
</head>

<body class="bg-light">

<!-- NAVBAR -->
<nav class="navbar navbar-expand-lg navbar-dark bg-dark shadow">
    <div class="container">

        <!-- LOGO -->
        <a class="navbar-brand d-flex align-items-center" href="home.jsp">
            <img src="Logo.png" width="40" class="me-2">
            MyApp
        </a>

        <!-- Mobile Toggle -->
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse"
                data-bs-target="#navbarNav">
            <span class="navbar-toggler-icon"></span>
        </button>

        <!-- Navbar Content -->
        <div class="collapse navbar-collapse" id="navbarNav">

            <!-- LEFT MENU -->
            <ul class="navbar-nav me-auto">
                <li class="nav-item">
                    <a class="nav-link active" href="home.jsp">Home</a>
                </li>

                <li class="nav-item">
                    <a class="nav-link" href="dashboard">Dashboard</a>
                </li>

                <li class="nav-item">
                    <a class="nav-link" href="about.jsp">About</a>
                </li>
            </ul>

            <!-- RIGHT PROFILE MENU -->
            <ul class="navbar-nav">
                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle d-flex align-items-center"
                       href="#" role="button" data-bs-toggle="dropdown">
                        <i class="bi bi-person-circle fs-5 me-1"></i>
                        Profile
                    </a>

                    <ul class="dropdown-menu dropdown-menu-end">
                        <li>
                            <a class="dropdown-item" href="Profile.jsp">
                                <i class="bi bi-person me-2"></i> View Profile
                            </a>
                        </li>

                        <li>
                            <a class="dropdown-item" href="ChangePassword.jsp">
                                <i class="bi bi-key me-2"></i> Change Password
                            </a>
                        </li>

                        <li><hr class="dropdown-divider"></li>

                        <li>
                            <a class="dropdown-item text-danger" href="index.jsp">
                                <i class="bi bi-box-arrow-right me-2"></i> Logout
                            </a>
                        </li>
                    </ul>
                </li>
            </ul>

        </div>
    </div>
</nav>

<!-- PAGE CONTENT -->
<div class="container text-center my-5">

    <div class="card member-card shadow-sm mx-auto">
        <div class="card-header bg-primary text-white text-center">
            <h5 class="mb-0">Add Member</h5>
            <small class="text-light">Member Details</small>
        </div>

        <div class="card-body">
            <form action="saveMember" method="post" id="memberForm"  enctype="multipart/form-data" onsubmit="return validateMemberForm()">

                <!-- Hidden teamId -->
                <input type="hidden" name="teamId" value="${teamId}">

                <!-- member image -->
                  <div class="text-center mb-3">
                        <label for="profileImageInput" style="cursor:pointer;">
                            <img id="profileAvatar" src="profile.png"
                                 class="rounded-circle shadow"
                                 style="width:120px; height:120px; object-fit:cover;">
                        </label>
                        <input type="file" id="profileImageInput" name="profileImage" style="display:none;"
                               onchange="previewProfileImage(this)">
                    </div>



                <!-- Member Name -->
                <div class="row mb-2 align-items-center">
                    <label class="col-4 col-form-label">Name</label>
                    <div class="col-8">
                        <input type="text" id="memberName" name="memberName" class="form-control form-control-sm"
                               onblur="validateMemberName()">
                        <small class="text-danger" id="memberNameError"></small>
                    </div>
                </div>

                <!-- Age -->
                <div class="row mb-2 align-items-center">
                    <label class="col-4 col-form-label">Age</label>
                    <div class="col-8">
                        <input type="number" id="age" name="age" class="form-control form-control-sm"
                               onblur="validateAge()">
                        <small class="text-danger" id="ageError"></small>
                    </div>
                </div>

                <!-- Gender -->
                <div class="row mb-2 align-items-center">
                    <label class="col-4 col-form-label">Gender</label>
                    <div class="col-8">
                        <select class="form-select form-select-sm" id="gender" name="gender" onblur="validateGender()">
                            <option value="" selected disabled>Select Gender</option>
                            <option value="Male">Male</option>
                            <option value="Female">Female</option>
                            <option value="Other">Other</option>
                        </select>
                        <small class="text-danger" id="genderError"></small>
                    </div>
                </div>

                <!-- Email -->
                <div class="row mb-2 align-items-center">
                    <label class="col-4 col-form-label">Email</label>
                    <div class="col-8">
                        <input type="email" id="email" name="email" class="form-control form-control-sm"
                               onblur="validateEmail()">
                        <small class="text-danger" id="emailError"></small>
                    </div>
                </div>

                <!-- Phone -->
                <div class="row mb-3 align-items-center">
                    <label class="col-4 col-form-label">Phone</label>
                    <div class="col-8">
                        <input type="text" id="phoneNumber" name="phoneNumber" class="form-control form-control-sm"
                               onblur="validatePhone()">
                        <small class="text-danger" id="phoneError"></small>
                    </div>
                </div>

                <div class="text-center">
                    <button class="btn btn-primary btn-sm px-4">Add Member</button>
                </div>

                <!-- Success Message -->
                <c:if test="${not empty successMessage}">
                    <div class="alert alert-success text-center mt-2">
                        ${successMessage}
                    </div>
                </c:if>

            </form>
        </div>
    </div>

</div>

<!-- FOOTER -->
<footer class="bg-dark text-light py-3 fixed-bottom">
    <div class="container text-center">
        <small>
            © 2026 MyApp |
            <a href="#" class="text-decoration-none text-secondary">Privacy Policy</a> |
            <a href="#" class="text-decoration-none text-secondary">Contact</a>
        </small>
    </div>
</footer>

<!-- Bootstrap JS -->

<script>
    function validateMemberName() {
        let name = document.getElementById("memberName").value.trim();
        if (name.length < 3) {
            document.getElementById("memberNameError").innerText = "Name must be at least 3 characters";
            return false;
        }
        document.getElementById("memberNameError").innerText = "";
        return true;
    }

    function validateAge() {
        let age = parseInt(document.getElementById("age").value);
        if (isNaN(age) || age < 1 || age > 120) {
            document.getElementById("ageError").innerText = "Enter a valid age (1-120)";
            return false;
        }
        document.getElementById("ageError").innerText = "";
        return true;
    }

    function validateGender() {
        let gender = document.getElementById("gender").value;
        if (!gender) {
            document.getElementById("genderError").innerText = "Select gender";
            return false;
        }
        document.getElementById("genderError").innerText = "";
        return true;
    }

    function validateEmail() {
        let email = document.getElementById("email").value.trim();
        let regex = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
        if (!regex.test(email)) {
            document.getElementById("emailError").innerText = "Invalid email address";
            return false;
        }
        document.getElementById("emailError").innerText = "";
        return true;
    }

    function validatePhone() {
        let phone = document.getElementById("phoneNumber").value.trim();
        if (!/^[6-9]\d{9}$/.test(phone)) {
            document.getElementById("phoneError").innerText = "Enter valid 10-digit mobile number";
            return false;
        }
        document.getElementById("phoneError").innerText = "";
        return true;
    }

    function validateMemberForm() {
        return validateMemberName() &&
            validateAge() &&
            validateGender() &&
            validateEmail() &&
            validatePhone();
    }


       function previewProfileImage(input) {
            if (input.files && input.files[0]) {
                var reader = new FileReader();
                reader.onload = function(e) {
                    document.getElementById('profileAvatar').src = e.target.result;
                }
                reader.readAsDataURL(input.files[0]);
            }
        }
</script>

</body>
</html>
