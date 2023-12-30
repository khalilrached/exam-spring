package com.example.examantp.controllers;

import com.example.examantp.models.Office;
import com.example.examantp.models.Project;
import com.example.examantp.services.OfficeService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/office")
public class OfficeController {


    private final OfficeService officeService;

    public OfficeController(OfficeService officeService) {
        this.officeService = officeService;
    }

    @GetMapping
    public List<Office> getProjects(){
        return officeService.retrieveAll();
    }

    @GetMapping(path = "/id")
    public Office getProject(@RequestParam Integer id){
        return officeService.retrieveById(id);
    }

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public Office createProject(@RequestBody Office project){
        return officeService.saveProject(project);
    }

    @PutMapping
    public Office updateProject(@RequestParam Integer id,@RequestBody Office newValue){
        return officeService.updateProject(id,newValue);
    }

    @DeleteMapping
    @ResponseStatus(code = HttpStatus.ACCEPTED)
    public Boolean deleteProject(@RequestParam Integer id){
        officeService.deleteProject(id);
        return true;
    }
}
