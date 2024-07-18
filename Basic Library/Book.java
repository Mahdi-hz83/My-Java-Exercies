package org.example;

import java.util.List;

public class Book {
    private final String title;
    private final String author;
    private final String ISBN;

    public Book(String title, String author, String ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    public String getTitle() {return title;}
    public String getAuthor() {return author;}
    public String getISBN() {return ISBN;}

    @Override
    public String toString() {
        return "Book [title= " + getTitle() + ", author= " + getAuthor() + ", ISBN= " + getISBN() + "]";
    }


}
