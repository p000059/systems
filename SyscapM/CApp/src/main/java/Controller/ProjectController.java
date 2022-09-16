package Controller;

import Model.Project;
import Services.CRUDprojects;
import java.util.List;

public class ProjectController {

    public void save(Project project){
        
        CRUDprojects projects = new CRUDprojects();
        projects.saveProject(project);
        
    }
    
    public void update(Project project){
        
        CRUDprojects projects = new CRUDprojects();
        projects.updateProject(project);
        
    }
    
    public List<Project> getAll(int id){
        
        CRUDprojects projects = new CRUDprojects();
        List<Project> lstProject = projects.getAllProject(id);
        
        return lstProject;
    }
    
    public void removeById(int id){
        
        CRUDprojects projects = new CRUDprojects();
        projects.removeByIdProject(id);
    }
}
