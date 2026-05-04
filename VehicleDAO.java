/*
Name: Wallace Tyner
Course: SDC330
Assignment: Week 4 Project – Database Implementation
Date: 3May2026

Description:
Handles CRUD operations for vehicles.
*/

import java.sql.*;

public class VehicleDAO {

    public void createTable() {
        String sql = "CREATE TABLE IF NOT EXISTS vehicles (" +
                "id INTEGER PRIMARY KEY AUTOINCREMENT," +
                "make TEXT," +
                "model TEXT," +
                "color TEXT" +
                ");";

        try (Connection conn = DatabaseConnection.connect();
             Statement stmt = conn.createStatement()) {

            stmt.execute(sql);
            System.out.println("Table created.");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void insertVehicle(String make, String model, String color) {
        String sql = "INSERT INTO vehicles(make, model, color) VALUES(?,?,?)";

        try (Connection conn = DatabaseConnection.connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, make);
            pstmt.setString(2, model);
            pstmt.setString(3, color);
            pstmt.executeUpdate();

            System.out.println("Vehicle added.");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void displayVehicles() {
        String sql = "SELECT * FROM vehicles";

        try (Connection conn = DatabaseConnection.connect();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                System.out.println(
                        rs.getInt("id") + " | " +
                        rs.getString("make") + " " +
                        rs.getString("model") + " | " +
                        rs.getString("color")
                );
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void updateVehicle(int id, String newColor) {
        String sql = "UPDATE vehicles SET color = ? WHERE id = ?";

        try (Connection conn = DatabaseConnection.connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setString(1, newColor);
            pstmt.setInt(2, id);
            pstmt.executeUpdate();

            System.out.println("Vehicle updated.");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public void deleteVehicle(int id) {
        String sql = "DELETE FROM vehicles WHERE id = ?";

        try (Connection conn = DatabaseConnection.connect();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setInt(1, id);
            pstmt.executeUpdate();

            System.out.println("Vehicle deleted.");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}