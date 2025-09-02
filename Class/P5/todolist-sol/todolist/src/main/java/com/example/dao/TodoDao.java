package com.example.dao;

import com.example.model.Todo;
import java.util.List;

//Menerapkan OCP Prinsiple
//Interface ini memungkinkan untuk ekstensi tanpa modifikasi
public interface TodoDao {
   void create(Todo todo) throws Exception;

   void update(Todo todo) throws Exception;

   void delete(int id) throws Exception;

   Todo findById(int id) throws Exception;

   List<Todo> findAll() throws Exception;

}
