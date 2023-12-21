package org.example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TableBuilder {

    public static String buildBedsTable() {
        String htmlTable = "<table class=\"w3-table-all w3-hoverable w3-centered\" border='1'>";
        htmlTable += "<thead><tr>";
        htmlTable += "<th>" + "Department" + "</th>";
        htmlTable += "<th>" + "Ward" + "</th>";
        htmlTable += "<th>" + "Bed ID" + "</th>";
        htmlTable += "<th>" + "Process" + "</th>";
        htmlTable += "<th>" + "State" + "</th>";
        htmlTable += "<th>" + "Departure date" + "</th>";
        htmlTable += "<th>" + "Arrival date" + "</th>";
        htmlTable += "</tr></thead>";

        try (Connection connection = DatabaseConnection.connection();
             PreparedStatement statement = connection.prepareCall("{CALL get_beds}")) {

            ResultSet resultSet = statement.executeQuery();
            int columnCount = resultSet.getMetaData().getColumnCount();

            while (resultSet.next()) {
                htmlTable += "<tr>";
                for (int i = 1; i <= columnCount; i++) {
                    htmlTable += "<td>" + resultSet.getString(i) + "</td>";
                }
                htmlTable += "</tr>";
            }

            htmlTable += "</table>";
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return htmlTable;
    }

    public static String buildUserTable() {
        String htmlTable = "<table class=\"w3-table-all w3-hoverable w3-centered\" border='1'>";

        try (Connection connection = DatabaseConnection.connection();
             PreparedStatement statement = connection.prepareCall("{CALL get_users}")) {

            ResultSet resultSet = statement.executeQuery();
            int columnCount = resultSet.getMetaData().getColumnCount();

            // Build table header
            htmlTable += "<thead><tr>";
            htmlTable += "<th>" + "Department" + "</th>";
            htmlTable += "<th>" + "Role" + "</th>";
            htmlTable += "<th>" + "User" + "</th>";
            htmlTable += "<th>" + "Badge number" + "</th>";
            htmlTable += "<th>" + "E-mail" + "</th>";
            htmlTable += "</tr></thead>";

            // Build table rows
            while (resultSet.next()) {
                htmlTable += "<tr>";
                for (int i = 1; i <= columnCount; i++) {
                    htmlTable += "<td>" + resultSet.getString(i) + "</td>";
                }
                htmlTable += "</tr>";
            }

            htmlTable += "</table>";
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return htmlTable;
    }
}
