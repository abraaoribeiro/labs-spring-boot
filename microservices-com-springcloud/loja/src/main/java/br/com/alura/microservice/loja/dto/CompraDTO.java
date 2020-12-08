package br.com.alura.microservice.loja.dto;

import java.util.List;

public class CompraDTO {

	private List<ItemDaCompra> itens;
	
	private EnderecoDTO endereco;

	public List<ItemDaCompra> getItens() {
		return itens;
	}

	public void setItens(List<ItemDaCompra> itens) {
		this.itens = itens;
	}

	public EnderecoDTO getEndereco() {
		return endereco;
	}

	public void setEndereco(EnderecoDTO endereco) {
		this.endereco = endereco;
	}
	
	
}
