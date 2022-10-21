package Model.DAO;

import Model.Util.Util;
import java.util.ArrayList;
import java.util.List;
import Model.Class.Email;
import Model.Class.Person;
import Model.Interface.IDAO;

public class DAOemail extends Util implements IDAO<Email> {

	@Override
	public void create(Email object) {

		String sql = "INSERT INTO email (email, status) VALUES (?,?)";

		try {

			Util.open();
			pstm = connection.prepareStatement(sql);
			pstm.setString(1, object.getEmail());
			pstm.setBoolean(2, object.getStatus());
			pstm.execute();

		} catch (Exception e) {

			e.printStackTrace();

		} finally {

			try {

			} catch (Exception ex) {

				ex.printStackTrace();
			}

		}
	}

	@Override
	public Email read(int object) {

		String sql = "SELECT * FROM email WHERE id = ?";
		Email email = null;

		try {

			Util.open();
			pstm = connection.prepareStatement(sql);
			pstm.setInt(1, object);
			resultSet = pstm.executeQuery();

			if (resultSet.next()) {

				email = new Email();
				email.setId(resultSet.getInt("id"));
				email.setEmail(resultSet.getString("email"));
				email.setStatus(resultSet.getBoolean("status"));

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

		return email;
	}

	@Override
	public List<Email> readAll() {

		List<Email> lstEmails = new ArrayList<>();
		Email email = null;
		String sql = "SELECT * FROM email";

		try {

			Util.open();
			pstm = connection.prepareStatement(sql);
			resultSet = pstm.executeQuery();

			while (resultSet.next()) {

				email = new Email();
				email.setEmail(resultSet.getString("email"));
				email.setStatus(resultSet.getBoolean("status"));
				lstEmails.add(email);

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

		return lstEmails;
	}

	@Override
	public void update(Email object) {

		String sql = "UPDATE email SET email = ?, status = ? WHERE id = ?";

		try {

			Util.open();
			pstm = connection.prepareStatement(sql);
			pstm.setString(1, object.getEmail());
			pstm.setBoolean(2, object.getStatus());
			pstm.setInt(3, object.getId());

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
	public void delete(Email object) {

		String sql = "DELETE FROM email WHERE id = ?";

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

		String sql = "SELECT MAX(id) FROM email";
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

			} catch (Exception ex) {

				ex.printStackTrace();
			}
		}

		return id;
	}

	public int findId(int id) {

		Email email = null;
		String sql = "SELECT * FROM person WHERE id = ?";

		try {

			Util.open();
			pstm = connection.prepareStatement(sql);
			pstm.setInt(1, id);
			resultSet = pstm.executeQuery();

			if (resultSet.next()) {

				email = new Email();
				email.setId(resultSet.getInt("id"));
				email.setEmail(resultSet.getString("email"));
				email.setStatus(resultSet.getBoolean("status"));
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

		return email.getId();
	}
}
