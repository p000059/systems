import javax.swing.JOptionPane;
import org.junit.jupiter.api.Test;

import DAL.DAOemail;
import DAL.DAOperson;
import Model.Class.Email;
import Model.Class.Person;

public class TestEmail {

	@Test
	public void findId() {
		
		Email email = new Email();
		DAOemail daOemail = new DAOemail();
		
		try {
			
			email = daOemail.findById(1L);
			JOptionPane.showMessageDialog(null, email.toString());			
			
		} catch (Exception e) {

			e.printStackTrace();
		}
		
	}	
}
