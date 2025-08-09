package com.control_academico.demo.Entidad;

import jakarta.persistence.*;

@Entity
@Table(name = "CURSO")
public class CursoEntidad {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_CURSO")
    private Integer idCurso;

    @Column(name = "NOMBRE", nullable = false, length = 100)
    private String nombre;

    @Column(name = "CREDITOS", nullable = false)
    private Integer creditos;

    @ManyToOne
    @JoinColumn(name = "ID_PROFESOR", nullable = false)
    private ProfesorEntidad profesor;

 
    public Integer getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(Integer idCurso) {
        this.idCurso = idCurso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getCreditos() {
        return creditos;
    }

    public void setCreditos(Integer creditos) {
        this.creditos = creditos;
    }

    public ProfesorEntidad getProfesor() {
        return profesor;
    }

    public void setProfesor(ProfesorEntidad profesor) {
        this.profesor = profesor;
    }
    
}
