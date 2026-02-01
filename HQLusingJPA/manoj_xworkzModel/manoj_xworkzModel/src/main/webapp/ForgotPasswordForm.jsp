<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@  page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Welcome</title>

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
</head>

<body class="bg-success-subtle">

<!-- Navbar -->
<nav class="navbar navbar-expand-lg bg-success bg-opacity-25 shadow-sm">
    <div class="container-fluid">

        <!-- Left: Logo + Nav -->
        <div class="d-flex align-items-center">
            <!-- Replace with your logo link -->
            <img src="Logo.png" alt="Logo" height="45" class="me-4">

            <ul class="navbar-nav">
                <li class="nav-item">
                    <a class="nav-link fw-medium text-success-emphasis" href="index.jsp">Home</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link fw-medium text-success-emphasis" href="#">About Us</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link fw-medium text-success-emphasis" href="#">Contact Us</a>
                </li>
            </ul>
        </div>

        <!-- Right: Buttons -->
        <div>

         <form action="signUp" method="get" class="d-inline">
             <button type="submit" class="btn btn-success">Sign Up</button>
         </form>

     <form action="signIn" method="get" class="d-inline">
             <button type="submit" class="btn btn-outline-success me-2">Sign In</button>
         </form>

        </div>

    </div>
</nav>

<!-- content -->

<div class="container mt-5">
    <div class="row justify-content-center">
        <div class="col-md-6">
 <c:if test="${not empty resetSuccess}">
                    <div class="alert alert-success text-center">
                        ${resetSuccess}
                    </div>
                </c:if>

                    <c:if test="${not empty resetFail}">
                                     <div class="alert alert-danger text-center">
                                         ${resetFail}
                                     </div>
                                 </c:if>

                <c:if test="${not empty resetFail}">
                    <div class="alert alert-danger text-center">
                      ${missMatch}
                    </div>
                </c:if>
            <div class="card shadow-sm">
                <div class="card-header bg-success bg-opacity-25 text-center">
                    <h4 class="text-success-emphasis mb-0">Forgot Password</h4>
                </div>


                <div class="card-body">

                    <!-- Email + Send OTP -->

                    <form action="sendOtp" method="post">
                        <div class="mb-3">
                            <label class="form-label">Email</label>
                            <input type="email" name="email" class="form-control"
                                   placeholder="Enter registered email" required>
                        </div>
                        <div class="d-grid mb-4">
                            <button type="submit" class="btn btn-success">
                                Send OTP
                            </button>
                        </div>
                        ${otpSent}
                    </form>

                    <!-- OTP + Verify -->
                    <form action="verifyOtp" method="post">
 <input type="hidden" name="email" value="${email}">

                        <div class="mb-3">
                            <label class="form-label">OTP</label>
                            <input type="text" name="otp" class="form-control"
                                   placeholder="Enter OTP" required>
                        </div>

                        <div class="d-grid mb-4">
                            <button type="submit" class="btn btn-outline-success">
                                Verify OTP
                            </button>
                        </div>
                    </form>

                    <!-- New Password
                      <c:if test="${showForgotPassword}"> -->

                        <form action="resetPassword" method="post">
                         <input type="hidden" name="email" value="${email}">
                        <div class="mb-3">
                            <label class="form-label">New Password</label>
                            <input type="password" name="newPassword"
                                   class="form-control" required>
                        </div>

                        <div class="mb-3">
                            <label class="form-label">Confirm Password</label>
                            <input type="password" name="confirmPassword"
                                   class="form-control" required>
                        </div>
${missMatch}
                        <div class="d-grid">
                            <button type="submit" class="btn btn-success">
                                Create New Password
                            </button>
                        </div>
                    </form>
 <!-- </c:if> -->
                </div>
            </div>

        </div>
    </div>
</div>


<!-- Footer -->
<footer class="bg-success bg-opacity-25 text-center py-2 fixed-bottom">
    <small class="text-success-emphasis">
        © 2026 Your Company Name. All rights reserved.
    </small>
</footer>

</body>
</html>
