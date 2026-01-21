<!DOCTYPE html>
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

            <form action="verifyOtp" method="post" onsubmit="return validateOTP()">

                <!-- EMAIL -->
                <div class="mb-3">
                    <label>Email</label>
                    <input type="email" class="form-control" id="email" name="email"
                           placeholder="Enter email">
                    <small class="text-danger" id="emailError"></small>
                </div>

                <!-- SEND OTP -->
                <div class="d-grid mb-3">
                    <button type="button" class="btn btn-primary"
                            onclick="sendOtp()">Send OTP</button>
                </div>

                <!-- OTP -->
                <div class="mb-3">
                    <label>Enter OTP</label>
                    <input type="text" class="form-control" id="otp" name="otp"
                           placeholder="Enter OTP">
                    <small class="text-danger" id="otpError"></small>
                </div>

                <!-- LOGIN -->
                <div class="d-grid">
                    <button type="submit" class="btn btn-warning fw-bold">
                        Verify & Login
                    </button>
                </div>

                <div class="text-center mt-3">
                    <small>Don't have account?
                        <a href="Register.jsp" class="text-decoration-none">Sign Up</a>
                    </small>
                </div>

            </form>

        </div>
    </div>
</div>

<script>
    function sendOtp() {
        let email = document.getElementById("email").value.trim();

        if (email === "") {
            document.getElementById("emailError").innerText = "Email required";
            return;
        }

        alert("OTP sent to " + email);

        // 🔹 Later connect backend:
        // fetch("sendOtp?email=" + email)
    }

    function validateOTP() {
        let email = document.getElementById("email").value.trim();
        let otp = document.getElementById("otp").value.trim();

        document.getElementById("emailError").innerText = "";
        document.getElementById("otpError").innerText = "";

        if (email === "") {
            document.getElementById("emailError").innerText = "Email required";
            return false;
        }

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
