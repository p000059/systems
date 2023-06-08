import org.junit.Test;
import DAL.Util.HibernateUtil;

public class ConnectionTest {

	@Test
	public void testConnection() {
		
		try {
			
			HibernateUtil.getSession();
			
		} catch (Exception e) {

			e.printStackTrace();
		}
		
	}
}
