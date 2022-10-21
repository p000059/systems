package Persistence.Util;

import java.sql.Connection;
import java.sql.DriverManager;

import javax.swing.JOptionPane;

public class SingleConnection {

	private static String url = "jdbc:mysql://localhost:3306/sysgithub";
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
				JOptionPane.showMessageDialog(null, connection + " -> Conexão estabelecida!");
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
	}

	public static Connection getConnection() {
		return connection;
	}
}
