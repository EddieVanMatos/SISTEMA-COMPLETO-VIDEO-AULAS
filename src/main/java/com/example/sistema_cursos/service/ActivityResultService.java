package com.example.sistema_cursos.service;

import com.example.sistema_cursos.model.ActivityResult;
import com.example.sistema_cursos.repository.ActivityResultRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ActivityResultService {

    @Autowired
    private ActivityResultRepository activityResultRepository;

    public List<ActivityResult> getAllResults() {
        return activityResultRepository.findAll();
    }

    public Optional<ActivityResult> getResultById(Long id) {
        return activityResultRepository.findById(id);
    }

    public ActivityResult saveResult(ActivityResult result) {
        return activityResultRepository.save(result);
    }

    public void deleteResult(Long id) {
        activityResultRepository.deleteById(id);
    }
}

