import java.sql.*;

public class ConEx {
    public static void main() {
        try {
            // Register the Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Create the connection
            Connection con = DriverManager.getConnection("mysql.jdbc://localhost:3306/yt", "root", "somaiya");
            if (con.isClosed()) {
                System.out.println("not connected");
            } else {
                System.out.println("Connected");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
