package org.example.poo.tpbooks;

import java.util.Arrays;

public class Book {
    int idBook;
    int counter;
    String name;

    Author[] authors;

    Publisher publisher;

    int publishingAnnee;

    int amountOfPages;

    float BigDecimal;

    public Publisher getPublisher() {
        return publisher;
    }

    public int getPublishingAnnee() {
        return publishingAnnee;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public Book() {

    }

    {
        counter++;
    }


    public Book(String name, Author[] authors, Publisher publisher, int publishingAnnee, int amountOfPages, float bigDecimal) {
        this.idBook = counter;
        this.name = name;
        this.authors = authors;
        this.publisher = publisher;
        this.publishingAnnee = publishingAnnee;
        this.amountOfPages = amountOfPages;
        BigDecimal = bigDecimal;
    }


    @Override
    public String toString() {
        return "Book{" +
                "idBook=" + idBook +
                ", counter=" + counter +
                ", name='" + name + '\'' +
                ", authors=" + Arrays.toString(authors) +
                ", publisher=" + publisher +
                ", publishingAnnee=" + publishingAnnee +
                ", amountOfPages=" + amountOfPages +
                ", BigDecimal=" + BigDecimal +
                '}';
    }
}
