package Persistence.Services;

import Persistence.Model.Personn;
import Persistence.Model.Emaill;
import Persistence.Model.PersonEmail;
import Persistence.DAO.DAOpersonn;
import Persistence.DAO.DAOemail;
import Persistence.DAO.DAOPersonEmail;

public class Operations {

	public void savePerson(Personn sourcePerson, Emaill sourceEmail) {
		
		PersonEmail personEmail = null;
		
		int idPerson = 0;
		int idEmail = 0;
		
		new DAOpersonn().create(sourcePerson);
		idPerson = new DAOpersonn().findMaxId();
		
		new DAOemail().create(sourceEmail);
		idEmail = new DAOemail().findMaxId();
		
		personEmail = new PersonEmail(idPerson, idEmail);
		new DAOPersonEmail().create(personEmail);		
	}
}
