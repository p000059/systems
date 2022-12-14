package DAL;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import javax.persistence.EntityManager;
import Model.Interface.CRUD;
import Util.JPAUtil;

public class DAOgeneric<T> implements CRUD<T> {

	private EntityManager entityManager;

	@Override
	public T create(T object) {

		T outPutObject = null;

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

		return outPutObject;
	}

	@Override
	public List<T> read(Class<T> object) {

		List<T> outPutList = new ArrayList<>();

		try {

			entityManager = JPAUtil.openConnection();
			outPutList = entityManager.createQuery("SELECT FROM " + object.getSimpleName(), object).getResultList();

		} catch (Exception e) {

			e.printStackTrace();

		} finally {

			JPAUtil.closeConnection();
		}

		return outPutList;
	}

	@Override
	public T findById(Class<T> objectClass, Long objectID) {

		T outPutObject = null;

		try {

			entityManager = JPAUtil.openConnection();
			outPutObject = entityManager.find(objectClass, objectID);

		} catch (Exception e) {

			e.printStackTrace();

		} finally {

			JPAUtil.closeConnection();
		}

		return outPutObject;
	}

	public T findByName(Class<T> objectClass, String object) {

		T outPutObject = null;

		try {

			entityManager = JPAUtil.openConnection();

		} catch (Exception e) {

			entityManager.getTransaction().rollback();
			e.printStackTrace();

		} finally {

			JPAUtil.closeConnection();
		}

		return outPutObject;
	}

	@Override
	public void update(T object) {

		try {

			entityManager = JPAUtil.openConnection();
			entityManager.getTransaction().begin();
			entityManager.merge(object);
			entityManager.flush();
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

		Collection<String> cl = new ArrayList<>(); 
		
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

	@Override
	public void deleteById(Class<T> objectClass, Long id) {

		T objectSource = findById(objectClass, id);

		try {

			entityManager = JPAUtil.openConnection();
			entityManager.getTransaction().begin();
			entityManager.remove(objectSource);
			entityManager.getTransaction().commit();

		} catch (Exception e) {

			entityManager.getTransaction().rollback();
			e.printStackTrace();

		} finally {

			JPAUtil.closeConnection();
		}
	}
}
