import java.text.NumberFormat;
import java.util.Scanner;

public class MainTesteConversao {
	
	public static void main(String[] args) {
		
		Moeda brl = new Moeda(); // objeto brl
		
			brl.setId(1);
			brl.setIso("BRL");
			brl.setNome("Real");
			brl.setNomes("Reais");
			brl.setSimbolo("R$");
			brl.setValorcambiobrl(1);
			brl.setValorcambioeur(0.18);
			brl.setValorcambiojpy(25.87);
			brl.setValorcambiousd(0.19);
		
		Moeda eur = new Moeda(); // objeto eur
		
			eur.setId(2);
			eur.setIso("EUR");
			eur.setNome("Euro");
			eur.setNomes("Euros");
			eur.setSimbolo("EUR$");
			eur.setValorcambiobrl(5.60);
			eur.setValorcambioeur(1);
			eur.setValorcambiojpy(145.3);
			eur.setValorcambiousd(1.06);
		
		Moeda jpy = new Moeda(); // objeto jpy
			
			jpy.setId(3);
			jpy.setIso("JPY");
			jpy.setNome("Iene");
			jpy.setNomes("Ienes");
			jpy.setSimbolo("JPY$");
			jpy.setValorcambiobrl(5.60);
			jpy.setValorcambioeur(1);
			jpy.setValorcambiojpy(145.3);
			jpy.setValorcambiousd(1.06);
			
		Moeda usd = new Moeda(); // objeto usd
			
			usd.setId(4);
			usd.setIso("USD");
			usd.setNome("Dolar");
			usd.setNomes("Dolares");
			usd.setSimbolo("USD$");
			usd.setValorcambiobrl(5.60);
			usd.setValorcambioeur(1);
			usd.setValorcambiojpy(145.3);
			usd.setValorcambiousd(1.06);

		Entrada entrada = new Entrada();
			
			entrada.setSelecaoMoedaOrigem(brl.getNomes(), eur.getNomes(), jpy.getNomes(), usd.getNomes());
			
				String origemNome = " ";
				String origemNomes = " ";
				String origemSimbolo = " ";
				double origemQuantidade = 0.0;
				String destinoNome = " ";
				String destinoNomes = " ";
				String destinoSimbolo = " ";
				double cambioDestino = 0.0;
			
				switch (entrada.getSelecaoMoedaOrigem()) 
				{
					
					case 1:
						origemNome = brl.getNome();
						origemNomes = brl.getNomes();
						origemSimbolo = brl.getSimbolo();
						break;
						
					case 2:
						origemNome = brl.getNome();
						origemNomes = brl.getNomes();
						origemSimbolo = brl.getSimbolo();
						break;
						
					case 3:
						origemNome = brl.getNome();
						origemNomes = brl.getNomes();
						origemSimbolo = brl.getSimbolo();
						break;
						
					case 4:
						origemNome = brl.getNome();
						origemNomes = brl.getNomes();
						origemSimbolo = brl.getSimbolo();
						break;
				}
			
			entrada.setSelecaoMoedaQuantidade(brl.getNomes(), brl.getSimbolo(),eur.getNomes(), eur.getSimbolo(),jpy.getNomes(), jpy.getSimbolo(),usd.getNomes(), usd.getSimbolo());
				
				origemQuantidade = entrada.getSelecaoMoedaQuantidade();
				
			entrada.setSelecaoMoedaDestino(brl.getNomes(), eur.getNomes(), jpy.getNomes(), usd.getNomes());
			
				switch (entrada.getSelecaoMoedaDestino()) 
				{
					case 1:
						destinoNome = brl.getNome();
						destinoNomes = brl.getNomes();
						destinoSimbolo = brl.getSimbolo();
						switch (entrada.getSelecaoMoedaOrigem()) 
						{
							case 1:
								cambioDestino = brl.getValorcambiobrl();
							case 2:
								cambioDestino = eur.getValorcambiobrl();
							case 3:
								cambioDestino = jpy.getValorcambiobrl();
							case 4:
								cambioDestino = usd.getValorcambiobrl();
						}
					case 2: 
						destinoNome = eur.getNome();
						destinoNomes = eur.getNomes();
						destinoSimbolo = eur.getSimbolo();
						switch (entrada.getSelecaoMoedaOrigem()) 
						{
							case 1:
								cambioDestino = brl.getValorcambioeur();
							case 2:
								cambioDestino = eur.getValorcambioeur();
							case 3:
								cambioDestino = jpy.getValorcambioeur();
							case 4:
								cambioDestino = usd.getValorcambioeur();
						}
					case 3: 
						destinoNome = jpy.getNome();
						destinoNomes = jpy.getNomes();
						destinoSimbolo = jpy.getSimbolo();
						switch (entrada.getSelecaoMoedaOrigem()) 
						{
							case 1:
								cambioDestino = brl.getValorcambiojpy();
							case 2:
								cambioDestino = eur.getValorcambiojpy();
							case 3:
								cambioDestino = jpy.getValorcambiojpy();
							case 4:
								cambioDestino = usd.getValorcambiousd();
						}
					case 4: 
						destinoNome = usd.getNome();
						destinoNomes = usd.getNomes();
						destinoSimbolo = usd.getSimbolo();
						switch (entrada.getSelecaoMoedaOrigem()) 
						{
							case 1:
								cambioDestino = brl.getValorcambiobrl();
							case 2:
								cambioDestino = eur.getValorcambioeur();
							case 3:
								cambioDestino = jpy.getValorcambiojpy();
							case 4:
								cambioDestino = usd.getValorcambiousd();
						}
				}
		Calculo calculo = new Calculo();
			
			calculo.setCalculoConversao(origemQuantidade, cambioDestino);
				
		Saida saida = new Saida();
				
			saida.setOrigemNome(origemNomes);
			saida.setOrigemNomes(origemNomes);
			saida.setOrigemSimbolo(origemSimbolo);
			saida.setOrigemQuantidade(origemQuantidade);
			saida.setDestinoNome(destinoNomes);
			saida.setDestinoNomes(destinoNomes);
			saida.setDestinoSimbolo(destinoSimbolo);
			saida.setCalculoConversao(cambioDestino);
			saida.getSaida();
	}
}