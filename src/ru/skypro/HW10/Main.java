package ru.skypro.HW10;

public class Main {

    public static void main(String[] args) {
            // Книга "Печаль"
            Book Pechal = new Book("Pechal", 2017, new Author("Azamat"));
            Book Radost = new Book("Radost", 2020, new Author("Azamat"));
            System.out.println("Книга " + Radost.getBookName() + ", год выпуска: " + Radost.getYearBook() + ", автор книги " + Radost.getAuthor());
            System.out.println("Книга " + Pechal.getBookName() + ", год выпуска: " + Pechal.getYearBook() + ", автор книги " + Pechal.getAuthor());
            Radost.setYearBook(2016);
            System.out.println("Книга " + Radost.getBookName() + ", год выпуска: " + Radost.getYearBook() + ", автор книги " + Radost.getAuthor());
    }
}
