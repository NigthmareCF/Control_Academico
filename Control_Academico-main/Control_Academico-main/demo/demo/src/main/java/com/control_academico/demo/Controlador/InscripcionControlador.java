package com.control_academico.demo.Controlador;

import org.springframework.web.bind.annotation.*;

import com.control_academico.demo.Entidad.InscripcionEntidad;
import com.control_academico.demo.Servicio.InscripcionServicio;

import java.util.List;

@RestController
@RequestMapping("/inscripciones")
public class InscripcionControlador {

    private final InscripcionServicio inscripcionServicio;

    public InscripcionControlador(InscripcionServicio inscripcionServicio) {
        this.inscripcionServicio = inscripcionServicio;
    }

    @GetMapping
    public List<InscripcionEntidad> listar() {
        return inscripcionServicio.listarInscripciones();
    }

    @PostMapping
    public InscripcionEntidad guardar(@RequestBody InscripcionEntidad inscripcion) {
        return inscripcionServicio.guardarInscripcion(inscripcion);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        inscripcionServicio.eliminarInscripcion(id);
    }
}