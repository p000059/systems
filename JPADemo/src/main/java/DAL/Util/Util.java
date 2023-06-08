package DAL.Util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

//singleton design pattern
public class Util {

	private static EntityManagerFactory factory = null;
	private static final String PERSISTENCE_UNIT_NAME = "JPADemo";	
	
	static {
		
		init();
	}
	
	public static void init() {
		
		try {
			
			if(factory == null) {
				
				factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
				System.out.print("\n\nSuccessfully Connected / Factory Value ->  " + factory + "\n\n");
			}
			
			
		} catch (Exception e) {

			e.printStackTrace();
		}
	}

	// This Method Is Used To Retrieve The 'HibernateUtil' Object
	public static EntityManager getEntityManager() {
		
		return factory.createEntityManager();
	}
}
