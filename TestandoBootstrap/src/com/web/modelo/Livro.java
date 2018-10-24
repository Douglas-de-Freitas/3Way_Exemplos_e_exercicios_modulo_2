package com.web.modelo;

public class Livro {

	private String autor;
	private String titulo;
	private String descricao;

	public Livro() {

	}

	public Livro(String autor, String titulo, String descricao) {
		this.autor = autor;
		this.titulo = titulo;
		this.descricao = descricao;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Override
	public String toString() {
		return "Livro [autor=" + autor + ", titulo=" + titulo + ", descricao=" + descricao + "]";
	}

}
