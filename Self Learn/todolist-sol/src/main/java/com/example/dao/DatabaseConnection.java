package com.example.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// 2. Database Connection - Menerapkan SRP
// Kelas ini hanya bertanggung jawab untuk mengelola koneksi database
public class DatabaseConnection {
   private static final String URL = "jdbc:mysql://localhost:3306/todolist";
   private static final String USERNAME = "root";
   private static final String PASSWORD = "";

   private static Connection connection = null;

   private DatabaseConnection() {
      // Private constructor untuk mencegah instansiasi dari luar
   }

   public static Connection getConnection() throws SQLException {
      // if (connection == null || connection.isClosed()) {

      // }
      try {
         Class.forName("com.mysql.cj.jdbc.Driver");
         connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
      } catch (ClassNotFoundException e) {
         throw new SQLException("MySQL JDBC Driver tidak ditemukan", e);
      }
      return connection;
   }

   public static void closeConnection() throws SQLException {
      if (connection != null && !connection.isClosed()) {
         connection.close();
      }
   }
}
