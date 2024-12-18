package Glider;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
///import java.sql.Statement;
///
public class Test {
    public static void main(String[] args)
            throws SQLException, ClassNotFoundException {
        // Load the JDBC driver
        //Class.forName("com.mysql.jdbc.Driver");
        System.out.println("Driver loaded");

        // Establish a connection
        Connection connection = DriverManager.getConnection
                ("jdbc:mysql://gliderserver.mysql.database.azure.com:3306/gliderdatabase","glider","Gpassword123");
        System.out.println("Database connected");

        // Create a statement ??
        PreparedStatement statement = connection.prepareStatement("select firstName, mi, lastName from Student where lastName "
                + " = ?");

        statement.setString(1, "Smith");

        // Execute a statement
        ResultSet resultSet = statement.executeQuery();

        // Iterate through the result and print the student names
        while (resultSet.next())
            System.out.println(resultSet.getString(1) + "\t" +
                    resultSet.getString(2) + "\t" + resultSet.getString(3));
        // Close the connection
        connection.close();
    }

}

