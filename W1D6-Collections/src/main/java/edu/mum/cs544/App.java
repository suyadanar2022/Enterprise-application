package edu.mum.cs544;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class App {
	private static EntityManagerFactory emf;
	
	public static void main(String[] args) {
	emf = Persistence.createEntityManagerFactory("cs544");
		
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        
        Laptop laptop = new Laptop("Mac", "16 inches");
        Laptop laptop2 = new Laptop("Dell", "XPS");
        Laptop laptop3 = new Laptop("Lenovo", "X1 Carbon");
        
        Employee employee = new Employee("Rabin", "Manjula");
        employee.addLaptop(laptop);
        employee.addLaptop(laptop2);
        employee.addLaptop(laptop3);
        
        em.persist(employee);
      
              em.getTransaction().commit();
        em.close();
	}
}
