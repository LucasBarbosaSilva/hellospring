package com.lucas.forum.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lucas.forum.controller.dto.TopicoDTO;
import com.lucas.forum.modelo.Curso;
import com.lucas.forum.modelo.Topico;

@RestController
public class TopicoController {
	
	@RequestMapping("/topicos")
	public List<TopicoDTO> lista(){
		Topico topico = new Topico("Dúvida", "Dúvida sobre o Spring", new Curso("Springboot", "Programação"));
		
		return TopicoDTO.converter(Arrays.asList(topico, topico, topico));
	}
}
