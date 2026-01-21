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
    }else{
    error.textContent = "";
    return true;
    }
}


function enableSubmit(){
    validateUserEmail()&&
    validatePassword();
        document.getElementById("signInBtn").disabled = !isValid;

}