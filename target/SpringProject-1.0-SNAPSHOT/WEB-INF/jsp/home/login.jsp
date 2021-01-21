<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="description" content="">
        <meta name="author" content="">
        <title>Log In | Upwork</title>

        <!-- core CSS -->
        <link href="/resources/home/css/bootstrap.min.css" rel="stylesheet">
        <link href="/resources/home/css/font-awesome.min.css" rel="stylesheet">
        <link href="/resources/home/css/prettyPhoto.css" rel="stylesheet">
        <link href="/resources/home/css/animate.min.css" rel="stylesheet">
        <link href="/resources/home/css/main.css" rel="stylesheet">
        <link href="/resources/home/css/responsive.css" rel="stylesheet">
        <link href="/resources/home/login/login.css" rel="stylesheet">
        <!--[if lt IE 9]>
        <script src="/resources/home/js/html5shiv.js"></script>
        <script src="/resources/home/js/respond.min.js"></script>
        <![endif]-->       
        <link rel="shortcut icon" href="/resources/home/images/ico/favicon.ico">
        <link rel="apple-touch-icon-precomposed" sizes="144x144" href="/resources/home/images/ico/apple-touch-icon-144-precomposed.png">
        <link rel="apple-touch-icon-precomposed" sizes="114x114" href="/resources/home/images/ico/apple-touch-icon-114-precomposed.png">
        <link rel="apple-touch-icon-precomposed" sizes="72x72" href="/resources/home/images/ico/apple-touch-icon-72-precomposed.png">
        <link rel="apple-touch-icon-precomposed" href="/resources/home/images/ico/apple-touch-icon-57-precomposed.png">
    </head><!--/head-->

    <body>

        <header id="header">
            <div class="top-bar">
                <div class="container">
                    <div class="row">
                        <div class="col-sm-6 col-xs-4">
                            <div class="top-number"><p><i class="fa fa-phone-square"></i>  +0123 456 70 90</p></div>
                        </div>
                        <div class="col-sm-6 col-xs-8">
                            <div class="social">
                                <ul class="social-share">
                                    <li><a href="#"><i class="fa fa-facebook"></i></a></li>
                                    <li><a href="#"><i class="fa fa-twitter"></i></a></li>
                                    <li><a href="#"><i class="fa fa-linkedin"></i></a></li> 
                                    <li><a href="#"><i class="fa fa-dribbble"></i></a></li>
                                    <li><a href="#"><i class="fa fa-skype"></i></a></li>
                                </ul>
                                <div class="search">
                                    <form role="form">
                                        <input type="text" class="search-form" autocomplete="off" placeholder="Search">
                                        <i class="fa fa-search"></i>
                                    </form>
                                </div>
                            </div>
                        </div>
                    </div>
                </div><!--/.container-->
            </div><!--/.top-bar-->

            <nav class="navbar navbar-inverse" role="banner">
                <div class="container">
                    <div class="navbar-header">
                        <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                            <span class="sr-only">Toggle navigation</span>
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                            <span class="icon-bar"></span>
                        </button>
                        <a class="navbar-brand" href="/home/index"><img src="/resources/home/images/logo.png" alt="logo"></a>
                    </div>

                    <div class="collapse navbar-collapse navbar-right">
                        <ul class="nav navbar-nav">
                            <li><a href="/home/index">Home</a></li>
                            <li><a href="/home/aboutUs">About Us</a></li>
                            <li class="active"><a href="/home/login">Log In</a></li>
                            <li><a href="/home/signup">Sign Up</a></li>
                            <li class="dropdown">
                                <a href="#" class="dropdown-toggle" data-toggle="dropdown">User <i class="fa fa-angle-down"></i></a>
                                <ul class="dropdown-menu">
                                    <li><a href="/client/client">Client</a></li>
                                    <li><a href="/freelancer/freelancer">Freelancer</a></li>
                                    <li><a href="404.html">404</a></li>
                                    <li><a href="shortcodes.html">Logout</a></li>
                                </ul>
                            </li>
                            <li><a href="/home/blog">Blog</a></li> 
                            <li><a href="/home/blog">Contact</a></li>                        
                        </ul>
                    </div>
                </div><!--/.container-->
            </nav><!--/nav-->

        </header><!--/header-->
        <div class="simple-login-container">
            <h2>Login Form</h2>
            <form action="/user/login" method="post">
                <div class="row">
                    <div class="col-md-12 form-group">
                        <input type="text" name="frontuser" class="form-control" placeholder="Username">
                    </div>
                </div>
                <div class="row">
                    <div class="col-md-12 form-group">
                        <input type="password" name="frontPass" placeholder="Enter your Password" class="form-control">
                    </div>
                </div>
                <div class="row">
                    <div class="col-md-12 form-group">
                        <input type="submit" value="Continue" class="btn btn-block btn-login" >
                    </div>
                </div>
                <div class="row">
                </div>
            </form>
        </div>
        <script src="/resources/home/js/jquery.js"></script>
        <script src="/resources/home/js/bootstrap.min.js"></script>
        <script src="/resources/home/js/jquery.prettyPhoto.js"></script>
        <script src="/resources/home/js/jquery.isotope.min.js"></script>
        <script src="/resources/home/js/main.js"></script>
        <script src="/resources/home/js/wow.min.js"></script>
    </body>
</html>