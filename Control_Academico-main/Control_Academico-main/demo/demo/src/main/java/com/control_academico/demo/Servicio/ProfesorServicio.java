package com.control_academico.demo.Servicio;

import org.springframework.stereotype.Service;

import com.control_academico.demo.Entidad.ProfesorEntidad;
import com.control_academico.demo.Repositorio.ProfesorRepositorio;

import java.util.List;

@Service
public class ProfesorServicio {

    private final ProfesorRepositorio profesorRepositorio;

    public ProfesorServicio(ProfesorRepositorio profesorRepositorio) {
        this.profesorRepositorio = profesorRepositorio;
    }

    public List<ProfesorEntidad> listarProfesores() {
        return profesorRepositorio.findAll();
    }

    public ProfesorEntidad guardarProfesor(ProfesorEntidad profesor) {
        return profesorRepositorio.save(profesor);
    }

    public void eliminarProfesor(Long id) {
        profesorRepositorio.deleteById(id);
    }
}