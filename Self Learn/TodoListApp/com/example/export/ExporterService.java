package com.example.export;

import com.example.model.Todo;
import java.util.List;

public class ExporterService {
    private final ITodoFormatter formatter;
    private final IExporter exporter;

    public ExporterService(ITodoFormatter formatter, IExporter exporter) {
        this.formatter = formatter;
        this.exporter = exporter;
    }

    public void exportTodos(List<Todo> todos) {
        String content = formatter.format(todos);
        exporter.export(content);
    }
}
