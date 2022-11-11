package Persistence.AppPersistence;

import java.sql.SQLException;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Persistence.Util.HibernateUtil;

public class Relationship {

	public static void main(String[] args) throws SQLException {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dbcodes");
		entityManagerFactory.close();
	}
}
