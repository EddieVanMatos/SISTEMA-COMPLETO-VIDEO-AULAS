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

    public Activity(Object o, String s, String s1, long l, String s2) {
    }

    public Activity() {

    }

    // Getters e Setters
}

