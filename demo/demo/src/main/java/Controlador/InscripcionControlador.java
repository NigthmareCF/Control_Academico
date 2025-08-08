package com.control_academico.demo.Controlador;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.control_academico.demo.Entidad.Inscripcion;
import com.control_academico.demo.Servicio.InscripcionServicio;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/inscripciones")
public class InscripcionControlador {

    private final InscripcionServicio servicio;

    public InscripcionControlador(InscripcionServicio servicio) {
        this.servicio = servicio;
    }

    @GetMapping
    public List<Inscripcion> listar() {
        return servicio.listar();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Inscripcion> obtenerPorId(@PathVariable Integer id) {
        Optional<Inscripcion> inscripcion = servicio.obtenerPorId(id);
        return inscripcion.map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Inscripcion crear(@RequestBody Inscripcion inscripcion) {
        return servicio.guardar(inscripcion);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Inscripcion> actualizar(@PathVariable Integer id, @RequestBody Inscripcion inscripcion) {
        Optional<Inscripcion> existente = servicio.obtenerPorId(id);
        if (existente.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        inscripcion.setIdInscripcion(id);
        Inscripcion actualizado = servicio.guardar(inscripcion);
        return ResponseEntity.ok(actualizado);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Integer id) {
        Optional<Inscripcion> existente = servicio.obtenerPorId(id);
        if (existente.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        servicio.eliminar(id);
        return ResponseEntity.noContent().build();
    }
}
