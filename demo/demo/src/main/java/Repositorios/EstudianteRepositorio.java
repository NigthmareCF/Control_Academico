package com.control_academico.demo.Repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import com.control_academico.demo.Entidad.Estudiante;

public interface EstudianteRepositorio extends JpaRepository<Estudiante, String> {
}
