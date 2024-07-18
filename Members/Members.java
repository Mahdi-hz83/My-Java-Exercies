package org.example.Members;

import org.example.Books.Books;

import java.util.ArrayList;
import java.util.List;

public abstract class Members {
    protected String name;
    protected String memberId;
    protected List<Books> borrowedBooks;

    public Members(String name , String memberId){
        this.name = name;
        this.memberId = memberId;
        borrowedBooks = new ArrayList<>();
    }

    public abstract int getBorrowDuration();

    public void borrowBook(Books book){
        if (book.isAvailable()){
            borrowedBooks.add(book);
            book.setAvailable(false);
        }
        else{throw new IllegalArgumentException("Book is not available");}
    }
    public void returnBook(Books book){
        if (borrowedBooks.remove(book)){
            book.setAvailable(true);
        }
        else{throw new IllegalArgumentException("This book was not borrowed by this member.");}
    }

    @Override
    public String toString() {
        return "Members [Name=" + name + ", ID=" + memberId + "]";
    }

}
