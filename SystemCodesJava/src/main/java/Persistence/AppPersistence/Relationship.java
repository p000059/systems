package Persistence.AppPersistence;

import java.sql.SQLException;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Persistence.Util.JPAutil;

public class Relationship {

	public static void main(String[] args) throws SQLException {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dbcodes");
		entityManagerFactory.close();
	}
}
