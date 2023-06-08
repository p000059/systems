import org.junit.jupiter.api.Test;
import DAL.DAOgeneric;
import Model.Class.Email;

public class SaveEmail {

	@Test
	public void save() {
		
		DAOgeneric<Email> daoEmail = new DAOgeneric<>();
		
		Email email = Email.builder()
				.email("mauguimba@gmail.com")
				.build();
		
		daoEmail.create(email);
		
	}
}
