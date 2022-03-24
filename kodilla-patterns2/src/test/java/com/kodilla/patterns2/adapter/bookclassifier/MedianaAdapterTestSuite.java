package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.book.clasifier.librarya.Book;
import com.kodilla.patterns2.book.clasifier.libraryb.Bookss;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MedianaAdapterTestSuite {

    @Test
    void publicationYearMedianaTest(){

        Set<Book> Book = new HashSet<>();

        Book Piotruś_Pan = new Book("Jan Brzechwa","Piotruś Pan",1996,"1");
        Book Lalka = new Book("Bolesław Prus","Lalka",2000,"2");
        Book Teletubisie = new Book("Nieznany","Teletubisie",2010,"3");

        Book.add(Piotruś_Pan);
        Book.add(Lalka);
        Book.add(Teletubisie);

        MedianAdapter medianAdapter = new MedianAdapter();
        int result= medianAdapter.publicationYearMedian(Book);

        assertEquals(2000,result);
    }
}
