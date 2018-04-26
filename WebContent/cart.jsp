<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html class="no-js">
    <head>
        <meta charset="utf-8">
        <title>Single cause | Charity / Non-profit responsive Bootstrap HTML5 template</title>
        <meta name="description" content="">
        <meta name="viewport" content="width=device-width, initial-scale=1">

        <!-- Fonts -->
        <link href='http://fonts.googleapis.com/css?family=Open+Sans:400,300,700' rel='stylesheet' type='text/css'>
        <link href='http://fonts.googleapis.com/css?family=Dosis:400,700' rel='stylesheet' type='text/css'>

        <!-- Bootsrap -->
        <link rel="stylesheet" href="assets/css/bootstrap.min.css">


        <!-- Font awesome -->
        <link rel="stylesheet" href="assets/css/font-awesome.min.css">

        <!-- PrettyPhoto -->
        <link rel="stylesheet" href="assets/css/prettyPhoto.css">

        <!-- Template main Css -->
        <link rel="stylesheet" href="assets/css/style.css">
        
        <!-- Modernizr -->
        <script src="assets/js/modernizr-2.6.2.min.js"></script>


    </head>
    <body>
  <%@include file="header.jsp"%>

	<div class="main-container">
		<div class="container">
			<div class="row fadeIn animated">
				<div class="col-md-6">
					<h2 class="title-style-2"> Services <span class="title-under"></span></h2>
					<p>
						Chose one of the desired services, pick up a suitable term and simply add it to your cart.
					</p>
				</div>
			</div>


			<div class="row ">
				<div class="col-md-12 fadeIn animate-onscroll">

					
						<h4>Medical consultation</h4>
						<table class="table table-style-1">
					      <thead>
					        <tr>
					          <th>.</th>
					          <th>Specialty</th>
					          <th>Personnel</th>
					          <th>Service</th>
					          <th>Date</th>
								<th>button</th>
					        </tr>
					      </thead>
					      <tbody>
					        <tr>
					          <th scope="row">1</th>
					          <td>Mark</td>
					          <td>Otto</td>
					          <td>@mdo</td>
					        </tr>

					      </tbody>
					    </table>

					<h4>Laboratory</h4>
					<table class="table table-style-1">
						<thead>
						<tr>
							<th>.</th>
							<th>First Name</th>
							<th>Last Name</th>
							<th>Username</th>
						</tr>
						</thead>
						<tbody>
						<tr>
							<th scope="row">1</th>
							<td>Mark</td>
							<td>Otto</td>
							<td>@mdo</td>
						</tr>
						<tr>
			@twitter</td>
						</tr>
						</tbody>
					</table>




				</div>
				
			</div>

		</div>

		

		


	</div> <!-- /.main-container  -->


    <%@include file="footer.jsp"%>




       
        
        <!-- jQuery -->
        <script src="//ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
        <script>window.jQuery || document.write('<script src="assets/js/jquery-1.11.1.min.js"><\/script>')</script>

        <!-- Bootsrap javascript file -->
        <script src="assets/js/bootstrap.min.js"></script>

        <!-- PrettyPhoto javascript file -->
        <script src="assets/js/jquery.prettyPhoto.js"></script>



        <!-- Google map  -->
        <script src="http://maps.google.com/maps/api/js?sensor=false&amp;libraries=places" type="text/javascript"></script>


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
