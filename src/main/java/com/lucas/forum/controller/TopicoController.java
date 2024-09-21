package com.lucas.forum.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lucas.forum.controller.dto.TopicoDTO;
import com.lucas.forum.modelo.Topico;
import com.lucas.forum.repository.TopicoRepository;

@RestController
public class TopicoController {
	
	@Autowired
	private TopicoRepository topicoRepository;
		
	@RequestMapping("/topicos")
	public List<TopicoDTO> lista(String curso){
		if(curso != null) {
			List<Topico> topicos = topicoRepository.findByCursoNome(curso);
			
			return TopicoDTO.converter(topicos);
		}
		List<Topico> topicos = topicoRepository.findAll();
		
		return TopicoDTO.converter(topicos);
	}
}
