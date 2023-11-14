package edu.mum.cs544.bookApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@RestController
@RequestMapping("/v1/books")
public class BookRestController {

    @Autowired
    private BookService bookService;

    @GetMapping
    public List<Book> getAll() {
        return bookService.getAll();
    }

    @GetMapping("/{id}")
    public Book get(@PathVariable int id) {
        return bookService.findById(id);
    }

    @PostMapping
    public RedirectView add(@RequestBody Book book) {
        bookService.addBook(book);
        return new RedirectView("/v1/books");
    }

    @PutMapping("/{id}")
    public void update(@PathVariable int id, @RequestBody Book book) {
        if (id != book.getId()) { throw new IllegalArgumentException(); }
        bookService.updateBook(book);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable int id) {
        bookService.deleteBook(id);
    }
}
