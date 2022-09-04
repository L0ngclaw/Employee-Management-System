package com;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "UpdateLeaveStatus", urlPatterns = {"/UpdateLeaveStatus"})
public class UpdateLeaveStatus extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        DBConnection d = new DBConnection();
        Connection c = d.getconnection();

        String leaveID=request.getParameter("id");
        String msg=request.getParameter("msg");
        String person=request.getParameter("person");

        try {
            PreparedStatement ps = c.prepareStatement("update leaves set status=?, approved_person=? where leaveID=?");
            ps.setString(1, msg);
            ps.setString(2, person);
            ps.setString(3, leaveID);

            ps.executeUpdate();
            response.sendRedirect("LeaveView.jsp");
        } catch (SQLException | IOException e) {
            response.sendRedirect("LeaveView.jsp");
            System.out.println(e);
        }
    }

}
