/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.belajar_rest_api.controller;

import com.example.belajar_rest_api.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author putra
 */
@RestController
@RequestMapping("/products")
public class ProductController {
    
    @Autowired
    private ProductService pService;
   
    @GetMapping("/")
    public String showText(){
        return "Test Product";
    }
    
        @GetMapping("/product2")
    public String showTextProduct2(){
        return "Test Product 2";
    }
    
    
}
