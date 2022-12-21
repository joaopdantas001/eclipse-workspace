
public class Calculo {

	private double valorconversao;

	protected void setValorconversao(double quantidade, double moedadestinovalor) {

		this.valorconversao = quantidade * moedadestinovalor;

	}
	
	protected double getValorConversao() {
		return valorconversao;
	}

}
