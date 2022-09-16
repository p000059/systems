package Controller;

import Model.Task;
import Services.CRUDtasks;
import java.sql.*;
import java.util.List;

public class TaskController {

    public void save(Task task) throws SQLException {

        CRUDtasks cRUDtasks = new CRUDtasks();
        
        cRUDtasks.saveTasks(task);

    }

    public void update(Task task) {

        CRUDtasks cRUDtasks = new CRUDtasks();
        
        cRUDtasks.updateTask(task);
    }

    public List<Task> getAll(Long idProject) {

        CRUDtasks cRUDtasks = new CRUDtasks();
        List<Task> lstTask = cRUDtasks.getAll(idProject);
        
        return lstTask;
    }

    public void read(Task task) {

    }

    public void removeById(Long id) throws SQLException {

        CRUDtasks cRUDtasks = new CRUDtasks();
        
        cRUDtasks.removeById(id);
    }
}
