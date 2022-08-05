package com.danamon.hibermart.model;

import javax.persistence.*;

public class Product {

    private int id;
    private String name;
    private int productPrice;
    private int stock;

    public Product(int id, String name, int productPrice, int stock) {
        this.id = id;
        this.name = name;
        this.productPrice = productPrice;
        this.stock = stock;
    }

    public Product(String name, int productPrice, int stock) {
        this.name = name;
        this.productPrice = productPrice;
        this.stock = stock;
    }

    public Product() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(int productPrice) {
        this.productPrice = productPrice;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", productPrice=" + productPrice +
                ", stock=" + stock +
                '}';
    }
}
