package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

@WebServlet(name = "DBConnection", urlPatterns = {"/DBConnection"})
public class DBConnection extends HttpServlet {
    
    public Connection getconnection(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3308/staff_management", "root", "");
            return con;
        } catch (ClassNotFoundException | SQLException e) {
           System.out.println("Error in DB Connection");
           System.out.println(e);
           return null;
        }
    }
}
