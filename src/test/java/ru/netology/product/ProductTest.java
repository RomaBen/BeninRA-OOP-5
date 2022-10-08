package ru.netology.product;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {
    Product product = new Product(95, "Cookie", 26.95);

    @Test
    void shouldGetId() {
        int expected = 95, actual = product.getId();

        assertEquals(expected, actual);
    }

    @Test
    void shouldGetProductName() {
        String expected = "Cookie", actual = product.getProductName();

        assertEquals(expected, actual);
    }

    @Test
    void shouldGetProductPrice() {
        double expected = 26.95, actual = product.getProductPrice();

        assertEquals(expected, actual);
    }

    @Test
    void shouldSetId() {
        product.setId(16);

        int expected = 16, actual = product.getId();

        assertEquals(expected, actual);
    }

    @Test
    void shouldSetProductName() {
        product.setProductName("CupCake");

        String expected = "CupCake", actual = product.getProductName();

        assertEquals(expected, actual);
    }

    @Test
    void shouldSetProductPrice() {
        product.setProductPrice(49.99);

        double expected = 49.99, actual = product.getProductPrice();

        assertEquals(expected, actual);
    }


}