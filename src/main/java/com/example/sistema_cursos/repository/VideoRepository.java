package com.example.sistema_cursos.repository;

import com.example.sistema_cursos.model.Video;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VideoRepository extends JpaRepository<Video, Long> {
}

