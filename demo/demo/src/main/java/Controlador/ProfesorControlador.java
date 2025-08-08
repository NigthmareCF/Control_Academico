package com.control_academico.demo.Controlador;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.control_academico.demo.Entidad.Profesor;
import com.control_academico.demo.Servicio.ProfesorServicio;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/profesores")
public class ProfesorControlador {

    private final ProfesorServicio servicio;

    public ProfesorControlador(ProfesorServicio servicio) {
        this.servicio = servicio;
    }

    @GetMapping
    public List<Profesor> listar() {
        return servicio.listar();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Profesor> obtenerPorId(@PathVariable Integer id) {
        Optional<Profesor> profesor = servicio.obtenerPorId(id);
        return profesor.map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Profesor crear(@RequestBody Profesor profesor) {
        return servicio.guardar(profesor);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Profesor> actualizar(@PathVariable Integer id, @RequestBody Profesor profesor) {
        Optional<Profesor> existente = servicio.obtenerPorId(id);
        if (existente.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        profesor.setIdProfesor(id);
        Profesor actualizado = servicio.guardar(profesor);
        return ResponseEntity.ok(actualizado);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Integer id) {
        Optional<Profesor> existente = servicio.obtenerPorId(id);
        if (existente.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        servicio.eliminar(id);
        return ResponseEntity.noContent().build();
    }
}
