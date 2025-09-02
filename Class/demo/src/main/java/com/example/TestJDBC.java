package com.example;
 
import java.sql.Connection; 
import java.sql.DriverManager;

public class TestJDBC {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/moduladpl"; // Sesuaikan dengan 
        String user = "root"; // Sesuaikan dengan username database 
        String password = ""; // Sesuaikan dengan password database 

        try (Connection conn = DriverManager.getConnection(url, user, password)) {
            System.out.println("Koneksi berhasil!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
