package ru.netology.product;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SmartphoneTest {
    Smartphone smartphone = new Smartphone("Samsung");

    @Test
    void shouldGetProducerName() {
        String expected = "Samsung", actual = smartphone.getProducerName();

        assertEquals(expected, actual);
    }

    @Test
    void shouldSetProducerName() {
        smartphone.setProducerName("Huawei");

        String expected = "Huawei", actual = smartphone.getProducerName();

        assertEquals(expected, actual);
    }

}