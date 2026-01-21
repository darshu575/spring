<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=yes, initial-scale=1.0, maximum-scale=2.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Home</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-sRIl4kxILFvY47J16cr9ZwB07vP4J8+LH7qKQnuqkuIAvNWLzeN8tE5YBujZqJLB" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/js/bootstrap.bundle.min.js" integrity="sha384-FKyoEForCGlyvwx9Hj09JcYn3nv7wiPVlz7YYwJrWVcXK/BmnVDxM+D2scQbITxI" crossorigin="anonymous"></script>
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
                <li class="nav-item"><a class="nav-link active text-dark  fw-bold m-1  bg-body-tertiary" href="signUp">Sign Up</a></li>
                <li class="nav-item"><a class="nav-link active text-dark  fw-bold m-1  bg-body-tertiary" href="signInPage">Sign In</a></li>

            </ul>
        </div>
    </div>
</nav>
<div class="container-fluid d-flex justify-content-center align-items-center p-4">
<div id="carouselExampleCaptions" class="carousel slide" style="width:70%;">
    <div class="carousel-indicators">
        <button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="0" class="active" aria-current="true" aria-label="Slide 1"></button>
        <button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="1" aria-label="Slide 2"></button>
        <button type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide-to="2" aria-label="Slide 3"></button>
    </div>
    <div class="carousel-inner" style="height:700px; width:100%; background:#000;">
        <div class="carousel-item active h-100 position-relative">
            <div class="carousel-caption d-flex flex-column justify-content-start align-items-center">
                <h5 class="fw-bold fs-4 text-uppercase">"Guiding lights, inspiring minds"</h5>
            </div>
            <img src="<%= request.getContextPath() %>/resources/images/slide3.png" class="d-block w-100 h-100" alt="..."  style="object-fit:cover;">

        </div>
        <div class="carousel-item h-100 position-relative">
            <div class="carousel-caption position-absolute top-0 start-0 w-100 h-100 d-flex flex-column justify-content-start align-items-center">
                <h5 class="fw-bold fs-4">"Traditions, togetherness, and timeless memories"</h5>
                <p class="fs-5">Capturing happiness during festive and ritual moments</p>
            </div>
            <img src="<%= request.getContextPath() %>/resources/images/slide1.jpeg" class="d-block w-100 h-100" alt="..."  style="object-fit:cover;">

        </div>
        <div class="carousel-item h-100 position-relative">
            <div class="carousel-caption ">
                <h5 class="fw-bold fs-4">"Learning, laughing, and growing together"</h5>
                <p class="fs-5">The joy of collaborative learning and personal growth</p>
            </div>
            <img src="<%= request.getContextPath() %>/resources/images/slide4.jpeg" class="d-block w-100 h-100" alt="..."  style="object-fit:cover;">

        </div>
    </div>
    <button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide="prev">
        <span class="carousel-control-prev-icon" aria-hidden="true"></span>
        <span class="visually-hidden">Previous</span>
    </button>
    <button class="carousel-control-next" type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide="next">
        <span class="carousel-control-next-icon" aria-hidden="true"></span>
        <span class="visually-hidden">Next</span>
    </button>
</div>
</div>
</body>

</html>
