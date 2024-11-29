package Database;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;



public class DatabaseConnection {
    public static void main(String[] args) {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://gliderserver.mysql.database.azure.com:3306/gliderdatabase?useSSL=true", "glider", "Gpassword123");
            System.out.println("Successful!");

            PreparedStatement statement = connection.prepareStatement(Queries.login);


        } catch(SQLException e){
            System.out.println("Connection failed.");

        } finally{
            connection.close();
        }
    }
}
