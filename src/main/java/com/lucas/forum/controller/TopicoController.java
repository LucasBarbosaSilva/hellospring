package com.lucas.forum.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lucas.forum.modelo.Curso;
import com.lucas.forum.modelo.Topico;

@Controller
public class TopicoController {
	
	@RequestMapping("/topicos")
	@ResponseBody
	public List<Topico> lista(){
		Topico topico = new Topico("Duvida", "Duvida sobre o Spring", new Curso("Springboot", "Programação"));
		
		return Arrays.asList(topico, topico, topico);
	}
}
