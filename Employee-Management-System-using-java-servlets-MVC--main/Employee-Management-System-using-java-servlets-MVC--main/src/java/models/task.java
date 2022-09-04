package models;

import com.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;

public class task {
    private String task,date,staffid,assignedby;

    public task(ArrayList<String> task) {
        setTask(task.get(0));
        setDate(task.get(1));
        setStaffid(task.get(2));
        setAssignedby(task.get(3));
    }

    public String getTask() {
        return task;
    }

    private void setTask(String task) {
        this.task = task;
    }

    public String getDate() {
        return date;
    }

    private void setDate(String date) {
        this.date = date;
    }

    public String getStaffid() {
        return staffid;
    }

    private void setStaffid(String staffid) {
        this.staffid = staffid;
    }

    public String getAssignedby() {
        return assignedby;
    }

    private void setAssignedby(String assignedby) {
        this.assignedby = assignedby;
    }
    
    public String addTask(){
        String message;
        DBConnection d = new DBConnection();
        Connection c = d.getconnection();
        
        try{
            PreparedStatement ps=c.prepareStatement("INSERT INTO `tasks`(`task`, `todo_date`, `assigned_to`, `assigned_by`) VALUES (?,?,?,?)");
            ps.setString(1, getTask());
            ps.setString(2, getDate());
            ps.setString(3, getStaffid());
            ps.setString(4, getAssignedby());
            ps.executeUpdate();
            
            message="ok";
            
        }catch(Exception e){
            message="error";
            System.out.println(e);
        }
        
        return message;
    }
}
