package Persistence.DAO;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import Persistence.Model.*;
import Persistence.Util.*;

public class DAOperson extends Util {

	public Person readPerson(int id) throws Exception {

		Person person = null;

		try {

			openConnnection();
			preparedStatement = connection.prepareStatement("SELECT * FROM person WHERE id = ?");
			resultSet = preparedStatement.executeQuery();

			if (resultSet.next()) {

				person = new Person();
				person.setId(resultSet.getInt("id"));
				person.setName(resultSet.getString("name"));

			}

		} catch (Exception e) {

			System.out.println(e.getMessage());

		} finally {

			closeConnection();
			preparedStatement.close();
		}

		return person;
	}

	public List<Person> readPersons() throws Exception {

		List<Person> lstPerson = new ArrayList<>();
		Person person = null;

		try {

			openConnnection();
			preparedStatement = connection.prepareStatement("SELECT * FROM person");
			resultSet = preparedStatement.executeQuery();

			while (resultSet.next()) {

				person = new Person();
				person.setId(resultSet.getInt("id"));
				person.setName(resultSet.getString("name"));
				lstPerson.add(person);
			}

		} catch (Exception e) {

			System.out.println(e.getMessage());

		} finally {

			preparedStatement.close();
			closeConnection();

		}

		return lstPerson;
	}

	public void createPerson(Person person) throws Exception {

		try {

			openConnnection();
			preparedStatement = connection.prepareStatement("INSERT INTO person (name) VALUES(?)");
			preparedStatement.setString(1, person.getName());
			
			preparedStatement.execute();

		} catch (SQLException e) {

			System.out.println(e.getMessage());

		} finally {

			preparedStatement.close();
			closeConnection();
		}
	}

	public void updatePerson(Person person) throws Exception {

		try {

			openConnnection();
			preparedStatement = connection.prepareStatement("UPDATE person name = ? , email = ? WHERE id = ?");
			preparedStatement.setString(1, person.getName());
			preparedStatement.setInt(2, person.getId());
			preparedStatement.execute();

		} catch (Exception e) {

			System.out.println(e.getMessage());

		} finally {

			preparedStatement.close();
			closeConnection();
		}
	}

	public void deletePerson(Person person) throws Exception {

		try {

			openConnnection();
			preparedStatement = connection.prepareStatement("DELETE FROM person WHERE id = ?");
			preparedStatement.setInt(1, person.getId());
			preparedStatement.execute();

		} catch (Exception e) {

			System.out.println(e.getMessage());

		} finally {

			preparedStatement.close();
			closeConnection();
		}

	}
}
