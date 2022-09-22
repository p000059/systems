package Persistence;

import javax.swing.JOptionPane;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class AppPersistence {

	private static final String PERSISTENCE_UNIT_NAME = "dbPerson";
	private static EntityManagerFactory factory;

	public static void main(String[] args) {
		
		factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
		EntityManager entityManager = factory.createEntityManager();

		try {

			entityManager.getTransaction().begin();
			
			Person personOne = new Person(null, "Carlos Silva");
			Person personTwo = new Person(null, "Marcos Silva");
			Person personThree = new Person(null, "Julio Silva");
			
			entityManager.persist(personOne);
			entityManager.persist(personTwo);
			entityManager.persist(personThree);
			entityManager.getTransaction().commit();

			JOptionPane.showMessageDialog(null, "Gravado no Banco");

		} catch (Exception e) {

			JOptionPane.showMessageDialog(null, "Mensage: " + e.getMessage() + "\n" + e);
			System.out.print(e.getMessage());

		} finally {
			
			entityManager.close();
			factory.close();
		}

	}

}
