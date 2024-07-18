package org.example.Library;

import org.example.Books.Books;
import org.example.Members.Members;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Books> books;
    private List<Members> members;
    private List<String> logs;

    public Library() {
        books = new ArrayList<Books>();
        members = new ArrayList<>();
        logs = new ArrayList<>();
    }
    public void addBook(Books book) {
        books.add(book);
    }
    public void addMember(Members member) {
        members.add(member);
    }
    public void borrowBook(Members member,Books book) {
        member.borrowBook(book);
        logs.add("Borrowed: " + book + " by " + member + " on " + LocalDateTime.now());
    }

    public void returnBook(Members member,Books book) {
        member.returnBook(book);
        logs.add("Returned: " + book + " by " + member + " on " + LocalDateTime.now());
    }

    public List<String> getLogs() {
        return logs;
    }
    public List<Books> getBooks() {
        return books;
    }
    public List<Members> getMembers() {
        return members;
    }
}
