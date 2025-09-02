/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.payment_solid;

import com.mycompany.payment_solid.model.*; 
import com.mycompany.payment_solid.service.PaymentProcessor; 
import com.mycompany.payment_solid.service.TransactionHistory; 
 
import java.util.Scanner; 
/**
 *
 * @author putra
 */
public class Payment_solid {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TransactionHistory history = new TransactionHistory();
        PaymentProcessor processor = new PaymentProcessor(history);
        Payment creditCard = new CreditCardPayment();
        Payment eWallet = new EWalletPayment();
        Payment bankTransfer = new BankTransferPayment();
        // Simulasi transaksi 
        processor.processTransaction("TXN001", 100.0, creditCard);
        processor.processTransaction("TXN002", 200.0, eWallet);
        processor.processTransaction("TXN003", 300.0, bankTransfer);
        // Menampilkan riwayat transaksi setelah pembayaran dilakukan 
        history.showTransactions();
        // Menambahkan fitur interaktif untuk melihat riwayat transaksi 
        System.out.println("\nIngin melihat riwayat transaksi lagi? (y/n)");
        String input = scanner.nextLine();
        if (input.equalsIgnoreCase("y")) {
            history.showTransactions();
        }
        System.out.println("Terima kasih telah menggunakan sistem pembayaran!");
        scanner.close();
    }
}
