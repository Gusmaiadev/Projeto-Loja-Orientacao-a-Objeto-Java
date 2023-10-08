package br.com.fiap.beans;

public class Endereco {
	
	private String cep;
	private String rua;
	private String bairro;
	private int numero;
	private String cidade;
	
	
	public Endereco() {
		super();
	}
	
	
	public Endereco(String cep, String rua, String bairro, int numero, String cidade) {
		super();
		this.cep = cep;
		this.rua = rua;
		this.bairro = bairro;
		this.numero = numero;
		this.cidade = cidade;
	}


	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	
	
	

}
