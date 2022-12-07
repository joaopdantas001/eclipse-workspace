package moedaconversor;

public class TesteConversao extends Moeda{
	
	public static void main(String[] args) {
		
		ConversorMoeda brl = new ConversorMoeda();
		
		brl.setData("07/12/2022");
		brl.setValorparaconversao(10);
		brl.setPais("Brasil");
		brl.setNomemoeda("Real");
		brl.setSigla("R$");
		brl.setCodigo("BRL");
		brl.setCambiobrl(1);
		brl.setCambiousd(0.1911);
		brl.setCambioeur(0.1816);
		brl.setCambiogbp(0.1569);
		brl.setCambiojpy(26.2075);
		
		
		ConversorMoeda usd = new ConversorMoeda();
		
		usd.setData("07/12/2022");
		usd.setValorparaconversao(20);
		usd.setPais("Estados Unidos");
		usd.setNomemoeda("Dolar Americano");
		usd.setSigla("US$");
		usd.setCodigo("USD");
		usd.setCambiobrl(5.2203);
		usd.setCambiousd(1);
		usd.setCambioeur(0.9487);
		usd.setCambiogbp(0.8184);
		usd.setCambiojpy(136.56);
		
		ConversorMoeda eur = new ConversorMoeda();
		
		eur.setData("07/12/2022");
		eur.setValorparaconversao(30);
		eur.setPais("União Europeia");
		eur.setNomemoeda("Euro");
		eur.setSigla("#");
		eur.setCodigo("EUR");
		eur.setCambiobrl(5.5030);
		eur.setCambiousd(1.5040);
		eur.setCambioeur(1);
		eur.setCambiogbp(0.8625);
		eur.setCambiojpy(143.94);
		
		ConversorMoeda gbp = new ConversorMoeda();
		
		gbp.setData("07/12/2022");
		gbp.setValorparaconversao(40);
		gbp.setPais("#");
		gbp.setNomemoeda("#");
		gbp.setSigla("#");
		gbp.setCodigo("GBP");
		gbp.setCambiobrl(6.3789);
		gbp.setCambiousd(1.2220);
		gbp.setCambioeur(1.1594);
		gbp.setCambiogbp(1);
		gbp.setCambiojpy(166.88);
		
		ConversorMoeda jpy = new ConversorMoeda();
		
		jpy.setData("07/12/2022");
		jpy.setValorparaconversao(50);
		jpy.setPais("#");
		jpy.setNomemoeda("#");
		jpy.setSigla("#");
		jpy.setCodigo("JPY");
		jpy.setCambiobrl(0.03823);
		jpy.setCambiousd(0.732250);
		jpy.setCambioeur(0.69465);
		jpy.setCambiogbp(0.005995);
		jpy.setCambiojpy(1);
		
		System.out.println("     " + brl.getCodigo() + "     " + usd.getCodigo() + "     " + eur.getCodigo() + "     " + gbp.getCodigo() + "      " + jpy.getCodigo() + "   ");
		System.out.println(" " + brl.getCodigo() + " " + brl.getCambiobrl() + "     " + brl.getCambiousd() + "  " + brl.getCambioeur() + "  " + brl.getCambiogbp() + "   " + brl.getCambiojpy());
		System.out.println(" " + usd.getCodigo() + " " + usd.getCambiobrl() + "  " + usd.getCambiousd() + "     " + usd.getCambioeur() + "  " + usd.getCambiogbp() + "   " + usd.getCambiojpy());
		System.out.println(" " + eur.getCodigo() + " " + eur.getCambiobrl() + "   " + eur.getCambiousd() + "   " + eur.getCambioeur() + "     " + eur.getCambiogbp() + "   " + eur.getCambiojpy());
		System.out.println(" " + gbp.getCodigo() + " " + gbp.getCambiobrl() + "  " + gbp.getCambiousd() + "   " + gbp.getCambioeur() + "  "   + gbp.getCambiogbp() + "      " + gbp.getCambiojpy());
		System.out.println(" " + jpy.getCodigo() + " " + jpy.getCambiobrl() + " " + jpy.getCambiousd() + " " +jpy.getCambioeur() + " " + jpy.getCambiogbp() + " " + jpy.getCambiojpy());
		System.out.println(" ");
		System.out.println(" " + usd.getSigla() + " " + usd.getValorparaconversao() + " --> " + brl.getSigla() + " " + usd.getValorparaconversao()*usd.getCambiobrl());

	}

	
}
