package com.control_academico.demo.Controlador;

import org.springframework.web.bind.annotation.*;

import com.control_academico.demo.Entidad.ProfesorEntidad;
import com.control_academico.demo.Servicio.ProfesorServicio;

import java.util.List;

@RestController
@RequestMapping("/profesores")
public class ProfesorControlador {

    private final ProfesorServicio profesorServicio;

    public ProfesorControlador(ProfesorServicio profesorServicio) {
        this.profesorServicio = profesorServicio;
    }

    @GetMapping
    public List<ProfesorEntidad> listar() {
        return profesorServicio.listarProfesores();
    }

    @PostMapping
    public ProfesorEntidad guardar(@RequestBody ProfesorEntidad profesor) {
        return profesorServicio.guardarProfesor(profesor);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        profesorServicio.eliminarProfesor(id);
    }
}