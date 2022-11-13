import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;
import org.junit.jupiter.api.Test;
import DAL.DAOgeneric;
import DAL.DAOperson;
import Model.Email;
import Model.Person;
import Model.Phone;

public class TestPerson {

	@Test
	public void findId() {
		
		Person objPerson = new Person();
		DAOperson daOperson = new DAOperson();
		
		try {
			
			objPerson = daOperson.findbyId(1L);
			JOptionPane.showInternalMessageDialog(null, objPerson.toString());
			
		} catch (Exception e) {
			
			System.out.println("\n\nErro: " + e.getMessage());
		}
	}
	
	public void save() {
		
		Person objPerson = new Person();
		Email objEmail = new Email();
		Phone objPhone = new Phone();
		List<Email> lstEmail = new ArrayList<>();
		List<Phone> lstPhone = new ArrayList<>();
		DAOgeneric<Person> daoPerson = new DAOgeneric<>();
		DAOgeneric<Email> daoEmail = new DAOgeneric<>();
		DAOgeneric<Phone> daoPhone = new DAOgeneric<>();
		
		try {
			
			objEmail = Email
					.builder()
					.email("Mauricio.guima@gmail.com")
					.build();
			lstEmail.add(objEmail);
			
			objPhone = Phone
					.builder()
					.phone("99998-8533")
					.build();
			lstPhone.add(objPhone);
			
			objPerson = Person
					.builder()
					.name("Mauricio")
					.Phone(lstPhone)
					.email(lstEmail)
					.email(null)
					.build();
			
			daoPerson.create(objPerson);
			
		} catch (Exception e) {
			
			System.out.println("\n\nError: \n\n" + e.getMessage());
		}
	}
}
