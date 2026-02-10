
<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Re-Set-Password</title>

    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Bootstrap -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
</head>

<body class="bg-light">

<!-- NAVBAR -->
<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
    <div class="container">
        <a class="navbar-brand" href="#">MyApp</a>

        <div class="ms-auto">
            <form action="signIn" method="get" class="d-inline">
                <button class="btn btn-outline-light btn-sm">Sign In</button>
            </form>
            <form action="signUp" method="get" class="d-inline">
                <button class="btn btn-outline-light btn-sm">Sign Up</button>
            </form>
        </div>
    </div>
</nav>

<!-- FORM -->
<div class="container my-5">
    <div class="row justify-content-end">
        <div class="col-md-4">

            <div class="card shadow">
                <div class="card-header bg-dark text-white text-center">
                    <h5>Re-Set-Password</h5>
                </div>

                <div class="card-body">
                    <form action="reSetPassword" method="post" onsubmit="return validateForm()">





                        <!-- Email -->
                        <div class="mb-2">
                            <label>Email</label>
                            <input type="email" id="email" name="newEmail"
                                   class="form-control form-control-sm"
                                   onblur="validateEmail()" value="${reSetEmail}">
                            <small class="text-danger" id="emailError"></small>


                        </div>


                        <!--New Password -->
                        <div class="mb-2">
                            <label>New Password</label>
                            <input type="password" id="Newpassword" name="newPassword"
                                   class="form-control form-control-sm"
                                   onblur="validateNewPassword()">
                            <small class="text-danger" id="passwordError"></small>

                                              <small class="text-danger">
                                               ${PasswordError}
                                                </small>
                        </div>

                        <!-- Confirm -->
                        <div class="mb-3">
                            <label>Confirm Password</label>
                            <input type="password" id="confirmPassword" name="confirmPassword"
                                   class="form-control form-control-sm"
                                   onblur="validateConfirmPassword()">
                            <small class="text-danger" id="confirmPasswordError"></small>


                                              <small class="text-danger">
                                               ${ConfirmPasswordError}
                                                </small>
                        </div>

                            <small class="text-danger">
                                 ${ErrorPassord}
                            </small>
                        <button class="btn btn-dark w-100">Login</button>
                    </form>
                </div>
            </div>

        </div>
    </div>
</div>

<!-- JS VALIDATION -->
<script>
function validateEmail() {
    let email = document.getElementById("email").value.trim();

    if (!/^[^\s@]+@[^\s@]+\.[^\s@]+$/.test(email)) {
        document.getElementById("emailError").innerText = "Invalid email";
        return false;
    }
    document.getElementById("emailError").innerText = "";
    return true;
}

function validateNewPassword() {
    let password = document.getElementById("Newpassword").value;

    let pattern = /^(?=.*[a-z])(?=.*[A-Z])(?=.*\d)(?=.*[@$!%*?&]).{8,}$/;

    if (!pattern.test(password)) {
        document.getElementById("passwordError").innerText =
            "Password must contain uppercase, lowercase, number & special char (min 8)";
        return false;
    }

    document.getElementById("passwordError").innerText = "";
    return true;
}

function validateConfirmPassword() {
    let password = document.getElementById("Newpassword").value;
    let confirm = document.getElementById("confirmPassword").value;

    if (password !== confirm) {
        document.getElementById("confirmPasswordError").innerText =
            "Passwords do not match";
        return false;
    }

    document.getElementById("confirmPasswordError").innerText = "";
    return true;
}

function validateForm() {
    return (
        validateEmail() &&
        validateNewPassword() &&
        validateConfirmPassword()
    );
}
</script>



</body>
</html>
