/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.user_service.service;

import java.util.List;
import java.util.Optional;

import com.example.user_service.model.User;
import com.example.user_service.repository.UserRepository;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author putra
 */
@Service
public class UserService {
    
    @Autowired
    private UserRepository repository;
    
    public List<User> getAllUser(){
        return repository.findAll();
    }
    
    public Optional<User> getUserById(Long id){
        return repository.findById(id);
    }
    
    public User saveUser(User user){
        return repository.save(user);
    }
    
    public User updateUser(Long id, User userDetails){
        return repository.findById(id).map(user -> {
        user.setUsername(userDetails.getUsername());
        user.setPassword(userDetails.getPassword());
        return repository.save(user);
        }).orElse(null);
    }
    
    public void deleteUser(Long id){
        repository.deleteById(id);
    }
}