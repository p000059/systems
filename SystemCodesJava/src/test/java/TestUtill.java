import java.sql.Connection;

import org.junit.jupiter.api.Test;

import Persistence.Util.Utill;

public class TestUtill {

	@Test
	public void testUtil() throws Exception {
		
		Connection connection = null;
		
		try {
			
			connection = Utill.openConnection();
			System.out.println("Successfuly Connection -> " + connection.toString());
			
		} catch (Exception e) {
			
			System.out.println("\n\nErro: \n\n" + e.getMessage() + "\n\n " + connection);
			
		} finally {
			
			Utill.closeConnection();
		}
	}
}
