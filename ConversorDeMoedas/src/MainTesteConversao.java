import java.text.NumberFormat;
import java.util.Scanner;

public class MainTesteConversao {
	
	public static void main(String[] args) {
		
		Cambio eur = new Cambio(); // objeto eur
		
			eur.setIso("EUR");
			eur.setNome("Euro");
			eur.setNomes("Euros");
			eur.setSimbolo("EUR$");
			eur.setValorcambiobrl(5.60);
			eur.setValorcambioeur(1);
			eur.setValorcambiojpy(145.3);
			eur.setValorcambiousd(1.06);
		
		Cambio brl = new Cambio(); // objeto brl
		
			brl.setIso("BRL");
			brl.setNome("Real");
			brl.setNomes("Reais");
			brl.setSimbolo("R$");
			brl.setValorcambiobrl(1);
			brl.setValorcambioeur(0.18);
			brl.setValorcambiojpy(25.87);
			brl.setValorcambiousd(0.19);

		Entrada entrada = new Entrada();
			
			entrada.escolhaMoeda(eur.getNomes(), brl.getNomes());
		
			entrada.quantidadeMoeda(eur.getNomes(), brl.getNomes());
	
		Calculo calculo = new Calculo();
			
			if (entrada.getEscolha() == 1) {
				
				calculo.setCalculoConversao(entrada.getQuantidade(), eur.getValorcambiobrl());
				
			} else {
				
				calculo.setCalculoConversao(entrada.getQuantidade(), brl.getValorcambioeur());
				
			}
		
		Saida saida = new Saida();
		
			if (entrada.getEscolha() == 1) {
			
				saida.setSaidaConversao(eur.getSimbolo(), entrada.getQuantidade(), brl.getSimbolo(), calculo.getValorConversao());
		
			}  else {
			
				saida.setSaidaConversao(brl.getSimbolo(), entrada.getQuantidade(), eur.getSimbolo(), calculo.getValorConversao());	
			}		
		
			System.out.println(saida.getSaida());
	}
}