package moedaconversor;

public class ConversorMoeda extends Moeda{
	
	private double valorparaconversao;
	private String data;
	
	protected double getValorparaconversao() {
		return valorparaconversao;
	}
	protected void setValorparaconversao(double valorparaconversao) {
		this.valorparaconversao = valorparaconversao;
	}
	protected String getData() {
		return data;
	}
	protected void setData(String data) {
		this.data = data;
	}
	

	
	
}

