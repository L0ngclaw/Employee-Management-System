package com;

import models.staffMember;
import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "useradd", urlPatterns = {"/useradd"})
public class useradd extends HttpServlet {
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        ArrayList<String> Staff = new ArrayList<String>();
        
        Staff.add(request.getParameter("staffid"));
        Staff.add(request.getParameter("name"));
        Staff.add(request.getParameter("address"));
        Staff.add(request.getParameter("email"));
        Staff.add(request.getParameter("telephone"));
        Staff.add(request.getParameter("department"));
        Staff.add(request.getParameter("position"));
        Staff.add(request.getParameter("type"));
        Staff.add(request.getParameter("salary"));
        Staff.add(request.getParameter("password"));
        
        staffMember stm=new staffMember(Staff);
        String msg=stm.AddStaff();
        
        response.sendRedirect("userAdd.jsp?msg="+msg);
    }
}
