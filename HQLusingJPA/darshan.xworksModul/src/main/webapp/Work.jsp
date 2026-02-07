<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

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
        .team-card {
            border: none;
            border-radius: 15px;
            background: linear-gradient(145deg, #f0f3ff, #d9e0ff);
            box-shadow: 8px 8px 20px #c5cbe5, -8px -8px 20px #ffffff;
            transition: all 0.3s ease;
            overflow: hidden;
        }

        .team-card:hover {
            transform: translateY(-10px) scale(1.02);
            box-shadow: 12px 12px 25px #b0b7d8, -12px -12px 25px #ffffff;
        }

        .team-card .card-header {
            background: linear-gradient(90deg, #6a11cb, #2575fc);
            color: #fff;
            font-weight: 700;
            font-size: 1.2rem;
            text-align: center;
            padding: 15px;
            border-radius: 15px 15px 0 0;
        }

        .team-card .card-body {
            padding: 15px;
        }

        .team-card p {
            margin-bottom: 10px;
            color: #333;
            font-size: 0.95rem;
        }

        .team-card i {
            color: #2575fc;
            margin-right: 6px;
        }

        .team-card button {
            background: #2575fc;
            color: white;
            border-radius: 8px;
            border: none;
            padding: 6px 12px;
            transition: all 0.3s ease;
            margin-top: 8px;
        }

        .team-card button:hover {
            background: #6a11cb;
            transform: scale(1.05);
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
<div class="container my-5">
    <div class="row">

      <c:forEach items="${members}" var="member">
          <div class="card mb-3 shadow-sm" style="max-width: 400px;">
              <div class="row g-0">
                  <div class="col-md-4 text-center p-2">
                      <c:choose>
                          <c:when test="${not empty member.profileImagePath}">
                              <img src="${member.profileImagePath}" class="rounded-circle"
                                   style="width:100px; height:100px; object-fit:cover;">
                          </c:when>
                          <c:otherwise>
                              <img src="/member-images/${fn:substringAfterLast(member.profileImagePath,'/')}"
                                                       class="card-img-top" alt="Profile Image"

                                   style="width:100px; height:100px; object-fit:cover;">
                          </c:otherwise>
                      </c:choose>
                  </div>
                  <div class="col-md-8">
                      <div class="card-body">
                           <p><i class="bi bi-person"></i> <strong>Age:</strong> ${member.age}</p>
                                                <p><i class="bi bi-gender-ambiguous"></i> <strong>Gender:</strong> ${member.gender}</p>
                                                <p><i class="bi bi-envelope"></i> <strong>Email:</strong> ${member.email}</p>
                                                <p><i class="bi bi-telephone"></i> <strong>Contact:</strong> ${member.phoneNumber}</p>
                      </div>
                  </div>
              </div>
          </div>
      </c:forEach>



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
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>

</body>
</html>


















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
                    <h5>Register</h5>
                </div>

                <div class="card-body">
                    <form action="registerDetails" method="post" onsubmit="return validateForm()">

 <div class="text-center mb-3">
                        <label for="profileImageInput" style="cursor:pointer;">
                            <img id="profileAvatar" src="profile.png"
                                 class="rounded-circle shadow"
                                 style="width:120px; height:120px; object-fit:cover;">
                        </label>
                        <input type="file" id="profileImageInput" name="profileImage" style="display:none;"
                               onchange="previewProfileImage(this)">
                    </div>

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




Sign up controller


    @SneakyThrows
    @PostMapping("/registerDetails")
    public ModelAndView registerUser(@Valid @ModelAttribute SignUpDto signUpDto, BindingResult bindingResult,
                               @RequestParam("userProfileImage")      MultipartFile file, ModelAndView mv) {

//        boolean isSaved = userService.ValidateAndSave(signUpDto);
//
//        System.out.println(isSaved);
//        if (isSaved) {
//
//            return "Result.jsp";
//        } else return "Error.jsp";
        System.out.println("BackEnd Validation Started");
        System.out.println(bindingResult.toString());
        if (bindingResult.hasErrors()) {
            if (bindingResult.hasFieldErrors("userName")) {
                mv.addObject("NameError", bindingResult.getFieldError("userName").getDefaultMessage());
            }


            if (bindingResult.hasFieldErrors("email")) {
                mv.addObject("EmailError", bindingResult.getFieldError("email").getDefaultMessage());

            }

            if (bindingResult.hasFieldErrors("phoneNumber")) {
                mv.addObject("PhoneNumberError", bindingResult.getFieldError("phoneNumber").getDefaultMessage());

            }
            if (bindingResult.hasFieldErrors("age")) {
                mv.addObject("AgeError", bindingResult.getFieldError("age").getDefaultMessage());

            }


            if (bindingResult.hasFieldErrors("gender")) {
                mv.addObject("GenderError", bindingResult.getFieldError("gender").getDefaultMessage());

            }

            if (bindingResult.hasFieldErrors("address")) {
                mv.addObject("AddressError", bindingResult.getFieldError("address").getDefaultMessage());
            }


            if (bindingResult.hasFieldErrors("password")) {
                mv.addObject("PasswordError", bindingResult.getFieldError("password").getDefaultMessage());
            }


            if (bindingResult.hasFieldErrors("confirmPassword")) {
                mv.addObject("ConfirmPasswordError", bindingResult.getFieldError("confirmPassword").getDefaultMessage());
            }

            if (!signUpDto.getPassword().equals(signUpDto.getConfirmPassword())) {
                mv.addObject("ConfirmPasswordError", "Password Not Match");

            }
            mv.setViewName("Register.jsp");
            return mv;
        }
        try {
            if (file != null || file.isEmpty()) {
                String uploadDir = "D:/team-images/";
                String filePath = System.currentTimeMillis() + "_" + file.getOriginalFilename();
                File dest = new File(uploadDir + filePath);
                file.transferTo(dest);

                signUpDto.setUserProfilePath("D:/team-images/" + filePath);
            } else {
//        if (bindingResult.hasErrors()) {
//            bindingResult.getFieldErrors().forEach(error ->
//                    mv.addObject(error.getField() + "Error",
//                            error.getDefaultMessage())
//            );
                System.out.println("Backend Validation Ended");
                if (signUpDto != null) {
                    boolean isSaved = userService.ValidateAndSave(signUpDto);

                    System.out.println(isSaved);
                    if (isSaved) {
                        mv.setViewName("Result.jsp");
                        return mv;
                    } else mv.setViewName("Error.jsp");
                    return mv;
                } else System.out.println("Data Is Not Valid");
            }

        } catch (Exception e){
            e.printStackTrace();
        }
        return mv;
    }
