package com.example;

import com.example.Controller.ProductController;
import com.example.View.ProductJFrame;

public class Main {
    public static void main(String[] args) {
        ProductJFrame view = new ProductJFrame();
        new ProductController(view);

        view.setVisible(true);
    }
}