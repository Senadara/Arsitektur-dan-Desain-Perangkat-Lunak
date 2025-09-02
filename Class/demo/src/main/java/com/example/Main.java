package com.example;

import com.example.Model.ProductDAO;
import com.example.Controller.ProductController;
import com.example.View.ProductView;

import javax.swing.SwingUtilities;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            ProductDAO dao = new ProductDAO();
            ProductController controller = new ProductController(dao, null);
            ProductView view = new ProductView(controller);
            controller.setView(view);
        });
    }
}