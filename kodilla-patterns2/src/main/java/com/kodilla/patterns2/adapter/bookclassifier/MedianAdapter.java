package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.book.clasifier.librarya.Book;
import com.kodilla.patterns2.book.clasifier.librarya.Classifier;
import com.kodilla.patterns2.book.clasifier.libraryb.BookSignature;
import com.kodilla.patterns2.book.clasifier.libraryb.Bookss;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MedianAdapter extends MedianAdaptee implements Classifier {
    @Override
    public int publicationYearMedian(Set<Book> bookSet) {


        Map<BookSignature,Bookss> books = new HashMap<BookSignature,Bookss>();


        for(Book booksSet: bookSet){
            Bookss book = new Bookss(booksSet.getAuthor(),booksSet.getTitle(),booksSet.getPublicationYear());
            BookSignature signature = new BookSignature(booksSet.getSignature());

            books.put(signature,book);
        }

        return medianPublicationYear(books);
    }
}
