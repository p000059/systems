package Services;

import Model.Class.Email;
import Model.Class.Person;
import Model.Class.PersonEmail;
import Model.DAO.DAOPersonEmail;
import Model.DAO.DAOemail;
import Model.DAO.DAOperson;

public class Operations {

	public void savePerson(Person sourcePerson, Email sourceEmail) {
		
		PersonEmail personEmail = null;
		
		int idPerson = 0;
		int idEmail = 0;
		
		new DAOperson().create(sourcePerson);
		idPerson = new DAOperson().findMaxId();
		
		new DAOemail().create(sourceEmail);
		idEmail = new DAOemail().findMaxId();
		
		personEmail = new PersonEmail(idPerson, idEmail);
		new DAOPersonEmail().create(personEmail);		
	}
}
