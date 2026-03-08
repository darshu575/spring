<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<title>TPO Login Portal</title>

<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">

<style>

body{
    background: linear-gradient(135deg,#1e3c72,#2a5298);
    height:100vh;
    display:flex;
    align-items:center;
    justify-content:center;
    font-family: Arial, Helvetica, sans-serif;
}

.login-card{
    width:400px;
    border-radius:12px;
}

.portal-title{
    font-weight:bold;
    color:#2a5298;
}

.login-btn{
    background:#2a5298;
    border:none;
}

.login-btn:hover{
    background:#1e3c72;
}

.logo{
    font-size:28px;
    font-weight:bold;
    color:#2a5298;
}

</style>

</head>

<body>

<div class="card login-card shadow-lg p-4">

    <div class="text-center mb-3">
        <div class="logo">TPO Portal</div>
        <p class="text-muted">Training & Placement Officer Login</p>
    </div>

    <c:if test="${not empty error}">
        <div class="alert alert-danger text-center">
            ${error}
        </div>
    </c:if>

    <form action="tpologin" method="post">

        <div class="mb-3">
            <label class="form-label">Email Address</label>
            <input type="email" name="email" class="form-control" placeholder="Enter your email" required>
        </div>

        <div class="mb-3">
            <label class="form-label">Login Code</label>
            <input type="text" name="loginCode" class="form-control" placeholder="Enter login code" required>
        </div>

        <div class="d-grid">
            <button type="submit" class="btn login-btn text-white">
                Login
            </button>

        </div>
        <c:if test="${not empty error}">
            <div class="alert alert-danger text-center">
                ${error}
            </div>
        </c:if>

    </form>

    <div class="text-center mt-3">
        <small class="text-muted">© 2026 DelegateContact</small>
    </div>

</div>

</body>
</html>