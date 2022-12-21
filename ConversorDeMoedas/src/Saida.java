import java.text.NumberFormat;
import java.util.Scanner;

public class Saida {

	private double saida;
	
	Calculo calculo = new Calculo();
	
	this.saida = calculo.getValorConversao();

}

	
/*	private String saida;
	
	protected void setSaida(String saida) {
		this.saida = saida;	// euros
		
	protected void setSaida
		
		ConversaoMoeda eurxbrl = new ConversaoMoeda(); // objeto euro para real
		eurxbrl.setQuantidade(quantidadeEur);
		eurxbrl.setValorconversao(eur.getValorcambioeur(), eurxbrl.getQuantidade(), eur.getValorcambiobrl());
		
		String eurxbrlValorFormatadoQuantidade = NumberFormat.getCurrencyInstance().format(eurxbrl.getQuantidade());
		// converter moeda de origem para 2 casas decimais
		String eurxbrlvalorFormatadoConversao = NumberFormat.getCurrencyInstance().format(eurxbrl.getValorconversao());
		// converter moeda de destino para 2 casas decimais

		if (eurxbrl.getQuantidade() == 1 || eurxbrl.getQuantidade() == 0.01) {
			System.out.print(eur.getSimbolo() + " " + eurxbrlValorFormatadoQuantidade + 
			" " + eur.getNome() + " valem "); } else { System.out.print(eur.getSimbolo()
			+ " " + eurxbrlValorFormatadoQuantidade + " " + eur.getNomes() + " vale "); 
		}

		if (eurxbrl.getQuantidade() == 1 || eurxbrl.getQuantidade() == 0.01) {
			System.out.println(brl.getSimbolo() + " " + eurxbrlvalorFormatadoConversao + 
			" " + brl.getNome()); } else { System.out.println(brl.getSimbolo() + " " +
			eurxbrlvalorFormatadoConversao + " " + brl.getNomes()); 
		}
		
	} else { // reais
		System.out.println("Digite quantos " + brl.getNomes() + " voce quer converter");
		double quantidadeBrl = sc.nextDouble();
		
		ConversaoMoeda brlxeur = new ConversaoMoeda(); // objeto real para euro
		
		brlxeur.setQuantidade(quantidadeBrl);
		brlxeur.setValorconversao(brl.getValorcambioeur(), brlxeur.getQuantidade(), brl.getValorcambioeur());
		
		String brlxeurValorFormatadoQuantidade = NumberFormat.getCurrencyInstance().format(brlxeur.getQuantidade());
		// converter moeda de origem para 2 casas decimais
		String brlxeurvalorFormatadoConversao = NumberFormat.getCurrencyInstance().format(brlxeur.getValorconversao());
		// converter moeda de destino para 2 casas decimais

		if (brlxeur.getQuantidade() == 1 || brlxeur.getQuantidade() == 0.01) {
			System.out
					.print(brl.getSimbolo() + " " + brlxeurValorFormatadoQuantidade + " " + brl.getNome() + " vale ");
		} else {
			System.out.print(brl.getSimbolo() + " " + brlxeurValorFormatadoQuantidade + " " + brl.getNomes() + " vale ");
		}

		if (brlxeur.getQuantidade() == 1 || brlxeur.getQuantidade() == 0.01) {
			System.out.println(eur.getSimbolo() + " " + brlxeurvalorFormatadoConversao + " " + eur.getNomes());
		} else {
			System.out.println(eur.getSimbolo() + " " + brlxeurvalorFormatadoConversao + " " + eur.getNome());
		}
		
	}
}
*/