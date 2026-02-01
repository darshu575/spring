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


<!-- Sign Up Form -->
<div class="container mt-5 mb-5">
    <div class="row justify-content-center">
        <div class="col-md-6">

            <h3 class="text-center text-success mb-4">Sign Up</h3>


            <form onsubmit="return validateForm()" action="signUpUser" method="post">


<c:if test="${not empty success}">
    <div class="alert alert-warning text-center">
        ${success}
    </div>
</c:if>

<c:if test="${not empty error}">
    <div class="alert alert-danger text-center">
        ${error}  ${exist}
    </div>
</c:if>

${errors}

                <!-- First Name -->
                <div class="mb-3">
                    <label class="form-label">First Name</label>
                    <input type="text" id="fname" class="form-control" name="fName" oninput="validateFirstName()">
                    <small id="fnameError" class="text-danger">${fNameError}</small>
                </div>

                <!-- Last Name -->
                <div class="mb-3">
                    <label class="form-label">Last Name</label>
                    <input type="text" id="lname" class="form-control" name="lName" oninput="validateLastName()">
                    <small id="lnameError" class="text-danger">${lNameError}</small>
                </div>

                <!-- Age -->
                <div class="mb-3">
                    <label class="form-label">Age</label>
                    <input type="number" id="age" class="form-control" name="age" oninput="validateAge()">
                    <small id="ageError" class="text-danger">${ageError}</small>
                </div>

                <!-- Gender -->
              <select id="gender" class="form-select" name="gender">
                  <option value="">Select</option>
                  <option value="Male">Male</option>
                  <option value="Female">Female</option>
                  <option value="Other">Other</option>
              </select>

              <small class="text-danger">${genderError}</small>


                <!-- Email -->
                <div class="mb-3">
                    <label class="form-label">Email</label>
                    <input type="email" id="email" class="form-control" name="email" oninput="validateEmail()">
                    <small id="emailError" class="text-danger">${emailError}</small>
                </div>

                <!-- Mobile -->
                <div class="mb-3">
                    <label class="form-label">Mobile Number</label>
                    <input type="number" id="mobile" class="form-control" name="mobile" oninput="validateMobile()">
                    <small id="mobileError" class="text-danger">${mobileError}</small>
                </div>

                <!-- Password -->
                <div class="mb-3">
                    <label class="form-label">Password</label>
                    <input type="password" id="password" class="form-control" name="password" oninput="validatePassword()">
                    <small id="passwordError" class="text-danger">${passwordError}</small>
                </div>

                <!-- Confirm Password -->
                <div class="mb-3">
                    <label class="form-label">Confirm Password</label>
                    <input type="password" id="confirmPassword" class="form-control" oninput="validateConfirmPassword()">
                    <small id="confirmPasswordError" class="text-danger">${confirmPasswordError}</small>
                </div>

                <div class="d-grid">
                    <button type="submit" class="btn btn-success">Register</button>
                </div>

            </form>
        </div>
    </div>
</div>

<!-- Footer -->
<footer class="bg-success bg-opacity-25 text-center py-2 fixed-bottom">
    <small class="text-success-emphasis">
        © 2026 Your Company Name. All rights reserved.
    </small>
</footer>

<!-- Bootstrap JS -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>

<!-- Real-time Validation JS
<script>
const fname = document.getElementById("fname");
const lname = document.getElementById("lname");
const age = document.getElementById("age");
const gender = document.getElementById("gender");
const email = document.getElementById("email");
const mobile = document.getElementById("mobile");
const password = document.getElementById("password");
const confirmPassword = document.getElementById("confirmPassword");

const fnameError = document.getElementById("fnameError");
const lnameError = document.getElementById("lnameError");
const ageError = document.getElementById("ageError");
const genderError = document.getElementById("genderError");
const emailError = document.getElementById("emailError");
const mobileError = document.getElementById("mobileError");
const passwordError = document.getElementById("passwordError");
const confirmPasswordError = document.getElementById("confirmPasswordError");

function validateFirstName() {
    fnameError.innerText =
        fname.value.trim().length > 5 ? "" : "First name must be more than 5 characters";
    return fnameError.innerText === "";
}

function validateLastName() {
    lnameError.innerText =
        lname.value.trim().length > 5 ? "" : "Last name must be more than 5 characters";
    return lnameError.innerText === "";
}

function validateAge() {
    ageError.innerText =
        age.value >= 18 ? "" : "Age must be greater than 18";
    return ageError.innerText === "";
}

function validateGender() {
    genderError.innerText =
        gender.value ? "" : "Please select gender";
    return genderError.innerText === "";
}

function validateEmail() {
    emailError.innerText =
        email.value.endsWith("@gmail.com") ? "" : "Email must end with @gmail.com";
    return emailError.innerText === "";
}

function validateMobile() {
    mobileError.innerText =
        /^[6-9]\d{9}$/.test(mobile.value)
            ? ""
            : "Mobile must start with 6–9 and be 10 digits";
    return mobileError.innerText === "";
}

function validatePassword() {
    passwordError.innerText =
        /(?=.*[a-z])(?=.*[A-Z])(?=.*\d)(?=.*[@$!%*?&]).{8,}/.test(password.value)
            ? ""
            : "Password must be 8+ chars with upper, lower, number & special char";
    return passwordError.innerText === "";
}

function validateConfirmPassword() {
    confirmPasswordError.innerText =
        password.value === confirmPassword.value ? "" : "Passwords do not match";
    return confirmPasswordError.innerText === "";
}

function validateForm() {
    return validateFirstName() &
           validateLastName() &
           validateAge() &
           validateGender() &
           validateEmail() &
           validateMobile() &
           validatePassword() &
           validateConfirmPassword();
}
</script> -->

</body>
</html>
