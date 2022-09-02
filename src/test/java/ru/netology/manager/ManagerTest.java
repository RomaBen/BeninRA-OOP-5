package ru.netology.manager;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.product.*;
import ru.netology.repository.Repository;

import static org.junit.jupiter.api.Assertions.*;

class ManagerTest {
    Repository repo = new Repository();
    Manager manager = new Manager(repo);

    Product product = new Product(1, "Dummy", 115);
    Product product1 = new Product(4, "Dummy");
    Product product2 = new Product(7, "Dummy");
    Product product3 = new Product(10);

    Book book = new Book("Dummy", 2);
    Book book1 = new Book(5);
    Book book2 = new Book(8);
    Book book3 = new Book(11);

    Smartphone smartphone = new Smartphone(3, "GalaxyI", "Samsung");
    Smartphone smartphone1 = new Smartphone(6);
    Smartphone smartphone2 = new Smartphone(9);
    Smartphone smartphone3 = new Smartphone("Dummy",12);

    @BeforeEach
    public void managerPreparations() {
        manager.add(product);
        manager.add(product1);
        manager.add(product2);
        manager.add(product3);
        manager.add(book);
        manager.add(book1);
        manager.add(book2);
        manager.add(book3);
        manager.add(smartphone);
        manager.add(smartphone1);
        manager.add(smartphone2);
        manager.add(smartphone3);
    }

    @Test
    void shouldAddAnObject() {
        Repository repoForTest = new Repository();
        Manager managerForTest = new Manager(repoForTest);
        Product productAddTester = new Product();
        managerForTest.add(productAddTester);

        Product[] expected = new Product[] {productAddTester};
        Product[] actual = managerForTest.showAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldSearchByProductNameForAnObject() {
        Product[] expected = new Product[] {smartphone};
        Product[] actual = manager.searchByText("GalaxyI");

        assertArrayEquals(expected, actual);
    }

    @Test
    void shouldConfirmMatches() {
        boolean expected = true;
        boolean actual = manager.matches(smartphone, "GalaxyI");

        assertEquals(expected, actual);
    }

    @Test
    public void shouldSearchByProductNameForAreSeveralObjects() {
        Product[] expected = new Product[] {
                product,
                product1,
                product2,
                book,
                smartphone3
        };
        Product[] actual = manager.searchByText("Dummy");

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldSearchByProductNameForAllPlaceholders() {
        Product[] expected = new Product[] {
                product3,
                book1,
                book2,
                book3,
                smartphone1,
                smartphone2
        };
        Product[] actual = manager.searchByText("Placeholder");

        assertArrayEquals(expected,actual);
    }
}