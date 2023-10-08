package br.com.fiap.beans;

public class Loja {

	private String nome;
	private String segmento;
	private int unidades;
	private Endereco endereco;
	
	
	public Loja() {
		super();
	}
	
	
	public Loja(String nome, String segmento, int unidades) {
		super();
		this.nome = nome;
		this.segmento = segmento;
		this.unidades = unidades;
	}
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSegmento() {
		return segmento;
	}
	public void setSegmento(String segmento) {
		this.segmento = segmento;
	}
	public int getUnidades() {
		return unidades;
	}
	public void setUnidades(int unidades) {
		this.unidades = unidades;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	
	
	
}
