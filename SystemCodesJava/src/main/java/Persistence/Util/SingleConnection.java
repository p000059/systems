package Persistence.Util;

import java.sql.Connection;
import java.sql.DriverManager;

public class SingleConnection {

	private static String url = "jdbc:mysql://localhost:3306/dbcodes";
	private static String password = "mysql";
	private static String user = "DBUSER";
	private static Connection connection = null;

	static {
		connect();
	}
	
	private static void connect() {

		try {

			if (connection == null) {

				Class.forName("com.mysql.cj.jdbc.Driver");
				connection = DriverManager.getConnection(url, user, password);
				connection.setAutoCommit(false);
				
				System.out.println(connection + " -> Conexão estabelecida!");
			}
			
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
		}
	}

	public static Connection openConnection() {
		
		return connection;
	}
}
