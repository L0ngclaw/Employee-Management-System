<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Staff Management</title>
        <link href='https://fonts.googleapis.com/css?family=Sofia' rel='stylesheet'>
        <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
    </head>
    <body style="background: rgb(33,60,180); background: radial-gradient(circle, rgba(33,60,180,1) 0%, rgba(103,5,5,0.8382703423166141) 75%);" onload="startTime()">
        <%@ include file = "header.jsp" %>
    <center><h1 style="font-family: 'Sofia';font-size: 72px; color: white">Online Staff Management System</h1></center>
    <div class="w3-content w3-section" style="max-width:700px">
        <img class="mySlides w3-animate-fading" src="images/img_rr_01.png" style="width:100%" alt="img1">
        <img class="mySlides w3-animate-fading" src="images/img_rr_02.png" style="width:100%" alt="img2">
    </div><br/><br/>
    <center><font id="welcome" style="font-size: 35px; font-weight: bold; color: #ffffff"></font>&nbsp;&nbsp;&nbsp;&nbsp;<span><font id="time" style="font-size: 35px; font-weight: bold; color: #ffffff"></font></span></center> 
            <%@ include file = "footer.jsp" %>
    <script>
        var myIndex = 0;
        carousel();
        function carousel() {
        var i;
        var x = document.getElementsByClassName("mySlides");
        for (i = 0; i < x.length; i++) {
        x[i].style.display = "none";
        }
        myIndex++;
        if (myIndex > x.length) {
        myIndex = 1
        }
        x[myIndex - 1].style.display = "block";
        setTimeout(carousel, 9000);
        }

        var welcome;
        var date = new Date();
        var hour = date.getHours();
        var minute = date.getMinutes();
        var second = date.getSeconds();
        if (minute < 10) {
        minute = "0" + minute;
        }
        if (second < 10) {
        second = "0" + second;
        }
        if (hour < 12) {
        welcome = "good morning";
        } else if (hour < 17) {
        welcome = "good afternoon";
        } else {
        welcome = "good evening";
        }
        document.getElementById('welcome').innerHTML = welcome;
        
        function startTime() {
        const today = new Date();
        let h = today.getHours();
        let m = today.getMinutes();
        let s = today.getSeconds();
        m = checkTime(m);
        s = checkTime(s);
        document.getElementById('time').innerHTML = h + ":" + m + ":" + s;
        setTimeout(startTime, 1000);
        }

        function checkTime(i) {
        if (i < 10) {i = "0" + i}; // add zero in front of numbers < 10
        return i;
        }
    </script>

</body>
</html>
