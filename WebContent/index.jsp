<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html class="no-js">
<head>
    <meta charset="utf-8">
    <title>Medical+Clinic</title>
    <meta name="description" content="">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- Fonts -->
    <link href='http://fonts.googleapis.com/css?family=Open+Sans:400,300,700' rel='stylesheet' type='text/css'>
    <link href='http://fonts.googleapis.com/css?family=Dosis:400,700' rel='stylesheet' type='text/css'>

    <!-- Bootsrap -->
    <link rel="stylesheet" href="assets/css/bootstrap.min.css">

    <!-- Font awesome -->
    <link rel="stylesheet" href="assets/css/font-awesome.min.css">

    <!-- Owl carousel -->
    <link rel="stylesheet" href="assets/css/owl.carousel.css">

    <!-- Template main Css -->
    <link rel="stylesheet" href="assets/css/style.css">

    <!-- Modernizr -->
    <script src="assets/js/modernizr-2.6.2.min.js"></script>


</head>

<body>
 <%@include file="header.jsp"%>



    <!-- Carousel
    ================================================== -->
    <div id="homeCarousel" class="carousel slide carousel-home" data-ride="carousel">

          <!-- Indicators -->
          <ol class="carousel-indicators">
            <li data-target="#homeCarousel" data-slide-to="0" class="active"></li>
            <li data-target="#homeCarousel" data-slide-to="1"></li>
            <li data-target="#homeCarousel" data-slide-to="2"></li>
          </ol>

          <div class="carousel-inner" role="listbox">

            <div class="item active">

              <img src="assets/images/firstimg.jpg" alt="">

              <div class="container">

                <div class="carousel-caption">

                  <h2 class="carousel-title bounceInDown animated slow">Welcome to Medical + Clinic</h2>
                  <h4 class="carousel-subtitle bounceInUp animated slow ">Join thousands of pleased patients</h4>


                </div> <!-- /.carousel-caption -->

              </div>

            </div> <!-- /.item -->


            <div class="item ">

              <img src="assets/images/doctors.jpg" alt="">

              <div class="container">

                <div class="carousel-caption">

                  <h2 class="carousel-title bounceInDown animated slow">Top qualified personnel</h2>
                  <h4 class="carousel-subtitle bounceInUp animated slow">We provide specialists in many fields at your service</h4>

                </div> <!-- /.carousel-caption -->

              </div>

            </div> <!-- /.item -->





          </div>

          <a class="left carousel-control" href="#homeCarousel" role="button" data-slide="prev">
            <span class="fa fa-angle-left" aria-hidden="true"></span>
            <span class="sr-only">Previous</span>
          </a>

          <a class="right carousel-control" href="#homeCarousel" role="button" data-slide="next">
            <span class="fa fa-angle-right" aria-hidden="true"></span>
            <span class="sr-only">Next</span>
          </a>

    </div><!-- /.carousel -->



    <div class="section-home about-us fadeIn animated">

        <div class="container">

            <div class="row">

                <div class="col-md-3 col-sm-6">

                  <div class="about-us-col">

                        <%--<div class="col-icon-wrapper">
                          <img src="assets/images/doc.png" alt="">
                        </div>--%>
                        <h3 class="col-title">Our team</h3>
                        <div class="col-details">

                          <p>Choose from variety of top doctors </p>

                        </div>
                        <a href="doctors.jsp" class="btn btn-primary"> Read more </a>

                  </div>

                </div>


                <div class="col-md-3 col-sm-6">

                  <div class="about-us-col">

                        <%--<div class="col-icon-wrapper">
                          <img src="assets/images/list.png" alt="">
                        </div>--%>
                        <h3 class="col-title">Our services</h3>
                        <div class="col-details">

                          <p>Chose from variety of services</p>

                        </div>
                        <a href="services.jsp" class="btn btn-primary"> Read more </a>

                  </div>

                </div>


                <div class="col-md-3 col-sm-6">

                  <div class="about-us-col">

                       <%-- <div class="col-icon-wrapper">
                          <img src="assets/images/twitter.png" alt="">
                        </div>--%>
                        <h3 class="col-title">Follow us twitter</h3>
                        <div class="col-details">

                          <p>Follow our profiles with many fresh information and current discounts </p>

                        </div>
                        <a href="#" class="btn btn-primary"> Follow </a>

                  </div>

                </div>


                <div class="col-md-3 col-sm-6">

                  <div class="about-us-col">

                        <%--<div class="col-icon-wrapper">
                          <img src="assets/images/phone.png" alt="">
                        </div>--%>
                        <h3 class="col-title">Contact us</h3>
                        <div class="col-details">

                          <p>Contact us from Monday to Saturday 7am - 6pm </p>

                        </div>
                        <a href="contact.jsp" class="btn btn-primary"> Read more </a>

                  </div>

                </div>



            </div>

        </div>

    </div> <!-- /.about-us -->




    


    <%@include file="footer.jsp"%>









    <!--  Scripts
    ================================================== -->

    <!-- jQuery -->
    <script src="//ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
    <script>window.jQuery || document.write('<script src="assets/js/jquery-1.11.1.min.js"><\/script>')</script>

    <!-- Bootsrap javascript file -->
    <script src="assets/js/bootstrap.min.js"></script>
    
    <!-- owl carouseljavascript file -->
    <script src="assets/js/owl.carousel.min.js"></script>

    <!-- Template main javascript -->
    <script src="assets/js/main.js"></script>

    <!-- Google Analytics: change UA-XXXXX-X to be your site's ID. -->
    <script>
        (function(b,o,i,l,e,r){b.GoogleAnalyticsObject=l;b[l]||(b[l]=
        function(){(b[l].q=b[l].q||[]).push(arguments)});b[l].l=+new Date;
        e=o.createElement(i);r=o.getElementsByTagName(i)[0];
        e.src='//www.google-analytics.com/analytics.js';
        r.parentNode.insertBefore(e,r)}(window,document,'script','ga'));
        ga('create','UA-XXXXX-X');ga('send','pageview');
    </script>

    </body>
</html>
