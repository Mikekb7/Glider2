package Glider.Database;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import Glider.common.Customer;
import Glider.common.Flights;
import Glider.common.Admin;
import Glider.Execptions.LoginExeceptions;


public class DatabaseConnection {
    public static void main(String[] args) {

        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://gliderserver.mysql.database.azure.com:3306/gliderdatabase?useSSL=true", "glider", "Gpassword123");
            System.out.println("Connection was successful!");

            // CRUD
            PreparedStatement ps = connection.prepareStatement(Queries.login);
            ps.setString(1,"Mike123");
            ps.setString(2,"Password123");

            // Run the query

            ResultSet resultSet = ps.executeQuery();

            while(resultSet.next()){
                System.out.println(resultSet.getString("Username") + resultSet.getString("Password"));
            }

        } catch(SQLException e){
            System.out.println("Connection failed: " + e.getMessage());

        }


    }


    public static Connection getConnection() {
        return null;
    }
}
