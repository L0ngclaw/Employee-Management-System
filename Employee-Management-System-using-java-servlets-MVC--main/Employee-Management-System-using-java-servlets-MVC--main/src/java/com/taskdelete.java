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

@WebServlet(name = "taskdelete", urlPatterns = {"/taskdelete"})
public class taskdelete extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        DBConnection d = new DBConnection();
        Connection c = d.getconnection();

        String taskID = request.getParameter("tid");
        String pid = request.getParameter("pid");
        try {
            PreparedStatement ps = c.prepareStatement("DELETE FROM tasks WHERE taskID=?;");
            ps.setString(1, taskID);

            int t=ps.executeUpdate();
            System.out.println(t);
            response.sendRedirect("manageTask.jsp?pid="+pid);
        } catch (SQLException e) {
            response.sendRedirect("manageTask.jsp?pid="+pid);
            System.out.println(e);
        }
    }

}
