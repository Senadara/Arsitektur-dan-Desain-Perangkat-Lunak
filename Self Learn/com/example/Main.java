package com.example;

import java.sql.SQLException;
import java.util.Scanner;

import com.example.dao.TodoDao;
import com.example.dao.TodoDaoJdbc;
import com.example.service.TodoService;
import com.example.service.TodoServiceImpl;
import com.example.export.Exportable;
import com.example.export.PdfExporter;
import com.example.export.JsonExporter;
import com.example.view.TodoCLI;

public class Main {
    public static void main(String[] args) throws SQLException {
        try {
            TodoDao todoDao = new TodoDaoJdbc();
            TodoService todoService = new TodoServiceImpl(todoDao);

            Scanner scanner = new Scanner(System.in);
            System.out.println("Pilih format export:");
            System.out.println("1. PDF");
            System.out.println("2. JSON");
            System.out.print("Pilihan Anda: ");
            String pilihan = scanner.nextLine();

            Exportable exporter;
            if (pilihan.equals("1")) {
                exporter = new PdfExporter();
            } else if (pilihan.equals("2")) {
                exporter = new JsonExporter();
            } else {
                throw new IllegalArgumentException("Format tidak dikenali");
            }

            TodoCLI cli = new TodoCLI(todoService, exporter);
            cli.start();

        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}