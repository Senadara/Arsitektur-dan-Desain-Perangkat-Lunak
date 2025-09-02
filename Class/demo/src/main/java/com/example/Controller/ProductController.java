/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Controller;

import com.example.Model.Product;
import com.example.Model.ProductDAO;
import com.example.View.ProductView;

import java.util.List;

public class ProductController {
    private ProductDAO productDAO;
    private ProductView view;

    public ProductController(ProductDAO productDAO, ProductView view) {
        this.productDAO = productDAO;
        this.view = view;
    }

    public void setView(ProductView view) {
        this.view = view;
    }

    public void loadProducts() {
        if (view != null) {
            List<Product> products = productDAO.getAllProducts();
            view.updateTable(products);
        } else {
            System.err.println("View belum diinisialisasi!");
        }
    }

    public void addProduct(String name, double price) {
        Product product = new Product(0, name, price);
        productDAO.insertProduct(product);
        loadProducts();
    }

    public void updateProduct(int id, String name, double price) {
        Product product = new Product(id, name, price);
        productDAO.updateProduct(product);
        loadProducts();
    }

    public void deleteProduct(int id) {
        productDAO.deleteProduct(id);
        loadProducts();
    }
}


