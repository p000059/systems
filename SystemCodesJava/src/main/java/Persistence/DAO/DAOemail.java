package Persistence.DAO;

import Persistence.Model.*;
import Persistence.Util.Utill;
import Persistence.Interface.IDAO;
import java.util.ArrayList;
import java.util.List;

public class DAOemail extends Utill implements IDAO<Emaill> {

	@Override
	public void create(Emaill object) {

		String sql = "INSERT INTO email (email, status) VALUES (?,?)";

		try {

			Utill.openConnection();
			pstm = connection.prepareStatement(sql);
			pstm.setString(1, object.getEmail());
			pstm.setBoolean(2, object.getStatus());
			pstm.execute();

		} catch (Exception e) {

			e.printStackTrace();

		
		} finally {

			try {
				
				Utill.closeConnection();
				
			} catch (Exception e) {
				
				e.printStackTrace();
			}
		}
	}

	@Override
	public Emaill read(int object) {

		String sql = "SELECT * FROM email WHERE id = ?";
		Emaill email = null;

		try {

			Utill.openConnection();
			pstm = connection.prepareStatement(sql);
			pstm.setInt(1, object);
			resultSet = pstm.executeQuery();

			if (resultSet.next()) {

				email = new Emaill();
				email.setId(resultSet.getInt("id"));
				email.setEmail(resultSet.getString("email"));
				email.setStatus(resultSet.getBoolean("status"));

			}

		} catch (Exception e) {

			e.printStackTrace();

		} finally {

			try {

				Utill.closeConnection();

			} catch (Exception ex) {

				ex.printStackTrace();
			}
		}

		return email;
	}

	@Override
	public List<Emaill> readAll() {

		List<Emaill> lstEmails = new ArrayList<>();
		Emaill email = null;
		String sql = "SELECT * FROM email";

		try {

			Utill.openConnection();
			pstm = connection.prepareStatement(sql);
			resultSet = pstm.executeQuery();

			while (resultSet.next()) {

				email = new Emaill();
				email.setEmail(resultSet.getString("email"));
				email.setStatus(resultSet.getBoolean("status"));
				lstEmails.add(email);

			}

		} catch (Exception e) {

			e.printStackTrace();

		} finally {

			try {

				Utill.closeConnection();

			} catch (Exception ex) {

				ex.printStackTrace();
			}

		}

		return lstEmails;
	}

	@Override
	public void update(Emaill object) {

		String sql = "UPDATE email SET email = ?, status = ? WHERE id = ?";

		try {

			Utill.openConnection();
			pstm = connection.prepareStatement(sql);
			pstm.setString(1, object.getEmail());
			pstm.setBoolean(2, object.getStatus());
			pstm.setInt(3, object.getId());

		} catch (Exception e) {

			e.printStackTrace();

		} finally {

			try {

				Utill.closeConnection();

			} catch (Exception ex) {

				ex.printStackTrace();
			}
		}
	}

	@Override
	public void delete(Emaill object) {

		String sql = "DELETE FROM email WHERE id = ?";

		try {

			Utill.openConnection();
			pstm = connection.prepareStatement(sql);
			pstm.setInt(1, object.getId());
			pstm.executeQuery();

		} catch (Exception e) {

			e.printStackTrace();

		} finally {

			try {

				Utill.closeConnection();

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

			Utill.openConnection();
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

		Emaill email = null;
		String sql = "SELECT * FROM person WHERE id = ?";

		try {

			Utill.openConnection();
			pstm = connection.prepareStatement(sql);
			pstm.setInt(1, id);
			resultSet = pstm.executeQuery();

			if (resultSet.next()) {

				email = new Emaill();
				email.setId(resultSet.getInt("id"));
			}

		} catch (Exception e) {

			e.printStackTrace();

		} finally {

			try {

				Utill.closeConnection();

			} catch (Exception e) {

				e.printStackTrace();
			}
		}

		return email.getId();
	}
}
