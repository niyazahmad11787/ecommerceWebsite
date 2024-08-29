package com.ecomm.qa.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class otpFunction {

    public static String getOtp() throws SQLException {
        String jdbcURL = "jdbc:postgresql://ecomm-backend.chfh7l48r6z1.ap-south-1.rds.amazonaws.com:5432/hippoecomm";
        String username = "niyaz_read";
        String password = "Test01";

        // Initialize ResultSet and Connection objects to null
        ResultSet resultSet = null;
        Connection connection = null;
        Statement statement = null;
        String otp = null;

        try {
            // Establish a connection
            connection = DriverManager.getConnection(jdbcURL, username, password);
            statement = connection.createStatement();

            String query = "SELECT c.first_name FROM customer c WHERE phone = '9129896786'";
            resultSet = statement.executeQuery(query);

            if (resultSet.next()) {
                otp = resultSet.getString(1);  // Assuming first_name is the OTP or whatever you need
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            
            if (resultSet != null) {
                resultSet.close();
            }
            if (statement != null) {
                statement.close();
            }
            if (connection != null) {
                connection.close();
            }
        }
        return otp;  
    }

    public static void main(String[] args) {
        try {
            String OTP = getOtp();
            System.out.println(OTP);
        } catch (SQLException e) {
            // Print any SQL exception that occurs in the main method
            e.printStackTrace();
        }
    }
}

