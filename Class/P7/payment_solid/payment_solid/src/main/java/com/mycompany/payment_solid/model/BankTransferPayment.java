/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.payment_solid.model;

/**
 *
 * @author putra
 */

// Pembayaran menggunakan transfer bank 
public class BankTransferPayment implements Payment { 
    public void pay(double amount) { 
        System.out.println("Membayar " + amount + " menggunakan Transfer Bank."); 
    } 
} 
