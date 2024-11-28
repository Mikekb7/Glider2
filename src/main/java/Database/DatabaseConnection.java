package Database;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class DatabaseConnection {
    public static void main(String[] args) {
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://<gliderserver.mysql.database.azure.com>:<3306>/<gliderdatabase>", "glider", "Gpassword123");
            System.out.println("Successful!");
        } catch(SQLException e){
            System.out.println("Connection failed.");

        }
        System.out.println("Database Connected");
    }
}
