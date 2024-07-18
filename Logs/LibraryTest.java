package org.example.Library;

import org.example.Books.Books;
import org.example.Members.Members;
import org.example.Members.PremiumMember;
import org.example.Members.RegularMember;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.*;


public class LibraryTest {
    private Library library;
    private Members regularMember;
    private Members premiumMember;
    private Books book1;
    private Books book2;

    @Before
    public void setUp(){
        library = new Library();
        regularMember = new RegularMember("John Saw","J124");
        premiumMember = new PremiumMember("Michael Kerry","M456");
        book1 = new Books("Effective Java", "Joshua Bloch", "978-0134685991");
        book2 = new Books("Clean Code" , "Robert Martin" , "978-0132350884");
    }

    @Test
    public void testAddBook(){
        Books book3 = new Books("Refactoring", "Martin Fowler", "978-0201485677");
        library.addBook(book3);
        assertTrue(library.getBooks().contains(book3));
    }

    @Test
    public void testAddMember(){
        Members newMember = new RegularMember("Alireza" , "A205");
        library.addMember(newMember);
        assertTrue(library.getMembers().contains(newMember));
    }

    @Test
    public void testBorrowBook(){
        library.borrowBook(regularMember , book2);
        assertFalse(book2.isAvailable());
        assertTrue(regularMember.borrowedBooks.contains(book2));
    }

    @Test
    public void testReturnBook(){
        library.borrowBook(premiumMember , book1);
        library.returnBook(premiumMember , book1);
        assertTrue(book1.isAvailable());
        assertFalse(premiumMember.borrowedBooks.contains(book1));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testBorrowedBook() {
        library.borrowBook(regularMember, book1);
        library.borrowBook(premiumMember, book1);
        assertEquals(1, regularMember.borrowedBooks.size());
        assertEquals(0, premiumMember.borrowedBooks.size());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testReturnNotBorrowed() {
        library.borrowBook(regularMember, book1);
        library.returnBook(premiumMember, book1);
        assertFalse(book1.isAvailable());
        assertTrue(regularMember.borrowedBooks.contains(book1));
    }

}