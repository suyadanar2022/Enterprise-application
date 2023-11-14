package edu.mum.cs544.bookApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class BookService {

    @Autowired
    private IBookDao iBookDao;

    public List<Book> getAll(){
        return iBookDao.getAll();
    }

    public Book findById(Integer id){
        return iBookDao.findById(id);
    }

    public void addBook(Book book){
        iBookDao.addBook(book);
    }

    public void updateBook(Book book){
        iBookDao.updateBook(book);
    }

    public void deleteBook(Integer id){
        iBookDao.deleteBook(id);
    }
}
