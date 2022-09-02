package ru.netology.product;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class Product {

    private int id;
    private String productName = "Placeholder";
    private double productPrice = 99.99;

    public Product(int id) {
        this.id = id;
    }

    public Product(int id, String productName) {
        this.id = id;
        this.productName = productName;
    }

    public Product(int id, double productPrice) {
        this.id = id;
        this.productPrice = productPrice;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public double getProductPrice() {
        return productPrice;
    }

}
