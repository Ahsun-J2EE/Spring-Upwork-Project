<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta name="description" content="Creative - Bootstrap 3 Responsive Admin Template">
        <meta name="author" content="GeeksLabs">
        <meta name="keyword" content="Creative, Dashboard, Admin, Template, Theme, Bootstrap, Responsive, Retina, Minimal">
        <link rel="shortcut icon" href="img/favicon.png">

        <title>Freelancer Dashbaord | Upwork</title>

        <!-- Bootstrap CSS -->
        <link href="/resources/client/css/bootstrap.min.css" rel="stylesheet">
        <!-- bootstrap theme -->
        <link href="/resources/client/css/bootstrap-theme.css" rel="stylesheet">
        <!--external css-->
        <!-- font icon -->
        <link href="/resources/client/css/elegant-icons-style.css" rel="stylesheet" />
        <link href="/resources/client/css/font-awesome.min.css" rel="stylesheet" />
        <link href="/resources/client/css/daterangepicker.css" rel="stylesheet" />
        <link href="/resources/client/css/bootstrap-datepicker.css" rel="stylesheet" />
        <link href="/resources/client/css/bootstrap-colorpicker.css" rel="stylesheet" />
        <!-- date picker -->

        <!-- color picker -->

        <!-- Custom styles -->
        <link href="/resources/client/css/style.css" rel="stylesheet">
        <link href="/resources/client/css/style-responsive.css" rel="stylesheet" />

    </head>

    <body>

        <!-- container section start -->
        <section id="container" class="">
            <!--header start-->
            <header class="header dark-bg">
                <div class="toggle-nav">
                    <div class="icon-reorder tooltips" data-original-title="Toggle Navigation" data-placement="bottom"><i class="icon_menu"></i></div>
                </div>

                <!--logo start-->
                <a href="/home/index" class="logo">Upwork <span class="lite">Freelancer</span></a>
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
                                <span class="badge bg-important">5</span>
                            </a>
                            <ul class="dropdown-menu extended tasks-bar">
                                <div class="notify-arrow notify-arrow-blue"></div>
                                <li>
                                    <p class="blue">You have 5 pending tasks</p>
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
                                        <span class="photo"><img alt="avatar" src="/resources/client/./img/avatar-mini.jpg"></span>
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
                                        <span class="photo"><img alt="avatar" src="/resources/client/./img/avatar-mini2.jpg"></span>
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
                                        <span class="photo"><img alt="avatar" src="/resources/client/./img/avatar-mini3.jpg"></span>
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
                                        <span class="photo"><img alt="avatar" src="/resources/client/./img/avatar-mini4.jpg"></span>
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
                                <span class="username">Ahsun Habib</span>
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

            <!--sidebar start-->
            <aside>
                <div id="sidebar" class="nav-collapse ">
                    <!-- sidebar menu start-->
                    <ul class="sidebar-menu">
                        <li class="active">
                            <a class="" href="/freelancer/freelancer">
                                <i class="icon_house_alt"></i>
                                <span>Dashboard</span>
                            </a>
                        </li>
                        <li class="sub-menu">
                            <a href="javascript:;" class="">
                                <i class="icon_document_alt"></i>
                                <span>My Jobs</span>
                                <span class="menu-arrow arrow_carrot-right"></span>
                            </a>
                            <ul class="sub">
                                <li><a class="" href="/freelancer/jobFeed">My Job Feed</a></li>
                                <li><a class="" href="/freelancer/currentJobs">My Curent Jobs</a></li>
                            </ul>
                        </li>
                        <li class="sub-menu">
                            <a href="javascript:;" class="">
                                <i class="icon_desktop"></i>
                                <span>Proposals</span>
                                <span class="menu-arrow arrow_carrot-right"></span>
                            </a>
                            <ul class="sub">
                                <li><a class="" href="/freelancer/proposal">Offer Request</a></li>
                                <li><a class="" href="buttons.html">Buttons</a></li>
                                <li><a class="" href="grids.html">Grids</a></li>
                            </ul>
                        </li>
                        <li>
                            <a class="" href="/freelancer/My Talent">
                                <i class="icon_genius"></i>
                                <span>Hire Talent</span>
                            </a>
                        </li>
                        <li>
                            <a class="" href="chart-chartjs.html">
                                <i class="icon_piechart"></i>
                                <span>Charts</span>

                            </a>

                        </li>

                        <li class="sub-menu">
                            <a href="javascript:;" class="">
                                <i class="icon_table"></i>
                                <span>Tables</span>
                                <span class="menu-arrow arrow_carrot-right"></span>
                            </a>
                            <ul class="sub">
                                <li><a class="" href="basic_table.html">Basic Table</a></li>
                            </ul>
                        </li>

                        <li class="sub-menu">
                            <a href="javascript:;" class="">
                                <i class="icon_documents_alt"></i>
                                <span>My Profile</span>
                                <span class="menu-arrow arrow_carrot-right"></span>
                            </a>
                            <ul class="sub">
                                <li><a class="" href="/freelancer/profile">View Profile</a></li>
                                <li><a class="" href="/freelancer/createProfile"><span>Create Profile</span></a></li>
                                <li><a class="" href="/home/contact"><span>Contact Page</span></a></li>
                                <li><a class="" href="/home/index">Log Out</a></li>
                                <li><a class="" href="/home/blog">Blog</a></li>
                            </ul>
                        </li>

                    </ul>
                    <!-- sidebar menu end-->
                </div>
            </aside>
            <!--sidebar end-->

            <!--main content start-->
            <section id="main-content">
                <section class="wrapper">
                    <div class="row">
                    </div>
                    <div class="form">
                        <div class="col-lg-12">
                            <section class="panel">
                                <header class="panel-title">
                                    <h3 style="color: whitesmoke; font-family: verdana; padding: 5px; background-color: graytext">Proposal Setting</h3>
                                </header>
                                <div class="panel-body">
                                    <form class="form-group" method="post" action="/bid/save" enctype="multipart/form-data">
                                        <div class="form-group">
                                            <label><h4><b>Cover Later</b></h4></label>
                                            <textarea class="form-control" name="coverLater" rows="3" placeholder="Hi! I want to work with you"></textarea>
                                        </div>
                                        <div class="form-group">
                                            <label><h4><b>First Name</b></h4></label>
                                            <input type="text" class="form-control" name="first_name" placeholder="First Name">
                                        </div>
                                        <div class="form-group">
                                            <label><h4><b>Last Name</b></h4></label>
                                            <input type="text" class="form-control" name="last_name" placeholder="Last Name">
                                        </div>
                                        <div class="form-group">
                                            <label><h4><b>User Name</b></h4></label>
                                            <input type="text" class="form-control" name="user_name" placeholder="User Name">
                                        </div>
                                        <div class="form-group">
                                            <label><h4><b>Hourly Rate</b></h4></label>
                                            <input type="text" class="form-control" name="hourlyRate" placeholder="$$$">
                                        </div>
                                        <div class="form-group">
                                            <label><h4><b>Choose a Job</b></h4></label>
                                            <select class="form-control" name="chooseAJob">
                                                <option value="Graphic Design">Graphic Design</option>
                                                <option value="Video Editing">Video Editing</option>
                                                <option value="Digital Marketing">Digital Marketing</option>                                            
                                            </select>
                                        </div>
                                        <div class="form-group">                      
                                            <div class="col-sm-10">
                                                <input type="hidden" class="form-control" name="id" value="${cj.id}">
                                            </div>
                                        </div>
                                        <div class="form-group">                                            
                                            <div class="col-sm-10">
                                                <input type="hidden" class="form-control" name="job_code" value="${cj.jobCode}">
                                            </div>
                                        </div>
                                        <div class="form-group">                                            
                                            <div class="col-sm-10">
                                                <input type="hidden" class="form-control" name="job_title" value="${cj.job_title}">
                                            </div>
                                        </div>
                                        <div class="form-group">                                            
                                            <div class="col-sm-10">
                                                <input type="hidden" class="form-control" name="category" value="${cj.category}">                                               
                                            </div>
                                        </div>
                                        <div class="form-group">                                            
                                            <div class="col-sm-10">
                                                <input type="hidden" class="form-control" name="description" value="${cj.description}">
                                            </div>
                                        </div>
                                        <div class="form-group">                                           
                                            <div class="col-sm-10">
                                                <input type="hidden" class="form-control" name="project_type" value="${cj.project_type}">
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <div class="col-sm-10">
                                                <input type="hidden" class="form-control" name="freelancer_level" value="${cj.freelancer_level}">
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <div class="col-sm-10">
                                                <input class="form-control" id="focusedInput" type="hidden" name="budget_amount" value="${cj.budget_Amount}">
                                            </div>
                                        </div>
                                        <div class="form-group">

                                            <div class="col-sm-10">
                                                <input type="hidden" class="form-control" name="job_duration" value="${cj.job_duration}">
                                            </div>
                                        </div>
                                        <div class="form-group">

                                            <div class="col-sm-10">
                                                <input type="hidden" class="form-control" name="client_name" value="${cj.client_name}">
                                            </div>
                                        </div>
                                        <div class="form-group">
                                            <label class="col-sm-2 control-label"></label>
                                            <div class="col-sm-10">
                                                <input type="submit" class="btn-success" value="Submit Proposal">
                                            </div>
                                        </div>
                                    </form>
                                </div>
                            </section>
                        </div>
                    </div>
                </section>
            </section>
        </section>


        <script src="/resources/client/js/jquery.js"></script>
        <script src="/resources/client/js/bootstrap.min.js"></script>
        <script src="/resources/client/js/jquery.scrollTo.min.js"></script>
        <script src="/resources/client/js/jquery.nicescroll.js" type="text/javascript"></script>
        <script src="/resources/client/js/jquery-ui-1.9.2.custom.min.js"></script>
        <script type="text/javascript" src="/resources/client/js/ga.js"></script>
        <script src="/resources/client/js/bootstrap-switch.js"></script>
        <script src="/resources/client/js/jquery.tagsinput.js"></script>

        <script src="/resources/client/js/jquery.hotkeys.js"></script>
        <script src="/resources/client/js/bootstrap-wysiwyg.js"></script>
        <script src="/resources/client/js/bootstrap-wysiwyg-custom.js"></script>
        <script src="/resources/client/js/moment.js"></script>
        <script src="/resources/client/js/bootstrap-colorpicker.js"></script>
        <script src="/resources/client/js/daterangepicker.js"></script>
        <script src="/resources/client/js/bootstrap-datepicker.js"></script>
        <script type="text/javascript" src="assets/ckeditor/ckeditor.js"></script>
        <script src="/resources/client/js/form-component.js"></script>
        <script src="/resources/client/js/scripts.js"></script>

    </body>

</html>
