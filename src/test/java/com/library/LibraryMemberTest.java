package com.library;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LibraryMemberTest {

    @Test
    void shouldCreateValidMember() {
        LibraryMember member =
                new LibraryMember("M001", "Ceby");

        assertEquals("M001", member.memberId());
        assertEquals("Ceby", member.name());
    }

    @Test
    void shouldThrowExceptionWhenMemberIdIsBlank() {
        assertThrows(
                IllegalArgumentException.class,
                () -> new LibraryMember("", "Ceby")
        );
    }

    @Test
    void shouldThrowExceptionWhenNameIsBlank() {
        assertThrows(
                IllegalArgumentException.class,
                () -> new LibraryMember("M001", "")
        );
    }

    @Test
    void shouldBorrowBook() {
        LibraryMember member =
                new LibraryMember("M001", "Ceby");

        Book book =
                new Book("B001", "Java Basics", "John Smith");

        member.borrowBook(book);

        assertEquals(1, member.totalBorrowedBooks());
    }

    @Test
    void shouldThrowExceptionWhenBorrowingNullBook() {
        LibraryMember member =
                new LibraryMember("M001", "Ceby");

        assertThrows(
                IllegalArgumentException.class,
                () -> member.borrowBook(null)
        );
    }

    @Test
    void shouldReturnTrueWhenMemberHasBook() {
        LibraryMember member =
                new LibraryMember("M001", "Ceby");

        Book book =
                new Book("B001", "Java Basics", "John Smith");

        member.borrowBook(book);

        assertTrue(member.hasBook("B001"));
    }

    @Test
    void shouldReturnFalseWhenMemberDoesNotHaveBook() {
        LibraryMember member =
                new LibraryMember("M001", "Ceby");

        assertFalse(member.hasBook("B001"));
    }

    @Test
    void shouldContainValuesInToString() {
        LibraryMember member =
                new LibraryMember("M001", "Ceby");

        String result = member.toString();

        assertTrue(result.contains("M001"));
        assertTrue(result.contains("Ceby"));
    }
}