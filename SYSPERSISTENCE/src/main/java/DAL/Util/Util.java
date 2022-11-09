package DAL.Util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

//Singleton Lazy
public class Util {

	private static EntityManagerFactory instancy;
	private static final String PERSISTENCE_UNIT = "SYSJPA";
	
	static {
		
		init();
	}
	
	private static void init() {
		
		try {
			
			if(instancy == null) {
				
				instancy = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT);
				System.out.println("\n\nConectado\n\n");
			}
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
	
	public static EntityManager getConnection() {
		
		return instancy.createEntityManager();
	}
}
