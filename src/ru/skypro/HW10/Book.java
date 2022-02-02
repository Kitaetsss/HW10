package ru.skypro.HW10;

public class Book {
    private final String BookName;
    private final Author Author;
    private int yearBook;

    public Book(String BookName, int yearBook, Author Author){
        this.BookName = BookName;
        this.yearBook = yearBook;
        this.Author = Author;
    }
    public String getBookName() {
        return BookName;
    }
    public int getYearBook() {
        return yearBook;
    }
    public void setYearBook(int yearBook) {
        this.yearBook = yearBook;
    }
    public String getAuthor() {
        return Author.getAuthorName();
    }
}
