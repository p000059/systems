package Services;

import Model.Task;
import Util.ConnectionFactory;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CRUDtasks {

    public void saveTasks(Task task) throws SQLException {

        String sql = "INSERT INTO tasks ("
                + "idProject, "
                + "name, "
                + "description, "
                + "completed, "
                + "notes, "
                + "deadline, "
                + "createAt, "
                + "updateAt) "
                + "values (?,?,?,?,?,?,?,?)";

        Connection connection = null;
        PreparedStatement statement = null;

        try {

            connection = ConnectionFactory.getConnection();
            statement = connection.prepareStatement(sql);
            statement.setLong(1, task.getId_project());
            statement.setString(2, task.getName());
            statement.setString(3, task.getDescription());
            statement.setString(4, task.getNotes());
            statement.setBoolean(5, task.getIsCompleted());
            statement.setDate(6, task.getDeadLine());
            statement.setDate(7, task.getCreatedAt());
            statement.setDate(8, task.getUpdatedAt());
            statement.execute();

        } catch (Exception e) {

            throw new RuntimeException("Error Create!" + e.getMessage(), e);

        } finally {

            ConnectionFactory.closeConnection(connection, statement);
        }

    }

    public void updateTask(Task task) {

        String sql = "UPDATE tasks SET "
                + "idProject = ?, "
                + "name = ?, "
                + "description = ?, "
                + "notes = ?, "
                + "deadline = ?, "
                + "completed = ?, "
                + "createAt = ?, "
                + "updateAt = ? "
                + "WHERE id = ?";

        Connection connection = null;
        PreparedStatement statement = null;

        try {

            connection = ConnectionFactory.getConnection();
            statement = connection.prepareStatement(sql);

            statement.setLong(1, task.getId_project());
            statement.setString(2, task.getName());
            statement.setString(3, task.getDescription());
            statement.setString(4, task.getNotes());
            statement.setBoolean(5, task.getIsCompleted());
            statement.setDate(6, task.getDeadLine());
            statement.setDate(7, task.getCreatedAt());
            statement.setDate(8, task.getUpdatedAt());
            statement.setLong(9, task.getId());
            statement.execute();

        } catch (Exception e) {

            throw new RuntimeException(e.getMessage(), e);

        } finally {

            ConnectionFactory.closeConnection(connection, statement);
        }
    }

    public List<Task> getAll(Long idProject) {

        List<Task> lstTask = new ArrayList<>();
        String sql = "SELECT * FROM tasks WHERE idProject = ?";

        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;

        try {

            connection = ConnectionFactory.getConnection();
            statement = connection.prepareStatement(sql);

            statement.setLong(1, idProject);
            resultSet = statement.executeQuery();

            while (resultSet.next()) {

                Task task = new Task();
                task.setId(resultSet.getInt("id"));
                task.setId_project(resultSet.getInt("id_Project"));
                task.setName(resultSet.getString("name"));
                task.setDescription(resultSet.getString("description"));
                task.setNotes(resultSet.getString("notes"));
                task.setIsCompleted(resultSet.getBoolean("true"));
                task.setDeadLine(resultSet.getDate("deadLine"));
                task.setCreatedAt(resultSet.getDate("createAt"));
                task.setUpdatedAt(resultSet.getDate("updateAt"));

                lstTask.add(task);

            }

        } catch (Exception e) {

            throw new RuntimeException(e.getMessage(), e);

        } finally {

            ConnectionFactory.closeConnection(connection, statement, resultSet);
        }

        return lstTask;
    }

    public void removeById(Long id) throws SQLException {

        String sql = "DELETE FROM tasks WHERE id = ?";

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
