package edu.mum.cs544;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class AppBook {

    private static EntityManagerFactory emf;
    public static void main(String[] args) throws Exception {

        emf = Persistence.createEntityManagerFactory("cs544");

        //Insert 3 book entries
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        Book book1 = new Book("Java", "2201020", "paul corozza", 30.0, new SimpleDateFormat("dd/MM/yyyy").parse("31/12/1998"));
        em.persist(book1);

        Book book2 = new Book("Javascript", "2201021", "Tina Xing", 50.0, new SimpleDateFormat("dd/MM/yyyy").parse("03/04/2001"));
        em.persist(book2);

        Book book3 = new Book("Big Data", "2201023", "Mrudula Mukadam", 50.0, new SimpleDateFormat("dd/MM/yyyy").parse("05/06/2009"));
        em.persist(book3);

        em.getTransaction().commit();
        em.close();


        //Retrieve all books
        em = emf.createEntityManager();
        em.getTransaction().begin();

        // retrieve all books after inserting
        TypedQuery<Book> query = em.createQuery("from Book", Book.class);
        List<Book> bookList = query.getResultList();
        for (Book book : bookList) {
            System.out.println("title= " + book.getTitle() + ", ISBN= "
                    + book.getISBN() + ", author= " + book.getAuthor()
                    + ", price= " + book.getPrice() + ", date= " + book.getPublish_date());
        }
        em.getTransaction().commit();
        em.close();


        //Update first Book
        em = emf.createEntityManager();
        em.getTransaction().begin();

        Book bookUpdated = bookList.get(0);
        bookUpdated.setTitle("MPP Java");
        bookUpdated.setPrice(75);
        em.merge(bookUpdated);

        em.getTransaction().commit();
        em.close();

        //Remove second Book Entry
        em = emf.createEntityManager();
        em.getTransaction().begin();

        Book bookToBeRemoved = bookList.get(1);
        em.remove(em.contains(bookToBeRemoved) ? bookToBeRemoved : em.merge(bookToBeRemoved));

        em.getTransaction().commit();
        em.close();


        em = emf.createEntityManager();
        em.getTransaction().begin();

        //retrieve all books after update and remove
        TypedQuery<Book> queryUpdated = em.createQuery("from Book", Book.class);
        List<Book> bookListUpdated = queryUpdated.getResultList();
        for (Book book : bookListUpdated) {
            System.out.println("title= " + book.getTitle() + ", ISBN= "
                    + book.getISBN() + ", author= " + book.getAuthor()
                    + ", price= " + book.getPrice() + ", date= " + book.getPublish_date());
        }
        em.getTransaction().commit();
        em.close();

    }
}
