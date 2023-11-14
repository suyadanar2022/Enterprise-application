package edu.mum.cs544.bookApp;

import java.util.List;

public interface IBookDao {

    List<Book> getAll();
    Book findById(Integer id);
    void addBook(Book book);
    void updateBook(Book book);
    void deleteBook(Integer id);
}
