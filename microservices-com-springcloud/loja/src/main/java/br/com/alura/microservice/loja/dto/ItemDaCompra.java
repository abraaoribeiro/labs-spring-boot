package br.com.alura.microservice.loja.dto;

public class ItemDaCompra {

	private Long id;
	private int quatidade;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getQuatidade() {
		return quatidade;
	}

	public void setQuatidade(int quatidade) {
		this.quatidade = quatidade;
	}
}
