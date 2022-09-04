<%-- 
    Document   : userAdd
    Created on : May 2, 2022, 1:43:05 PM
    Author     : GL63 8RCS
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>USER ADD page</title>
        <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Sofia">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <style>
            body {font-family: Arial, Helvetica, sans-serif;}
            * {box-sizing: border-box;}

            .input-container {
                display: -ms-flexbox; /* IE10 */
                display: flex;
                width: 100%;
                margin-bottom: 15px;
            }

            .icon {
                padding: 10px;
                background: dodgerblue;
                color: white;
                min-width: 50px;
                text-align: center;
            }
            .iconmain {
                padding: 10px;
                color: #0000ff;
                min-width: 50px;
                text-align: center;
            }

            .input-field {
                width: 100%;
                padding: 10px;
                outline: none;
            }

            .input-field:focus {
                border: 2px solid dodgerblue;
            }

            /* Set a style for the submit button */
            .btn {
                background-color: dodgerblue;
                color: white;
                padding: 15px 20px;
                border: none;
                cursor: pointer;
                width: 70%;
                opacity: 0.9;
                border-radius: 20px;
            }

            .btn:hover {
                opacity: 1;
                color: black;
                font-size: 18px;
                font-weight: bold;
            }
            .blink {
                animation: blinker 0.6s linear infinite;
                color: #cc0000;
                font-size: 30px;
                font-weight: bold;
                font-family: sans-serif;
            }
            @keyframes blinker {
                50% {
                    opacity: 0;
                }
            }
        </style>
    </head>
    <body style="background: radial-gradient(#e66465, #9198e5);">
        <form action="useradd" method="POST" style="max-width:500px;margin:auto"><br/>
            <%
                String msg = request.getParameter("msg");
                if ("ok".equals(msg)) {
                    %><center><h3 class="blink">Staff Member Added</h3></center>
            <%}%>

            <%
                if ("error".equals(msg)) {
            %>
            <h3 class="blink">Some thing Went Wrong! Try Again...</h3>
            <%}%>
            <center><h1 style="font-family: 'Sofia'; font-size: 40px; sans-serif"><i class="fa fa-group iconmain"></i>Add New Staff Member</h1></center>

            <div class="input-container">
                <i class="fa fa-id-badge icon"></i>
                <input class="input-field" type="text" placeholder="Please Add 'STF' prefix, Enter StaffID" name="staffid"  required>
            </div>


            <div class="input-container">
                <i class="fa fa-user icon"></i>
                <input class="input-field" type="text" placeholder="Full Name" name="name" onkeypress="return ((event.charCode >= 65 && event.charCode <= 90) || (event.charCode >= 97 && event.charCode <= 122) || (event.charCode === 32))" required>
            </div>

            <div class="input-container">
                <i class="fa fa-home icon"></i>
                <input class="input-field" type="text" placeholder="Address" name="address" required>
            </div>

            <div class="input-container">
                <i class="fa fa-envelope icon"></i>
                <input class="input-field" type="email" placeholder="Email" name="email" required>
            </div>

            <div class="input-container">
                <i class="fa fa-phone-square icon"></i>
                <input class="input-field" type="number" placeholder="Telephone" name="telephone" required>
            </div>
            <span style="color: #33ff33">Select Department</span>
            <div class="input-container">
                <i class="fa fa-sitemap icon"></i>
                <select class="input-field" name="department" required>
                    <option>select</option>
                    <option value="Finance Department">Finance Department</option>
                    <option value="HR department">HR department</option>
                    <option value="Administration Department">Administration Department</option>
                    <option value="Management Department">Management Department</option>
                </select>
            </div>
            <span style="color: #33ff33">Select Position</span>
            <div class="input-container">
                <i class="fa fa-street-view icon"></i>
                <select class="input-field" name="position" required>
                    <option>select</option>
                    <option value="Administrator">Administrator</option>
                    <option value="Finance manager">Finance manager</option>
                    <option value="HR manager">HR manager</option>
                    <option value="Assistant Administrative Manager">Assistant Administrative Manager</option>
                    <option value="Assistant Finance Manager">Assistant Finance Manager</option>
                    <option value="Assistant HR Manager">Assistant HR Manager</option>
                    <option value="Executive assistants">Executive assistants</option>
                    <option value="Accountant">Accountant</option>
                    <option value="Staff Member">Staff Member</option>
                </select>
            </div>
            <span style="color: #33ff33">Select Employee Type</span>
            <div class="input-container">
                <i class="fa fa-suitcase icon"></i>
                <select class="input-field" name="type" required>
                    <option>select</option>
                    <option value="Permanent Employee">Permanent Employee</option>
                    <option value="Contract Employee">Contract Employee</option>
                    <option value="Trainee">Trainee</option>
                </select>
            </div>

            <div class="input-container">
                <i class="fa fa-dollar icon"></i>
                <input class="input-field" type="number" placeholder="Basic Salary" name="salary" required>
            </div>

            <div class="input-container">
                <i class="fa fa-key icon"></i>
                <input class="input-field" type="password" placeholder="Password" name="password" id="passwordinput" required>
            </div>
            <center><input type="checkbox" onclick="showpsw()">Show Password</center>


            <center><button type="submit" class="btn">Register</button></center>
        </form>
        <script>
            function showpsw() {
                var x = document.getElementById("passwordinput");
                if (x.type === "password") {
                    x.type = "text";
                } else {
                    x.type = "password";
                }
            }
        </script>
    </body>
</html>
