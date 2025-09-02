package com.example.export;

import com.example.model.Todo;
import java.util.List;

public interface ITodoFormatter {
    String format(List<Todo> todos);
}
