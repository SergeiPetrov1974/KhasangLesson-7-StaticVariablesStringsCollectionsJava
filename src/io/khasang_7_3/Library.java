package io.khasang_7_3;

import java.util.ArrayList;

public class Library {
    private Book book;
    private ArrayList<Book> catalog = new ArrayList<>();
    private int counter = 0;


    public ArrayList<Book> getCatalog() {
        return catalog;
    }

    public void addBook(Book book) {
        catalog.add(book);
        System.out.println("Книга №" + getCountBook() + " " + book.getBookInfo());
    }

    public void removeBook(int id) {
        catalog.remove(id);
    }

    public int getCountBook() {
        return catalog.size();

    }

    public String getBookInfoById(int id) {
        book = catalog.get(id);
        return book.getBookInfo();
    }

    public int searchBookByName(String text) {
        String nameBook;
        for (int i = 0; i < getCountBook(); i++) {
            book = catalog.get(i);
            nameBook = book.getName().toLowerCase();
            if (nameBook.contains(text.toLowerCase())) {
                System.out.println(book.getBookInfo());
                counter++;
            }
        }
        if (counter == 0) {
            counter = searchBookByWriter(text);
        }
        return counter;
    }

    public int searchBookByWriter(String text) {
        String nameWriter;
        for (int i = 0; i < getCountBook(); i++) {
            book = catalog.get(i);
            nameWriter = book.getAuthor().toLowerCase();
            if (nameWriter.contains(text.toLowerCase())) {
                System.out.println(book.getBookInfo());
                counter++;
            }
        }
        return counter;
    }
}
