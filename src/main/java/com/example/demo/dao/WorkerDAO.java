package com.example.demo.dao;

import java.sql.SQLException;
import java.util.List;

import com.example.demo.model.Worker;


public interface WorkerDAO {
    public int add()
            throws SQLException;

    public int delete()
            throws SQLException;

    public Worker getWorker()
            throws SQLException;

    public List<Worker> getWorkers()
            throws SQLException;

    public int update()
            throws SQLException;
}

