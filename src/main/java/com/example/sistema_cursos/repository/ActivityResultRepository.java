package com.example.sistema_cursos.repository;

import com.example.sistema_cursos.model.ActivityResult;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActivityResultRepository extends JpaRepository<ActivityResult, Long> {
}

