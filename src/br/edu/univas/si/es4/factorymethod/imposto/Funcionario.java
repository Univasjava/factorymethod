package br.edu.univas.si.es4.factorymethod.imposto;

public abstract class Funcionario {
	
	private String nome;
	
	public double salarioLiquido() {
		double impostos = getCalculadoraImposto().calcularImposto();
		double salarioLiquido = salarioBruto() - impostos;
		return salarioLiquido;
	}
	
	public abstract double salarioBruto();

	protected abstract CalculadoraImposto getCalculadoraImposto();
	
	public String getNome() {
		return nome;
		
	}
	
	public void setNome(String nome){
		this.nome = nome;
	}

}
