package com.example.examantp.services;

import com.example.examantp.models.Project;
import com.example.examantp.repository.ProjectRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ProjectService {
    @Autowired
    private ProjectRepository projectRepository;

    public List<Project> retrieveAll(){
        return projectRepository.findAll();
    }

    public Project retrieveById(Integer projectId){
        return projectRepository.findById(projectId).orElseThrow();
    }

    public Project saveProject(Project projectToSave){
        return projectRepository.save(projectToSave);
    }

    public Project updateProject(Integer projectId,Project newValue){
        Project oldProject = projectRepository.findById(projectId).orElseThrow();
        oldProject.setName(newValue.getName());
        oldProject.setProjectManager(newValue.getProjectManager());
        return projectRepository.save(oldProject);
    }

    public void deleteProject(Integer projectId){
        projectRepository.deleteById(projectId);
    }
}
