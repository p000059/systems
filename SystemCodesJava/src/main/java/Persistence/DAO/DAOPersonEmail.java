package Persistence.DAO;

import java.util.ArrayList;
import java.util.List;
import Persistence.Model.PersonEmail;
import Persistence.Interface.IDAO;
import Persistence.Util.Utill;

public class DAOPersonEmail extends Utill implements IDAO<PersonEmail> {

	@Override
	public void create(PersonEmail object) {

		String sql = "INSERT INTO person_email (person_id, email_id) VALUES (?,?)";

		try {

			Utill.open();
			pstm = connection.prepareStatement(sql);
			pstm.setInt(1, object.getPerson_id());
			pstm.setInt(2, object.getEmail_id());
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
	public int findMaxId() {

		return 0;
	}

	@Override
	public List<PersonEmail> readAll() {

		List<PersonEmail> lstPersonEmail = new ArrayList<>();
		PersonEmail personEmail = null;
		String sql = "SELECT * FROM person_email";

		try {

			pstm = connection.prepareStatement(sql);
			resultSet = pstm.executeQuery();

			while (resultSet.next()) {

				personEmail = new PersonEmail();
				personEmail.setEmail_id(resultSet.getInt("email_id"));
				personEmail.setPerson_id(resultSet.getInt("person_id"));
				lstPersonEmail.add(personEmail);

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

		return lstPersonEmail;
	}

	@Override
	public PersonEmail read(int object) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(PersonEmail object) {
		// TODO Auto-generated method stub
	}

	@Override
	public void delete(PersonEmail object) {
		// TODO Auto-generated method stub
	}
}
