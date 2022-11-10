import org.junit.jupiter.api.Test;

import Persistence.Util.ConnectionFactory;

public class TestConnectionFactory {

	@Test
	public void testConnectionConnectionFactory() {

		ConnectionFactory.openConnection();
	}
}
