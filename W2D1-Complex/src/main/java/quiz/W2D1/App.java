package quiz.W2D1;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class App {
	private static EntityManagerFactory emf;
	public static void main(String[] args) {
		emf = Persistence.createEntityManagerFactory("cs544");

		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		// Create new instance of Employee



        em.getTransaction().commit();
        em.close();
	}
}
