package Persistence.Util;

import java.sql.*;

public class ConnectionFactory {

    public static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    public static final String URL = "jdbc:mysql://localhost:3306/appcap";
    public static final String USER = "DBUSER";
    public static final String PASSWORD = "mysql";

    public static Connection getConnection() {

        try {

            Class.forName(DRIVER);
            return DriverManager.getConnection(URL, USER, PASSWORD);

        } catch (Exception e) {

            throw new RuntimeException("Connection Error: " + e.getMessage());
        }
    }

    public static void closeConnection(Connection connection) {

        try {

            if (connection != null) {

                connection.close();
            }

        } catch (Exception e) {

            throw new RuntimeException("No-null connection!");
        }
    }

    public static void closeConnection(Connection connection, PreparedStatement statement) {

        try {

            if ((connection != null) && (statement != null)) {

                connection.close();
                statement.close();
            }

        } catch (Exception e) {

            throw new RuntimeException("No-null connection!");
        }
    }
    
    public static void closeConnection(Connection connection, PreparedStatement statement, ResultSet resultSet) {

        try {

            if ((connection != null) && (statement != null)) {

                connection.close();
                statement.close();
            }
            
            if(resultSet != null){
                
                resultSet.close();
            }

        } catch (Exception e) {

            throw new RuntimeException("No-null connection!");
        }
    }
}
