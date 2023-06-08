import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import org.junit.jupiter.api.Test;

import Persistence.Util.JPAutil;

public class TestHibernateUtil {

	@Test
	public void testConnectionUtil() {
		
//		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dbcodes");
//		EntityManager entityManager = entityManagerFactory.createEntityManager();
//		
//		entityManager.close();
//		entityManagerFactory.close();
		
		EntityManager entityManager = null;
		
		try {
			
			entityManager = JPAutil.openConnection();
			System.out.println("\n\nSuccessfully Connected -> " + entityManager.toString());
			
		} catch (Exception e) {
			
			System.out.println("\n\nError: \n\n" + e.getMessage() + "\n\n" + entityManager.toString());
			
		} finally {
			
			JPAutil.closeConnection();
		}
	}
}
