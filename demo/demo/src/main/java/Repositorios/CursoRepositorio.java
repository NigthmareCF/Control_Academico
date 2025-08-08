package com.control_academico.demo.Repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import com.control_academico.demo.Entidad.Curso;

public interface CursoRepositorio extends JpaRepository<Curso, Integer> {
}
