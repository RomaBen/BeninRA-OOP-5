package ru.netology.repository;

import org.junit.jupiter.api.Test;
import ru.netology.product.Book;
import ru.netology.product.Product;
import ru.netology.product.Smartphone;

import static org.junit.jupiter.api.Assertions.*;

class RepositoryTest {
    Repository repo = new Repository();
    Product product = new Product();
    Book book = new Book();
    Smartphone smartphone = new Smartphone();

    @Test
    void shouldSaveAnObject() {
        repo.save(product);
        repo.save(book);
        repo.save(smartphone);

        Product[] expected = {product, book, smartphone};
        Product[] actual = repo.findAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldFindAllObjectsInArray() {
        Product[] expected = {}, actual = repo.findAll();

        assertArrayEquals(expected, actual);
    }
}