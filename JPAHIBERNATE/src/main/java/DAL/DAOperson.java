package DAL;

import javax.persistence.EntityManager;
import javax.transaction.Transaction;

import Model.Class.Person;
import Util.JPAUtil;

public class DAOperson {
	
	EntityManager entityManager;
	Transaction transaction;

	public Person findbyId(Long id) {
		
		Person person = new Person();
		
		try {
			
			entityManager = JPAUtil.openConnection();
			person = entityManager.find(Person.class, id);
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
		} finally {
			
			entityManager.close();
		}
		
		return person;
	}
}
