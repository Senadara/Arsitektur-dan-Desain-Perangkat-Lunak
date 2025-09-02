/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.payment_solid.service;

import com.mycompany.payment_solid.model.Transaction;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author putra
 */
public class TransactionHistory { 
    private List<Transaction> transactions = new ArrayList<>(); 
 
    public void addTransaction(Transaction transaction) { 
        transactions.add(transaction); 
    } 
 
    public void showTransactions() { 
        System.out.println("\n=== Riwayat Transaksi ==="); 
        if (transactions.isEmpty()) { 
            System.out.println("Belum ada transaksi."); 
        } else { 
            for (Transaction transaction : transactions) { 
                System.out.println(transaction); 
            } 
        } 
    } 
} 
