package com.miumg.Academia.Repositorios;

import org.springframework.data.jpa.repository.JpaRepository;
import com.miumg.Academia.Entidad.Inscripcion;

public interface InscripcionRepositorio extends JpaRepository<Inscripcion, Integer> {
}
