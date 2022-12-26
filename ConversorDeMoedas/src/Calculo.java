
public class Calculo {

	private double calculoConversao;

	protected void setCalculoConversao(double quantidadeMoedaOrigem, double cambioMoedaDestino) {
		
		this.calculoConversao = quantidadeMoedaOrigem * cambioMoedaDestino;

	}
	
	protected double getValorConversao() {
		return calculoConversao;
	}

}
