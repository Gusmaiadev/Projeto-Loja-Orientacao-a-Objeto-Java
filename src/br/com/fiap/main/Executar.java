package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.*;

public class Executar {

	public static void main(String[] args) {
		
		
		// String nome, String segmento, int unidades
		Loja objLoja = new Loja(JOptionPane.showInputDialog("Digite o nome da loja: "),
				JOptionPane.showInputDialog("Digite qual é o segmento da loja: "),
				Integer.parseInt(JOptionPane.showInputDialog("Digite o número de unidades: ")));
		
		// String cep, String rua, String bairro, int numero, String cidade
		Endereco objEndereco = new Endereco(JOptionPane.showInputDialog("CEP da loja; "),
				JOptionPane.showInputDialog("Rua da Loja: "),
				JOptionPane.showInputDialog("Bairro da Loja: "),
				Integer.parseInt(JOptionPane.showInputDialog("Número da Loja: ")),
				JOptionPane.showInputDialog("Cidade da loja: "));
		
		//String nome, int idade, String cargo, double salario
		Colaborador objColaborador = new Colaborador(JOptionPane.showInputDialog("Nome do Colaborador: "),
				Integer.parseInt(JOptionPane.showInputDialog("Idade do colaborador: ")),
				JOptionPane.showInputDialog("Cargo do colaborador: "),
				Double.parseDouble(JOptionPane.showInputDialog("Salário do colaborador: ")));
		
		System.out.println("Nome da Loja: " + objLoja.getNome() +
				"\nSegmento da loja: " + objLoja.getSegmento() + 
				"\nNúmero de unidades: " + objLoja.getUnidades() +
				"\n\nCEP: " + objEndereco.getCep() + 
				"\nRua: " + objEndereco.getRua() +
				"\nBairro: " + objEndereco.getBairro() +
				"\nNúmero: " + objEndereco.getNumero() +
				"\nCidade: " + objEndereco.getCidade() +
				"\n\nColaborador: " + objColaborador.getNome() +
				"\nIdade: " + objColaborador.getIdade() +
				"\nCargo: " + objColaborador.getCargo() + 
				"\nSalário: " + objColaborador.getSalario());

	}

}
