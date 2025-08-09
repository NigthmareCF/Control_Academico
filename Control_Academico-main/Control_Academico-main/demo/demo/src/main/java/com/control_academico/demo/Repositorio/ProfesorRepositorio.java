package com.control_academico.demo.Repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import com.control_academico.demo.Entidad.ProfesorEntidad;

public interface ProfesorRepositorio extends JpaRepository<ProfesorEntidad, Long> {
}