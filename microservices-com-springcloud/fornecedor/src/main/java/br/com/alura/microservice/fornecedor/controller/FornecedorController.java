package br.com.alura.microservice.fornecedor.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.alura.microservice.fornecedor.model.InfoFornecedor;
import br.com.alura.microservice.fornecedor.service.InforService;

@RestController
@RequestMapping("/info")
public class FornecedorController {

	@Autowired
	private InforService infoService;
	
	@RequestMapping("/{estado}")
	public InfoFornecedor getInfoEstado(@PathVariable String estado) {
		return infoService.getInfoPorEstado(estado);
	}
}
