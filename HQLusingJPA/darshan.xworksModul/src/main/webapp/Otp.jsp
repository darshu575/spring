<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>OTP Login</title>

    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Bootstrap -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">

    <style>
        body {
            background: linear-gradient(135deg, #1f1f1f, #343a40);
        }
        .login-card {
            width: 350px;
            border-radius: 12px;
        }
    </style>
</head>

<body>

<!-- NAVBAR -->
<nav class="navbar navbar-dark bg-dark">
    <div class="container">
        <span class="navbar-brand">OTP Login Portal</span>
    </div>
</nav>

<div class="container d-flex justify-content-center align-items-center vh-100">
    <div class="card login-card shadow">
        <div class="card-body p-4">

            <h4 class="text-center mb-4 fw-bold">Login with OTP</h4>

            <!-- Form to send OTP -->
            <form action="sendOtp" method="post" class="mb-3">
                <div class="mb-3">
                    <label>Email</label>
                    <input type="email" class="form-control" id="email" name="email"
                           placeholder="Enter email" value="${email}" required>
                    <small class="text-danger" id="emailError"></small>
                </div>

                <div class="d-grid mb-3">
                    <button type="submit" class="btn btn-primary">Send OTP</button>
                </div>
            </form>

            <!-- Form to verify OTP -->
            <form action="verifyOtp" method="post" onsubmit="return validateOTP()">
                <input type="hidden" name="email" value="${email}"> <!-- Pass email again -->

                <div class="mb-3">
                    <label>Enter OTP</label>
                    <input type="text" class="form-control" id="otp" name="otp"
                           placeholder="Enter OTP" required>
                    <small class="text-danger">${error}</small>
                    <small class="text-danger" id="otpError"></small>
                </div>

                <div class="d-grid">
                    <button type="submit" class="btn btn-warning fw-bold">
                        Verify & Login
                    </button>
                </div>

                <div class="text-center mt-3">
                    <small>Don't have an account?
                        <a href="Register.jsp" class="text-decoration-none">Sign Up</a>
                    </small>
                </div>
            </form>

        </div>
    </div>
</div>

<script>
    function validateOTP() {
        let otp = document.getElementById("otp").value.trim();
        document.getElementById("otpError").innerText = "";

        if (otp === "") {
            document.getElementById("otpError").innerText = "OTP required";
            return false;
        }

        if (otp.length !== 6) {
            document.getElementById("otpError").innerText = "OTP must be 6 digits";
            return false;
        }

        return true;
    }
</script>

</body>
</html>
