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
		
		entrada.escolhaMoeda();
//		System.out.println(entrada.getEscolha());
		
		entrada.quantidadeMoeda();
//		System.out.println(entrada.getQuantidade());
		
	
		Calculo calculo = new Calculo();
			
		int escolha = entrada.getEscolha();

		double quantidade = entrada.getQuantidade();
		  
		if (escolha == 1) {
		  
				calculo.setValorconversao(quantidade, eur.getValorcambiobrl());
		 
		} else {
		 
		 		calculo.setValorconversao(quantidade, brl.getValorcambioeur()); 
		 }
		 	
		 System.out.println(calculo.getValorConversao());
		
		

		
	}
}