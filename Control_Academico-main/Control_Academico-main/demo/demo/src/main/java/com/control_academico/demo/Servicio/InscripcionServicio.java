package com.control_academico.demo.Servicio;

import org.springframework.stereotype.Service;

import com.control_academico.demo.Entidad.InscripcionEntidad;
import com.control_academico.demo.Repositorio.InscripcionRepositorio;

import java.util.List;

@Service
public class InscripcionServicio {

    private final InscripcionRepositorio inscripcionRepositorio;

    public InscripcionServicio(InscripcionRepositorio inscripcionRepositorio) {
        this.inscripcionRepositorio = inscripcionRepositorio;
    }

    public List<InscripcionEntidad> listarInscripciones() {
        return inscripcionRepositorio.findAll();
    }

    public InscripcionEntidad guardarInscripcion(InscripcionEntidad inscripcion) {
        return inscripcionRepositorio.save(inscripcion);
    }

    public void eliminarInscripcion(Long id) {
        inscripcionRepositorio.deleteById(id);
    }
}