package ru.netology.product;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {
    Book book = new Book();

    @Test
    void shouldGetBookAuthor() {
        String expected = "Placeholder";
        String actual = book.getBookAuthor();

        assertEquals(expected,actual);
    }

    @Test
    void shouldSetBookAuthor() {
        book.setBookAuthor("Lebovskiy");

        String expected = "Lebovskiy";
        String actual = book.getBookAuthor();

        assertEquals(expected, actual);
    }
}