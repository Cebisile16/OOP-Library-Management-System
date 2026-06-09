package com.library;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Library {

    // TODO:
    // Create HashMap<String, Book>
    private HashMap<String, LibraryMember>members;
    // Create HashMap<String, LibraryMember>
    private HashMap<String, Book> books;

    public Library() {

        // TODO:
        // Initialize HashMaps
        this.members = new HashMap<>();
        this.books =new HashMap<>();
    }

    public void addBook(Book book) {

        // TODO:
        // book cannot be null
        if(book == null){
            throw new IllegalArgumentException(" ");
        }
        books.put(book.isbn(),book);


    }

    public void addMember(LibraryMember member) {

        // TODO:
        // member cannot be null
        if(member == null){
            throw new IllegalArgumentException(" ");
        }
        // store using memberId as key
        members.put(member.memberId(),member);
    }

    public Book findBook(String isbn) {

        // TODO:
        // return book from HashMap

        return books.get(isbn);
    }

    public LibraryMember findMember(String memberId) {

        // TODO:
        // return member from HashMap

        return members.get(memberId);
    }

    public int totalBooks() {

        // TODO:
        // return books.size()

        return  books.size();
    }

    public int totalMembers() {

        // TODO:
        // return members.size()

        return members.size();
    }

    public void borrowBook(String memberId, String isbn) {

        // TODO:
        // Find member
        LibraryMember member = members.get(memberId);
        // Find book
        Book book= books.get(isbn);
        // Call member.borrowBook(book)
        member.borrowBook(book);
    }

    public List<String> allBookTitles() {

        // TODO:
        // Create List<String>
        List<String>titles= new ArrayList<>();

        // Loop through all books
        for (Book book : books.values()) {
            titles.add(book.title());
        }

        return titles;
    }


}