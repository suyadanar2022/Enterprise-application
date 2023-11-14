package edu.mum.cs544;

import java.util.List;

public interface BookService {
    List<Book> getAll();
    Book get(Integer id);
    void add(Book book);
    void update(Book book);
    void delete(Integer id);
}
