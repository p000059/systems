import org.junit.jupiter.api.Test;

import Persistence.Util.HibernateUtil;

public class TestHibernateUtil {

	@Test
	public void testConnectionUtil() {
		
		HibernateUtil.getEntityManager();
	}
}
