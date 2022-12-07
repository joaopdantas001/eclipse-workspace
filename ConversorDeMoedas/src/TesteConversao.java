import java.text.DecimalFormat;

public class TesteConversao {

	public static void main(String[] args) {

		TaxaDeCambio brl = new TaxaDeCambio();
		
		brl.setCambiobrl(1);
		brl.setCambioeur(5.4840);
		brl.setCambiogbp(6.3647);
		brl.setCambiojpy(0.03821);
		brl.setCambiousd(5.2172);
		brl.setCodigosiscomex(790);
		brl.setDescricaomoeda("Real");
		brl.setPais("Brasil");
		brl.setSimboloiso("BRL");
		brl.setSimbolomonetario("R$");
		
		TaxaDeCambio eur = new TaxaDeCambio();
		
		eur.setCambiobrl(0.1826);
		eur.setCambioeur(1);
		eur.setCambiogbp(1.1612);
		eur.setCambiojpy(0.69715);
		eur.setCambiousd(0.9524);
		eur.setCodigosiscomex(978);
		eur.setDescricaomoeda("Euro");
		eur.setPais("Uniao Europeia");
		eur.setSimboloiso("EUR");
		eur.setSimbolomonetario("€");
		
TaxaDeCambio gbp = new TaxaDeCambio();
		
		gbp.setCambiobrl(0.1572);
		gbp.setCambioeur(0.8612);
		gbp.setCambiogbp(1);
		gbp.setCambiojpy(0.006005);
		gbp.setCambiousd(0.9525);
		gbp.setCodigosiscomex(540);
		gbp.setDescricaomoeda("Libra Esterlina");
		gbp.setPais("Gra-Bretanha");
		gbp.setSimboloiso("GBP");
		gbp.setSimbolomonetario("£");

TaxaDeCambio jpy = new TaxaDeCambio();
		
		jpy.setCambiobrl(26.1935);
		jpy.setCambioeur(143.41);
		jpy.setCambiogbp(166.54);
		jpy.setCambiojpy(1);
		jpy.setCambiousd(136.43);
		jpy.setCodigosiscomex(470);
		jpy.setDescricaomoeda("Iene Japones");
		jpy.setPais("Japão");
		jpy.setSimboloiso("JPY");
		jpy.setSimbolomonetario("¥");
		
TaxaDeCambio usd = new TaxaDeCambio();
		
		usd.setCambiobrl(0.1921);
		usd.setCambioeur(1.0517);
		usd.setCambiogbp(1.2215);
		usd.setCambiojpy(0.733350);
		usd.setCambiousd(1);
		usd.setCodigosiscomex(220);
		usd.setDescricaomoeda("Dolar dos EUA");
		usd.setPais("Estados Unidos");
		usd.setSimboloiso("USD");
		usd.setSimbolomonetario("US$");
		
		usd.setQuantidade(10);
		brl.setQuantidade(20);
		jpy.setQuantidade(30);
		
		System.out.println("    "                                + brl.getSimboloiso()                      + "    " + eur.getSimboloiso()                      + "    " + gbp.getSimboloiso()                      + "    " + jpy.getSimboloiso() + "   " + usd.getSimboloiso());
		System.out.println(""     + brl.getSimboloiso() + " "    + String.format("%.2f",brl.getCambiobrl()) + "   "  + String.format("%.2f",brl.getCambioeur()) + "   "  + String.format("%.2f",brl.getCambiogbp()) + "   "  + String.format("%.2f",brl.getCambiojpy()) + "  " + String.format("%.2f",brl.getCambiousd()));
		System.out.println(""     + eur.getSimboloiso() + " "    + String.format("%.2f",eur.getCambiobrl()) + "   "  + String.format("%.2f",eur.getCambioeur()) + "   "  + String.format("%.2f",eur.getCambiogbp()) + "   "  + String.format("%.2f",eur.getCambiojpy()) + "  " + String.format("%.2f",eur.getCambiousd()));
		System.out.println(""     + gbp.getSimboloiso() + " "    + String.format("%.2f",gbp.getCambiobrl()) + "   "  + String.format("%.2f",gbp.getCambioeur()) + "   "  + String.format("%.2f",gbp.getCambiogbp()) + "   "  + String.format("%.2f",gbp.getCambiojpy()) + "  " + String.format("%.2f",gbp.getCambiousd()));
		System.out.println(""     + jpy.getSimboloiso() + " "    + String.format("%.2f",jpy.getCambiobrl()) + "  "   + String.format("%.2f",jpy.getCambioeur()) + " "    + String.format("%.2f",jpy.getCambiogbp()) + " "    + String.format("%.2f",jpy.getCambiojpy()) + "  " + String.format("%.2f",jpy.getCambiousd()));
		System.out.println(""     + usd.getSimboloiso() + " "    + String.format("%.2f",usd.getCambiobrl()) + "   "  + String.format("%.2f",usd.getCambioeur()) + "   "  + String.format("%.2f",usd.getCambiogbp()) + "   "   + String.format("%.2f",usd.getCambiojpy()) + "  " + String.format("%.2f",usd.getCambiousd()));
		System.out.println("");
		System.out.println("Conversao de Moedas:");
		System.out.println(usd.getQuantidade() + " " + usd.getDescricaomoeda() + " --> " + String.format("%.2f",usd.getCambiobrl()*usd.getQuantidade()) + "    " + brl.getDescricaomoeda());
		System.out.println(brl.getQuantidade() + " " + brl.getDescricaomoeda() + "          --> " + String.format("%.2f",brl.getCambioeur()*brl.getQuantidade()) + "  " + eur.getDescricaomoeda());
		System.out.println(jpy.getQuantidade() + " " + jpy.getDescricaomoeda() + "  --> " + String.format("%.2f",jpy.getCambiousd()*jpy.getQuantidade()) + " " + usd.getDescricaomoeda());

	}

}
