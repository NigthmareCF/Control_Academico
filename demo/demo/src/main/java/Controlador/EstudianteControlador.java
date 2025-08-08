package com.control_academico.demo.Controlador;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.control_academico.demo.Entidad.Estudiante;
import com.control_academico.demo.Servicio.EstudianteServicio;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/estudiantes")
public class EstudianteControlador {

    private final EstudianteServicio servicio;

    public EstudianteControlador(EstudianteServicio servicio) {
        this.servicio = servicio;
    }

    @GetMapping
    public List<Estudiante> listar() {
        return servicio.listar();
    }

    @GetMapping("/{carnet}")
    public ResponseEntity<Estudiante> obtenerPorId(@PathVariable String carnet) {
        Optional<Estudiante> estudiante = servicio.obtenerPorId(carnet);
        return estudiante.map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Estudiante crear(@RequestBody Estudiante estudiante) {
        return servicio.guardar(estudiante);
    }

    @PutMapping("/{carnet}")
    public ResponseEntity<Estudiante> actualizar(@PathVariable String carnet, @RequestBody Estudiante estudiante) {
        Optional<Estudiante> existente = servicio.obtenerPorId(carnet);
        if (existente.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        estudiante.setCarnet(carnet);
        Estudiante actualizado = servicio.guardar(estudiante);
        return ResponseEntity.ok(actualizado);
    }

    @DeleteMapping("/{carnet}")
    public ResponseEntity<Void> eliminar(@PathVariable String carnet) {
        Optional<Estudiante> existente = servicio.obtenerPorId(carnet);
        if (existente.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        servicio.eliminar(carnet);
        return ResponseEntity.noContent().build();
    }
}
