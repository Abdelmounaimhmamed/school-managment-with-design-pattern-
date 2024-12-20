package com.designpattern.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseSingleton {
    private static Connection instance;

    private DatabaseSingleton() {}

    public static Connection getInstance() {
        if (instance == null) {
            try {
                // Load the JDBC driver
                Class.forName("org.sqlite.JDBC");
                // Establish the connection to the database
                String url = "jdbc:sqlite:database.db"; // Modify the path as necessary
                instance = DriverManager.getConnection(url);
                // Log successful connection
                System.out.println("Connection to SQLite has been established.");
            } catch (ClassNotFoundException | SQLException e) {
                System.out.println("Error while establishing database connection: " + e.getMessage());
                e.printStackTrace(); // Add this to print stack trace
            }
        }
        return instance;
    }
}
