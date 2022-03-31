package com.example.demo.util;

import java.sql.*;
import java.util.Date;
public class DatabaseConnection{
    private static final String USERNAME = "root";
    private static final String PASSWORD = "admin";
    private static final String URL = "jdbc:mysql://localhost:3307/my_org";
    private static Connection connection;
    private DatabaseConnection() {

    }

    public static Connection getConnection() throws SQLException {
        if (connection == null) {
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
                System.out.println("Connected to database server "
                + connection.getMetaData().getDatabaseProductName()
                + " version: "
                + connection.getMetaData().getDatabaseProductVersion());
        }
        return connection;
    }

    public static void close() throws SQLException {
        if (connection != null)
        connection.close();
    }
}
