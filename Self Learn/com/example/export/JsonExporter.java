package com.example.export;

import java.util.List;
import com.example.model.Todo;

public class JsonExporter implements Exportable {
    @Override
    public void export(List<Todo> todos) {
        System.out.println("Exporting to JSON...");
        for (Todo todo : todos) {
            System.out.println("JSON - { id: " + todo.getId() + ", title: " + todo.getTitle() + ", description: " + todo.getDescription() + ", completed: " + todo.isCompleted() + " }");
        }
    }
}