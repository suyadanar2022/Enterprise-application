package edu.mum.cs544;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.List;
import java.util.stream.Collectors;


public class App {
    private static EntityManagerFactory emf;

    public static void main(String[] args) {
        emf = Persistence.createEntityManagerFactory("cs544");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        TypedQuery<Students> query = em.createQuery("from Students", Students.class);
        List<Students> studentList = query.getResultList();
        studentList.stream()
                .forEach(s -> System.out.println(s.getName()));
        em.getTransaction().commit();
        em.close();

        em = emf.createEntityManager();
        em.getTransaction().begin();
        Students student = new Students(5, "rabin", "rabin@gmail.com", "happy");
        em.persist(student);
        em.getTransaction().commit();
        em.close();

        em = emf.createEntityManager();
        em.getTransaction().begin();
        TypedQuery<Students> query2 = em.createQuery("from Students", Students.class);
        List<Students> studentList2 = query2.getResultList();
        studentList2.stream()
                .forEach(s -> System.out.println(s.getName()));
        em.getTransaction().commit();
        em.close();
    }
}
