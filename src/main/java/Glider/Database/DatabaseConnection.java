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
        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://gliderserver.mysql.database.azure.com:3306/gliderdatabase?useSSL=true", "glider", "Gpassword123");
            System.out.println("Successful!");



        } catch(SQLException e){
            System.out.println("Connection failed.");

        }
    }


}
