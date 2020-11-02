package br.com.alura.forum.repository;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import br.com.alura.forum.modelo.Topico;

public interface TopicoRepsitory extends JpaRepository<Topico, Long> {


	Page<Topico> findByCursoNome(String nomeCursoString, Pageable paginacao);

	
}
