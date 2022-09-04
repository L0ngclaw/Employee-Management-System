<%-- 
    Document   : LeaveView
    Created on : May 3, 2022, 7:02:43 PM
    Author     : GL63 8RCS
--%>

<%@page import="com.DBConnection"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Sofia">
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
        <title>Leaves page</title>
        <style>
            table,td,th{
                border: 1px solid;
            }
        </style>
    </head>
    <body style="background: radial-gradient(#e66465, #9198e5); font-family: 'Century Gothic'">
    <center><h1 style="font-family: 'Sofia'; font-size: 40px; sans-serif"><i class="fa fa-sign-out" style="font-size:60px;"></i>&nbsp;&nbsp;View Applied Leaves</h1></center>
        <%
                try {
                    String person=request.getParameter("pid");
                    DBConnection d = new DBConnection();
                    Connection c = d.getconnection();

                    Statement st = c.createStatement();
                    ResultSet rs = st.executeQuery("select * from leaves where status='pending';");
            %><table align=center style="text-align:center; font-size: 25px; border-collapse: collapse;">
                <thead>
                    <tr>
                        <th>Leave ID</th>
                        <th>Staff ID</th>
                        <th>Date</th>
                        <th>Reason</th>
                        <th colspan="2" style="text-align: center">Actions</th>
                    </tr>
                </thead>
                <tbody>
                    <%while (rs.next()) {
                    %>
                    <tr>
                        <td><%=rs.getString("leaveID")%>&nbsp;&nbsp;</td>
                        <td><%=rs.getString("sid")%>&nbsp;&nbsp;</td>
                        <td><%=rs.getString("date")%>&nbsp;&nbsp;</td>
                        <td><%=rs.getString("leave_reason")%>&nbsp;&nbsp;</td>
                        <td><button style="background-color: #dd4b39"><a href="UpdateLeaveStatus?id=<%= rs.getString("leaveID")%>&msg='Rejected'&person=<%=person%>" style="font-size: 16px;">Reject</a></button></td>
                        <td><button style="background-color: #33ff33"><a href="UpdateLeaveStatus?id=<%= rs.getString("leaveID")%>&msg='Approved'&person=<%=person%>" style="font-size: 16px;">Confirm</a></button></td>
                    </tr>
                    <%}%>
                </tbody>
            </table><br>
            <%} catch (Exception e) {
                    out.print(e.getMessage());
            }%>
    </body>
</html>
