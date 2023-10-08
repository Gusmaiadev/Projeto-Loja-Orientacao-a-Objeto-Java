package br.com.fiap.beans;

public class Colaborador {

	private String nome;
	private int idade;
	private String cargo;
	private double salario;
	
	
	public Colaborador() {
		super();
	}
	
	
	public Colaborador(String nome, int idade, String cargo, double salario) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.cargo = cargo;
		this.salario = salario;
	}


	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
	
}
