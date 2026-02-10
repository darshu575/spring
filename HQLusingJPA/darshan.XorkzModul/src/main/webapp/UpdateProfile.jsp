<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

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

<a class="navbar-brand d-flex align-items-center" href="#">
            <!-- Replace with your logo link -->
            <img src="Logo.png" alt="Logo" width="50" class="me-2">

        </a>        <a class="navbar-brand" href="#">MyApp</a>

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
                    <h5>Upadate Profile Details</h5>
                </div>

                <div class="card-body">


                    <form action="updateProfileInfo" method="post" enctype="multipart/form-data" onsubmit="return validateForm()">

      <div class="text-center mb-3">
          <label for="profileImageInput" style="cursor:pointer;">
              <img id="profileAvatar"
                   src="${editeUser.userProfilePath}"
                   class="rounded-circle shadow"
                   style="width:120px; height:120px; object-fit:cover;">
          </label>

          <input type="file"
                 id="profileImageInput"
                 name="userProfileImage"
                 style="display:none;"
                 onchange="previewProfileImage(this)">
      </div>



                        <!-- Name -->
                        <div class="mb-2">
                            <label>Name</label>
                            <input type="text" id="name" name="userName" value="${editeUser.userName}"
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
                            <input type="email" id="email" name="email" value="${editeUser.email}"
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
                            <input type="text" id="phone" name="phoneNumber" value="${editeUser.phoneNumber}"
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
                            <input type="number" id="age" name="age" value="${editeUser.age}"
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
                                     onblur="validateAddress()">${editeUser.address}</textarea>

                           <small class="text-danger" id="addressError"></small>

                           <small class="text-danger">
                               ${AddressError}
                           </small>
                       </div>


                        <c:if test="${not empty updated}">
                            <div class="alert alert-success text-center">
                                ${updated}
                            </div>
                        </c:if>

                        <c:if test="${not empty notUpdated}">
                            <div class="alert alert-danger text-center">
                                ${notUpdated}
                            </div>
                        </c:if>

                        <button type="submit" class="btn btn-dark w-100">Update</button>

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




function validateForm() {
    return (
        validateName() &&
        validateEmail() &&
        validatePhone() &&
        validateAge() &&
        validateGender() &&
        validateAddress()

    );
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


