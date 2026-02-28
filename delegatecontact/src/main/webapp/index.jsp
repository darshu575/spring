<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>DelegateContact | Smart Event Delegate Management</title>

    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">

    <!-- Bootstrap Icons -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.1/font/bootstrap-icons.css" rel="stylesheet">

    <!-- Google Font -->
    <link href="https://fonts.googleapis.com/css2?family=Poppins:wght@300;500;700&display=swap" rel="stylesheet">

    <style>
        body {
            font-family: 'Poppins', sans-serif;
            margin: 0;
            scroll-behavior: smooth;
        }

        /* NAVBAR */
       /* NAVBAR FIXED */
       .navbar {
           background-color: #4da6ff !important;
           padding: 12px 0;
       }

       .navbar-brand {
           display: flex;
           align-items: center;
           font-weight: 600;
           font-size: 20px;
           color: black !important;
       }

       .navbar-brand img {
           height: 35px;
           margin-right: 8px;
       }

       .navbar-nav {
           align-items: center;
       }

       .nav-link {
           color: black !important;
           margin-left: 25px;
           font-weight: 500;
       }

       .nav-link:hover {
           color: #003366 !important;
       }
        /* HERO */
        .hero {
            height: 100vh;
            background: linear-gradient(rgba(0,0,0,0.75), rgba(0,0,0,0.75)),
            url('https://images.unsplash.com/photo-1540575467063-178a50c2df87')
            no-repeat center center/cover;
            display: flex;
            justify-content: center;
            align-items: center;
            text-align: center;
            color: white;
        }

        .hero h1 {
            font-size: 55px;
            font-weight: 700;
        }

        .typing {
            color: #00d4ff;
        }

        .btn-main {
            padding: 12px 30px;
            border-radius: 30px;
            font-size: 18px;
        }

        /* SCROLL DOWN */
        .scroll-down {
            position: absolute;
            bottom: 30px;
            left: 50%;
            transform: translateX(-50%);
            font-size: 30px;
            color: white;
            animation: bounce 2s infinite;

        }

        @keyframes bounce {
            0%,20%,50%,80%,100% { transform: translate(-50%,0); }
            40% { transform: translate(-50%,10px); }
            60% { transform: translate(-50%,5px); }
        }

        /* STATS */
        .stats {
            padding: 80px 0;
            background: #f8f9fa;
                text-align: center;
        }

        .stat-number {
            font-size: 40px;
            font-weight: 700;
            color: #00aaff;
        }

        footer {
            background: #111;
            color: #aaa;
            text-align: center;
            padding: 20px;
        }
    </style>
</head>

<body>

<!-- NAVBAR --><nav class="navbar navbar-expand-lg navbar-light fixed-top">
                   <div class="container">

                       <!-- LOGO -->
                       <a class="navbar-brand" href="#">
                           <img src="Logo.png" alt="Logo">
                           DelegateContact
                       </a>

                       <!-- TOGGLER -->
                       <button class="navbar-toggler" type="button"
                               data-bs-toggle="collapse"
                               data-bs-target="#navbarNav">
                           <span class="navbar-toggler-icon"></span>
                       </button>


                       <!-- MENU -->
                       <div class="collapse navbar-collapse justify-content-end" id="navbarNav">
                           <div class="navbar-nav">
                               <a class="nav-link" href="#">Home</a>
                               <a class="nav-link" href="#">Events</a>
                               <a class="nav-link" href="#">Login</a>
                               <a class="btn btn-dark ms-4 px-4" href="#">Register</a>
                           </div>
                       </div>

                   </div>
               </nav>

<!-- HERO -->
<section class="hero">
    <div>
        <h1>Smart <span class="typing"></span></h1>
        <p class="mt-3">Connecting Clients, Students & HR Professionals Seamlessly</p>
        <a href="#" class="btn btn-info btn-main mt-3">Get Started</a>
        <a href="#" class="btn btn-outline-light btn-main mt-3 ms-3">Explore Events</a>
    </div>

    <div class="scroll-down">
        <i class="bi bi-chevron-double-down"></i>
    </div>
</section>

<!-- STATS -->
<section class="stats">
    <div class="container">
        <h2 class="mb-5">Platform Impact</h2>
        <div class="row">
            <div class="col-md-4">
                <div class="stat-number">500+</div>
                <p>Events Managed</p>
            </div>
            <div class="col-md-4">
                <div class="stat-number">10,000+</div>
                <p>Delegates Connected</p>
            </div>
            <div class="col-md-4">
                <div class="stat-number">200+</div>
                <p>Corporate Clients</p>
            </div>
        </div>
    </div>
</section>

<!-- FOOTER -->
<footer>
    © 2026 DelegateContact | Professional Delegate Management System
</footer>

<!-- jQuery -->
<script src="https://code.jquery.com/jquery-3.7.1.min.js"></script>

<!-- Bootstrap JS Bundle -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>

<!-- Navbar Scroll Effect -->
<script>
    $(window).scroll(function() {
        if ($(this).scrollTop() > 50) {
            $('.navbar').addClass('scrolled');
        } else {
            $('.navbar').removeClass('scrolled');
        }
    });
</script>

<!-- Typing Animation -->
<script>
    const words = ["Delegate Management", "Event Coordination", "HR & Student Networking"];
    let i = 0;

    function typingEffect() {
        let word = words[i].split("");
        let loopTyping = function() {
            if (word.length > 0) {
                document.querySelector(".typing").innerHTML += word.shift();
                setTimeout(loopTyping, 100);
            } else {
                setTimeout(deletingEffect, 1000);
            }
        };
        loopTyping();
    }

    function deletingEffect() {
        let word = words[i].split("");
        let loopDeleting = function() {
            if (word.length > 0) {
                word.pop();
                document.querySelector(".typing").innerHTML = word.join("");
                setTimeout(loopDeleting, 50);
            } else {
                i = (i + 1) % words.length;
                typingEffect();
            }
        };
        loopDeleting();
    }

    typingEffect();
</script>

</body>
</html>