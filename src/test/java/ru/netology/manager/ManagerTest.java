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
    Product product2 = new Product(7, 449.99);
    Product product3 = new Product(10);

    Book book = new Book("Dummy", 2);
    Book book1 = new Book(5, "EducationBook", 265.50,
            "JeanPaul");
    Book book2 = new Book(8, "Recipes", "ChrisMeatson");
    Book book3 = new Book(11, "AndrewSamovipilov");
    Book book4 = new Book("EvgeniyHromoy");
    Book book5 = new Book(78, "HowToKillABoring", 500.00);
    Book book6 = new Book(1987, 499.99);
    Book book7 = new Book(129873);

    Smartphone smartphone = new Smartphone(3, "GalaxyI", "Samsung");
    Smartphone smartphone1 = new Smartphone(6, 48499.99);
    Smartphone smartphone2 = new Smartphone(9, "Honor1337", 54499.99);
    Smartphone smartphone3 = new Smartphone("Dummy",12);
    Smartphone smartphone4 = new Smartphone(18567, "Apple");
    Smartphone smartphone5 = new Smartphone(45679, "MtaePro3000",
                                96999.99, "Xiaozu");
    Smartphone smartphone6 = new Smartphone(125);


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
        manager.add(book4);
        manager.add(book5);
        manager.add(smartphone);
        manager.add(smartphone1);
        manager.add(smartphone2);
        manager.add(smartphone3);
        manager.add(smartphone4);
        manager.add(smartphone5);
        manager.add(book6);
        manager.add(book7);
        manager.add(smartphone6);
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
                book,
                smartphone3
        };
        Product[] actual = manager.searchByText("Dummy");

        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldSearchByProductNameForAllPlaceholders() {
        Product[] expected = new Product[] {
                product2,
                product3,
                book3,
                book4,
                smartphone1,
                smartphone4,
                book6,
                book7,
                smartphone6
        };
        Product[] actual = manager.searchByText("Placeholder");

        assertArrayEquals(expected,actual);
    }
}