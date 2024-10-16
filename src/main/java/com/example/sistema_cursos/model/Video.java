package com.example.sistema_cursos.model;

import jakarta.persistence.*;

@Entity
public class Video {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;
    private String url;

    @ManyToOne
    @JoinColumn(name = "course_id")
    private Course course;

    public Video(Object o, String videoDeJava, String s, String s1, long l) {
    }

    public Video() {

    }

    // Getters e Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Long getNome() {
        return 0L;
    }

    public Object getDescricao() {
        return null;
    }

    public void setDescricao(Object descricao) {

    }
}
