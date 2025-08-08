package com.control_academico.demo.Servicio;

import org.springframework.stereotype.Service;

import com.control_academico.demo.Entidad.Inscripcion;
import com.control_academico.demo.Repositorios.RepositorioInscripcion;

import java.util.List;
import java.util.Optional;

@Service
public class InscripcionServicio {

    private final RepositorioInscripcion repositorio;

    public InscripcionServicio(RepositorioInscripcion repositorio) {
        this.repositorio = repositorio;
    }

    public List<Inscripcion> listar() {
        return repositorio.findAll();
    }

    public Optional<Inscripcion> obtenerPorId(Integer id) {
        return repositorio.findById(id);
    }

    public Inscripcion guardar(Inscripcion inscripcion) {
        return repositorio.save(inscripcion);
    }

    public void eliminar(Integer id) {
        repositorio.deleteById(id);
    }
}
