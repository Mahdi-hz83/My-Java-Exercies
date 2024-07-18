package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LibraryTest {

    @Test
    public void testAddBook() {
        Library library = new Library();
        Book book = new Book("1984", "George Orwell","102030-25");

        library.addBook(book);
        assertTrue(library.toString().contains("1984"));
    }

    @Test
    void testRemoveBook() {
        Library library = new Library();
        Book book = new Book("1984", "George Orwell","102030-25");

        library.addBook(book);
        library.removeBook(book);
        assertFalse(library.toString().contains("1984"));
    }

    
}