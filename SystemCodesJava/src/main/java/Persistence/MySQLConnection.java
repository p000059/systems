package Persistence;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.List;

public class MySQLConnection {

	public static void main(String[] args) {

		boolean isValid = true;
		
		try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/sysgitHub?serverTimezone=UTC","DBUSER", "mysql")) {
			
			PreparedStatement selectStatement = conn.prepareStatement("select * from person");
			ResultSet rs = selectStatement.executeQuery();
			
			List<Person> lstPerson = new ArrayList<>();
			
			while(rs.next()) {
				
				Long id = rs.getLong("id");
				String name = rs.getString("name");
				
				Person person = new Person();
				person.setName(name);
				lstPerson.add(person);
			}
			
			isValid = conn.isValid(0);

		} catch (Exception e) {


			isValid = false;
		}

	}

}
