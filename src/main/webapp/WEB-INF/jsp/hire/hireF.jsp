<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="description" content="Creative - Bootstrap 3 Responsive Admin Template">
        <meta name="author" content="GeeksLabs">
        <meta name="keyword" content="Creative, Dashboard, Admin, Template, Theme, Bootstrap, Responsive, Retina, Minimal">
        <link rel="shortcut icon" href="/resources/client/img/favicon.png">

        <title>Creative - Bootstrap Admin Template</title>

        <!-- Bootstrap CSS -->
        <link href="/resources/client/css/bootstrap.min.css" rel="stylesheet">
        <!-- bootstrap theme -->
        <link href="/resources/client/css/bootstrap-theme.css" rel="stylesheet">
        <!--external css-->
        <!-- font icon -->
        <link href="/resources/client/css/elegant-icons-style.css" rel="stylesheet" />
        <link href="/resources/client/css/font-awesome.min.css" rel="stylesheet" />
        <!-- full calendar css-->
        <link href="assets/fullcalendar/fullcalendar/bootstrap-fullcalendar.css" rel="stylesheet" />
        <link href="assets/fullcalendar/fullcalendar/fullcalendar.css" rel="stylesheet" />
        <!-- easy pie chart-->
        <link href="assets/jquery-easy-pie-chart/jquery.easy-pie-chart.css" rel="stylesheet" type="text/css" media="screen" />
        <!-- owl carousel -->
        <link rel="stylesheet" href="/resources/client/css/owl.carousel.css" type="text/css">
        <link href="/resources/client/css/jquery-jvectormap-1.2.2.css" rel="stylesheet">
        <!-- Custom styles -->
        <link rel="stylesheet" href="/resources/client/css/fullcalendar.css">
        <link href="/resources/client/css/widgets.css" rel="stylesheet">
        <link href="/resources/client/css/style.css" rel="stylesheet">
        <link href="/resources/client/css/style-responsive.css" rel="stylesheet" />
        <link href="/resources/client/css/xcharts.min.css" rel=" stylesheet">
        <link href="/resources/client/css/jquery-ui-1.10.4.min.css" rel="stylesheet">
        <!-- payment method css link-->
        <link rel="stylesheet" type="text/css" href="bootstrap/css/bootstrap.min.css" />
        <link rel="stylesheet" type="text/css" href="font-awesome/css/font-awesome.min.css" />
        <script type="text/javascript" src="js/jquery-1.10.2.min.js"></script>
        <script type="text/javascript" src="bootstrap/js/bootstrap.min.js"></script>
        <style>
            hr{
                height: 1px;
                background-color: salmon;
            }
        </style>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
        <script>
            $(function () {
                var modal = $(".modal");
                var body = $(window);
                // Get modal size
                var w = modal.width();
                var h = modal.height();
                // Get window size
                var bw = body.width();
                var bh = body.height();

                // Update the css and center the modal on screen
                modal.css({
                    "position": "center",
                    "top": ((bh - h) / 3) + "px",
                    "left": ((bw - w) / 2) + "px"
                })
            });
        </script>
    </head>

    <body>
        <!-- container section start -->
        <section id="container" class="">


            <header class="header dark-bg">
                <div class="toggle-nav">
                    <div class="icon-reorder tooltips" data-original-title="Toggle Navigation" data-placement="bottom"><i class="icon_menu"></i></div>
                </div>

                <!--logo start-->
                <a href="/home/index" class="logo">Upwork <span class="lite">Client</span></a>
                <!--logo end-->

                <div class="nav search-row" id="top_menu">
                    <!--  search form start -->
                    <ul class="nav top-menu">
                        <li>
                            <form class="navbar-form">
                                <input class="form-control" placeholder="Search" type="text">
                            </form>
                        </li>
                    </ul>
                    <!--  search form end -->
                </div>

                <div class="top-nav notification-row">
                    <!-- notificatoin dropdown start-->
                    <ul class="nav pull-right top-menu">

                        <!-- task notificatoin start -->
                        <li id="task_notificatoin_bar" class="dropdown">
                            <a data-toggle="dropdown" class="dropdown-toggle" href="#">
                                <i class="icon-task-l"></i>
                                <span class="badge bg-important">6</span>
                            </a>
                            <ul class="dropdown-menu extended tasks-bar">
                                <div class="notify-arrow notify-arrow-blue"></div>
                                <li>
                                    <p class="blue">You have 6 pending letter</p>
                                </li>
                                <li>
                                    <a href="#">
                                        <div class="task-info">
                                            <div class="desc">Design PSD </div>
                                            <div class="percent">90%</div>
                                        </div>
                                        <div class="progress progress-striped">
                                            <div class="progress-bar progress-bar-success" role="progressbar" aria-valuenow="90" aria-valuemin="0" aria-valuemax="100" style="width: 90%">
                                                <span class="sr-only">90% Complete (success)</span>
                                            </div>
                                        </div>
                                    </a>
                                </li>
                                <li>
                                    <a href="#">
                                        <div class="task-info">
                                            <div class="desc">
                                                Project 1
                                            </div>
                                            <div class="percent">30%</div>
                                        </div>
                                        <div class="progress progress-striped">
                                            <div class="progress-bar progress-bar-warning" role="progressbar" aria-valuenow="30" aria-valuemin="0" aria-valuemax="100" style="width: 30%">
                                                <span class="sr-only">30% Complete (warning)</span>
                                            </div>
                                        </div>
                                    </a>
                                </li>
                                <li>
                                    <a href="#">
                                        <div class="task-info">
                                            <div class="desc">Digital Marketing</div>
                                            <div class="percent">80%</div>
                                        </div>
                                        <div class="progress progress-striped">
                                            <div class="progress-bar progress-bar-info" role="progressbar" aria-valuenow="80" aria-valuemin="0" aria-valuemax="100" style="width: 80%">
                                                <span class="sr-only">80% Complete</span>
                                            </div>
                                        </div>
                                    </a>
                                </li>
                                <li>
                                    <a href="#">
                                        <div class="task-info">
                                            <div class="desc">Logo Designing</div>
                                            <div class="percent">78%</div>
                                        </div>
                                        <div class="progress progress-striped">
                                            <div class="progress-bar progress-bar-danger" role="progressbar" aria-valuenow="78" aria-valuemin="0" aria-valuemax="100" style="width: 78%">
                                                <span class="sr-only">78% Complete (danger)</span>
                                            </div>
                                        </div>
                                    </a>
                                </li>
                                <li>
                                    <a href="#">
                                        <div class="task-info">
                                            <div class="desc">Mobile App</div>
                                            <div class="percent">50%</div>
                                        </div>
                                        <div class="progress progress-striped active">
                                            <div class="progress-bar" role="progressbar" aria-valuenow="50" aria-valuemin="0" aria-valuemax="100" style="width: 50%">
                                                <span class="sr-only">50% Complete</span>
                                            </div>
                                        </div>

                                    </a>
                                </li>
                                <li class="external">
                                    <a href="#">See All Tasks</a>
                                </li>
                            </ul>
                        </li>
                        <!-- task notificatoin end -->
                        <!-- inbox notificatoin start-->
                        <li id="mail_notificatoin_bar" class="dropdown">
                            <a data-toggle="dropdown" class="dropdown-toggle" href="#">
                                <i class="icon-envelope-l"></i>
                                <span class="badge bg-important">5</span>
                            </a>
                            <ul class="dropdown-menu extended inbox">
                                <div class="notify-arrow notify-arrow-blue"></div>
                                <li>
                                    <p class="blue">You have 5 new messages</p>
                                </li>
                                <li>
                                    <a href="#">
                                        <span class="photo"><img alt="avatar" src="/resources/client.//resources/client/img//avatar-mini.jpg"></span>
                                        <span class="subject">
                                            <span class="from">Greg  Martin</span>
                                            <span class="time">1 min</span>
                                        </span>
                                        <span class="message">
                                            I really like this admin panel.
                                        </span>
                                    </a>
                                </li>
                                <li>
                                    <a href="#">
                                        <span class="photo"><img alt="avatar" src="/resources/client.//resources/client/img//avatar-mini2.jpg"></span>
                                        <span class="subject">
                                            <span class="from">Bob   Mckenzie</span>
                                            <span class="time">5 mins</span>
                                        </span>
                                        <span class="message">
                                            Hi, What is next project plan?
                                        </span>
                                    </a>
                                </li>
                                <li>
                                    <a href="#">
                                        <span class="photo"><img alt="avatar" src="/resources/client.//resources/client/img//avatar-mini3.jpg"></span>
                                        <span class="subject">
                                            <span class="from">Phillip   Park</span>
                                            <span class="time">2 hrs</span>
                                        </span>
                                        <span class="message">
                                            I am like to buy this Admin Template.
                                        </span>
                                    </a>
                                </li>
                                <li>
                                    <a href="#">
                                        <span class="photo"><img alt="avatar" src="/resources/client.//resources/client/img//avatar-mini4.jpg"></span>
                                        <span class="subject">
                                            <span class="from">Ray   Munoz</span>
                                            <span class="time">1 day</span>
                                        </span>
                                        <span class="message">
                                            Icon fonts are great.
                                        </span>
                                    </a>
                                </li>
                                <li>
                                    <a href="#">See all messages</a>
                                </li>
                            </ul>
                        </li>
                        <!-- inbox notificatoin end -->
                        <!-- alert notification start-->
                        <li id="alert_notificatoin_bar" class="dropdown">
                            <a data-toggle="dropdown" class="dropdown-toggle" href="#">

                                <i class="icon-bell-l"></i>
                                <span class="badge bg-important">7</span>
                            </a>
                            <ul class="dropdown-menu extended notification">
                                <div class="notify-arrow notify-arrow-blue"></div>
                                <li>
                                    <p class="blue">You have 4 new notifications</p>
                                </li>
                                <li>
                                    <a href="#">
                                        <span class="label label-primary"><i class="icon_profile"></i></span>
                                        Friend Request
                                        <span class="small italic pull-right">5 mins</span>
                                    </a>
                                </li>
                                <li>
                                    <a href="#">
                                        <span class="label label-warning"><i class="icon_pin"></i></span>
                                        John location.
                                        <span class="small italic pull-right">50 mins</span>
                                    </a>
                                </li>
                                <li>
                                    <a href="#">
                                        <span class="label label-danger"><i class="icon_book_alt"></i></span>
                                        Project 3 Completed.
                                        <span class="small italic pull-right">1 hr</span>
                                    </a>
                                </li>
                                <li>
                                    <a href="#">
                                        <span class="label label-success"><i class="icon_like"></i></span>
                                        Mick appreciated your work.
                                        <span class="small italic pull-right"> Today</span>
                                    </a>
                                </li>
                                <li>
                                    <a href="#">See all notifications</a>
                                </li>
                            </ul>
                        </li>
                        <!-- alert notification end-->
                        <!-- user login dropdown start-->
                        <li class="dropdown">
                            <a data-toggle="dropdown" class="dropdown-toggle" href="#">
                                <span class="profile-ava">
                                    <img alt="" src="/resources/client/img/avatar1_small.jpg">
                                </span>
                                <span class="username">Jenifer Smith</span>
                                <b class="caret"></b>
                            </a>
                            <ul class="dropdown-menu extended logout">
                                <div class="log-arrow-up"></div>
                                <li class="eborder-top">
                                    <a href="#"><i class="icon_profile"></i> My Profile</a>
                                </li>
                                <li>
                                    <a href="#"><i class="icon_mail_alt"></i> My Inbox</a>
                                </li>
                                <li>
                                    <a href="#"><i class="icon_clock_alt"></i> Timeline</a>
                                </li>
                                <li>
                                    <a href="#"><i class="icon_chat_alt"></i> Chats</a>
                                </li>
                                <li>
                                    <a href="login.html"><i class="icon_key_alt"></i> Log Out</a>
                                </li>
                                <li>
                                    <a href="documentation.html"><i class="icon_key_alt"></i> Documentation</a>
                                </li>
                                <li>
                                    <a href="documentation.html"><i class="icon_key_alt"></i> Documentation</a>
                                </li>
                            </ul>
                        </li>
                        <!-- user login dropdown end -->
                    </ul>
                    <!-- notificatoin dropdown end-->
                </div>
            </header>
            <!--header end-->
            <div class="container card-title" style="padding-top: 5%; border: 1px; border-radius: 5px">
                <div class="card">
                    <div class="card-header">
                        <h3 class="card-title"><b>Hire</b></h3><hr>
                    </div>
                    <div class="card-body" style="background-color: white; margin: 15px; padding: 20px">
                        <h4 class="card-title"><b style="font-family: Bauhaus 93">Name: ${bid.user_name}</b></h4>
                        <h5 class="card-title"><b>Pay by the hour<br><br> ${bid.hourlyRate}/hr</b></h5>
                        <h5 class="card-title"><b>Time Duration: ${bid.jobDuration}</b></h5>
                        <p class="card-text" style="font-family: Bahnschrift Light">Cover Later: ${bid.coverLater}</p>

                    </div>
                    <div class="card-header">
                        <h3 class="card-title"><b>Billing Method</b></h3><hr>
                    </div>
                    <div class="card-body" style="background-color: white; margin: 15px; padding: 20px">                       
                        <p class="card-text" style="font-family: Bahnschrift Light">Adding a billing method is required to show the freelancer you can pay once work is delivered. There is a 3% processing fee for all payments.</p>
                        <a href="#" class="btn btn-success" data-toggle="modal" data-target="#myModal"> + Add Billing Now</a><br><br>
                        <p><span> $ </span><b>Upwork Payment Protection gives you security and peace of mind.</b></p>
                    </div>
                    <div class="card-header">
                        <h3 class="card-title"><b>Work Description</b></h3><hr>
                    </div>
                    <div class="card-body" style="background-color: white; margin: 15px; padding: 20px">                       
                        <p class="card-text" style="font-family: Bahnschrift Light"><b>Related job Listing </b><br>${bid.jobTitle}</p>
                        <p class="card-text"><b>Contract Title<br></b>${bid.chooseAJob}</p>
                        <p class="card-text"><b>Work Details<br></b>${bid.description}</p>         
                    </div><hr>
                    <div class="card-body" style="background-color: white; margin: 15px; padding: 20px">                       
                        <form action="/hire/save1" method="post" enctype="multipart/form-data">
                            <label><b>Start Date</b></label><br>
                            <input type="date" class="form-group" name="startDate">
                            <br><label><b>Add Related Files</b></label><br>
                            <input type="file" name="projectFile"><br>
                            <input type="button" class="btn btn-danger" value="Cancel"/> &nbsp;
                            <input type="hidden" name="coverLater" value="${bid.coverLater}">
                            <input type="hidden" name="hourlyRate" value="${bid.hourlyRate}">
                            <input type="hidden" name="chooseAJob" value="${bid.chooseAJob}">
                            <input type="hidden" name="jobTitle" value="${bid.jobTitle}">
                            <input type="hidden" name="category" value="${bid.category}">
                            <input type="hidden" name="description" value="${bid.description}">
                            <input type="hidden" name="projectType" value="${bid.projectType}">
                            <input type="hidden" name="freelancerLevel" value="${bid.freelancerLevel}">
                            <input type="hidden" name="budgetAmount" value="${bid.budgetAmount}">
                            <input type="hidden" name="jobDuration" value="${bid.jobDuration}">
                            <input type="hidden" name="jobCode" value="${bid.jobCode}">
                            <input type="hidden" name="firstName" value="${bid.first_name}">
                            <input type="hidden" name="lastName" value="${bid.last_name}">
                            <input type="hidden" name="userName" value="${bid.user_name}">
                            <input type="submit" class="btn btn-info" value="Hire ${bid.first_name}"/><br>
                        </form>
                    </div>
                </div>
            </div>

            <!-- Modal started -->

            <!-- Modal -->
            <div class="modal fade" id="myModal" role="dialog">
                <div class="modal-dialog">

                    <!-- Modal content-->
                    <div class="modal-content">
                        <div class="modal-header">
                            <button type="button" class="close" data-dismiss="modal">&times;</button>
                            <h4 class="modal-title">Add a billing method</h4>
                        </div>
                        <div class="modal-body">
                            <div class="container">
                                <div class="row">
                                    <div class="">
                                        <div class="panel panel-default">
                                            <div class="panel-heading">
                                                <div class="row">
                                                    <h3 class="text-center">Payment Details</h3>
                                                    <img class="img-responsive cc-img" src="http://www.prepbootstrap.com/Content/images/shared/misc/creditcardicons.png">
                                                </div>
                                            </div>
                                            <div class="panel-body">
                                                <form role="form">
                                                    <div class="row">
                                                        <div class="">
                                                            <div class="form-group">
                                                                <label>CARD NUMBER</label>
                                                                <div class="input-group">
                                                                    <input type="tel" class="form-control" placeholder="Valid Card Number" />
                                                                    <span class="input-group-addon"><span class="fa fa-credit-card"></span></span>
                                                                </div>
                                                            </div>
                                                        </div>
                                                    </div>
                                                    <div class="row">
                                                        <div class="">
                                                            <div class="form-group">
                                                                <label><span class="hidden-xs">EXPIRATION</span><span class="visible-xs-inline">EXP</span> DATE</label>
                                                                <input type="tel" class="form-control" placeholder="MM / YY" />
                                                            </div>
                                                        </div>
                                                        <div class="col-xs-5 col-md-5 pull-right">
                                                            <div class="form-group">
                                                                <label>CV CODE</label>
                                                                <input type="tel" class="form-control" placeholder="CVC" />
                                                            </div>
                                                        </div>
                                                    </div>
                                                    <div class="row">
                                                        <div class="col-xs-12">
                                                            <div class="form-group">
                                                                <label>CARD OWNER</label>
                                                                <input type="text" class="form-control" placeholder="Card Owner Names" />
                                                            </div>
                                                        </div>
                                                    </div>
                                                </form>
                                            </div>
                                            <div class="panel-footer">
                                                <div class="row">
                                                    <div class="col-xs-12">
                                                        <button class="btn btn-warning btn-lg btn-block" data-dismiss="modal" >Process payment</button>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>

                        </div>
                        <div class="modal-footer">
                            <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
                        </div>
                    </div>

                </div>
            </div>

        </div>