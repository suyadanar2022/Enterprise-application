package edu.mum.cs544;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.util.List;

@Service
public class BookServiceProxy implements BookService{

    @Autowired
    private RestTemplate restTemplate;

    private final String booksUrl = "http://localhost:8080/v1/books/";
    private final String bookUrl = "http://localhost:8080/v1/books/{id}";

    @Override
    public List<Book> getAll() {
        ResponseEntity<List<Book>> response =
                restTemplate.exchange(booksUrl, HttpMethod.GET, null,
                        new ParameterizedTypeReference<List<Book>>() {});
        return response.getBody();
    }

    @Override
    public Book get(Integer id) {
        return restTemplate.getForObject(bookUrl, Book.class, id);
    }

    @Override
    public void add(Book book) {
        Book response =  restTemplate.postForObject(booksUrl, book, Book.class);
        System.out.println(response.toString());
    }

    @Override
    public void update(Book book) {
        restTemplate.put(bookUrl, book, book.getId());
    }

    @Override
    public void delete(Integer id) {
        restTemplate.delete(bookUrl, id);
    }
}
