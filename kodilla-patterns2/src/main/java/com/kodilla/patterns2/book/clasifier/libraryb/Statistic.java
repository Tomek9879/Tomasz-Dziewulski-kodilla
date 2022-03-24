package com.kodilla.patterns2.book.clasifier.libraryb;

import java.util.Arrays;
import java.util.Map;

public class Statistic implements BookStatistic{


        @Override
        public int averagePublicationYear(Map<BookSignature, Bookss> books) {
            if (books.size() == 0) return 0;
            int sum = 0;
            for (Map.Entry<BookSignature, Bookss> entry : books.entrySet()) {
                sum += entry.getValue().getYearOfPublication();
            }
            return sum / books.size();
        }

        @Override
        public int medianPublicationYear(Map<BookSignature, Bookss> books) {
            if (books.size() == 0) return 0;
            int[] years = new int[books.size()];
            int n = 0;
            for (Map.Entry<BookSignature, Bookss> entry : books.entrySet()) {
                years[n] = entry.getValue().getYearOfPublication();
                n++;
            }
            Arrays.sort(years);
            return years[years.length / 2];
        }

}
