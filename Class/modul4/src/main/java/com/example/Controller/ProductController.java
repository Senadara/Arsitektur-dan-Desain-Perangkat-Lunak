package com.example.Controller;

import java.util.List;

import javax.swing.table.DefaultTableModel;

import com.example.DAO.ProductDAO;
import com.example.Model.Product;
import com.example.View.ProductJFrame;

public class ProductController {

    private ProductJFrame view;
    private ProductDAO productDAO = new ProductDAO();

    public ProductController(ProductJFrame view) {
        this.view = view;
        refreshTable();
    }

    public void addProduct() {
        String name = view.getProductName();
        double price = view.getProductPrice();
        productDAO.addProduct(new Product(0, name, price));
        view.setProductFields("", "");
        refreshTable();
    }

    public void updateProduct() {
        String name = view.getProductName();
        double price = view.getProductPrice();
        int selectedRow = view.getTable().getSelectedRow();
        if (selectedRow != -1) {
            int id = Integer.parseInt(view.getTable().getValueAt(selectedRow, 0).toString());
            productDAO.updateProduct(id, new Product(0, name, price));
            view.setProductFields("", "");
            refreshTable();
        }
    }

    public void deleteProduct() {
        int selectedRow = view.getTable().getSelectedRow();
        if (selectedRow != -1) {
            int id = Integer.parseInt(view.getTable().getValueAt(selectedRow, 0).toString());
            productDAO.deleteProduct(id);
            view.setProductFields("", "");
            refreshTable();
        }
    }

    public void selectTableRow() {
        int selectedRow = view.getTable().getSelectedRow();
        if (selectedRow != 1) {
            String name = view.getTable().getValueAt(selectedRow, 1).toString();
            String price = view.getTable().getValueAt(selectedRow, 2).toString();
            view.setProductFields(name, price);
        }
    }

    public void refreshTable() {
        List<Product> products = productDAO.getAllProducts();
        DefaultTableModel model = (DefaultTableModel) view.getTable().getModel();
        model.setRowCount(0);
        for (Product p : products) {
            model.addRow(new Object[]{p.getId(), p.getName(), p.getPrice()});
        }
    }

}
