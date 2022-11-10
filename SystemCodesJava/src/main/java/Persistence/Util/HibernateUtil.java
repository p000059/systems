package Persistence.Util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class HibernateUtil {
	
	public static EntityManagerFactory factory = null;
	private final static String PERSISTENCE_UNIT = "dbcodes";
	
	static {
		initRead();
	}
	
	private static void initRead() {
		
		try {
			
			if(factory == null) {
				
				factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT);
				System.out.println(factory + " -> Successfully Connected!");
			}
			
		} catch (Exception e) {
			
			e.getMessage();
		}
	}
	
	public static EntityManager getEntityManager() {
		
		return factory.createEntityManager();
	}
}
