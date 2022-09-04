<%-- 
    Document   : ViewAttendance
    Created on : May 3, 2022, 8:11:15 PM
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
        <title>Attendance</title>
        <style>
            input{
                font-size: 25px;
            }
            table,td,th{
                border: 1px solid;
            }
            .button {
                display: inline-block;
                padding: 15px 25px;
                font-size: 24px;
                cursor: pointer;
                text-align: center;
                text-decoration: none;
                outline: none;
                color: #fff;
                background-color: #4CAF50;
                border: none;
                border-radius: 15px;
                box-shadow: 0 9px #999;
            }

            .button:hover {background-color: #3e8e41}

            .button:active {
                background-color: #3e8e41;
                box-shadow: 0 5px #666;
                transform: translateY(4px);
            }
        </style>
    </head>
    <body style="background: radial-gradient(#e66465, #9198e5); font-family: 'Century Gothic'"><center>
        <form action="ViewAttendance.jsp" style="background: linear-gradient(to right, #33ccff 0%, #ff99cc 100%); width: 90%; height: 100px; font-size: 25px; font-family: 'Century Gothic'">

            <label for="date">Search Attendance Records By Date</label>
            <input type="date" id="date" name="date"><br/><br/>

            <label for="date">Search Attendance Records By Staff ID</label>
            <input type="text" id="sid" name="sid" placeholder="Enter Staff ID">
            <input type="submit" value="Search">
        </form></center><br/><br/>

    <%
        try {
            String date = request.getParameter("date");
            String sid = request.getParameter("sid");
            DBConnection d = new DBConnection();
            Connection c = d.getconnection();

            Statement st = c.createStatement();
            ResultSet rs = rs = st.executeQuery("select * from attendance where date='" + date + "';");
            if (date.isEmpty()) {
                rs = st.executeQuery("select * from attendance where sid='" + sid + "';");
            } else if (sid.isEmpty()) {
                rs = st.executeQuery("select * from attendance where date='" + date + "';");
            }
    %><table align=center style="text-align:center; font-size: 25px; border-collapse: collapse;">
        <thead>
            <tr>
                <th>Staff ID</th>
                <th>Date</th>
                <th>IN Time</th>
                <th>OUT Time</th>
            </tr>
        </thead>
        <tbody>
            <%while (rs.next()) {
            %>
            <tr>
                <td><%=rs.getString("sid")%></td>
                <td><%=rs.getString("date")%></td>
                <td><%=rs.getString("in_time")%></td>
                <td><%=rs.getString("out_time")%></td>
            </tr>
            <%}%>
        </tbody>
    </table><br>
    <%} catch (Exception e) {
            out.print(e.getMessage());
        }%>
    <center><button onclick="printFunction()" class="button">Print Attendance Records</button>​</center>
    <script>
        function printFunction() {
            window.print();
        }
    </script>
</body>
</html>
