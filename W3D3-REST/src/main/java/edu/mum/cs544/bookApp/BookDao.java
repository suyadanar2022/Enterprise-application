package edu.mum.cs544.bookApp;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class BookDao implements IBookDao{

    @PersistenceContext
    private EntityManager em;

    @Override
    public List<Book> getAll() {
        TypedQuery<Book> bookTypedQuery = em.createQuery("from Book", Book.class);
        return bookTypedQuery.getResultList();
    }

    @Override
    public Book findById(Integer id) {
        return em.find(Book.class, id);
    }

    @Override
    public void addBook(Book book) {
        em.persist(book);
    }

    @Override
    public void updateBook(Book book) {
        em.merge(book);
    }

    @Override
    public void deleteBook(Integer id) {
        Book book = em.getReference(Book.class, id);
        em.remove(book);
    }
}
