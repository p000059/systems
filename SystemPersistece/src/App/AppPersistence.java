package App;

import Model.Class.Email;
import Model.Class.Person;
import Services.Operations;

public class AppPersistence {

	public static void main(String[] args) throws Exception {

		
		Person objPerson = null;
		Email objEmail = null;
		Operations operations = new Operations();
		
		objPerson = new Person("Taisa",true);
		objEmail = new Email("taisa.aspnet@gmail.com", true);
		
		operations.savePerson(objPerson, objEmail);

	}

}
