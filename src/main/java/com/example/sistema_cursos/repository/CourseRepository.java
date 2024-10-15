package com.example.sistema_cursos.repository;

import com.example.sistema_cursos.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
}

