package com.kodilla.patterns.prototype.library;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class LibraryTestSuite {

    @Test
    void testGetBooks() {
        Book book0 = new Book("Jan i Ola", "Pawel Londynski", LocalDate.of(14, 1, 28));
        Book book1 = new Book("Samochody", "Alan Jakis", LocalDate.of(20, 9, 3));
        Book book2 = new Book("Nowoczesne Budownictwo", "Ewa Majewska", LocalDate.of(17, 7, 15));
        Book book3 = new Book("Wojskowość", "Patryk Nowakowski", LocalDate.of(17, 4, 21));

        Library library = new Library("Biblioteka");
        library.books.add(book0);
        library.books.add(book1);
        library.books.add(book2);

        Library cloneLibrary = null;
        try {
            cloneLibrary = library.shallowCopy();
            cloneLibrary.setName("Projekt number 2");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        Library deepLibraryClone = null;
        try {
            deepLibraryClone = library.deepCopy();
            deepLibraryClone.setName("Project number 3");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        cloneLibrary.books.add(book3);
        deepLibraryClone.books.remove(book0);

        assertEquals(2, deepLibraryClone.getBooks().size());
        assertNotEquals(deepLibraryClone.getBooks(), library.getBooks());

        assertEquals(4, cloneLibrary.getBooks().size());
        assertEquals(library.getBooks(), cloneLibrary.getBooks());
    }
}
