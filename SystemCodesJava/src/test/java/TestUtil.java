import java.sql.SQLException;

import org.junit.jupiter.api.Test;

import Persistence.Util.*;

public class TestUtil {

	@Test
	public void testUtil() throws SQLException {
		
		UtilConnection utilConnection = new UtilConnection();
		
		try {
			
			utilConnection.openConnnection();
			System.out.println("Conexão bem sucedida -> " + utilConnection.toString());
			
		} catch (Exception e) {
		
			System.out.println("\n\nErro: \n\n" + e.getMessage());
			
		} finally {
			
			utilConnection.closeConnection();
		}
	}
}
