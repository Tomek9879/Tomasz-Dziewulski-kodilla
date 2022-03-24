package com.kodilla.patterns2.book.clasifier.libraryb;

import java.util.Map;

public interface BookStatistic {

        int averagePublicationYear(Map<BookSignature, Bookss> books);
        int medianPublicationYear(Map<BookSignature, Bookss> books);

}
