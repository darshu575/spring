<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>My Application</title>

    <!-- Meta Info -->
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- ✅ Bootstrap 5 CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
</head>

<body class="bg-light">

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
<!-- FORM SECTION -->
<div class="container my-5">
    <div class="row">
        <!-- Move form to right & reduce width -->
        <div class="col-md-4 offset-md-6">

            <div class="card shadow">
                <div class="card-header bg-dark text-light text-center">
                    <h5>Register</h5>
                </div>

                <div class="card-body">
                    <form action="registerDetails" method="post" onsubmit="return validateForm();">

                        <!-- Name -->
                        <div class="mb-2">
                            <label class="form-label">Name</label>
                            <input type="text" class="form-control form-control-sm" id="name" name="userName">
                            <small class="text-danger" id="nameError"></small>
                        </div>

                        <!-- Email -->
                        <div class="mb-2">
                            <label class="form-label">Email</label>
                            <input type="email" class="form-control form-control-sm" id="email" name="email">
                            <small class="text-danger" id="emailError"></small>
                        </div>

                        <!-- Phone -->
                        <div class="mb-2">
                            <label class="form-label">Phone</label>
                            <input type="tel" class="form-control form-control-sm" id="phone" name="phoneNumber">
                            <small class="text-danger" id="phoneError"></small>
                        </div>

                        <!-- Age -->
                        <div class="mb-2">
                            <label class="form-label">Age</label>
                            <input type="number" class="form-control form-control-sm" id="age" name="age">
                            <small class="text-danger" id="ageError"></small>
                        </div>

                        <!-- Gender -->
                        <div class="mb-2">
                            <label class="form-label">Gender</label>
                            <select class="form-select form-select-sm" id="gender" name="gender">
                                <option value="">Select</option>
                                <option>Male</option>
                                <option>Female</option>
                                <option>Other</option>
                            </select>
                            <small class="text-danger" id="genderError"></small>
                        </div>

                        <!-- Address -->
                        <div class="mb-2">
                            <label class="form-label">Address</label>
                            <textarea class="form-control form-control-sm" id="address" name="address" rows="2"></textarea>
                            <small class="text-danger" id="addressError"></small>
                        </div>

                        <!-- Password -->
                        <div class="mb-2">
                            <label class="form-label">Password</label>
                            <input type="password" class="form-control form-control-sm" id="password" name="password">
                            <small class="text-danger" id="passwordError"></small>
                        </div>

                        <!-- Confirm Password -->
                        <div class="mb-3">
                            <label class="form-label">Confirm</label>
                            <input type="password" class="form-control form-control-sm" id="confirmPassword" name="confirmPassword">
                            <small class="text-danger" id="confirmPasswordError"></small>
                        </div>

                        <div class="d-grid">
                            <button type="submit" class="btn btn-dark btn-sm">Register</button>
                        </div>

                    </form>
                </div>
            </div>

        </div>
    </div>
</div>

<!-- FOOTER -->
<footer class="bg-dark text-light py-3 ">
    <div class="container text-center">
        <small>
            © 2026 MyApp |
            <a href="#" class="text-decoration-none text-secondary">Privacy Policy</a> |
            <a href="#" class="text-decoration-none text-secondary">Contact</a>
        </small>
    </div>
</footer>

<!-- ✅ Bootstrap 5 JS -->
<script>
function validateForm() {

    let isValid = true;

    // Get values
    let name = document.getElementById("name").value.trim();
    let email = document.getElementById("email").value.trim();
    let phone = document.getElementById("phone").value.trim();
    let age = document.getElementById("age").value;
    let gender = document.getElementById("gender").value;
    let address = document.getElementById("address").value.trim();
    let password = document.getElementById("password").value;
    let confirmPassword = document.getElementById("confirmPassword").value;

    // Clear old errors
    document.querySelectorAll("small").forEach(e => e.innerText = "");

    // Name

        let namePattern = /^[A-Za-z\s]+$/;
    if (name.length < 3) {
        document.getElementById("nameError").innerText = "Name must be at least 3 characters";
        isValid = false;
    }

    // Email
    let emailPattern = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
    if (!emailPattern.test(email)) {
        document.getElementById("emailError").innerText = "Enter a valid email";
        isValid = false;
    }

    // Phone
    let phonePattern = /^[0-9]{10}$/;
    if (!phonePattern.test(phone)) {
        document.getElementById("phoneError").innerText = "Phone number must be 10 digits";
        isValid = false;
    }

    // Age
    if (age < 18 || age > 100) {
        document.getElementById("ageError").innerText = "Age must be between 18 and 100";
        isValid = false;
    }

    // Gender
    if (gender === "") {
        document.getElementById("genderError").innerText = "Please select gender";
        isValid = false;
    }

    // Address
    if (address.length < 5) {
        document.getElementById("addressError").innerText = "Address must be at least 5 characters";
        isValid = false;
    }

    // Password
    if (password.length < 6) {
        document.getElementById("passwordError").innerText = "Password must be at least 6 characters";
        isValid = false;
    }

    // Confirm Password
    if (password !== confirmPassword) {
        document.getElementById("confirmPasswordError").innerText = "Passwords do not match";
        isValid = false;
    }

    return isValid;
}
</script>

</body>
</html>
