/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author GL63 8RCS
 */
@WebServlet(name = "login", urlPatterns = {"/login"})
public class login extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {;

        ArrayList<String> login = new ArrayList<String>();

        login.add(request.getParameter("username"));
        login.add(request.getParameter("password"));

        try {
            String un = login.get(0);
            String pw = login.get(1);
            System.out.println(un);
            System.out.println(pw);
            DBConnection d = new DBConnection();
            Connection c = d.getconnection();

            Statement st = c.createStatement();
            ResultSet rs = st.executeQuery("select * from staff where staff_id='" + un + "' AND password='" + pw + "';");

            while (rs.next()) {
                //ResultSet rs1 = st.executeQuery("select position from staff where staff_id='" + un + "'");
                String position = rs.getString("position");
                if (position.equals("Staff Member")) {
                    response.sendRedirect("staffMember.jsp?staff_ID=" + un);
                } else if (position.equals("Administrator")) {
                    response.sendRedirect("Administrator.jsp?staff_ID=" + un);
                } else if (position.equals("Finance manager")) {
                    response.sendRedirect("financeManager.jsp?staff_ID=" + un);
                } else if (position.equals("HR manager")) {
                    response.sendRedirect("HRmanager.jsp?staff_ID=" + un);
                }
            }
        } catch (SQLException | IOException e) {
            System.out.println(e);
        }
    }

}
