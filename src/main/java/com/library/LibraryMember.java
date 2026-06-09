package com.library;

import java.util.ArrayList;
import java.util.List;

public class LibraryMember {

    // TODO: Add fields
    private String memberId;
    private String name;
    private List<Book> borrowedBooks;

    public LibraryMember(String memberId, String name) {
        this.memberId = memberId;
        this.name = name;
        this.borrowedBooks= new ArrayList<>();

        // TODO:
        // Validate memberId
        if (memberId == null || memberId.isEmpty()) {
            throw new IllegalArgumentException("memberId cannot be empty");
        }
        // Validate name
        if(name ==null || name.isEmpty()){
            throw new IllegalArgumentException("Name cannot be empty");
        }
        // Initialize borrowedBooks list
        this.borrowedBooks =new ArrayList<>();
    }

    public String memberId() {
        // TODO
        return memberId;
    }

    public String name() {
        // TODO
        return name;
    }

    public void borrowBook(Book book) {

        // TODO:
        // book cannot be null
        if(book == null){
            throw new IllegalArgumentException("");
        }

        // add book to borrowedBooks
       borrowedBooks.add(book);

    }

    public int totalBorrowedBooks() {

        // TODO:
        // return number of borrowed books


        return borrowedBooks.size();
    }

    public boolean hasBook(String isbn) {

        // TODO:
        // Loop through borrowedBooks
        for (Book book : borrowedBooks){
            if (book.isbn().equals(isbn)) {

                return true;
            }
        }

        // Return true if isbn matches
        return false;

    }

    @Override
    public String toString() {

        // TODO:
        // Include memberId
        // Include name
        // Include total borrowed books

        return memberId+ name + borrowedBooks;
    }
}