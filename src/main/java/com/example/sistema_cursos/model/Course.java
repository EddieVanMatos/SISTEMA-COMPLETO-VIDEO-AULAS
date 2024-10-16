package com.example.sistema_cursos.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String descricao;

    @OneToMany(mappedBy = "course", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Video> videos;

    @OneToMany(mappedBy = "course", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Activity> activities;

    public Course(Object o, String cursoDeJava, String descriçãoDoCursoDeJava) {
    }

    public Course() {

    }

    // Getters e Setters
}

