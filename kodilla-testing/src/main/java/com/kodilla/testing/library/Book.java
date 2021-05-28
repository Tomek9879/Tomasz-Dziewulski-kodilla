package com.kodilla.testing.library;

import java.util.Objects;

public class Book {
    private String Title;
    private String author;
    private int publicationYear;

    public Book(String title, String author, int publicationYear) {
        Title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public String getTitle() {
        return Title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return publicationYear == book.publicationYear && Title.equals(book.Title) && author.equals(book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Title, author, publicationYear);
    }
}
