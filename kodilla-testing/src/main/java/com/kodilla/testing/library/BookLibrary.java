package com.kodilla.testing.library;

import java.util.ArrayList;
import java.util.List;

public class BookLibrary {
    LibraryDatabase libraryDatabase;


    public BookLibrary(LibraryDatabase libraryDatabase) {
        this.libraryDatabase = libraryDatabase;
    }

    public List<Book> listBookWithCondition(String titleFragment){



        List<Book> bookList = new ArrayList<>();
        Book book = new Book("The book title","The Book Author",2000);

        if(titleFragment.length()<3)return bookList;
        List<Book> resultList = libraryDatabase.listBookWithCondition(titleFragment);
        if(resultList.size()>20)return bookList;
        bookList = resultList;
        return bookList;


    }
    public List<Book> listBooksInHandsOf(LibraryUser libraryUser){

        List<Book> resultsList = libraryDatabase.listBooksInHandsOf(libraryUser);
        return resultsList;
    }
}
