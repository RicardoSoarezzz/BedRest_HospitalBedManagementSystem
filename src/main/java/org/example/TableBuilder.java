package org.example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TableBuilder {
    static StringBuilder htmlTable = new StringBuilder("<table border='1'>");
    public static String buildBedsTable(){

        try (Connection connection = DatabaseConnection.connection();
             PreparedStatement statement = connection.prepareCall("{CALL get_beds}")) {

            ResultSet resultSet = statement.executeQuery();
            int columnCount = resultSet.getMetaData().getColumnCount();
            // Build table header
            htmlTable.append("<tr>");
            htmlTable.append("<th>").append("Department").append("</th>");
            htmlTable.append("<th>").append("Ward").append("</th>");
            htmlTable.append("<th>").append("Bed ID").append("</th>");
            htmlTable.append("<th>").append("Process").append("</th>");
            htmlTable.append("<th>").append("State").append("</th>");
            htmlTable.append("<th>").append("Departure date").append("</th>");
            htmlTable.append("<th>").append("Arrival date").append("</th>");
            htmlTable.append("</tr>");

            // Build table rows
            while (resultSet.next()) {
                htmlTable.append("<tr>");
                for (int i = 1; i <= columnCount; i++) {
                    htmlTable.append("<td>").append(resultSet.getString(i)).append("</td>");
                }
                htmlTable.append("</tr>");
            }

            htmlTable.append("</table>");
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return htmlTable.toString();
    }
    public static String buildUserTable() {

        try (Connection connection = DatabaseConnection.connection();
             PreparedStatement statement = connection.prepareCall("{CALL get_users}")) {

            ResultSet resultSet = statement.executeQuery();
            int columnCount = resultSet.getMetaData().getColumnCount();

            // Build table header
            htmlTable.append("<tr>");
            htmlTable.append("<th>").append("Department").append("</th>");
            htmlTable.append("<th>").append("Role").append("</th>");
            htmlTable.append("<th>").append("User").append("</th>");
            htmlTable.append("<th>").append("Badge number").append("</th>");
            htmlTable.append("<th>").append("E-mail").append("</th>");
            htmlTable.append("</tr>");

            // Build table rows
            while (resultSet.next()) {
                htmlTable.append("<tr>");
                for (int i = 1; i <= columnCount; i++) {
                    htmlTable.append("<td>").append(resultSet.getString(i)).append("</td>");
                }
                htmlTable.append("</tr>");
            }

            htmlTable.append("</table>");
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return htmlTable.toString();
    }
}
