package com.example.examantp.controllers;

import com.example.examantp.models.Project;
import com.example.examantp.services.ProjectService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/project")
public class ProjectController {


    private final ProjectService projectService;

    public ProjectController(ProjectService projectService) {
        this.projectService = projectService;
    }

    @GetMapping
    public List<Project> getProjects(){
        return projectService.retrieveAll();
    }

    @GetMapping(path = "/id")
    public Project getProject(@RequestParam Integer id){
        return projectService.retrieveById(id);
    }

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public Project createProject(@RequestBody Project project){
        return projectService.saveProject(project);
    }

    @PutMapping
    public Project updateProject(@RequestParam Integer id,@RequestBody Project newValue){
        return projectService.updateProject(id,newValue);
    }

    @DeleteMapping
    @ResponseStatus(code = HttpStatus.ACCEPTED)
    public Boolean deleteProject(@RequestParam Integer id){
        projectService.deleteProject(id);
        return true;
    }
}
