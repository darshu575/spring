<!DOCTYPE html>
<html>
<head>
    <title>Login</title>

    <!-- Meta -->
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Bootstrap 5 -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">

    <style>
        body {
            background: linear-gradient(135deg, #1f1f1f, #343a40);
        }
        .login-card {
            width: 340px;
            border-radius: 12px;
        }
        .form-control:focus {
            box-shadow: none;
            border-color: #ffc107;
        }
    </style>
    <!-- NAVBAR -->
    <nav class="navbar navbar-expand-lg navbar-dark bg-dark shadow">
        <div class="container">

            <!-- LOGO -->
            <a class="navbar-brand d-flex align-items-center" href="#">
                <!-- Replace with your logo link -->
                <img src="Logo.png" alt="Logo" width="50" class="me-2">

            </a>

            <button class="navbar-toggler" type="button" data-bs-toggle="collapse"
                    data-bs-target="#navbarNav">
                <span class="navbar-toggler-icon"></span>
            </button>

            <div class="collapse navbar-collapse" id="navbarNav">

                <!-- LEFT NAV LINKS -->
                <ul class="navbar-nav me-auto">
                    <li class="nav-item">
                        <a class="nav-link active" href="#">Home</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#">About Us</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#">Contact Us</a>
                    </li>
                </ul>

                <!-- RIGHT BUTTONS -->
                <div class="d-flex gap-2">


               <form action="signIn" method="get">

                                 <button type="submit"> Sign In</button>
                           </form>
                    <form action="signUp" method="get">
                                    <button type="submit"> Sign Up</button>
                    </form>

                </div>

            </div>
        </div>
    </nav>

</head>

<body>

<div class="container d-flex justify-content-center align-items-center vh-100">
    <div class="card login-card shadow-lg">
        <div class="card-body p-4">

            <h4 class="text-center mb-4 fw-bold">Sign In</h4>

            <form action="loginGamil" method="post">

                <!-- Email -->
                <div class="mb-3">
                    <label class="form-label">Email</label>
                    <input type="email"
                           class="form-control"
                           id="email"
                           name="email"
                           placeholder="Enter email">
                    <small class="text-danger" id="emailError"></small>
                </div>

                <!-- Password -->
                <div class="mb-3">
                    <label class="form-label">Password</label>
                    <input type="password"
                           class="form-control"
                           id="password"
                           name="password"
                           placeholder="Enter password">
                    <small class="text-danger" id="passwordError"></small>
                </div>
                <div class="d-grid mt-4"> <button type="submit" class="btn btn-warning fw-bold"> Login </button>
                </div>



                <div class="text-center mt-3"> <small> Don’t have an account? <a href="Register.jsp" class="text-decoration-none">
                Sign Up</a>
                </small>
                </div>


            </form>



        </div>
    </div>
</div>

<!-- Bootstrap JS -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js">

function validateLogin() {

    let isValid = true;

    let email = document.getElementById("email").value.trim();
    let password = document.getElementById("password").value.trim();

    // Clear old errors
    document.getElementById("emailError").innerText = "";
    document.getElementById("passwordError").innerText = "";

    // Email validation
    let emailPattern = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
    if (email === "") {
        document.getElementById("emailError").innerText = "Email is required";
        isValid = false;
    } else if (!emailPattern.test(email)) {
        document.getElementById("emailError").innerText = "Enter a valid email";
        isValid = false;
    }

    // Password validation
    if (password === "") {
        document.getElementById("passwordError").innerText = "Password is required";
        isValid = false;
    } else if (password.length < 6) {
        document.getElementById("passwordError").innerText =
            "Password must be at least 6 characters";
        isValid = false;
    }

    return isValid;
}




</script>

</body>
</html>
