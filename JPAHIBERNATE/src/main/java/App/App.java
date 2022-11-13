package App;

import javax.persistence.EntityManager;

import Util.JPAUtil;

public class App {

	public static void main(String[] args) {
		
		try {
			
			EntityManager entityManager = JPAUtil.openConnection();
			System.out.println("\n\nSuccessfuly Connection -> " + entityManager.toString() + "\n\n");
			
		} catch (Exception e) {

			System.out.println("\n\nError: \n\n" + e.getMessage());
			
		} finally {
			
			JPAUtil.closeConnection();			
		}
	}
}
