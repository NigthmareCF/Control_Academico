package com.control_academico.demo.Controlador;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.control_academico.demo.Entidad.Curso;
import com.control_academico.demo.Servicio.CursoServicio;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/cursos")
public class CursoControlador {

    private final CursoServicio servicio;

    public CursoControlador(CursoServicio servicio) {
        this.servicio = servicio;
    }

    @GetMapping
    public List<Curso> listar() {
        return servicio.listar();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Curso> obtenerPorId(@PathVariable Integer id) {
        Optional<Curso> curso = servicio.obtenerPorId(id);
        return curso.map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Curso crear(@RequestBody Curso curso) {
        return servicio.guardar(curso);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Curso> actualizar(@PathVariable Integer id, @RequestBody Curso curso) {
        Optional<Curso> existente = servicio.obtenerPorId(id);
        if (existente.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        curso.setIdCurso(id);
        Curso actualizado = servicio.guardar(curso);
        return ResponseEntity.ok(actualizado);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminar(@PathVariable Integer id) {
        Optional<Curso> existente = servicio.obtenerPorId(id);
        if (existente.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        servicio.eliminar(id);
        return ResponseEntity.noContent().build();
    }
}
