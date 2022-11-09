package DAL.Util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import org.hibernate.Session;

public class HibernateUtil {

	private static EntityManagerFactory factory;
	private static final String PERSISTENCE_UNIT_NAME = "JPADemo";

	public static Session getSession() {

		Session session = null;
		
		try {

			if (factory == null) {
				
				factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
				System.out.print("\n\nSuccessfully Connected / Factory Value ->  " + factory + "\n\n");
			}
			
			EntityManager hibernateUtil = factory.createEntityManager();
			session = hibernateUtil.unwrap(Session.class);
			
		} catch (Exception e) {

			e.printStackTrace();
		}
		
		return session;
	}

	public static Session beginTransaction() {
		
		Session hibernateSession = null;
		
		try {
			
			hibernateSession = getSession();
			hibernateSession.beginTransaction();
			
		} catch (Exception e) {

			e.printStackTrace();
		}
		
		return hibernateSession;
	}

	public static void commitTransaction(Session session) {
		
		session.getTransaction().commit();
	}

	public static void rollbackTransaction(Session session) {
		
		session.getTransaction().rollback();
	}

	public static void closeSession(Session session) {
		
		session.close();
	}
}
