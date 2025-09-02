/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.belajar_rest_api.service;

import com.example.belajar_rest_api.model.User;
import com.example.belajar_rest_api.repository.ProductRepository;
import com.example.belajar_rest_api.repository.UserRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author putra
 */
@Service
public class ProductService {
    
    @Autowired
    private ProductRepository repository;
    
    public List<User> getAllProduct(){
        return repository.findAll();
    }
    
    public Optional<User> getProductById(Long id){
        return repository.findById(id);
    }
    
    public User saveProduct(User user){
        return repository.save(user);
    }
    
    public User updateProduct(Long id, User userDetails){
        return repository.findById(id).map(user -> {
        user.setUsername(userDetails.getUsername());
        user.setPassword(userDetails.getPassword());
        return repository.save(user);
        }).orElse(null);
    }
    
    public void deleteProduct(Long id){
        repository.deleteById(id);
    }
}
