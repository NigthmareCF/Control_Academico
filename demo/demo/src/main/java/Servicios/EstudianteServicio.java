package com.control_academico.demo.Servicio;

import org.springframework.stereotype.Service;

import com.control_academico.demo.Entidad.Estudiante;
import com.control_academico.demo.Repositorios.RepositorioEstudiante;

import java.util.List;
import java.util.Optional;

@Service
public class EstudianteServicio {

    private final RepositorioEstudiante repositorio;

    public EstudianteServicio(RepositorioEstudiante repositorio) {
        this.repositorio = repositorio;
    }

    public List<Estudiante> listar() {
        return repositorio.findAll();
    }

    public Optional<Estudiante> obtenerPorId(String carnet) {
        return repositorio.findById(carnet);
    }

    public Estudiante guardar(Estudiante estudiante) {
        return repositorio.save(estudiante);
    }

    public void eliminar(String carnet) {
        repositorio.deleteById(carnet);
    }
}
