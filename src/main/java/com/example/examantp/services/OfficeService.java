package com.example.examantp.services;

import com.example.examantp.models.Office;
import com.example.examantp.repository.OfficeRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class OfficeService {

    @Autowired
    private OfficeRepository officeRepository;

    public Office updateProject(Integer id, Office newValue) {
        return null;
    }

    public void deleteProject(Integer id) {

    }

    public Office saveProject(Office project) {

        return null;
    }

    public Office retrieveById(Integer id) {
        return null;
    }

    public List<Office> retrieveAll() {
        return null;
    }
}
