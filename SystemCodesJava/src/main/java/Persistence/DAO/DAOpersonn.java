package Persistence.DAO;

import java.util.ArrayList;
import java.util.List;
import Persistence.Interface.IDAO;
import Persistence.Model.Personn;
import Persistence.Util.Utill;

public class DAOpersonn extends Utill implements IDAO<Personn> {

	@Override
	public void create(Personn object) {

		String sql = "INSERT INTO person (name,status) VALUES(?,?)";

		try {

			Utill.open();
			pstm = connection.prepareStatement(sql);
			pstm.setString(1, object.getName());
			pstm.setBoolean(2, true);
			pstm.execute();

		} catch (Exception e) {

			e.printStackTrace();

		} finally {

			try {

				Utill.close();

			} catch (Exception ex) {

				ex.printStackTrace();
			}
		}

	}

	@Override
	public Personn read(int object) {

		String sql = "SELECT * FROM person WHERE id = ?";
		Personn outPutPerson = null;

		try {

			Utill.open();
			pstm = connection.prepareStatement(sql);
			pstm.setInt(1, object);
			resultSet = pstm.executeQuery();

			if (resultSet.next()) {

				outPutPerson = new Personn();
				outPutPerson.setId(resultSet.getInt("id"));
				outPutPerson.setName(resultSet.getString("name"));
				outPutPerson.setStatus(resultSet.getBoolean("status"));
			}

		} catch (Exception e) {

			e.printStackTrace();

		} finally {

			try {

				Utill.close();

			} catch (Exception ex) {

				ex.printStackTrace();
			}
		}

		return outPutPerson;
	}

	@Override
	public List<Personn> readAll() {

		Personn person = null;
		List<Personn> lstPerson = new ArrayList<>();

		String sql = "SELECT * FROM person";

		try {

			Utill.open();
			pstm = connection.prepareStatement(sql);
			resultSet = pstm.executeQuery();

			while (resultSet.next()) {

				person = new Personn();
				person.setId(resultSet.getInt("id"));
				person.setName(resultSet.getString("name"));
				person.setStatus(resultSet.getBoolean("true"));

				lstPerson.add(person);
			}

		} catch (Exception e) {

			e.printStackTrace();

		} finally {

			try {

				Utill.close();

			} catch (Exception e) {

				e.printStackTrace();
			}
		}

		return lstPerson;
	}

	@Override
	public void update(Personn object) {

		String sql = "UPDATE person SET name = ?, status = ? WHERE id = ?";

		try {

			Utill.open();
			pstm = connection.prepareStatement(sql);
			pstm.setString(1, object.getName());
			pstm.setBoolean(2, object.getStatus());
			pstm.setInt(3, object.getId());
			pstm.executeQuery();

		} catch (Exception e) {

			e.printStackTrace();

		} finally {

			try {

				Utill.close();

			} catch (Exception e) {

				e.printStackTrace();
			}
		}
	}

	@Override
	public void delete(Personn object) {

		String sql = "DELETE FROM person WHERE id = ?";

		try {

			Utill.open();
			pstm = connection.prepareStatement(sql);
			pstm.setInt(1, object.getId());
			pstm.executeQuery();

		} catch (Exception e) {

			e.printStackTrace();

		} finally {

			try {

				Utill.close();

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

			Utill.open();
			pstm = connection.prepareStatement(sql);
			resultSet = pstm.executeQuery();

			if (resultSet.next()) {

				id = resultSet.getInt(1);
			}

		} catch (Exception e) {

			e.printStackTrace();

		} finally {

			try {

				Utill.close();

			} catch (Exception e) {

				e.printStackTrace();
			}
		}

		return id;
	}
}
