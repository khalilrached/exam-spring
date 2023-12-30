package com.example.examantp.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;

@Entity
@Table(name = "managers")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProjectManager {
    @Id
    private Integer id;
    private String name;
    @OneToMany
    private Collection<Project> projects;
    @ManyToOne
    private Office office;
}
