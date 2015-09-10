package br.edu.univas.si.es4.factorymethod.imposto;

public class ImpostoHorista {
	
	private double valorHora;
	private int quantidadeHoras;
	
	public ImpostoHorista (double valorHora, int quantidadeHoras) {
		this.valorHora = valorHora;
		this.quantidadeHoras = quantidadeHoras;
	}
	
	public double calcularImposto(){
		return (valorHora * quantidadeHoras) * .2;
	}

}
