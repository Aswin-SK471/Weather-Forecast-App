import java.sql.*;

public class DBConnection {
    private static final String URL = "jdbc:mysql://localhost:3306/weather_db";
    private static final String USER = "root";          // your MySQL username
    private static final String PASS = "kira";  // your MySQL password

    public static Connection getConnection() throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // explicitly load driver
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return DriverManager.getConnection(URL, USER, PASS);
    }
}
