<%-- 
    Document   : manageTask
    Created on : May 3, 2022, 8:57:09 PM
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
        <title>task Management</title>
        <link href='https://fonts.googleapis.com/css?family=Sofia' rel='stylesheet'>
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
                font-size: 22px;
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
            
            td{
                padding-right: 40px;
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
    <body style="background: radial-gradient(#e66465, #9198e5); font-family: 'Century Gothic'">
        <%
                String id=request.getParameter("pid");
            %>
        <%
                String msg = request.getParameter("msg");
                if ("ok".equals(msg)) {
                    %><center><h3 class="blink">Task Assigned</h3></center>
            <%}%>

            <%
                if ("error".equals(msg)) {
            %>
            <center><h3 class="blink">Some thing Went Wrong! Try Again...</h3></center>
            <%}%>
            <center>
        <table>
            <tr>
                <td>
                    <form action="addtask" method="POST" style="max-width:500px;margin:auto"><br/>
            <center><h1 style="font-family: 'Sofia'; font-size: 40px; sans-serif"><i class="fa fa-group iconmain"></i>Assign Task</h1></center>
                        <input type="hidden" value="<%=id%>" name="assignedby"/>
            <div class="input-container">
                <i class="fa fa-id-badge icon"></i>
                <textarea class="input-field" placeholder="Enter Task" name="task"  required></textarea>
            </div>
            
            <div class="input-container">
                <i class="fa fa-user icon"></i>
                <input class="input-field" type="date" name="date" required>
            </div>

            <div class="input-container">
                <i class="fa fa-home icon"></i>
                <input class="input-field" type="text" placeholder="Enter Staff ID" name="sid" required>
            </div>
            
            <center><button type="submit" class="btn">Assign</button></center>
        </form>
                </td>
                <td>
                    <form action="manageTask.jsp" style="font-size: 25px; font-family: 'Century Gothic'">
                        <input type="hidden" value="<%=id%>" name="pid"/>
            <label for="date">Search Assigned Tasks By Date</label>
            <input type="date" id="date" name="date" style="font-size: 24px"><br/><br/>
            <label for="sid">Search Assigned Tasks By Staff ID</label>
            <input type="text" id="sid" name="sid" style="font-size: 24px">
            <input type="submit" value="Search" style="font-size: 24px">
        </form>
        
        <%
                try {
                    String pid=request.getParameter("pid");
                    String date=request.getParameter("date");
                    String sid=request.getParameter("sid");
                    DBConnection d = new DBConnection();
                    Connection c = d.getconnection();
                    
                    Statement st = c.createStatement();
                    ResultSet rs = st.executeQuery("select * from tasks where todo_date='"+date+"' AND assigned_by='"+pid+"';");
                    if(date.isEmpty()){
                        rs = st.executeQuery("select * from tasks where assigned_to='"+sid+"' AND assigned_by='"+pid+"';");
                    }else if(sid.isEmpty()){
                        rs = st.executeQuery("select * from tasks where todo_date='"+date+"' AND assigned_by='"+pid+"';");
                    }
            %><table border="1" align=center style="text-align:center; font-size: 22px; font-family: 'Century Gothic'">
                <thead>
                    <tr>
                        <th>Staff ID</th>
                        <th>Date</th>
                        <th>Assigned To</th>
                        <th>Actions</th>
                    </tr>
                </thead>
                <tbody>
                    <%while (rs.next()) {
                    %>
                    <tr>
                        <td><%=rs.getString("task")%></td>
                        <td><%=rs.getString("todo_date")%></td>
                        <td><%=rs.getString("assigned_to")%></td>
                        <td><button><a href="taskdelete?tid=<%= rs.getString("taskID")%>&pid=<%=id%>">Remove Task</a></button></td>
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
                </td>
            </tr>
        </table>
            </center>
    </body>
</html>
