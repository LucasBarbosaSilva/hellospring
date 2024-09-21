package com.lucas.forum.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.lucas.forum.modelo.Topico;

public interface TopicoRepository extends JpaRepository<Topico, Long>{
	
	public List<Topico> findByCursoNome(String nomeCurso);
	
	@Query("SELECT t FROM Topico t WHERE t.curso.nome = :nomeCurso")
	public List<Topico> carregarPorNomeDoCurso(@Param("nomeCurso") String nomeCurso);

}
