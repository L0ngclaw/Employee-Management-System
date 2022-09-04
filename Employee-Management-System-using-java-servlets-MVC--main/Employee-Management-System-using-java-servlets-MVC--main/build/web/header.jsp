<%-- 
    Document   : header
    Created on : May 1, 2022, 1:39:23 PM
    Author     : GL63 8RCS
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <style>
            body {
                margin: 0;
                font-family: Arial, Helvetica, sans-serif;
            }

            .topnav {
                overflow: hidden;
                background-color: #333;
                max-height: 60px;
            }

            .topnav a {
                float: left;
                display: block;
                color: #f2f2f2;
                text-align: center;
                padding: 14px 16px;
                text-decoration: none;
                font-size: 17px;
            }

            .topnav a:hover {
                background-color: #ddd;
                color: black;
            }

            .topnav a.active {
                background-color: #04AA6D;
                color: white;
            }

            .topnav .icon {
                display: none;
            }

            @media screen and (max-width: 600px) {
                .topnav a:not(:first-child) {display: none;}
                .topnav a.icon {
                    float: right;
                    display: block;
                }
            }

            @media screen and (max-width: 600px) {
                .topnav.responsive {position: relative;}
                .topnav.responsive .icon {
                    position: absolute;
                    right: 0;
                    top: 0;
                }
                .topnav.responsive a {
                    float: none;
                    display: block;
                    text-align: left;
                }
            }
        </style>
    </head>
    <body>

        <div class="topnav" id="myTopnav">
            <a><img src="./images/pngwing.com.png"/></a>
            <a class="active">Online Staff Management System</a>
            <a href="index.jsp"><i class="fa fa-fw fa-home"></i> Home</a> 
            <a href="aboutus.jsp"><i class="fa fa-fw fa-search"></i> About</a>
            <button onmouseover="document.getElementById('id01').style.display = 'block'" class="w3-button w3-green w3-large" style="margin-top:5px; margin-left: 50%"><i class="fa fa-fw fa-user"></i>Login Here!</button>
            <a href="javascript:void(0);" class="icon" onclick="myFunction()">
                <i class="fa fa-bars"></i>
            </a>
        </div>

        <div id="id01" class="w3-modal">
            <div class="w3-modal-content w3-card-4 w3-animate-zoom" style="max-width:600px">

                <div class="w3-center"><br>
                    <span onclick="document.getElementById('id01').style.display = 'none'" class="w3-button w3-xlarge w3-transparent w3-display-topright" title="Close Modal">×</span>
                    <img src="./images/icons8_person_127px.png" alt="Avatar" style="width:30%" class="w3-circle w3-margin-top">
                </div>

                <form class="w3-container" method="POST" action="login">
                    <div class="w3-section">
                        <label><b>Username</b></label>
                        <input class="w3-input w3-border w3-margin-bottom" type="text" placeholder="Enter Staff ID" name="username" required>
                        <label><b>Password</b></label>
                        <input class="w3-input w3-border" type="text" placeholder="Enter Password" name="password" required>
                        <button class="w3-button w3-block w3-green w3-section w3-padding" type="submit">Login</button>
                    </div>
                </form>

                <div class="w3-container w3-border-top w3-padding-16 w3-light-grey">
                    <button onclick="document.getElementById('id01').style.display = 'none'" type="button" class="w3-button w3-red">Cancel</button>
                    <span class="w3-right w3-padding w3-hide-small">Forgot <a href="#">password?</a></span>
                </div>

            </div>
        </div>

        <script>
            function myFunction() {
                var x = document.getElementById("myTopnav");
                if (x.className === "topnav") {
                    x.className += " responsive";
                } else {
                    x.className = "topnav";
                }
            }
        </script>

    </body>
</html>
