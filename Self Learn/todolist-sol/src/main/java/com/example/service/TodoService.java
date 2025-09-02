package com.example.service;

import com.example.model.Todo;
import java.util.List;

// 5. Service Interface - Menerapkan OCP
public interface TodoService {
   void addTodo(String title, String description) throws Exception;

   List<Todo> getAllTodos() throws Exception;

   Todo getTodoById(int id) throws Exception;

   void updateTodo(Todo todo) throws Exception;

   void markAsCompleted(int id) throws Exception;

   void deleteTodo(int id) throws Exception;
}
