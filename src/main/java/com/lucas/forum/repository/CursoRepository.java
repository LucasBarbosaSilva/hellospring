package com.lucas.forum.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucas.forum.modelo.Curso;

public interface CursoRepository extends JpaRepository<Curso, Long>{

	Curso findByNome(String nomeCurso);

}
