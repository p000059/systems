import org.junit.jupiter.api.Test;
import Persistence.Util.SingleConnection;

public class TestSingleConnection {

	@Test
	public void testSingleConnection() {
		
		SingleConnection.openConnection();
	}
}
