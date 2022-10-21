package Model.DAO;

import java.util.ArrayList;
import java.util.List;
import Model.Class.Person;
import Model.Interface.IDAO;
import Model.Util.Util;

public class DAOperson extends Util implements IDAO<Person> {

	@Override
	public void create(Person object) {
		
		String sql = "INSERT INTO person (name,status) VALUES(?,?)";
		
		try {
			
			Util.open();
			pstm = connection.prepareStatement(sql);
			pstm.setString(1, object.getName());
			pstm.setBoolean(2, true);
			pstm.execute();
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
		} finally {
			
			try {
				
				Util.close();
				
			} catch (Exception ex) {
				
				ex.printStackTrace();
			}
		}		
	}

	@Override
	public Person read(int id) {

		String sql = "SELECT * FROM person WHERE id = ?";
		Person outPutPerson = null;

		try {

			Util.open();
			pstm = connection.prepareStatement(sql);
			pstm.setInt(1, id);
			resultSet = pstm.executeQuery();

			if (resultSet.next()) {

				outPutPerson = new Person();
				outPutPerson.setId(resultSet.getInt("id"));
				outPutPerson.setName(resultSet.getString("name"));
				outPutPerson.setStatus(resultSet.getBoolean("status"));
			}

		} catch (Exception e) {

			e.printStackTrace();

		} finally {

			try {

				Util.close();

			} catch (Exception ex) {

				ex.printStackTrace();
			}
		}

		return outPutPerson;
	}

	@Override
	public List<Person> readAll() {

		Person person = null;
		List<Person> lstPerson = new ArrayList<>();

		String sql = "SELECT * FROM person";

		try {

			Util.open();
			pstm = connection.prepareStatement(sql);
			resultSet = pstm.executeQuery();

			while (resultSet.next()) {

				person = new Person();
				person.setId(resultSet.getInt("id"));
				person.setName(resultSet.getString("name"));
				person.setStatus(resultSet.getBoolean("true"));

				lstPerson.add(person);
			}

		} catch (Exception e) {

			e.printStackTrace();

		} finally {

			try {

				Util.close();

			} catch (Exception e) {

				e.printStackTrace();
			}
		}

		return lstPerson;
	}

	@Override
	public void update(Person object) {

		String sql = "UPDATE person SET name = ?, status = ? WHERE id = ?";

		try {

			Util.open();
			pstm = connection.prepareStatement(sql);
			pstm.setString(1, object.getName());
			pstm.setBoolean(2, object.getStatus());
			pstm.setInt(3, object.getId());
			pstm.executeQuery();

		} catch (Exception e) {

			e.printStackTrace();

		} finally {

			try {

				Util.close();

			} catch (Exception e) {

				e.printStackTrace();
			}
		}
	}

	@Override
	public void delete(Person object) {

		String sql = "DELETE FROM person WHERE id = ?";

		try {

			Util.open();
			pstm = connection.prepareStatement(sql);
			pstm.setInt(1, object.getId());
			pstm.executeQuery();

		} catch (Exception e) {

			e.printStackTrace();

		} finally {

			try {

				Util.close();

			} catch (Exception ex) {

				ex.printStackTrace();
			}
		}
	}

	@Override
	public int findMaxId() {

		String sql = "SELECT MAX(id) FROM person";
		int id = 0;

		try {

			Util.open();
			pstm = connection.prepareStatement(sql);
			resultSet = pstm.executeQuery();

			if (resultSet.next()) {

				id = resultSet.getInt(1);
			}

		} catch (Exception e) {

			e.printStackTrace();

		} finally {

			try {

				Util.close();

			} catch (Exception e) {

				e.printStackTrace();
			}
		}

		return id;
	}

}
