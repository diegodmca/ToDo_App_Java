
package todoApp.Main;


import todoApp.Controller.ProjectController;
import todoApp.Model.Project;


/**
 *
 * @author diegocarvalho
 */

public class Main {
   
    public static void main(String[] args) {
        
       ProjectController projectController = new ProjectController();
       
       Project project = new Project();
       project.setId(12);
       project.setName("Novo nome Projeto");
       project.setDescription("description");
       
       projectController.update(project);
       

//projectController.save(project);
//project.setName("Novo nome do projeto");
//projectController.update(project);
//
//List<Project> projects = projectController.getAll();
//        System.out.println("Total de projetos = " + projects.size());
       
        
        
  
        
    }
}
