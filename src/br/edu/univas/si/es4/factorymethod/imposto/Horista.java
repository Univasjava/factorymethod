package br.edu.univas.si.es4.factorymethod.imposto;

public class Horista extends Funcionario {
	
	private double valorHora;
	private int quantidadeHoras;
	
	@Override
	public double salarioBruto() {
		return valorHora * quantidadeHoras;
	}
	public double getValorHora() {
		return valorHora;
	}
	public void setValorHora(double valorHora) {
		this.valorHora = valorHora;
	}
	public int getQuantidadeHoras() {
		return quantidadeHoras;
	}
	public void setQuantidadeHoras(int quantidadeHoras) {
		this.quantidadeHoras = quantidadeHoras;
	}
	@Override
	protected CalculadoraImposto getCalculadoraImposto() {
		return new ImpostoHorista(valorHora, quantidadeHoras);
	}
	
	

}
