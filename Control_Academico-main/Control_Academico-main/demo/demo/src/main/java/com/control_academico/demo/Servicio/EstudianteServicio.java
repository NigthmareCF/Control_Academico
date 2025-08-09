package com.control_academico.demo.Servicio;

import org.springframework.stereotype.Service;

import com.control_academico.demo.Entidad.EstudianteEntidad;
import com.control_academico.demo.Repositorio.EstudianteRepositorio;

import java.util.List;

@Service
public class EstudianteServicio {

    private final EstudianteRepositorio estudianteRepositorio;

    public EstudianteServicio(EstudianteRepositorio estudianteRepositorio) {
        this.estudianteRepositorio = estudianteRepositorio;
    }

    public List<EstudianteEntidad> listarEstudiantes() {
        return estudianteRepositorio.findAll();
    }

    public EstudianteEntidad guardarEstudiante(EstudianteEntidad estudiante) {
        return estudianteRepositorio.save(estudiante);
    }

    public void eliminarEstudiante(String carnet) {
        estudianteRepositorio.deleteById(carnet);
    }
}
