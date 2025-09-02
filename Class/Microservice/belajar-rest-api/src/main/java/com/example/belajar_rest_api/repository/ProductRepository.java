/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.belajar_rest_api.repository;

import com.example.belajar_rest_api.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author putra
 */
public interface ProductRepository extends JpaRepository<User, Long> {
}
