package br.com.alura.microservice.loja.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import br.com.alura.microservice.loja.dto.CompraDTO;
import br.com.alura.microservice.loja.dto.InforFornecedorDTO;

@Service
public class CompraService {

	@Autowired
	private RestTemplate client;
	
	public void realizarCompra(CompraDTO compra) {
		ResponseEntity<InforFornecedorDTO> exchange = client.exchange(
				"http://localhost/8081/info/" + compra.getEndereco().getEstado(), 
				HttpMethod.GET, 
				null,
				InforFornecedorDTO.class);

		System.out.println(exchange.getBody().getEndereco());
	}

}
