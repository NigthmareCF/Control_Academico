package com.control_academico.demo.Servicio;

import org.springframework.stereotype.Service;

import com.control_academico.demo.Entidad.SemestreEntidad;
import com.control_academico.demo.Repositorio.SemestreRepositorio;

import java.util.List;

@Service
public class SemestreServicio {

    private final SemestreRepositorio semestreRepositorio;

    public SemestreServicio(SemestreRepositorio semestreRepositorio) {
        this.semestreRepositorio = semestreRepositorio;
    }

    public List<SemestreEntidad> listarSemestres() {
        return semestreRepositorio.findAll();
    }

    public SemestreEntidad guardarSemestre(SemestreEntidad semestre) {
        return semestreRepositorio.save(semestre);
    }

    public void eliminarSemestre(Long id) {
        semestreRepositorio.deleteById(id);
    }
}