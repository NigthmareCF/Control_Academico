package com.control_academico.demo.Repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.control_academico.demo.Entidad.CursoEntidad;

public interface CursoRepositorio extends JpaRepository<CursoEntidad, Long> {
}
