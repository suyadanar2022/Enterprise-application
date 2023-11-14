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

        // Create new instance of Car and set values in it
        Owner owner1 = new Owner("Rabin","203");
        em.persist(owner1);
        Car car1 = new Car("BMW", "SDA231", 30221.00,owner1);
        // save the car
        em.persist(car1);
        
        Owner owner2 = new Owner("Duminda","202");
        em.persist(owner2);
        // Create new instance of Car and set values in it
        Car car2 = new Car("Mercedes", "HOO100", 4088.00,owner2);
        // save the car
        em.persist(car2);

        em.getTransaction().commit();
        em.close();

        em = emf.createEntityManager();
        em.getTransaction().begin();

        // retieve all cars
        TypedQuery<Car> query = em.createQuery("from Car", Car.class);
        List<Car> carList = query.getResultList();
        for (Car car : carList) {
            System.out.println("brand= " + car.getBrand() + ", year= "
                    + car.getYear() + ", price= " + car.getPrice());
        }
        em.getTransaction().commit();
        em.close();
	}
}
