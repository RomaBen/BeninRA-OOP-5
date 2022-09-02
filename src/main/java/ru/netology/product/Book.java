package ru.netology.product;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class Book extends Product {

    private String bookAuthor = "Placeholder";

    public Book(int id) {
        super(id);
    }

    public Book(int id, double productPrice) {
        super(id, productPrice);
    }

    public Book(String productName, int id) {
        super(id, productName);
    }

    public Book(int id, String bookAuthor) {
        super(id);
        this.bookAuthor = bookAuthor;
    }

    public Book(int id, String productName, String bookAuthor) {
        super(id, productName);
        this.bookAuthor = bookAuthor;
    }

    public  Book(int id, String productName, double productPrice) {
        super(id, productName, productPrice);
    }

    public Book(int id, String productName, double productPrice, String bookAuthor) {
        super(id, productName, productPrice);
        this.bookAuthor = bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }
}
