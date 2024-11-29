package Database;

public class Queries {
    public static final String login = "SELECT COUNT(*) FROM users WHERE username = ? AND password = ?";

}
