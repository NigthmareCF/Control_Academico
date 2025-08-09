package com.control_academico.demo.Controlador;

import org.springframework.web.bind.annotation.*;

import com.control_academico.demo.Entidad.CursoEntidad;
import com.control_academico.demo.Servicio.CursoServicio;

import java.util.List;

@RestController
@RequestMapping("/cursos")
public class CursoControlador {

    private final CursoServicio cursoServicio;

    public CursoControlador(CursoServicio cursoServicio) {
        this.cursoServicio = cursoServicio;
    }

    @GetMapping
    public List<CursoEntidad> listar() {
        return cursoServicio.listarCursos();
    }

    @PostMapping
    public CursoEntidad guardar(@RequestBody CursoEntidad curso) {
        return cursoServicio.guardarCurso(curso);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        cursoServicio.eliminarCurso(id);
    }
}