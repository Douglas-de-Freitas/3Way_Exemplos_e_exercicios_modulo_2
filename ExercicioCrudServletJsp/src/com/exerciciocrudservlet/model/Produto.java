package com.exerciciocrudservlet.model;

public class Produto {

	private int id;
	private String descricao;
	private int codigo;
	private int quantidade;
	
	public Produto() {
		
	}

	public Produto(int id, String descricao, int codigo, int quantidade) {
		this.id = id;
		this.descricao = descricao;
		this.codigo = codigo;
		this.quantidade = quantidade;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

}
