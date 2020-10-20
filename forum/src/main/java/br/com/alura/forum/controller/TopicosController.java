package br.com.alura.forum.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.alura.forum.controller.dto.TopicoDTO;
import br.com.alura.forum.modelo.Topico;
import br.com.alura.forum.repository.TopicoRepsitory;

@RestController
@RequestMapping("/topicos")
public class TopicosController {

	@Autowired
	private TopicoRepsitory repository;

	@GetMapping
	public List<TopicoDTO> lista(String nomeCurso) {

		if (nomeCurso == null) {
			List<Topico> topicos = this.repository.findAll();
			return TopicoDTO.converter(topicos);

		} else {
			List<Topico> topicos = this.repository.findByCurso_Nome(nomeCurso);
			return TopicoDTO.converter(topicos);
		}

	}
	
	@PostMapping
	public void cadastrar(Topico topico) {
		
	}
}
