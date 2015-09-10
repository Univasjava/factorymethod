package br.edu.univas.si.es4.factorymethod.imposto;

public class ImpostoMensalista {
			
		private double salarioMensal;
		
		public ImpostoMensalista (double salarioMensal, int horasExtras) {
			this.salarioMensal = salarioMensal;
		}
		
		public double calcularImposto(){
			return salarioMensal * .2;
		}

}
