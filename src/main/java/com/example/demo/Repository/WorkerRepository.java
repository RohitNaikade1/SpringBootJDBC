package com.example.demo.Repository;

import java.sql.*;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.dao.WorkerDAO;
import com.example.demo.model.Worker;
import com.example.demo.util.DatabaseConnection;

@Repository
public class WorkerRepository implements WorkerDAO {
    Connection connection;

    public WorkerRepository() throws SQLException {

        this.connection = DatabaseConnection.getConnection();

    }
    
    @Override
    public int add() throws SQLException {
        int worker_id = 11;
        String first_name = "Omkar";
        String last_name = "Naikade";
        int salary = 8000;
        Date date = new Date();
        String department = "HR";
        String email = "omkar@gmail.com";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String joining_date = sdf.format(date);
        String query = String.format("INSERT INTO worker VALUES(%d,'%s','%s',%d,'%s','%s','%s');", worker_id,
                first_name,
                last_name, salary, joining_date, department, email);
        try (Statement statement = connection.createStatement()) {
            return statement.executeUpdate(query);
        }

    }

    @Override
    public int delete() throws SQLException {
        String query = "DELETE FROM worker WHERE worker_id=11";
        int res=0;
        try (Statement statement = connection.createStatement()) {
        	res =statement.executeUpdate(query);
        }
        
        return 0;
        
    }

    @Override
    public Worker getWorker() throws SQLException {
        String query = "SELECT * FROM worker WHERE worker_id=1";
        Worker res = null;
        try (Statement ps = connection.createStatement();) {
            ResultSet result = ps.executeQuery(query);
            while (result.next()) {
                int workerId1 = result.getInt("worker_id");
                String firstName = result.getString("first_name");
                String lastName = result.getString("last_name");
                int salary = result.getInt("salary");
                Date date = result.getDate("joining_date");
                String department = result.getString("department");
                String email = result.getString("email");

                res = new Worker(workerId1, firstName, lastName, salary, date, department, email);
            }
        }
        return res;
    }

    @Override
    public List<Worker> getWorkers() throws SQLException {
        String query = "SELECT * FROM worker";
        List<Worker> list = new ArrayList<>();
        try (Statement statement = connection.createStatement()) {
            ResultSet result = statement.executeQuery(query);
            while (result.next()) {
                int worker_id = result.getInt("worker_id");
                String first_name = result.getString("first_name");
                String last_name = result.getString("last_name");
                int salary = result.getInt("salary");
                Date date = result.getDate("joining_date");
                String department = result.getString("department");
                String email = result.getString("email");

                list.add(new Worker(worker_id, first_name, last_name, salary, date, department, email));
            }
        }

        return list;
    }

    @Override
    public int update() throws SQLException {
        int workerId = 11;
        String firstName = "omkar";
        String lastName = "naikade";
        int salary = 5000;
        Date date = new Date();
        String department = "HR";
        String email = "mfs.akash@gmail.com";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String joiningDate = sdf.format(date);
        String query = String.format("""
                UPDATE worker SET
                worker_id =%d,
                first_name = '%s',
                last_name ='%s',
                salary =%d,
                joining_date = '%s',
                department = '%s',
                email = '%s'
                WHERE worker_id = %d """, workerId,
                firstName,
                lastName, salary, joiningDate, department, email, workerId);
        int res=0;
        try (Statement statement = connection.createStatement()) {
            res = statement.executeUpdate(query);
            System.out.println(res + " row get Updated");
        }
        
        return res;
    }



}

