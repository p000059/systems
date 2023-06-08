package DAL.DAO;

import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;

import DAL.Interface.CRUD;
import DAL.Util.HibernateUtil;

public class DAOgeneric<T> implements CRUD<T> {

	public void create(T sourceObject) {

		Session session = null;

		try {

			HibernateUtil.getSession();
			session = HibernateUtil.beginTransaction();
			session.persist(sourceObject);
			HibernateUtil.commitTransaction(session);

		} catch (Exception e) {

			HibernateUtil.rollbackTransaction(session);
			e.printStackTrace();

		} finally {

			HibernateUtil.closeSession(session);
		}
	}

	public T read(int id) {
		
		Session session = null;
		T objOutPut = null;
		
		try {
			
			HibernateUtil.getSession();
			session = HibernateUtil.beginTransaction();
			
			
		} catch (Exception e) {
			
			HibernateUtil.rollbackTransaction(session);
			e.printStackTrace();
			
		} finally {
			
			HibernateUtil.closeSession(session);
		}
		
		return objOutPut;
	}

	public List<T> readAll(T sourceObject) {
		
		Session session = null;
		List result = null;
		
		try {
			
			HibernateUtil.getSession();
			session = HibernateUtil.beginTransaction();
			result = session.createQuery("from" + sourceObject).list();
			
		} catch (Exception e) {

			HibernateUtil.rollbackTransaction(null);
		}
		
		return result;
	}

	public void update(T sourceObject) {
		// TODO Auto-generated method stub

	}

	public void delete(int id) {
		// TODO Auto-generated method stub

	}

	public List<T> readAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
