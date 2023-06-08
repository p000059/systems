package DAL.DAO;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import DAL.Util.Util;
import DAL.Interface.EntityBase;

public class DAOGeneric<T extends EntityBase> {
	
	public T create(T object) {
		
		EntityManager entityManager = Util.getConnection();
		
		try {
			
			entityManager.getTransaction().begin();
			
			if(object.getId() == null) {
				
				entityManager.persist(object);
				
			} else if(!entityManager.contains(object)) {
				
//				if(entityManager.find(object.g, (object.getId()) == null)) {
//					
//					object = null;
//				}
				
				object = entityManager.merge(object);
			}
			
			entityManager.getTransaction().commit();
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
		} finally {
			
			Util.getConnection().close();
		}
		
		return object;
	}
	
	public T findById(Class<T> object, int id) {

		T outPutObject = null;
		
		try {

			outPutObject = Util.getConnection().find(object, id);
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
		} finally {
			
			Util.getConnection().close();
		}
		
		return outPutObject;
	}
	
	public void delete(Class<T> object, Long id) {
		
		EntityManager entityManager = Util.getConnection();
		
		T outPutObject = entityManager.find(object, id);
		
		try {
			
			entityManager.getTransaction().begin();
			entityManager.remove(outPutObject);
			entityManager.getTransaction().commit();
			
		} catch (Exception e) {
			
			entityManager.getTransaction().rollback();
			e.printStackTrace();
			
		} finally {
			
			Util.getConnection().close();
			
		}		
	}
}
