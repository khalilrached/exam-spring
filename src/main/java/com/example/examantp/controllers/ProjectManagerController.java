package com.example.examantp.controllers;

import com.example.examantp.models.Office;
import com.example.examantp.models.Project;
import com.example.examantp.models.ProjectManager;
import com.example.examantp.services.OfficeService;
import com.example.examantp.services.ProjectMangerService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/manager")
public class ProjectManagerController {


    private final ProjectMangerService projectMangerService;

    public ProjectManagerController(ProjectMangerService projectMangerService) {
        this.projectMangerService = projectMangerService;
    }

    @GetMapping
    public List<ProjectManager> getProjects(){
        return projectMangerService.retrieveAll();
    }

    @GetMapping(path = "/id")
    public ProjectManager getProject(@RequestParam Integer id){
        return projectMangerService.retrieveById(id);
    }

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public ProjectManager createProject(@RequestBody ProjectManager project){
        return projectMangerService.saveProject(project);
    }

    @PutMapping
    public ProjectManager updateProject(@RequestParam Integer id,@RequestBody ProjectManager newValue){
        return projectMangerService.updateProject(id,newValue);
    }

    @DeleteMapping
    @ResponseStatus(code = HttpStatus.ACCEPTED)
    public Boolean deleteProject(@RequestParam Integer id){
        projectMangerService.deleteProject(id);
        return true;
    }
}
