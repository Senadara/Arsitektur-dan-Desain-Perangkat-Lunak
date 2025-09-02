/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.payment_solid.model;

/**
 *
 * @author putra
 */
// Pembayaran menggunakan e-wallet 
public class EWalletPayment implements Payment { 
    public void pay(double amount) { 
        System.out.println("Membayar " + amount + " menggunakan E-Wallet."); 
    } 
} 
