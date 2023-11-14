package edu.mum.cs544;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class Client implements CommandLineRunner {

    @Autowired
    private BookService bookService;

    @Override
    public void run(String... args) throws Exception {
        bookService.getAll().stream()
                .forEach(book -> System.out.println(book));
        Book book1 = bookService.get(1);
        System.out.println(book1.toString());
        bookService.add(new Book(4, "Friends", "213123", "Kabin", 1234.55));
        Book book = bookService.get(1);
        book.setAuthor("Harbindar");
        System.out.println(book.toString());
        bookService.update(book);
        bookService.delete(2);
        bookService.getAll().stream()
                .forEach(b -> System.out.println(b));


    }
}
