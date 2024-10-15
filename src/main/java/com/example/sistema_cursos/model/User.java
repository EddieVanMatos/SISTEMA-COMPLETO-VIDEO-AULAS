package com.example.sistema_cursos.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String email;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<ActivityResult> resultados;

    // Getters e Setters
}

