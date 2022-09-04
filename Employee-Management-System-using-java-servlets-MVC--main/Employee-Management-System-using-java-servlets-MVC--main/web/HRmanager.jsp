<%-- 
    Document   : HRmanager
    Created on : May 3, 2022, 2:49:18 PM
    Author     : GL63 8RCS
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="com.DBConnection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>HR manager Page</title>
        <link href='https://fonts.googleapis.com/css?family=Sofia' rel='stylesheet'>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <style>
            .bg-text {
                background-color: rgb(0,0,0); /* Fallback color */
                background-color: rgba(0,0,0, 0.4); /* Black w/opacity/see-through */
                color: white;
                font-weight: bold;
                border: 3px solid #f1f1f1;
                position: absolute;
                top: 50%;
                left: 50%;
                transform: translate(-50%, -50%);
                z-index: 2;
                width: 80%;
                padding: 20px;
                text-align: center;
            }

            .col-container {
                display: table;
                width: 100%;
            }
            .col {
                display: table-cell;
                padding: 16px;
            }
            .btn {
                font-size: 18px;
                background-color: dodgerblue;
                color: white;
                padding: 15px 20px;
                border: none;
                cursor: pointer;
                width: 80%;
                opacity: 0.9;
                border-radius: 20px;
            }

            .btn:hover {
                opacity: 1;
                color: black;
                font-size: 20px;
                font-weight: bold;
            }
            h2{
                font-family: 'Sofia';
                font-size: 42px;
                color: black;
            }
        </style>

    </head>

    <body style="background: radial-gradient(#e66465, #9198e5);">
        <%
            String id = request.getParameter("staff_ID");

            DBConnection d = new DBConnection();
            Connection c = d.getconnection();

            Statement st = c.createStatement();
            ResultSet rs = rs = st.executeQuery("select * from staff where staff_id='" + id + "';");

            while (rs.next()) {
        %>
    <center><h1 style="font-family: 'Sofia';font-size: 42px; color: black">Welcome Manager <%=rs.getString("name")%></h1></center>

    <%
        }
    %>

    <div class="bg-text">
        <div class="col-container">
            <div class="col" style="background:transparent">
                <i class="fa fa-sign-out" style="font-size:60px;"></i>
                <h2>Manage Leaves</h2>
                <button onclick="window.location.href = 'LeaveView.jsp?pid=<%=id%>';" class="btn">Manage Requested Leaves</button>
            </div>

            <div class="col" style="background:transparent">
                <i class="fa fa-edit" style="font-size:60px;"></i>
                <h2>Manage Tasks</h2>
                <button onclick="window.location.href = 'manageTask.jsp?pid=<%=id%>';" class="btn">Manage Assigned Tasks</button>
            </div>

            <div class="col" style="background:transparent">
                <i class="fa fa-calendar" style="font-size:60px;"></i>
                <h2>Manage Attendance</h2>
                <button onclick="window.location.href = 'ViewAttendance.jsp?pid=<%=id%>';" class="btn">Manage Attendance Records</button>
            </div>
            <div class="col" style="background:transparent">
                <i class="fa fa-group" style="font-size:60px;"></i>
                <h2>Add New Employees</h2>
                <button onclick="window.location.href = 'userAdd.jsp?pid=<%=id%>';" class="btn">Add New Employees</button>
            </div>
            <div class="col" style="background:transparent">
                <i class="fa fa-user-circle-o" style="font-size:60px;"></i>
                <h2>Update Profile</h2>
                <button onclick="window.location.href = 'updateprofile.jsp?sid=<%=id%>';" class="btn">Update My Profile</button>
            </div>
        </div>
    </div>
    <%@include file="footer.jsp" %>
</body>
</html>
