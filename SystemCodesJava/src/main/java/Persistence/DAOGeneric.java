package Persistence;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.swing.JOptionPane;

public class DAOGeneric<T> {

	private EntityManager entityManager = HibernateUtil.getEntityManager();
	
	public void createGeneric(T entity) {

		EntityTransaction transaction = entityManager.getTransaction();
		
		try {
			transaction.begin();
			entityManager.persist(entity);
			transaction.commit();
		} catch (Exception e) {
			transaction.rollback();
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
		finally {
			entityManager.close();
		}
	}
	
	/* O métod abaixo, não recebe como parâmetro um id de um atributo de uma classe para pesquisa, mas recebe
	 * um objeto e deste tipo de objeto genérico, ele o procura pelo método find() da classe entityManager, passando
	 * um parâmetro por outro objeto instânciado da classe HibernateUtil.
	 */
	@SuppressWarnings("unchecked")
	public T getGeneric(T entity) {
		
		T objGeneric = null;
		
		try {
			Object id = HibernateUtil.getEntityManager();
			
			objGeneric = (T) entityManager.find(entity.getClass(), id);
			
			
		} catch (Exception e) {
			e.getMessage();
		}
		return objGeneric; 
	}
	
	public T getGenericIdClass(Integer id, Class<T> entity) {
		
		T objGeneric = null;
		
		try {
			objGeneric = (T) entityManager.find(entity, id);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
		finally {
			entityManager.close();
		}
		return objGeneric;
	}
	
	@SuppressWarnings("unchecked")
	public List<T> getAllGeneric(Class<T> entity) {

		EntityTransaction transaction = entityManager.getTransaction();
		List<T> lstGeneric = new ArrayList<>();
		
		try {
			
			transaction.begin();
			lstGeneric = (List<T>) entityManager.createQuery("from" + entity.getName()).getResultList();
			transaction.commit(); 
			
		} catch (Exception e) {
			transaction.rollback();
		}
		finally {
			entityManager.close();
		}
		return lstGeneric;
	}
	
	public T updateGeneric(T entity) {
		
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		T objGeneric = null;
		
		try {
			entityTransaction.begin();
			objGeneric = entityManager.merge(entity);
			entityTransaction.commit();
		} catch (Exception e) {
			entityTransaction.rollback();
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
		finally {
			entityManager.close();
		}
		
		return objGeneric;
	}
	
	public void deleteGeneric(T entity) {
		
		EntityManager entityManager = HibernateUtil.getEntityManager();
		Object id = HibernateUtil.getEntityManager();
		
		EntityTransaction transaction = entityManager.getTransaction();
		
		try {
			
			transaction.begin();
			entityManager.createNativeQuery("delete from " + entity.getClass().getSimpleName().toLowerCase() + "where id = " + id).executeUpdate();
			transaction.commit();
			
			
		} catch (Exception e) {
			transaction.rollback();
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
		finally {
			entityManager.close();
		}
		
	}
}
