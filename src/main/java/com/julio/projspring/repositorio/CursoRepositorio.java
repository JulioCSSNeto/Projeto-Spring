package com.julio.projspring.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.julio.projspring.model.Curso;

@Repository
public interface CursoRepositorio  extends JpaRepository<Curso,Long> {
    
    
}
