package Persistence.Util;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Util {

	protected Connection connection;
	protected PreparedStatement preparedStatement;
	protected ResultSet resultSet;
	protected CallableStatement callableStatement;

	public void openConnnection() throws Exception {

		String url = "jdbc:mysql://localhost:3306/dbcodes";
		String user = "DBUSER";
		String password = "mysql";
		String driver = "com.mysql.cj.jdbc.Driver";

		try {

			Class.forName(driver);
			connection = DriverManager.getConnection(url, user, password);
			System.out.println("Conexão bem sucedida!");

		} catch (SQLException | ClassNotFoundException ex) {

			System.out.println("\n\nErro ao conectar banco!\n\n" + ex);
		}
	}

	public void closeConnection() throws Exception {

		try {
			
			connection.close();
			
		} catch (SQLException ex) {
			
			System.out.println("\n\nErro ao desconectar do banco!\n\n" + ex);
		}
	}
}
