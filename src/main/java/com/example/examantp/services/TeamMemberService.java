package com.example.examantp.services;

import com.example.examantp.models.TeamMember;
import com.example.examantp.repository.TeamMemberRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class TeamMemberService {
    @Autowired
    private TeamMemberRepository teamMemberRepository;

    public TeamMember updateProject(Integer id, TeamMember newValue) {
        TeamMember oldValue = teamMemberRepository.findById(id).orElseThrow();
        oldValue.setName(newValue.getName());
        return teamMemberRepository.save(oldValue);
    }

    public void deleteProject(Integer id) {
        teamMemberRepository.deleteById(id);
    }

    public TeamMember saveProject(TeamMember project) {
        return teamMemberRepository.save(project);
    }

    public TeamMember retrieveById(Integer id) {
        return teamMemberRepository.findById(id).orElseThrow();
    }

    public List<TeamMember> retrieveAll() {
        return null;
    }
}
