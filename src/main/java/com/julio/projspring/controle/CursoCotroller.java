package com.julio.projspring.controle;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.julio.projspring.model.Curso;
import com.julio.projspring.repositorio.CursoRepositorio;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/cursos")
@AllArgsConstructor
public class CursoCotroller {

    
    private final CursoRepositorio cursoRepositorio;


    @GetMapping
    public @ResponseBody List<Curso> list(){
        return cursoRepositorio.findAll();

    }
    
}
