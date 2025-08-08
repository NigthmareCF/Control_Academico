package com.control_academico.demo.Servicio;

import org.springframework.stereotype.Service;

import com.control_academico.demo.Entidad.Semestre;
import com.control_academico.demo.Repositorios.RepositorioSemestre;

import java.util.List;
import java.util.Optional;

@Service
public class SemestreServicio {

    private final RepositorioSemestre repositorio;

    public SemestreServicio(RepositorioSemestre repositorio) {
        this.repositorio = repositorio;
    }

    public List<Semestre> listar() {
        return repositorio.findAll();
    }

    public Optional<Semestre> obtenerPorId(Integer id) {
        return repositorio.findById(id);
    }

    public Semestre guardar(Semestre semestre) {
        return repositorio.save(semestre);
    }

    public void eliminar(Integer id) {
        repositorio.deleteById(id);
    }
}
