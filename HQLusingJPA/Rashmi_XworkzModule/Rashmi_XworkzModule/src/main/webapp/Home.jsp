<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=yes, initial-scale=1.0, maximum-scale=2.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Home</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-sRIl4kxILFvY47J16cr9ZwB07vP4J8+LH7qKQnuqkuIAvNWLzeN8tE5YBujZqJLB" crossorigin="anonymous">
    <style>
        body {
       background-image: url('<%= request.getContextPath() %>/resources/images/bgImage.jpg');
       background-repeat: no-repeat;
       background-size: cover;
       background-position: center;
       backdrop-filter: blur(7px);
      }


    .navbar-nav .nav-link:hover {
        color: #fd7e14 !important;
        border-bottom : 2px solid #fd7e14;
    }

    </style>
</head>
<body>

<nav class="navbar navbar-expand-lg bg-dark border-bottom border-body" style="height: 80px;">
    <div class="container-fluid">
        <img src="<%= request.getContextPath() %>/resources/images/logo.png" alt="logo" style="height:60px;width:130px;">
        <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav"
                aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>

        <div class="collapse navbar-collapse" id="navbarNav">
            <ul class="navbar-nav ps-5 ms-5">
                <li class="nav-item">
                    <a class="nav-link active text-white ps-4 ms-4 fs-5" aria-current="page" href="index">HOME</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link active text-white ps-4 ms-4 fs-5" aria-current="page" href="about">ABOUT</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link active text-white ps-4 ms-4 fs-5" aria-current="page" href="contact">CONTACT</a>
                </li>

            </ul>
            <ul class="navbar-nav nav-pills ms-auto">
                <li class="nav-item"><a class="nav-link active text-dark  fw-bold m-1  bg-body-tertiary" href="index">Logout</a></li>
            </ul>
        </div>
    </div>
</nav>

<div class="card text-center p-4">
    <div class="card-body">
        <h5 class="card-title fs-3 fw-semibold" style="color:#fd7e14;">WELCOME TO X-WORKZ</h5>
        <br>
        <p class="card-text fs-2 fw-bolder">Transforming Careers Through <span style="color: #fd7e14 !important;"><u>Excellence</u></span></p>
        <p class="fs-5  text-center">Where passion for technology meets dedication to student success. We are professionals
            <br> from the IT industry, committed to bridging the gap between academic learning and real-world <br> demands.</p>
    </div>
</div>
</body>
</html>
