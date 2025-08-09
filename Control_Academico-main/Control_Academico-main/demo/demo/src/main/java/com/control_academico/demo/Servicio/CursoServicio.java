package com.control_academico.demo.Servicio;

import org.springframework.stereotype.Service;

import com.control_academico.demo.Entidad.CursoEntidad;
import com.control_academico.demo.Repositorio.CursoRepositorio;

import java.util.List;

@Service
public class CursoServicio {

    private final CursoRepositorio cursoRepositorio;

    public CursoServicio(CursoRepositorio cursoRepositorio) {
        this.cursoRepositorio = cursoRepositorio;
    }

    public List<CursoEntidad> listarCursos() {
        return cursoRepositorio.findAll();
    }

    public CursoEntidad guardarCurso(CursoEntidad curso) {
        return cursoRepositorio.save(curso);
    }

    public void eliminarCurso(Long id) {
        cursoRepositorio.deleteById(id);
    }
}