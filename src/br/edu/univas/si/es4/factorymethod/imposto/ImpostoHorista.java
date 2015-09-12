package br.edu.univas.si.es4.factorymethod.imposto;

public class ImpostoHorista implements CalculadoraImposto {
	
	private double valorHora;
	private int quantidadeHoras;
	
	public ImpostoHorista (double valorHora, int quantidadeHoras) {
		this.valorHora = valorHora;
		this.quantidadeHoras = quantidadeHoras;
	}
	@Override
	public double calcularImposto(){
		return (valorHora * quantidadeHoras) * .2;
	}

}
