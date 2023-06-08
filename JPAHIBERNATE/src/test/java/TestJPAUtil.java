import javax.persistence.EntityManager;

import org.junit.jupiter.api.Test;

import Util.JPAUtil;

public class TestJPAUtil {

	@Test
	public void testConnection() {
		
		EntityManager entityManager = null;
		
		try {
			
			entityManager = JPAUtil.openConnection();
			System.out.println("\n\nSuccessfuly Connection -> " + entityManager.toString() + "\n\n");
			
		} catch (Exception e) {
			
			System.out.print("\n\nError: \n\n" + e.getMessage());
			
		} finally {
			
			JPAUtil.closeConnection();
		}
	}
}
