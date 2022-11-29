package com.julio.projspring;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.julio.projspring.model.Curso;
import com.julio.projspring.repositorio.CursoRepositorio;

@SpringBootApplication
public class ProjspringApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjspringApplication.class, args);
	}

	@Bean
	CommandLineRunner initDatabase(CursoRepositorio cursoRepositorio){
		return args ->{
			cursoRepositorio.deleteAll();

			Curso c = new Curso();
			c.setNome("Angular");
			c.setCategoria("front-end");

			cursoRepositorio.save(c);
		};
	}
}
