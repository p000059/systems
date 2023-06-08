import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.jupiter.api.Test;

import Util.JPAUtil;

public class ConnectionTest {

	@Test
	public void TestConnection() {

		EntityManagerFactory entityManagerFactory = null;
		EntityManager entityManager = null;

		try {
			
			entityManagerFactory = Persistence.createEntityManagerFactory("dbcodes");
			entityManager = entityManagerFactory.createEntityManager();
			
			System.out.println(entityManager.isOpen() + " -> Successfully Connected!");

		} catch (Exception e) {

			System.out.println("\n\nErro: \n\n" + e.getMessage());

		} finally {

			entityManager.close();
			entityManagerFactory.close();
		}
	}
}
