package com.example.examantp.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;
import java.util.Date;

@Entity

@Table(name = "projects")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Project {
    @Id
    private Integer id;
    private String name;
    private Date startDate;
    @ManyToOne
    private ProjectManager projectManager;
    @ManyToMany
    private Collection<TeamMember> teamMembers;
}
