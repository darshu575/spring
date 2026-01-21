function validateUserName() {
    const name = document.getElementById("name");
    const error = document.getElementById("nameError");
    const pattern = /^[A-Za-z ]{2,45}$/;

    if (name.value.trim() === "") {
        error.textContent = "Name is required";
        return false;
    }
    if (!pattern.test(name.value.trim())) {
        error.textContent = "Only letters and spaces allowed";
        return false;
    }

    error.textContent = "";
    return true;
}

function validateUserEmail() {
    const email = document.getElementById("email");
    const error = document.getElementById("emailError");

    const emailPattern = /^[a-zA-Z0-9._%+-]+@gmail\.com$/;

    if (email.value.trim() === "") {
        error.textContent = "Email is required";
        return false;
    } else if (!emailPattern.test(email.value.trim())) {
        error.textContent = "Enter a valid email address which should include @gmail.com";
        return false;
    } else {
        error.textContent = "";
        return true;
    }
}

function validatePhoneNumber() {
    let phone = document.getElementById("phoneNumber");
    let error = document.getElementById("phoneNumberError");

    const pattern = /^\+91[6-9]\d{9}$/;

    if (phone.value.trim() === "") {
        error.textContent = "Phone number is required";
        return false;
    }
    else if (!pattern.test(phone.value.trim())) {
        error.textContent = "Enter valid number (ex: +919876543210)";
        return false;
    }
    else {
        error.textContent = "";
        return true;
    }
}

function validateAge() {
    let name = document.getElementById("age");
    let error = document.getElementById("ageError");

    if (name.value.trim() === "") {
        error.textContent = "Age is required";
        return false;
    }else if(name.value<18){
         error.textContent = "Age must be greater than 18";
    }
     else {
        error.textContent = "";
        return true;
    }
}

function validateGender() {
    let type = document.getElementById("gender");
    let error = document.getElementById("genderError");

    if (type.value.trim() === "") {
        error.textContent = "Please select Gender";
        return false;
    } else {
        error.textContent = "";
        return true;
    }
}

function validateAddress() {
    let name = document.getElementById("address");
    let error = document.getElementById("addressError");

    if (name.value.trim() === "") {
        error.textContent = "Address is required";
        return false;
    }else if(name.value.length<5){
     error.textContent = "Address must be more than 5 characters";
    } else {
        error.textContent = "";
        return true;
    }
}


function validatePassword() {
    let password = document.getElementById("password").value;
    let error = document.getElementById("passwordError");

    if (password.trim() === "") {
        error.textContent = "Password is required";
        return false;
    }

    if (password.length < 6) {
        error.textContent = "Password must be at least 6 characters";
        return false;
    }

    let pattern = /^(?=.*[A-Za-z])(?=.*\d).+$/;
    if (!pattern.test(password)) {
        error.textContent = "Password must contain letters and numbers";
        return false;
    }

    error.textContent = "";
    return true;
}

function validateConfirmPassword() {
    let password = document.getElementById("password").value;
    let confirmPassword = document.getElementById("confirmPassword").value;
    let error = document.getElementById("confirmPasswordError");

    if (confirmPassword.trim() === "") {
        error.textContent = "Confirm password is required";
        return false;
    }

    if (password !== confirmPassword) {
        error.textContent = "Passwords do not match";
        return false;
    }
    error.textContent = "";
    return true;
}

function enableSubmit() {
    let isValid =
        validateUserName() &&
         validateUserEmail() &&
         validatePhoneNumber() &&
         validateAge()&&
         validateGender()&&
         validateAddress()&&
         validatePassword()&&
         validateConfirmPassword();

    document.getElementById("signUpBtn").disabled = !isValid;
}

document.getElementById("gender").onkeyup = function () {
    validateGender();
    enableSubmit();
};

