<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" type="image/png" sizes="16x16" href="plugins/images/favicon.png">
    <title>绩效考核系统</title>
    <!-- Bootstrap Core CSS -->
    <link href="bootstrap/dist/css/bootstrap.min.css" rel="stylesheet">
    <!-- Menu CSS -->
    <link href="plugins/bower_components/sidebar-nav/dist/sidebar-nav.min.css" rel="stylesheet">
    <!-- animation CSS -->
    <link href="css/animate.css" rel="stylesheet">
    <!-- Custom CSS -->
    <link href="css/style.css" rel="stylesheet">
    <!-- color CSS -->
    <link href="css/colors/default.css" id="theme" rel="stylesheet">
</head>

<body class="fix-header">
    <div class="preloader">
        <svg class="circular" viewBox="25 25 50 50">
            <circle class="path" cx="50" cy="50" r="20" fill="none" stroke-width="2" stroke-miterlimit="10" />
        </svg>
    </div>

    <div id="wrapper">
        <nav class="navbar navbar-default navbar-static-top m-b-0" >
            <div class="navbar-header"  style="background:rgb(224, 238, 238);"> 
                <div class="top-left-part"style="background:rgb(224, 238, 238);">
						<span class="hidden-xs" >
						<h3 style="text-align: center"  >成本绩效管理系统</h3>
                        </span>
                </div>
                <!-- /Logo -->
                
            </div>

        </nav>

        <div class="navbar-default sidebar" role="navigation">
            <div class="sidebar-nav slimscrollsidebar" style="background:#E0EEEE">
                <ul class="nav" id="side-menu">
                    <li style="padding: 70px 0 0;">
                        <a href="${pageContext.request.contextPath }/ToFirst.action" class="waves-effect"><i class="fa fa-clock-o fa-fw"
                                aria-hidden="true"></i>月度营业数据</a>
                    </li>
                    <li>
                        <a href="${pageContext.request.contextPath }/ToSecond.action" class="waves-effect"><i class="fa fa-user fa-fw"
                                aria-hidden="true"></i>季度营业数据</a>
                    </li>
                    <li>
                        <a href="${pageContext.request.contextPath }/ToThird.action" class="waves-effect"><i class="fa fa-table fa-fw"
                                aria-hidden="true"></i>管理层月度绩效考核结果</a>
                    </li>
                    <li>
                        <a href="${pageContext.request.contextPath }/ToFour.action" class="waves-effect"><i class="fa fa-font fa-fw"
                                aria-hidden="true"></i>季度绩效考核结果</a>
                    </li>
                    <li>
                        <a href="${pageContext.request.contextPath }/ToFive.action" class="waves-effect"><i class="fa fa-globe fa-fw"
                                aria-hidden="true"></i>内控指标汇总</a>
                    </li>
                </ul>
            </div>
        </div>

        <div id="page-wrapper">
            <div class="container-fluid">
                <h1>这是第四个界面</h1>
              
                </div>
                <!-- /.row -->
            </div>
            <!-- /.container-fluid -->
            <footer class="footer text-center"> 2017 &copy; DDD</footer>
        </div>
        <!-- /#page-wrapper -->
    </div>
    <!-- /#wrapper -->
    <!-- jQuery -->
    <script src="plugins/bower_components/jquery/dist/jquery.min.js"></script>
    <!-- Bootstrap Core JavaScript -->
    <script src="bootstrap/dist/js/bootstrap.min.js"></script>
    <!-- Menu Plugin JavaScript -->
    <script src="plugins/bower_components/sidebar-nav/dist/sidebar-nav.min.js"></script>
    <!--slimscroll JavaScript -->
    <script src="js/jquery.slimscroll.js"></script>
    <!--Wave Effects -->
    <script src="js/waves.js"></script>
    <!-- Custom Theme JavaScript -->
    <script src="js/custom.min.js"></script>
</body>

</html>