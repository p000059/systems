import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import org.junit.jupiter.api.Test;

public class TestHibernateUtil {

	@Test
	public void testConnectionUtil() {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dbcodes");
		entityManagerFactory.close();
		
//		EntityManager entityManager = null;
//		
//		try {
//			
//			entityManager = HibernateUtil.getEntityManager();
//			
//		} catch (Exception e) {
//			
//			e.printStackTrace();
//			
//		} finally {
//			
//			entityManager.close();
//		}
	}
}
