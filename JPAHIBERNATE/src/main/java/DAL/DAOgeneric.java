package DAL;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import com.mysql.cj.Session;

import Model.Interface.CRUD;
import Util.JPAUtil;

public class DAOgeneric<T> implements CRUD<T> {

	private EntityManager entityManager;

	@Override
	public void create(T object) {
		
		try {
			
			entityManager = JPAUtil.openConnection();
			entityManager.getTransaction().begin();
			entityManager.persist(object);
			entityManager.getTransaction().commit();
			
		} catch (Exception e) {
			
			entityManager.getTransaction().rollback();
			e.printStackTrace();
			
		} finally {
			
			JPAUtil.closeConnection();
		}
	}

	
	@Override
	public List<T> read(Class<T> object) {

		List<T> outPutList = new ArrayList<>();
		
		try {
			
			entityManager = JPAUtil.openConnection();
			outPutList = entityManager.createQuery("FROM " + object.getSimpleName(), object).getResultList();
			
		} catch (Exception e) {

			e.printStackTrace();
			
		} finally {
			
			JPAUtil.closeConnection();
		}
		
		return outPutList;
	}
	
	@Override
	public void update(T object) {

		try {
			
			entityManager = JPAUtil.openConnection();
			entityManager.getTransaction().begin();
			entityManager.merge(object);
			entityManager.getTransaction().commit();
			
		} catch (Exception e) {
			
			entityManager.getTransaction().rollback();
			e.printStackTrace();
			
		} finally {
			
			JPAUtil.closeConnection();
		}
	}
	
	@Override
	public void delete(T object) {

		try {
			
			entityManager = JPAUtil.openConnection();
			entityManager.getTransaction().begin();
			entityManager.remove(object);
			entityManager.getTransaction().commit();
			
		} catch (Exception e) {
			
			entityManager.getTransaction().rollback();
			e.printStackTrace();
			
		} finally {
			
			JPAUtil.closeConnection();
		}
	}

}
