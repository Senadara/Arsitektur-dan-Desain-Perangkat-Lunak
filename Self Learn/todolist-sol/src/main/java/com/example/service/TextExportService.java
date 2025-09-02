/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.service;

import com.example.model.Todo;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class TextExportService implements ExportService {

    @Override
    public void export(List<Todo> todos, String filename) throws IOException {
        String directoryName = "D:\\Activity\\Asisten Praktikum\\Arsitektur dan Desain Perangkat Lunak\\Self Learn\\Output";
        File directory = new File(directoryName);

        // Buat folder kalau belum ada
        if (!directory.exists()) {
            directory.mkdir();
        }

        File file = new File(directory, filename);

        try (FileWriter writer = new FileWriter(file)) {
            for (Todo todo : todos) {
                writer.write("ID: " + todo.getId() + "\n");
                writer.write("Judul: " + todo.getTitle() + "\n");
                writer.write("Deskripsi: " + todo.getDescription() + "\n");
                writer.write("Status: " + (todo.isCompleted() ? "Selesai" : "Belum Selesai") + "\n");
                writer.write("-----------------------------------\n");
            }
        }
    }
}
