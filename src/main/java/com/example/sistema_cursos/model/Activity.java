package com.example.sistema_cursos.model;

import jakarta.persistence.*;

@Entity
public class Activity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;
    private String enunciado;

    @ManyToOne
    @JoinColumn(name = "course_id")
    private Course course;

    // Getters e Setters
}

