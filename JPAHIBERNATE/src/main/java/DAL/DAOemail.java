package DAL;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import Model.Email;
import Util.JPAUtil;

public class DAOemail {

	EntityManager entityManager;
	
	public Email findById(Long id) {
		
		Email email = new Email();
		
		try {
			
			entityManager = JPAUtil.openConnection();
			email = entityManager.find(Email.class, id);
			
		} catch (Exception e) {

			e.printStackTrace();
			
		} finally {
			
			entityManager.close();
		}
		
		return email;
	}
}
