/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.payment_solid.model;

/**
 *
 * @author putra
 */
 
public class Transaction { 
    private String id; 
    private double amount; 
    private Payment paymentMethod; 
 
    public Transaction(String id, double amount, Payment paymentMethod) { 
        this.id = id; 
        this.amount = amount; 
        this.paymentMethod = paymentMethod; 
    } 
 
    public void processPayment() { 
        paymentMethod.pay(amount); 
        System.out.println("Transaksi " + id + " berhasil."); 
    } 
 
    @Override 
    public String toString() { 
        return "ID: " + id + ", Jumlah: " + amount + ", Metode: " + 
paymentMethod.getClass().getSimpleName(); 
    } 
} 
