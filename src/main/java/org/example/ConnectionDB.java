package org.example;

import java.sql.*;
public class ConnectionDB {
    // JDBC URL, username, and password of MySQL server
    private static final String JDBC_URL = "jdbc:sqlserver://RICARDOSHUAWEI\\SQLEXPRESS01:1434;database=QS_Gestao_Camas;integratedSecurity=true;encrypt=true;trustServerCertificate=true";
    private static final String USERNAME = "RicardoSHuawei\\geral";
    public static CallableStatement callableStatement;

    public ConnectionDB() {
        try {
            // Register JDBC driver
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

            // Open a connection
            Connection connection = DriverManager.getConnection(JDBC_URL);
            String query = "SELECT * FROM Ward";
            Statement statement = connection.createStatement();
            // The stored procedure call
            ResultSet rs = statement.executeQuery(query);
            while (rs.next()) {
                System.out.println(rs.getString("W_name"));
            }
            // Create a CallableStatement
            //callableStatement = connection.prepareCall(storedProcedureCall);


            // Set input parameters, if any
            //callableStatement.setString(1, "parameter1_value");
            //callableStatement.setInt(2, 123);

            // Execute the stored procedure
            System.out.println(callableStatement.execute());

            // Get output parameters, if any
            // Example: int outputValue = callableStatement.getInt(3);

            // Close resources
            callableStatement.close();
            connection.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}

