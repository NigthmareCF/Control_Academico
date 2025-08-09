package com.control_academico.demo.Controlador;

import org.springframework.web.bind.annotation.*;

import com.control_academico.demo.Entidad.SemestreEntidad;
import com.control_academico.demo.Servicio.SemestreServicio;

import java.util.List;

@RestController
@RequestMapping("/semestres")
public class SemestreControlador {

    private final SemestreServicio semestreServicio;

    public SemestreControlador(SemestreServicio semestreServicio) {
        this.semestreServicio = semestreServicio;
    }

    @GetMapping
    public List<SemestreEntidad> listar() {
        return semestreServicio.listarSemestres();
    }

    @PostMapping
    public SemestreEntidad guardar(@RequestBody SemestreEntidad semestre) {
        return semestreServicio.guardarSemestre(semestre);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        semestreServicio.eliminarSemestre(id);
    }
}