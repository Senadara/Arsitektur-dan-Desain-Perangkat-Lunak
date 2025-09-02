package com.example.export;

import com.example.model.Todo;
import java.util.List;

public class PlainTextFormatter implements ITodoFormatter {
    public String format(List<Todo> todos) {
        StringBuilder sb = new StringBuilder();
        sb.append("===== Ekspor Daftar Todo =====\n");
        for (Todo todo : todos) {
            sb.append(todo).append("\n");
        }
        return sb.toString();
    }
}
