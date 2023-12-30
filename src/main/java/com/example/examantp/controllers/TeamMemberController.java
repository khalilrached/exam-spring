package com.example.examantp.controllers;

import com.example.examantp.models.ProjectManager;
import com.example.examantp.models.TeamMember;
import com.example.examantp.services.ProjectMangerService;
import com.example.examantp.services.TeamMemberService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/members")
public class TeamMemberController {


    private final TeamMemberService teamMemberService;

    public TeamMemberController(TeamMemberService teamMemberService) {
        this.teamMemberService = teamMemberService;
    }

    @GetMapping
    public List<TeamMember> getProjects(){
        return teamMemberService.retrieveAll();
    }

    @GetMapping(path = "/id")
    public TeamMember getProject(@RequestParam Integer id){
        return teamMemberService.retrieveById(id);
    }

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public TeamMember createProject(@RequestBody TeamMember project){
        return teamMemberService.saveProject(project);
    }

    @PutMapping
    public TeamMember updateProject(@RequestParam Integer id,@RequestBody TeamMember newValue){
        return teamMemberService.updateProject(id,newValue);
    }

    @DeleteMapping
    @ResponseStatus(code = HttpStatus.ACCEPTED)
    public Boolean deleteProject(@RequestParam Integer id){
        teamMemberService.deleteProject(id);
        return true;
    }
}
