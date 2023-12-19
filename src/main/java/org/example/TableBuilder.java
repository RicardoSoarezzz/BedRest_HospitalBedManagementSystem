package org.example;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

public class TableBuilder {
    public static String buildHtmlTable() {
        StringBuilder htmlTable = new StringBuilder("<table border='1'>");

        try (Connection connection = DatabaseConnection.connection();
             PreparedStatement statement = connection.prepareCall("{CALL get_users}")) {

            ResultSet resultSet = statement.executeQuery();
            int columnCount = resultSet.getMetaData().getColumnCount();

            // Build table header
            htmlTable.append("<tr>");
            for (int i = 1; i <= columnCount; i++) {
                htmlTable.append("<th>").append(resultSet.getMetaData().getColumnName(i)).append("</th>");
            }
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

    @RestController
    @RequestMapping("/")
    public class YourController {

        @GetMapping("/htmlTable")
        public String getHtmlTable() {
            String table = new TableBuilder().buildHtmlTable();
            System.out.println(table);
            return buildHtmlTable();
        }
    }
}
