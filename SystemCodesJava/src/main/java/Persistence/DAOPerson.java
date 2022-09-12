package Persistence;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class DAOPerson {

	private Connection connection = null;

	public DAOPerson() {
		connection = SingleConnection.getConnection();
	}

	public void save(Person objPerson) {
		try {

			String sqlInsert = "insert into Person(namePerson, emailPerson) values(?,?)";

			PreparedStatement insert = connection.prepareStatement(sqlInsert);
			insert.setString(1, objPerson.getNamePerson());
//			insert.setString(2, objPerson.getEmailPerson());
			insert.execute();
			connection.commit();

		} catch (Exception e) {
			
			try {
				connection.rollback();
			} catch (SQLException e1) {
				JOptionPane.showMessageDialog(null, e.getMessage());
			}
			
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
	}
}
