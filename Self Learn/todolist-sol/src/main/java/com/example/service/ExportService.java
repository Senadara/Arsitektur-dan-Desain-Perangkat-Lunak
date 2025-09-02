/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.service;

import com.example.model.Todo;
import java.util.List;

/**
 *
 * @author putra
 */
public interface ExportService {
    void export(List<Todo> todos, String filename) throws Exception;
}
