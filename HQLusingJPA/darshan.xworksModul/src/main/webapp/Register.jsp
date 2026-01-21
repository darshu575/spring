<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
    <title>Register</title>

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
                    <h5>Register</h5>
                </div>

                <div class="card-body">
                    <form action="registerDetails" method="post" onsubmit="return validateForm()">

                        <!-- Name -->
                        <div class="mb-2">
                            <label>Name</label>
                            <input type="text" id="name" name="userName"
                                   class="form-control form-control-sm"
                                   onblur="validateName()">

                            <small class="text-danger" id="nameError"></small>

                                            <small class="text-danger">
                                                 ${NameError}
                                            </small>

                        </div>

                        <!-- Email -->
                        <div class="mb-2">
                            <label>Email</label>
                            <input type="email" id="email" name="email"
                                   class="form-control form-control-sm"
                                   onblur="validateEmail()">
                            <small class="text-danger" id="emailError"></small>

                              <small class="text-danger">
                                     ${EmailError}
                               </small>
                        </div>

                        <!-- Phone -->
                        <div class="mb-2">
                            <label>Phone</label>
                            <input type="text" id="phone" name="phoneNumber"
                                   class="form-control form-control-sm"
                                   onblur="validatePhone()">
                            <small class="text-danger" id="phoneError"></small>
                                              <small class="text-danger">
                                                    ${PhoneNumberError}
                                               </small>
                        </div>

                        <!-- Age -->
                        <div class="mb-2">
                            <label>Age</label>
                            <input type="number" id="age" name="age"
                                   class="form-control form-control-sm"
                                   onblur="validateAge()">
                            <small class="text-danger" id="ageError"></small>

                                         <small class="text-danger">
                                                ${AgeError}
                                          </small>
                        </div>

                        <!-- Gender -->
                        <div class="mb-2">
                            <label>Gender</label>
                            <select id="gender" name="gender"
                                    class="form-select form-select-sm"
                                    onblur="validateGender()">
                                <option value="">Select</option>
                                <option>Male</option>
                                <option>Female</option>
                                <option>Other</option>
                            </select>
                            <small class="text-danger" id="genderError"></small>

                                            <small class="text-danger">
                                                ${GenderError}
                                            </small>
                        </div>

                        <!-- Address -->
                        <div class="mb-2">
                            <label>Address</label>
                            <textarea id="address" name="address"
                                      class="form-control form-control-sm"
                                      rows="2"
                                      onblur="validateAddress()"></textarea>
                            <small class="text-danger" id="addressError"></small>

                             <small class="text-danger">
                                               ${AddressError}
                              </small>
                        </div>

                        <!-- Password -->
                        <div class="mb-2">
                            <label>Password</label>
                            <input type="password" id="password" name="password"
                                   class="form-control form-control-sm"
                                   onblur="validatePassword()">
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

                        <button class="btn btn-dark w-100">Register</button>
                    </form>
                </div>
            </div>

        </div>
    </div>
</div>

<!-- JS VALIDATION -->
 <script>
function validateName() {
    let name = document.getElementById("name").value.trim();
    let pattern = /^[A-Za-z\s]+$/;   // only letters and spaces

    if (name.length < 3) {
        document.getElementById("nameError").innerText =
            "Name must be at least 3 characters";
        return false;
    }

    if (!pattern.test(name)) {
        document.getElementById("nameError").innerText =
            "Name must contain only letters (no numbers or symbols)";
        return false;
    }

    document.getElementById("nameError").innerText = "";
    return true;
}


function validateEmail() {
    let email = document.getElementById("email").value;
    if (!/^[^\s@]+@[^\s@]+\.[^\s@]+$/.test(email)) {
        document.getElementById("emailError").innerText = "Invalid email";
        return false;
    }
    document.getElementById("emailError").innerText = "";
    return true;
}

function validatePhone() {
    let phone = document.getElementById("phone").value;
    if (!/^[6-9]\d{9}$/.test(phone)) {
        document.getElementById("phoneError").innerText = "10 digit number only";
        return false;
    }
    document.getElementById("phoneError").innerText = "";
    return true;
}

function validateAge() {
    let age = document.getElementById("age").value;
    if (age < 18 || age > 100) {
        document.getElementById("ageError").innerText = "Age 18–100 only";
        return false;
    }
    document.getElementById("ageError").innerText = "";
    return true;
}

function validateGender() {
    if (document.getElementById("gender").value === "") {
        document.getElementById("genderError").innerText = "Select gender";
        return false;
    }
    document.getElementById("genderError").innerText = "";
    return true;
}

function validateAddress() {
    if (document.getElementById("address").value.length < 5) {
        document.getElementById("addressError").innerText = "Min 5 chars";
        return false;
    }
    document.getElementById("addressError").innerText = "";
    return true;
}

function validatePassword() {
    let password = document.getElementById("password").value;

    let pattern = /^(?=.*[a-z])(?=.*[A-Z])(?=.*\d)(?=.*[@$!%*?&]).{8,}$/;

    if (!pattern.test(password)) {
        document.getElementById("passwordError").innerText =
            "Password must contain 1 uppercase, 1 lowercase, 1 number, 1 special character and min 8 chars";
        return false;
    }

    document.getElementById("passwordError").innerText = "";
    return true;
}

function validateConfirmPassword() {
    let password = document.getElementById("password").value;
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
        validateName() &&
        validateEmail() &&
        validatePhone() &&
        validateAge() &&
        validateGender() &&
        validateAddress() &&
        validatePassword() &&
        validateConfirmPassword()
    );
}
</script>


</body>
</html>
