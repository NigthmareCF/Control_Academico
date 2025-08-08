package com.control_academico.demo.Repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import com.control_academico.demo.Entidad.Profesor;

public interface ProfesorRepositorio extends JpaRepository<Profesor, Integer> {
}
