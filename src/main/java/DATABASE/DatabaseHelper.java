/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DATABASE;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author TieuLong
 */
public class DatabaseHelper {

    private static String user = "sa";
    private static String pass = "123456789";
    private static String url = "jdbc:sqlserver://localhost:1433;databaseName=DuAnBanGiay;trustServerCertificate=true";

    public static Connection getConnection() throws Exception {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        Connection conn = DriverManager.getConnection(url, user, pass);
        return conn;
    }
}
