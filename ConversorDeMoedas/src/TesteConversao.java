
public class TesteConversao {

	public static void main(String[] args) {

		Cambio brl = new Cambio();
		
		brl.setIso("BRL");
		brl.setNome("Real");
		brl.setNomes("Reais");
		brl.setSimbolo("R$");
		brl.setValorcambiobrl(1);
		brl.setValorcambioeur(0.18);
		brl.setValorcambiojpy(25.87);
		brl.setValorcambiousd(0.19);
		
		/*
		 * System.out.println(brl.getIso()); System.out.println(brl.getNome());
		 * System.out.println(brl.getSimbolo());
		 * System.out.println(brl.getValorcambiobrl());
		 * System.out.println(brl.getValorcambioeur());
		 * System.out.println(brl.getValorcambiojpy());
		 * System.out.println(brl.getValorcambiousd());
		 * System.out.println("----------------------------");
		 */
		
		Cambio eur = new Cambio() ;
			
		eur.setIso("EUR");
		eur.setNome("Euro");
		eur.setNomes("Euros");
		eur.setSimbolo("EUR$");
		eur.setValorcambiobrl(5.60);
		eur.setValorcambioeur(1);
		eur.setValorcambiojpy(145.3);
		eur.setValorcambiousd(1.06);
		
		/*
		 * System.out.println(eur.getIso()); System.out.println(eur.getNome());
		 * System.out.println(eur.getSimbolo());
		 * System.out.println(eur.getValorcambiobrl());
		 * System.out.println(eur.getValorcambioeur());
		 * System.out.println(eur.getValorcambiojpy());
		 * System.out.println(eur.getValorcambiousd());
		 * System.out.println("----------------------------");
		 */
		
		ConversaoMoeda brlxeur = new ConversaoMoeda();

		brlxeur.setQuantidade(50);
		brlxeur.setValorconversao(brl.getValorcambiobrl(), brlxeur.getQuantidade(), brl.getValorcambioeur());
		

		System.out.println(brl.getSimbolo() + " " + brlxeur.getQuantidade() + " " +
				brl.getNome() + " valem " + eur.getSimbolo() + " " + 
				brlxeur.getValorconversao() + 
				" " + eur.getNome());
		
		System.out.println("----------------------------");
		
		ConversaoMoeda eurxbrl = new ConversaoMoeda();

		eurxbrl.setQuantidade(20);
		eurxbrl.setValorconversao(eur.getValorcambioeur(), eurxbrl.getQuantidade(), eur.getValorcambiobrl());
		
		System.out.println(eur.getSimbolo() + " " + eurxbrl.getQuantidade() + " " + 
				eur.getNome() + " valem " + brl.getSimbolo() + " " + 
				eurxbrl.getValorconversao() + " " + brl.getNome());
	}

}
