package com.library;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    @Test
    void shouldCreateValidBook() {
        Book book = new Book("B001", "Java Basics", "John Smith");

        assertEquals("B001", book.isbn());
        assertEquals("Java Basics", book.title());
        assertEquals("John Smith", book.author());
    }

    @Test
    void shouldThrowExceptionWhenIsbnIsBlank() {
        assertThrows(
                IllegalArgumentException.class,
                () -> new Book("", "Java Basics", "John Smith")
        );
    }

    @Test
    void shouldThrowExceptionWhenTitleIsBlank() {
        assertThrows(
                IllegalArgumentException.class,
                () -> new Book("B001", "", "John Smith")
        );
    }

    @Test
    void shouldThrowExceptionWhenAuthorIsBlank() {
        assertThrows(
                IllegalArgumentException.class,
                () -> new Book("B001", "Java Basics", "")
        );
    }

    @Test
    void shouldContainValuesInToString() {
        Book book = new Book("B001", "Java Basics", "John Smith");

        String result = book.toString();

        assertTrue(result.contains("B001"));
        assertTrue(result.contains("Java Basics"));
        assertTrue(result.contains("John Smith"));
    }
}