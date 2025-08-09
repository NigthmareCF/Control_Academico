package com.control_academico.demo.Repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.control_academico.demo.Entidad.InscripcionEntidad;

public interface InscripcionRepositorio extends JpaRepository<InscripcionEntidad, Long> {
}