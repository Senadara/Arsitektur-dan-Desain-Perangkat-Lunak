package com.example.Model;

public class Product {
    private int id;
    private String Name;
    private double Price;

    public Product() {
    }
    
    public Product(int id, String Name, double Price) {
        this.id = id;
        this.Name = Name;
        this.Price = Price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double Price) {
        this.Price = Price;
    }
}
