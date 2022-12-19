
public class ConversaoMoeda {

	private double moedaorigemvalor;
	private String moedaorigemiso;
	private double moedadestinovalor;
	private String moedadestinoiso;
	private double valorconversao;
	private double quantidade;
	
	protected double getMoedaorigemvalor() {
		return moedaorigemvalor;
	}
	protected void setMoedaorigemvalor(double moedaorigemvalor) {
		this.moedaorigemvalor = moedaorigemvalor;
	}
	protected String getMoedaorigemiso() {
		return moedaorigemiso;
	}
	protected void setMoedaorigemiso(String moedaorigemiso) {
		this.moedaorigemiso = moedaorigemiso;
	}
	protected double getMoedadestinovalor() {
		return moedadestinovalor;
	}
	protected void setMoedadestinovalor(double moedadestinovalor) {
		this.moedadestinovalor = moedadestinovalor;
	}
	protected String getMoedadestinoiso() {
		return moedadestinoiso;
	}
	protected void setMoedadestinoiso(String moedadestinoiso) {
		this.moedadestinoiso = moedadestinoiso;
	}
	protected void setQuantidade(double quantidade) {
		this.quantidade = quantidade;
	}
	protected double getQuantidade() {
		return quantidade;
	}

	protected double getValorconversao() { 
		return valorconversao;
	}
	
	protected void setValorconversao(double moedaorigemvalor, double quantidade, double moedadestinovalor) {
		
		this.valorconversao = (moedaorigemvalor*quantidade) * moedadestinovalor;
		
	}
	
}
