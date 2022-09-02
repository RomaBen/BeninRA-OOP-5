package ru.netology.product;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class Smartphone extends Product {
    private String producerName = "Placeholder";

    public Smartphone(int id) {
        super(id);
    }

    public Smartphone(int id, double productPrice) {
        super(id, productPrice);
    }

    public Smartphone(String productName, int id) {
        super(id, productName);
    }

    public Smartphone(int id, String producerName) {
        super(id);
        this.producerName = producerName;
    }

    public Smartphone(int id, String productName, String producerName) {
        super(id, productName);
        this.producerName = producerName;
    }

    public  Smartphone(int id, String productName, double productPrice) {
        super(id, productName, productPrice);
    }

    public Smartphone(int id, String productName,double productPrice,
                      String producerName) {
        super(id, productName, productPrice);
        this.producerName = producerName;
    }

    public String getProducerName() {
        return producerName;
    }

    public void setProducerName(String producerName) {
        this.producerName = producerName;
    }
}
