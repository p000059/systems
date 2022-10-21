package Persistence.AppPersistence;

import Persistence.Model.*;
import Persistence.DAO.*;

public class AppPersistence {

	public static void main(String[] args) {
		
		DAOperson dAOperson = new DAOperson();
		Person personOne = new Person();
		Person personTwo = new Person();
		
		personOne.setName("Maria");
		personTwo.setName("Jose");

		try {
			
			dAOperson.createPerson(personOne);
			dAOperson.createPerson(personTwo);
			
		} catch (Exception e) {

			System.out.println(e.getMessage());
			
		}

	}

}
