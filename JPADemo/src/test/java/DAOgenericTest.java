import org.junit.Test;

import DAL.Class.Person;
import DAL.DAO.DAOgeneric;

public class DAOgenericTest {

	@Test
	public void testCreate() {
		
		DAOgeneric<Person> daOgeneric = new DAOgeneric<Person>();
		
		Person objPerson = Person.builder()
		.name("Lucas Sousa")
		.status(true)
		.build(); 
		
		daOgeneric.create(objPerson);
	}
}
