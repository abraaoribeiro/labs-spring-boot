package br.com.alura.microservice.loja.service;

import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import br.com.alura.microservice.loja.dto.CompraDTO;
import br.com.alura.microservice.loja.dto.InforFornecedorDTO;

public class CompraService {

	public void realizarCompra(CompraDTO compra) {
		RestTemplate cliet = new RestTemplate();

		ResponseEntity<InforFornecedorDTO> exchange = cliet.exchange(
				"http://8081/info" + compra.getEndereco().getEstado(), 
				HttpMethod.GET,
				null, 
				InforFornecedorDTO.class);
		
		System.out.println(exchange.getBody().getEndereco());
	}

}
