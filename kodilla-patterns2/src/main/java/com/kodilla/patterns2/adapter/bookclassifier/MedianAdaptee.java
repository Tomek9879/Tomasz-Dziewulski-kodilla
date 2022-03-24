package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.book.clasifier.libraryb.Bookss;
import com.kodilla.patterns2.book.clasifier.libraryb.BookSignature;
import com.kodilla.patterns2.book.clasifier.libraryb.BookStatistic;
import com.kodilla.patterns2.book.clasifier.libraryb.Statistic;

import java.util.Map;

public class MedianAdaptee implements BookStatistic {
    @Override
    public int averagePublicationYear(Map<BookSignature, Bookss> books) {
        Statistic statistic = new Statistic();
        return statistic.averagePublicationYear(books);
    }

    @Override
    public int medianPublicationYear(Map<BookSignature, Bookss> books) {
        Statistic statistic = new Statistic();
        return statistic.medianPublicationYear(books);

    }
}
