/*
Name: Wallace Tyner
Course: SDC330
Assignment: Week 4 Project – Database Implementation
Date: [enter date]

Description:
Handles connection to SQLite database.
*/

import java.sql.Connection;
import java.sql.DriverManager;

public class DatabaseConnection {

    private static final String URL = "jdbc:sqlite:vehicle.db";

    public static Connection connect() {
        try {
            // Force load SQLite driver
            Class.forName("org.sqlite.JDBC");

            return DriverManager.getConnection(URL);

        } catch (Exception e) {
            System.out.println("Connection failed: " + e.getMessage());
            return null;
        }
    }
}