package com.example;

import java.sql.SQLException;

import com.example.dao.DatabaseConnection;
import com.example.dao.TodoDao;
import com.example.dao.TodoDaoJdbc;
import com.example.service.TodoService;
import com.example.service.TodoServiceImpl;
import com.example.view.TodoCLI;

public class Main {
    public static void main(String[] args) throws SQLException {
        try {
            TodoDao todoDao = new TodoDaoJdbc();
            TodoService todoService = new TodoServiceImpl(todoDao);
            TodoCLI cli = new TodoCLI(todoService);
            cli.start();
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
            e.printStackTrace();
        } finally {
            DatabaseConnection.closeConnection();
        }
    }
}
