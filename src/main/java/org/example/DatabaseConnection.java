package org.example;

import java.sql.*;
public class DatabaseConnection {
    private static final String JDBC_URL = "jdbc:sqlserver://TIAGO-DESKTOP\\SQL_43431:1434;database=QS_Gestao_Camas;integratedSecurity=true;encrypt=true;trustServerCertificate=true";
    public static CallableStatement callableStatement;

    public static Connection connection() throws SQLException {
        //try {
            // Register JDBC driver
            //Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

            // Open a connection
            Connection connection = DriverManager.getConnection(JDBC_URL);

            return connection;

            /*
            String query = "SELECT * FROM Ward";
            Statement statement = connection.createStatement();
            // The stored procedure call
            ResultSet rs = statement.executeQuery(query);
            while (rs.next()) {
                System.out.println(rs.getString("W_name"));
            }
            // Create a CallableStatement
            callableStatement = connection.prepareCall(storedProcedureCall);


            // Set input parameters, if any
            //callableStatement.setString(1, "parameter1_value");
            //callableStatement.setInt(2, 123);

            // Execute the stored procedure
            //System.out.println(callableStatement.execute());

            // Get output parameters, if any
            // Example: int outputValue = callableStatement.getInt(3);

            // Close resources
            //callableStatement.close();
            connection.close();


            return connection;
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }*/
    }
}