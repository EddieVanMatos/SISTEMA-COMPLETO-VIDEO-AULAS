package com.example.sistema_cursos.controller;

import com.example.sistema_cursos.model.ActivityResult;
import com.example.sistema_cursos.service.ActivityResultService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/resultados")
public class ActivityResultController {

    @Autowired
    private ActivityResultService activityResultService;

    @GetMapping
    public List<ActivityResult> getAllResults() {
        return activityResultService.getAllResults();
    }

    @GetMapping("/{id}")
    public ResponseEntity<ActivityResult> getResultById(@PathVariable Long id) {
        return activityResultService.getResultById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ActivityResult saveResult(@RequestBody ActivityResult result) {
        return activityResultService.saveResult(result);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteResult(@PathVariable Long id) {
        activityResultService.deleteResult(id);
        return ResponseEntity.noContent().build();
    }
}

