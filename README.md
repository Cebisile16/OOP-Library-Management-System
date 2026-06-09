# OOP-Library-Management-System

A JAVA OOP PROJECT WITH THE LISTS AND HASHMAPS


Overview

Build a simple Library Management System.

The system consists of:

Book

LibraryMember

Library

Book


Represents a book in the library.

Fields

Field	Type

isbn	String

title	String

author	String

Constructor

Book(String isbn, String title, String author)


Rules

isbn cannot be null or blank

title cannot be null or blank

author cannot be null or blank

If validation fails:

throw new IllegalArgumentException();


Methods

Getters

String isbn()

String title()

String author()

toString()


Must contain:

isbn

title

author

LibraryMember


Represents a member of the library.

Fields

Field	Type

memberId	String

name	String

borrowedBooks	List<Book>

Constructor

LibraryMember(String memberId, String name)


Rules

memberId cannot be null or blank

name cannot be null or blank


Methods

Getters

String memberId()

String name()

borrowBook

void borrowBook(Book book)


Rules:

book cannot be null

Adds the book to the list.

totalBorrowedBooks

int totalBorrowedBooks()

Returns:

borrowedBooks.size()

hasBook

boolean hasBook(String isbn)

Returns true if member has borrowed the book.

toString()

Must contain:

memberId

name

total borrowed books

Library

This is where HashMaps come in.

Fields

Field	Type

members	HashMap<String, LibraryMember>

books	HashMap<String, Book>

Why HashMap?


The key will be:

memberId

or

isbn

and the value will be the object itself.

Example:

members.put("M001", member);

books.put("B001", book);

Constructor

Library()

Creates empty HashMaps.

Methods

addBook

void addBook(Book book)

Rules:

book cannot be null

Store it in:

books HashMap

using isbn as the key.

addMember

void addMember(LibraryMember member)

Rules:

member cannot be null

Store it in:

members HashMap

using memberId as key.

findBook

Book findBook(String isbn)

Returns:

books.get(isbn)

findMember

LibraryMember findMember(String memberId)

Returns:

members.get(memberId)

totalBooks

int totalBooks()

Returns:

books.size()

totalMembers

int totalMembers()

Returns:

members.size()

borrowBook

void borrowBook(String memberId, String isbn)

Steps:

Find the member in HashMap.

Find the book in HashMap.


Call:

member.borrowBook(book);

allBookTitles

List<String> allBookTitles()

Returns a list containing all book titles.



Project Structure


library-management/
│
├── pom.xml
│
└── src
    ├── main
    │   └── java
    │       └── com
    │           └── library
    │               ├── Book.java
    │               ├── LibraryMember.java
    │               └── Library.java
    │
    └── test
        └── java
            └── com
                └── library
                    ├── BookTest.java



OUTCOME OF THE PROJECT

WILL LEARN HASHMAP SKILLS SUCH AS:

HashMap<String, Book>
HashMap<String, LibraryMember>

put()
get()
containsKey()
size()
values()

                    ├── LibraryMemberTest.java
                    └── LibraryTest.java
