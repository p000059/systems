import java.sql.Connection;

import org.junit.jupiter.api.Test;
import Persistence.Util.SingleConnection;

public class TestSingleConnection {

	@Test
	public void testSingleConnection() {
		
		Connection connection = null;
		
		try {
			
			connection = SingleConnection.openConnection();
			System.out.println(connection + " -> Conexão estabelecida!");
			
		} catch (Exception e) {

			System.out.println("\n\nErro:\n\n" + e.getMessage());
			
		} finally {
			
			SingleConnection.closeConnection(connection);
		}
	}
}
