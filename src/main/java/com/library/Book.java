package com.library;

public class Book {

    // TODO: Add fields
    private String isbn;
    private String title;
    private String author;

    public Book(String isbn, String title, String author) {
        // TODO:
        this.isbn = isbn;
        this.title = title;
        this.author = author;

        // Validate inputs
        // Throw IllegalArgumentException when invalid
        if (isbn == null || isbn.isEmpty()) {
            throw new IllegalArgumentException("isbn cannot be empty");
        }
        if (title == null || title.isEmpty()) {
            throw new IllegalArgumentException("the title cannot be empty");
        }
        if (author == null || author.isEmpty()) {
            throw new IllegalArgumentException("the author cannot be empty");
        }

    }

    public String isbn() {
        // TODO
        return isbn;
    }

    public String title() {
        // TODO
        return title;
    }

    public String author() {
        // TODO
        return author;
    }



    @Override
    public String toString() {
        // TODO
        return isbn + title +author ;
    }

}