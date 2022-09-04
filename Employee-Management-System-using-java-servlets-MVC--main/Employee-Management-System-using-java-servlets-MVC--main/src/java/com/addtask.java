package com;

import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import models.task;

@WebServlet(name = "addtask", urlPatterns = {"/addtask"})
public class addtask extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        ArrayList<String> task = new ArrayList<String>();
        
        task.add(request.getParameter("task"));
        task.add(request.getParameter("date"));
        task.add(request.getParameter("sid"));
        task.add(request.getParameter("assignedby"));
        
        task t=new task(task);
        String msg=t.addTask();
        String pid=request.getParameter("assignedby");
        
        response.sendRedirect("manageTask.jsp?msg="+msg+"&pid="+pid);
    }

}
