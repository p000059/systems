import javax.persistence.EntityManager;

import org.junit.jupiter.api.Test;

import Util.HibernateUtil;

public class ConnectionTest {

	@Test
	public void TestConnection() {
		
		EntityManager entityManager = HibernateUtil.getEntityManager();
		entityManager.close();
	}
}
