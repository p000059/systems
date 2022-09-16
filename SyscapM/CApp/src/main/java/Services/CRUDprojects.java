package Services;

import Model.Project;
import Util.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class CRUDprojects {

    public void saveProject(Project project) {

        String sql = "INSERT INTO projects (name, description, createdAt, updatedAt) VALUES (?,?,?,?)";

        Connection connection = null;
        PreparedStatement statement = null;

        try {

            connection = ConnectionFactory.getConnection();
            statement = connection.prepareStatement(sql);
            statement.setString(1, project.getName());
            statement.setString(2, project.getDescription());
            statement.setDate(3, project.getCreatedAt());
            statement.setDate(4, project.getUpdatedAt());
            statement.execute();

        } catch (Exception e) {

            throw new RuntimeException(e.getMessage(), e);

        } finally {

            ConnectionFactory.closeConnection(connection, statement);
        }
    }

    public void updateProject(Project project) {

        String sql = "UPDATE projects SET "
                + "name = ?, "
                + "description = ?, "
                + "createdAt = ?, "
                + "updatedAt = ?"
                + "WHERE id = ?";

        Connection connection = null;
        PreparedStatement statement = null;

        try {

            connection = ConnectionFactory.getConnection();
            statement = connection.prepareStatement(sql);
            statement.setString(1, project.getName());
            statement.setString(2, project.getDescription());
            statement.setDate(3, project.getCreatedAt());
            statement.setDate(4, project.getUpdatedAt());
            statement.setInt(5, project.getId());
            statement.execute();

        } catch (Exception e) {

            throw new RuntimeException(e.getMessage(), e);

        } finally {

            ConnectionFactory.closeConnection(connection, statement);
        }

    }

    public List<Project> getAllProject(int id) {

        List<Project> lstProject = new ArrayList<>();
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;

        String sql = "SELECT * FROM projects WHERE id = ?";

        try {

            connection = ConnectionFactory.getConnection();
            statement = connection.prepareStatement(sql);

            statement.setInt(1, id);
            resultSet = statement.executeQuery();

            while (resultSet.next()) {

                Project project = new Project();
                project.setId(resultSet.getInt("id"));
                project.setName(resultSet.getString("name"));
                project.setDescription(resultSet.getString("description"));
                project.setCreatedAt(resultSet.getDate("createdAt"));
                project.setUpdatedAt(resultSet.getDate("updatedAt"));

                lstProject.add(project);

            }

        } catch (Exception e) {

            throw new RuntimeException(e.getMessage(), e);

        } finally {

            ConnectionFactory.closeConnection(connection, statement, resultSet);
        }

        return lstProject;
    }

    public void removeByIdProject(int id) {

        String sql = "DELETE FROM projects WHERE id = ?";

        Connection connection = null;
        PreparedStatement statement = null;

        try {

            connection = ConnectionFactory.getConnection();
            statement = connection.prepareStatement(sql);
            statement.setLong(1, id); //Parameter 1 "?", replace with received parameter "id".
            statement.execute();

        } catch (Exception e) {

            throw new RuntimeException(e.getMessage(), e);

        } finally {

            ConnectionFactory.closeConnection(connection, statement);
        }
    }
}
