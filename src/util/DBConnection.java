package util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    private static final String URL = "jdbc:mysql://localhost:3306/doctor_app_db";
    private static final String USER = "root";
    private static final String PASSWORD = "root"; // change if needed

    public static Connection getConnection() {
        try {
            // FORCE load MySQL driver
            Class.forName("com.mysql.jdbc.Driver");

            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
