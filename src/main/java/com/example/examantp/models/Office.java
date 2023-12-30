package com.example.examantp.models;

import com.example.examantp.dto.Location;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;

@Entity
@Table(name = "office")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Office {
    @Id
    private Integer id;
    @Embedded
    private Location location;
    @OneToMany
    private Collection<ProjectManager> projectManager;
}
