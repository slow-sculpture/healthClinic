<%--
  Created by IntelliJ IDEA.
  User: chris
  Date: 24.04.2018
  Time: 19:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>



<header class="main-header">


    <nav class="navbar navbar-static-top">

        <div class="navbar-top">

            <div class="container">
                <div class="row">

                    <div class="col-sm-6 col-xs-12">

                        <ul class="list-unstyled list-inline header-contact">
                            <li><i class="fa fa-phone"></i> <a href="tel:">71 805 50 09 </a></li>
                            <li><i class="fa fa-envelope"></i> <a href="#">office@medicalclinic.org</a></li>
                        </ul> <!-- /.header-contact  -->

                    </div>
                </div>
            </div>

        </div>

        <div class="navbar-main">

            <div class="container">

                <div class="navbar-header">
                    <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar"
                            aria-expanded="false" aria-controls="navbar">

                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>

                    </button>


                    <h2 class="footer-title" href="index.jsp">Medical + Clinic<span class="title-under"></span></h2>
                   <%-- <img src="assets/images/logo.png" alt="">--%>
                </div>

                <div id="navbar" class="navbar-collapse collapse pull-right">

                    <ul class="nav navbar-nav">

                        <li><a class="is-active" href="index.jsp">HOME</a></li>
                        <li><a href="doctors.jsp">PERSONNEL</a></li>
                        <li><a href="doctors.jsp">SERVICES</a></li>
                       <%-- <li class="has-child"><a href="#">SERVICES</a>

                            <ul class="submenu">
                                <li class="submenu-item"><a href="causes-single.jsp">Single cause </a></li>
                                <li class="submenu-item"><a href="causes-single.jsp">Single cause </a></li>
                                <li class="submenu-item"><a href="causes-single.jsp">Single cause </a></li>
                            </ul>

                        </li>--%>
                        <li><a href="contact.jsp">CONTACT</a></li>
                        <li><a href="account.jsp">PATIENT PANEL</a></li>
                        <li><a href="login.jsp">LOGIN</a></li>
                        <li><a href="index.jsp">LOGOUT</a></li>

                    </ul>

                </div> <!-- /#navbar -->

            </div> <!-- /.container -->

        </div> <!-- /.navbar-main -->


    </nav>

</header> <!-- /. main-header -->

