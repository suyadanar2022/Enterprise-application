package cs544;

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
		// Create new instance of Employee




		Patient patient = new Patient("Kabin", "Rambazar", "1198", "Pokhara");
		Doctor doctor = new Doctor("Eye doctor", "Ramesh", "Yadav");
		em.persist(patient);
		em.persist(doctor);
		em.getTransaction().commit();
		em.close();

		em = emf.createEntityManager();
		Appointment appointment = new Appointment("12/06/08");
		Payment payment = new Payment("12/04/07", 1000);
		em.persist(appointment);


        em.getTransaction().commit();
        em.close();
	}
}
