package br.edu.univas.si.es4.factorymethod.imposto;

public abstract class Funcionario {
	
	private String nome;
	
	public double salarioLiquido() {
		throw new RuntimeException("Não Implementado");
	}
	
	public abstract double salarioBruto();

	
	
	public String getNome() {
		return nome;
		
	}
	
	public void setNome(String nome){
		this.nome = nome;
	}

}
