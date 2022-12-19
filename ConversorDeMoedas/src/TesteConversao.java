import java.text.NumberFormat;
public class TesteConversao {

	public static void main(String[] args) {

		Cambio brl = new Cambio();  //objeto brl
		
		brl.setIso("BRL");
		brl.setNome("Real");
		brl.setNomes("Reais");
		brl.setSimbolo("R$");
		brl.setValorcambiobrl(1);
		brl.setValorcambioeur(0.18);
		brl.setValorcambiojpy(25.87);
		brl.setValorcambiousd(0.19);

		
		Cambio eur = new Cambio() ; //objeto eur
			
		eur.setIso("EUR");
		eur.setNome("Euro");
		eur.setNomes("Euros");
		eur.setSimbolo("EUR$");
		eur.setValorcambiobrl(5.60);
		eur.setValorcambioeur(1);
		eur.setValorcambiojpy(145.3);
		eur.setValorcambiousd(1.06);
		
		ConversaoMoeda brlxeur = new ConversaoMoeda(); //objeto brlxeur ou real para euro
		brlxeur.setQuantidade(50);  
		brlxeur.setValorconversao(brl.getValorcambiobrl(), brlxeur.getQuantidade(), 
				brl.getValorcambioeur());
		
		String brlxeurValorFormatadoQuantidade = NumberFormat.getCurrencyInstance().format(brlxeur.getQuantidade());
		//converter moeda de origem para 2 casas decimais
		String brlxeurvalorFormatadoConversao = NumberFormat.getCurrencyInstance().format(brlxeur.getValorconversao());
		// converter moeda de destino para 2 casas decimais
	
		if (brlxeur.getQuantidade() > 0) {
			System.out.print(brl.getSimbolo() + " " + brlxeurValorFormatadoQuantidade + 
			" " + brl.getNomes() + " valem ");
		}
			else {
				System.out.print(brl.getSimbolo() + " " + brlxeurValorFormatadoQuantidade + 
				" " + brl.getNome() + " vale ");
			}
		
		if (brlxeur.getValorconversao() > 0) {
			System.out.println(eur.getSimbolo() + " " + brlxeurvalorFormatadoConversao + 
			" " + eur.getNomes());
		} 
			else {
			System.out.println(eur.getSimbolo() + " " + brlxeurvalorFormatadoConversao + 
			" " + eur.getNome());	
			}
			
		System.out.println("----------------------------");
		
		ConversaoMoeda eurxbrl = new ConversaoMoeda(); //objeto eur x brl ou euro para real
		eurxbrl.setQuantidade(60);
		eurxbrl.setValorconversao(eur.getValorcambioeur(), eurxbrl.getQuantidade(), eur.getValorcambiobrl());
		
		String eurxbrlValorFormatadoQuantidade = NumberFormat.getCurrencyInstance().format(eurxbrl.getQuantidade());
		//converter moeda de origem para 2 casas decimais
		String eurxbrlvalorFormatadoConversao = NumberFormat.getCurrencyInstance().format(eurxbrl.getValorconversao());
		// converter moeda de destino para 2 casas decimais
		
		if (eurxbrl.getQuantidade() > 0) {
			System.out.print(eur.getSimbolo() + " " + eurxbrlValorFormatadoQuantidade + 
			" " + eur.getNomes() + " valem ");
		}
			else {
				System.out.print(eur.getSimbolo() + " " + eurxbrlValorFormatadoQuantidade + 
				" " + eur.getNome() + " vale ");
			}
		
		if (eurxbrl.getValorconversao() > 0) {
			System.out.println(brl.getSimbolo() + " " + eurxbrlvalorFormatadoConversao + 
			" " + brl.getNomes());
		} 
			else {
			System.out.println(brl.getSimbolo() + " " + eurxbrlvalorFormatadoConversao + 
			" " + brl.getNome());	
			}
	}

}
