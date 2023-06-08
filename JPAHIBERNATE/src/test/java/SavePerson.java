import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;
import org.junit.jupiter.api.Test;
import DAL.DAOgeneric;
import DAL.DAOperson;
import Model.Class.Email;
import Model.Class.Person;
import Model.Class.PersonName;
import Model.Class.Phone;

public class SavePerson {

	@Test
	public void save() {
		
		Person objPerson = new Person();
		PersonName objPersonName = new PersonName();
		Email objEmail = new Email();
		Phone objPhone = new Phone();
		List<Email> lstEmail = new ArrayList<>();
		List<Phone> lstPhone = new ArrayList<>();
		DAOgeneric<Person> daoPerson = new DAOgeneric<>();
		
		try {
			
			objEmail = Email
					.builder()
					.email("Mauricio.guima@gmail.com")
					.build();
			lstEmail.add(objEmail);
			
			objPhone = Phone
					.builder()
					.typePhone("Cel")
					.numberPhone("61999988533")
					.build();
			lstPhone.add(objPhone);
			
			objPersonName = PersonName
					.builder()
					.firstName("Mauguiba")
					.lastName("Guimaraes")
					.build();
			
			objPerson = Person
					.builder()
					.personName(objPersonName)
					.email(lstEmail)
					.Phone(lstPhone)
					.build();
			
			daoPerson.create(objPerson);
			
		} catch (Exception e) {
			
			System.out.println("\n\nError: \n\n" + e.getMessage());
		}
	}
}
