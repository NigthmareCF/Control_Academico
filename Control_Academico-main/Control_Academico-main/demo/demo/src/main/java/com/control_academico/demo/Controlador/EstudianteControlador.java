package com.control_academico.demo.Controlador;

import org.springframework.web.bind.annotation.*;

import com.control_academico.demo.Entidad.EstudianteEntidad;
import com.control_academico.demo.Servicio.EstudianteServicio;

import java.util.List;

@RestController
@RequestMapping("/estudiantes")
public class EstudianteControlador {

    private final EstudianteServicio estudianteServicio;

    public EstudianteControlador(EstudianteServicio estudianteServicio) {
        this.estudianteServicio = estudianteServicio;
    }

    @GetMapping
    public List<EstudianteEntidad> listar() {
        return estudianteServicio.listarEstudiantes();
    }

    @PostMapping
    public EstudianteEntidad guardar(@RequestBody EstudianteEntidad estudiante) {
        return estudianteServicio.guardarEstudiante(estudiante);
    }

    @DeleteMapping("/{carnet}")
    public void eliminar(@PathVariable String carnet) {
        estudianteServicio.eliminarEstudiante(carnet);
    }
}