package com.control_academico.demo.Repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.control_academico.demo.Entidad.SemestreEntidad;

public interface SemestreRepositorio extends JpaRepository<SemestreEntidad, Long> {
}