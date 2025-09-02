/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.post_service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author putra
 */

@RestController 
@RequestMapping("/posts") 
public class PostController { 
 
    @GetMapping("/") 
    public String getProduct() { 
        return "Test Post"; 
    } 
} 
