package com.control_academico.demo.Controlador;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.control_academico.demo.Entidad.Semestre;
import com.control_academico.demo.Servicio.SemestreServicio;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/semestres")
public class SemestreControlador {

    private final SemestreServicio servicio;

    public SemestreControlador(SemestreServicio servicio) {
        this.servicio = servicio;
    }

    @GetMapping
    public List<Semestre> listar() {
        return servicio.listar();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Semestre> obtenerPorId(@PathVariable Integer id) {
        Optional<Semestre> semestre = servicio.obtenerPorId(id);
        return semestre.map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Semestre crear(@RequestBody Semestre semestre) {
        return servicio.guardar(semestre);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Semestre> actualizar(@PathVariable Integer id, @RequestBody Semestre semestre) {
        Optional<Semestre> existente = servicio.obtenerPorId(id);
        if (existente.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        semestre.setIdSemestre(id);
        Semestre actualizado = servicio.guardar(semestre);
        return ResponseEntity.ok(actualizado);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Integer id) {
        Optional<Semestre> existente = servicio.obtenerPorId(id);
        if (existente.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        servicio.eliminar(id);
        return ResponseEntity.noContent().build();
    }
}
