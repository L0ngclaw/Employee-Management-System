/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import com.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;

/**
 *
 * @author GL63 8RCS
 */
public class staffMember {

    private String staffid, name, address, email, telephone, department, position, type, salary, password;

    public staffMember(ArrayList<String> StaffMember) {
        setStaffid(StaffMember.get(0));
        setName(StaffMember.get(1));
        setAddress(StaffMember.get(2));
        setEmail(StaffMember.get(3));
        setTelephone(StaffMember.get(4));
        setDepartment(StaffMember.get(5));
        setPosition(StaffMember.get(6));
        setType(StaffMember.get(7));
        setSalary(StaffMember.get(8));
        setPassword(StaffMember.get(9));

    }

    public String getStaffid() {
        return staffid;
    }

    private void setStaffid(String staffid) {
        this.staffid = staffid;
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    private void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    private void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    private void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getDepartment() {
        return department;
    }

    private void setDepartment(String department) {
        this.department = department;
    }

    public String getPosition() {
        return position;
    }

    private void setPosition(String position) {
        this.position = position;
    }

    public String getType() {
        return type;
    }

    private void setType(String type) {
        this.type = type;
    }

    public String getSalary() {
        return salary;
    }

    private void setSalary(String salary) {
        this.salary = salary;
    }

    public String getPassword() {
        return password;
    }

    private void setPassword(String password) {
        this.password = password;
    }

    public String AddStaff() {
        String message;
        DBConnection d = new DBConnection();
        Connection c = d.getconnection();
        
        try{
            PreparedStatement ps=c.prepareStatement("INSERT INTO `staff`(`staff_id`, `name`, `address`, `telephone`, `email`, `department`, `position`, `employee_type`, `basic_salary`, `password`) VALUES (?,?,?,?,?,?,?,?,?,?)");
            ps.setString(1, getStaffid());
            ps.setString(2, getName());
            ps.setString(3, getAddress());
            ps.setString(4, getTelephone());
            ps.setString(5, getEmail());
            ps.setString(6, getDepartment());
            ps.setString(7, getPosition());
            ps.setString(8, getType());
            ps.setString(9, getSalary());
            ps.setString(10, getPassword());
            ps.executeUpdate();
            
            message="ok";
            
        }catch(Exception e){
            message="error";
            System.out.println(e);
        }
        
        return message;
    }

}
