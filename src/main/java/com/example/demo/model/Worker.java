package com.example.demo.model;

import java.sql.*;
import java.util.Date;
public class Worker {
    private int workerId;
    private String firstName;
    private String lastName;
    private int salary;
    private Date joiningDate;
    private String department;
    private String email;

    public Worker(int workerId, String firstName, String lastName, int salary, String department,
            String email) {
        this.workerId = workerId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.joiningDate = new Date();
        this.department = department;
        this.email = email;
    }


    public Worker(int workerId, String firstName, String email) {
        this.workerId = workerId;
        this.firstName = firstName;
        this.email = email;
        this.joiningDate = new Date();
    }

    public Worker(int workerId, String firstName, Date joiningDate, String email) {
        this.workerId = workerId;
        this.firstName = firstName;
        this.joiningDate = joiningDate;
        this.email = email;
    }

    public Worker(int workerId, String firstName, String lastName, int salary, Date joiningDate, String department,
            String email) {
        this.workerId = workerId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.joiningDate = joiningDate;
        this.department = department;
        this.email = email;
    }
    
    public int getworkerId() {
        return workerId;
    }
    public void setworkerId(int workerId) {
        this.workerId = workerId;
    }
    public String getfirstName() {
        return firstName;
    }
    public void setfirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getlastName() {
        return lastName;
    }
    public void setlastName(String lastName) {
        this.lastName = lastName;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public Date getjoiningDate() {
        return joiningDate;
    }
    public void setjoiningDate(Date joiningDate) {
        this.joiningDate = joiningDate;
    }
    public String getDepartment() {
        return department;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Worker [department=" + department + ", email=" + email + ", firstName=" + firstName
                + ", joiningDate=" + joiningDate + ", lastName=" + lastName + ", salary=" + salary + ", workerId="
                + workerId + "]";
    }
}

