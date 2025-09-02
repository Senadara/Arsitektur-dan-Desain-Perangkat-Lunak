package com.example.export;

import java.util.List;
import com.example.model.Todo;

public class PdfExporter implements Exportable {
    @Override
    public void export(List<Todo> todos) {
        System.out.println("Exporting to PDF...");
        for (Todo todo : todos) {
            System.out.println("PDF - " + todo);
        }
    }
}