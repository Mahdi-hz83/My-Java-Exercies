package org.example.Books;

public class Books {
    private final String title;
    private final String author;
    private final String isbn;
    private boolean isAvailable;

    public Books(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.isAvailable = true;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        this.isAvailable = available;
    }

    @Override
    public String toString() {
        return "Books [title=" + title + ", author=" + author + ", isbn=" + isbn + "]";
    }

}
