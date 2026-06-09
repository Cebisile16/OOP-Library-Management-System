package com.library;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {

    @Test
    void shouldAddBook() {
        Library library = new Library();

        Book book =
                new Book("B001", "Java Basics", "John Smith");

        library.addBook(book);

        assertEquals(1, library.totalBooks());
    }

    @Test
    void shouldThrowExceptionWhenAddingNullBook() {
        Library library = new Library();

        assertThrows(
                IllegalArgumentException.class,
                () -> library.addBook(null)
        );
    }

    @Test
    void shouldAddMember() {
        Library library = new Library();

        LibraryMember member =
                new LibraryMember("M001", "Ceby");

        library.addMember(member);

        assertEquals(1, library.totalMembers());
    }

    @Test
    void shouldThrowExceptionWhenAddingNullMember() {
        Library library = new Library();

        assertThrows(
                IllegalArgumentException.class,
                () -> library.addMember(null)
        );
    }

    @Test
    void shouldFindBookByIsbn() {
        Library library = new Library();

        Book book =
                new Book("B001", "Java Basics", "John Smith");

        library.addBook(book);

        assertEquals(book, library.findBook("B001"));
    }

    @Test
    void shouldFindMemberById() {
        Library library = new Library();

        LibraryMember member =
                new LibraryMember("M001", "Ceby");

        library.addMember(member);

        assertEquals(member, library.findMember("M001"));
    }

    @Test
    void shouldBorrowBookForMember() {
        Library library = new Library();

        LibraryMember member =
                new LibraryMember("M001", "Ceby");

        Book book =
                new Book("B001", "Java Basics", "John Smith");

        library.addMember(member);
        library.addBook(book);

        library.borrowBook("M001", "B001");

        assertEquals(1, member.totalBorrowedBooks());
    }

    @Test
    void shouldReturnAllBookTitles() {
        Library library = new Library();

        library.addBook(
                new Book("B001", "Java Basics", "John Smith")
        );

        library.addBook(
                new Book("B002", "Clean Code", "Robert Martin")
        );

        List<String> titles = library.allBookTitles();

        assertEquals(2, titles.size());
        assertTrue(titles.contains("Java Basics"));
        assertTrue(titles.contains("Clean Code"));
    }

    @Test
    void shouldReturnTotalBooks() {
        Library library = new Library();

        library.addBook(
                new Book("B001", "Java Basics", "John Smith")
        );

        library.addBook(
                new Book("B002", "Clean Code", "Robert Martin")
        );

        assertEquals(2, library.totalBooks());
    }

    @Test
    void shouldReturnTotalMembers() {
        Library library = new Library();

        library.addMember(
                new LibraryMember("M001", "Ceby")
        );

        library.addMember(
                new LibraryMember("M002", "Alice")
        );

        assertEquals(2, library.totalMembers());
    }
}