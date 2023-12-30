package com.example.examantp.dto;

import lombok.*;
import org.springframework.lang.NonNull;

import java.util.List;
import java.util.Optional;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProjectManagerDto {
    private String name;
    private Optional<Integer> officeId;
    private Optional<List<Integer>> projectIds;
}
