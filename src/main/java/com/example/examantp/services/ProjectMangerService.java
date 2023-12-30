package com.example.examantp.services;

import com.example.examantp.models.Project;
import com.example.examantp.models.ProjectManager;
import com.example.examantp.repository.ProjectManagerRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ProjectMangerService {
    @Autowired
    private ProjectManagerRepository projectManagerRepository;

    public List<ProjectManager> retrieveAll(){
        return projectManagerRepository.findAll();
    }

    public ProjectManager retrieveById(Integer projectId){
        return projectManagerRepository.findById(projectId).orElseThrow();
    }

    public ProjectManager saveProject(ProjectManager projectToSave){
        return projectManagerRepository.save(projectToSave);
    }

    public ProjectManager updateProject(Integer projectId,ProjectManager newValue){
        ProjectManager oldProject = projectManagerRepository.findById(projectId).orElseThrow();
        oldProject.setName(newValue.getName());
        return projectManagerRepository.save(oldProject);
    }

    public void deleteProject(Integer projectId){
        projectManagerRepository.deleteById(projectId);
    }
}
