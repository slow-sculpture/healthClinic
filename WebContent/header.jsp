<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="main.java.app.user.User" %>
<%@ page import="main.java.app.user.UserRepo" %><%--
  Created by IntelliJ IDEA.
  User: chris
  Date: 24.04.2018
  Time: 19:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    User userCookie = UserRepo.getUserCookie(request.getCookies());
    if (userCookie != null){
        pageContext.setAttribute("user", userCookie);
    }
    Object i = application.getAttribute("i");
    if(i==null){
        application.setAttribute("i",1);
    } else {
        application.setAttribute("i", (int)i+1);
    }
    pageContext.setAttribute("i", application.getAttribute("i"));
%>

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
                        <li><a href="/doctors.jsp">PERSONNEL</a></li>
                        <li><a href="/services.jsp">SERVICES</a></li>
                        <li class="has-child"><a href="#">PATIENT ZONE</a>

                            <ul class="submenu">
                                <li class="submenu-item"><a href="/cart.jsp">Cart </a></li>
                                <li class="submenu-item"><a href="/orderHistory.jsp">Order history </a></li>
                                <li class="submenu-item"><a href="/userAccount.jsp">Patient data </a></li>
                            </ul>

                        </li>
                        <c:if test="${user == null}">
                        <li><a href="login.jsp">LOGIN</a></li></c:if>
                        <c:if test="${user != null}">
                            <li><a><<<>>></a></li>
                            <li><a>${user.firstName} ${user.lastName}</a></li>
                            <li><a href="/logout">LOGOUT</a></li></c:if>

                    </ul>

                </div> <!-- /#navbar -->

            </div> <!-- /.container -->

        </div> <!-- /.navbar-main -->


    </nav>

</header>
<!-- /. main-header -->

