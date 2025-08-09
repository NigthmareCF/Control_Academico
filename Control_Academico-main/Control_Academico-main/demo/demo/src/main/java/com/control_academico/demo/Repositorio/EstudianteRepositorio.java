package com.control_academico.demo.Repositorio;


import org.springframework.data.jpa.repository.JpaRepository;

import com.control_academico.demo.Entidad.EstudianteEntidad;

public interface EstudianteRepositorio extends JpaRepository<EstudianteEntidad, String> {
}
