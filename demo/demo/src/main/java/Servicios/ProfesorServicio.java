package com.control_academico.demo.Servicio;

import org.springframework.stereotype.Service;

import com.control_academico.demo.Entidad.Profesor;
import com.control_academico.demo.Repositorios.RepositorioProfesor;

import java.util.List;
import java.util.Optional;

@Service
public class ProfesorServicio {

    private final RepositorioProfesor repositorio;

    public ProfesorServicio(RepositorioProfesor repositorio) {
        this.repositorio = repositorio;
    }

    public List<Profesor> listar() {
        return repositorio.findAll();
    }

    public Optional<Profesor> obtenerPorId(Integer id) {
        return repositorio.findById(id);
    }

    public Profesor guardar(Profesor profesor) {
        return repositorio.save(profesor);
    }

    public void eliminar(Integer id) {
        repositorio.deleteById(id);
    }
}
