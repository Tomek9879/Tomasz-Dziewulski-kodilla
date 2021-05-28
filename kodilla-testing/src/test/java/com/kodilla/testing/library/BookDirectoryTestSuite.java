package com.kodilla.testing.library;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class BookDirectoryTestSuite {

    @Mock
    private LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);

    @Test
    void testListBooksWithConditionsReturnList() {

        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        List<Book> resultListOfBooks = new ArrayList<>();
        Book book1 = new Book("Secrets of Almo", "John Smith", 2008);
        Book book2 = new Book("Secretaries and Directors", "Dilbert Michigan", 2012);
        Book book3 = new Book("Secret life of programers", "Stave Wolkowitz", 2016);
        Book book4 = new Book("Secret of Java", "Ian Tenewitch", 2010);

        resultListOfBooks.add(book1);
        resultListOfBooks.add(book2);
        resultListOfBooks.add(book3);
        resultListOfBooks.add(book4);

        when(libraryDatabaseMock.listBookWithCondition("Secret")).thenReturn(resultListOfBooks);
        List<Book> theListOfBooks = bookLibrary.listBookWithCondition("Secret");
        assertEquals(4, theListOfBooks.size());


    }

    private List<Book> generateListOfNBooks(int booksQuantity) {
        List<Book> resultList = new ArrayList<>();
        for (int n = 1; n <= booksQuantity; n++) {
            Book theBook = new Book("Title" + n, "Author" + n, 1970 + n);
            resultList.add(theBook);
        }
        return resultList;
    }

    @Test
    void testListBookWithConditionMoreThan20() {
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);

        List<Book> resultListOf0Books = new ArrayList<Book>();
        List<Book> resultListOf15Books = generateListOfNBooks(15);
        List<Book> resultListOf40Books = generateListOfNBooks(40);

        when(libraryDatabaseMock.listBookWithCondition(anyString())).thenReturn(resultListOf15Books);
        when(libraryDatabaseMock.listBookWithCondition("ZeroBooks")).thenReturn(resultListOf0Books);
        when(libraryDatabaseMock.listBookWithCondition("FortyBooks")).thenReturn(resultListOf40Books);

        List<Book> theListOfBooks0 = bookLibrary.listBookWithCondition("ZeroBooks");
        List<Book> theListOfBooks15 = bookLibrary.listBookWithCondition("Any title");
        List<Book> theListOfBooks40 = bookLibrary.listBookWithCondition("FortyBooks");

        assertEquals(0, theListOfBooks0.size());
        assertEquals(15, theListOfBooks15.size());
        assertEquals(0, theListOfBooks40.size());

    }

    @Test
    void testListBooksWithConditionFragmentShorterThan3() {
        LibraryDatabase libraryDatabaseMock = mock(LibraryDatabase.class);
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);

        List<Book> theListOfBooks10 = bookLibrary.listBookWithCondition("An");

        assertEquals(0, theListOfBooks10.size());
        verify(libraryDatabaseMock, times(0)).listBookWithCondition(anyString());

    }

    @Test
    void testListBooksInHandsOf0Books() {
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        LibraryUser libraryUser = new LibraryUser("Piotr", "Zablocki", 444);


        List<Book> theListOfBooks0 = null;
        when(libraryDatabaseMock.listBooksInHandsOf(libraryUser)).thenReturn(theListOfBooks0);
        List<Book> bookList = bookLibrary.listBooksInHandsOf(libraryUser);
        assertEquals(null, bookList);


    }

    @Test
    void testListBooksInHandsOfBooks1() {
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        LibraryUser libraryUser = new LibraryUser("Piotr", "Zana", 57);

        Book book = new Book("Samochody xx wieku", "Marek Nieznany", 2020);
        List<Book> bookList = new ArrayList<>();
        bookList.add(book);
        when(libraryDatabaseMock.listBooksInHandsOf(libraryUser)).thenReturn(bookList);

        assertEquals(bookList, bookLibrary.listBooksInHandsOf(libraryUser));
    }

    @Test
    void testListBooksInHandsOfBook5() {
        BookLibrary bookLibrary = new BookLibrary(libraryDatabaseMock);
        LibraryUser libraryUser = new LibraryUser("Piotr", "Hofama", 65);

        Book book1 = new Book("Swiat w opalach", "Zosia malach", 2019);
        Book book2 = new Book("Zwierzeta", "Iza grubala", 2014);
        Book book3 = new Book("historia", "Ewa mina ", 2015);
        Book book4 = new Book("Komputery", "ela grubala", 2016);
        Book book5 = new Book("Samoloty", "Anna grubala", 2018);

        List<Book> bookList = new ArrayList<>();
        bookList.add(book1);
        bookList.add(book2);
        bookList.add(book3);
        bookList.add(book4);
        bookList.add(book5);

        when(libraryDatabaseMock.listBooksInHandsOf(libraryUser)).thenReturn(bookList);
        assertEquals(bookList, bookLibrary.listBooksInHandsOf(libraryUser));
    }
}
