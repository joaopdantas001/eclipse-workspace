package moeda;

public class TesteConversao {

	public static void main(String[] args) {
		
		Moeda a = new Moeda();
		
		a.setTaxadecambiocodigoiso("R$");
		a.setTaxadecambiomoeda("Real");
		a.setTaxadecambiopais("Brasil");
		a.setTaxadecambiovalorars(32.28);
		a.setTaxadecambiovalorbrl(1.00);
		a.setTaxadecambiovaloreur(0.18);
		a.setTaxadecambiovalorusd(0.19);
		
		Moeda b = new Moeda ();
		
		b.setTaxadecambiocodigoiso("US$");
		b.setTaxadecambiomoeda("Dolar Americano");
		b.setTaxadecambiopais("Estados Unidos");
		b.setTaxadecambiovalorars(169.50);
		b.setTaxadecambiovalorbrl(5.25);
		b.setTaxadecambiovaloreur(0.95);
		b.setTaxadecambiovalorusd(1);
	
		ConversorMoeda ab = new ConversorMoeda();
		
		ab.setConversaodata("06/12/2022");
		ab.setConversaocodigoiso(a.getTaxadecambiocodigoiso() + " " + a.getTaxadecambiovalorbrl() + " x " + b.getTaxadecambiocodigoiso() + " " + a.getTaxadecambiovalorusd());
		ab.setConversaoquantidade(30*a.getTaxadecambiovalorbrl());
		
		
		
		System.out.println(ab.getConversaodata());
		System.out.println(ab.getConversaocodigoiso());
		
	}

}
