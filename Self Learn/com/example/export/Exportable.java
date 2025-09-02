package com.example.export;

import java.util.List;
import com.example.model.Todo;

public interface Exportable {
    void export(List<Todo> todos);
}