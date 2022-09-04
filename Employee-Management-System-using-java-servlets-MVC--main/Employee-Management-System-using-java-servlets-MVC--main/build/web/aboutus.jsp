<%-- 
    Document   : aboutus
    Created on : May 1, 2022, 5:23:56 PM
    Author     : GL63 8RCS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <style>
            body, html {
                height: 100%;
                margin: 0;
                font-family: Arial, Helvetica, sans-serif;
            }

            * {
                box-sizing: border-box;
            }

            .bg-image {
                /* The image used */
                background-image: url("images/aboutus.jpg");

                /* Add the blur effect */
                filter: blur(8px);
                -webkit-filter: blur(8px);

                /* Full height */
                height: 100%; 

                /* Center and scale the image nicely */
                background-position: center;
                background-repeat: no-repeat;
                background-size: cover;
            }

            /* Position text in the middle of the page/image */
            .bg-text {
                background-color: rgb(0,0,0); /* Fallback color */
                background-color: rgba(0,0,0, 0.4); /* Black w/opacity/see-through */
                color: white;
                font-weight: bold;
                border: 3px solid #f1f1f1;
                position: absolute;
                top: 55%;
                left: 50%;
                transform: translate(-50%, -50%);
                z-index: 0;
                width: 80%;
                padding: 20px;
                text-align: center;
            }
            .col-container {
                display: flex;
                width: 100%;
            }
            .col {
                flex: 1;
                padding: 16px;
            }
            #div1 {
                font-size:48px;
                transform: rotate(90deg);
            }
            #div2 {
                font-size:48px;
            }
            #div3 {
                font-size:48px;
            }
        </style>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    </head>
    <body>
        <%@ include file = "header.jsp" %>
        <div class="bg-image"></div>

        <div class="bg-text">
            <img src="images/About-Us-PNG-Isolated-File.png" alt="img"/>
            <div class="col-container">
                <div class="col" style="background: transparent">
                    <div id="div1" class="fa"></div>&nbsp;&nbsp;<span style="font-size: 35px">What We Do?</span><br/><br/><br/>
                    <i style="font-size:20px" class="fa">&#xf044;</i> <font>Make you easy-to-use online filing cabinet</font><br/><br/>
                    <i style="font-size:20px" class="fa">&#xf044;</i> <font>allows you to securely store employee records</font><br/><br/>
                    <i style="font-size:20px" class="fa">&#xf044;</i> <font>All HR data is securely stored and encrypted on our servers</font><br/><br/>
                    <i style="font-size:20px" class="fa">&#xf044;</i> <font>Employees can access their own records, saving you time</font><br/><br/>
                </div>

                <div class="col" style="background:transparent">
                    <div id="div2" class="fa"></div>&nbsp;&nbsp;&nbsp;&nbsp;<span style="font-size: 35px">Who We Are?</span><br/><br/><br/>
                    <i style="font-size:20px" class="fa">&#xf044;</i> <font>This is an all-in-one HR Suite built for small, local businesses</font><br/><br/>
                    <i style="font-size:20px" class="fa">&#xf044;</i> <font>Founded in 2022 by SLIIT Undergraduates</font><br/><br/>
                    <i style="font-size:20px" class="fa">&#xf044;</i> <font>Key features include job posting management, tracking incoming candidates, and a full-scale applicant tracking system (ATS)</font><br/><br/>
                    
                </div>

                <div class="col" style="background:transparent">
                    <div id="div3" class="fa"></div>&nbsp;&nbsp;<span style="font-size: 35px">Our Services</span><br/><br/><br/>
                    <i style="font-size:20px" class="fa">&#xf044;</i> <font>Pre-populated sample data</font><br/><br/>
                    <i style="font-size:20px" class="fa">&#xf044;</i> <font>Full access to try out all features of the platform</font><br/><br/>
                    <i style="font-size:20px" class="fa">&#xf044;</i> <font>Login as a Controller, Manager or Employee</font><br/><br/>
                    <i style="font-size:20px" class="fa">&#xf044;</i> <font>Personalised screen share tour and demonstration with our client care team</font><br/><br/>
                </div>
            </div>
        </div>

<%@ include file = "footer.jsp" %>
        <script>
            function hand() {
                var a;
                a = document.getElementById("div1");
                a.innerHTML = "&#xf25a;";
                setTimeout(function () {
                    a.innerHTML = "&#xf256;";
                }, 500);
            }
            hand();
            setInterval(hand, 1000);

            function openfolder() {
                var a;
                a = document.getElementById("div2");
                a.innerHTML = "&#xf114;";
                setTimeout(function () {
                    a.innerHTML = "&#xf115;";
                }, 500);
            }
            openfolder();
            setInterval(openfolder, 1000);

            function smile() {
                var a;
                a = document.getElementById("div3");
                a.innerHTML = "&#xf118;";
                setTimeout(function () {
                    a.innerHTML = "&#xf11a;";
                }, 500);
            }
            smile();
            setInterval(smile, 1000);
        </script>
    </body>
</html>