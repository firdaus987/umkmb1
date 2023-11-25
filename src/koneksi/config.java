package koneksi;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author 
 */

public class config {

    private static Connection koneksi;

    public static Connection configDB() throws SQLException {
        if (koneksi == null) {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                koneksi = java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "");
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
        return koneksi;
    }

//    public static void main(String[] args) {
//        try {
//            Connection connection = configDB();
//            if (connection != null) {
//                System.out.println("Connection successful!");
//                // Do something with the connection if needed
//            } else {
//                System.out.println("Failed to connect to the database.");
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
}
