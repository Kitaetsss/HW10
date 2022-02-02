package ru.skypro.HW10;

public class Main {

    public static void main(String[] args) {
            // Книга "Печаль"
            Book Pechal = new Book("Pechal", 2017, new Author("Azamat"));
            Book Radost = new Book("Radost", 2020, new Author("Azamat"));
            System.out.println("Книга " + Radost.getBookName() + ", год выпуска: " + Radost.getYearBook() + ", автор книги " + Radost.toString());
            System.out.println("Книга " + Pechal.getBookName() + ", год выпуска: " + Pechal.getYearBook() + ", автор книги " + Pechal.toString());
            Radost.setYearBook(2016);
            System.out.println("Книга " + Radost.getBookName() + ", год выпуска: " + Radost.getYearBook() + ", автор книги " + Radost.toString());
            System.out.println(Pechal);
            System.out.println(Radost);
            Author author1 = new Author("Azamat");
            Author author2 = new Author("Azamat");
            System.out.println(author1.equals(author2));
            System.out.println(author1 == author2);
            Book book1 = new Book("Radost", 2016,author1);
            Book book2 = new Book("Pechal",2017,author2);
            System.out.println(book1.equals(book2));
    }
}
