import java.text.NumberFormat;
import java.util.Scanner;

public class Saida {
	
	private String saida;
	
	protected void setSaidaConversao(String simboloMoedaEntrada, double escolhaQuantidadeEntrada, String simboloMoedaSaida, double calculoSaida) 
	{
		{
			this.saida = ("Voce converteu " + simboloMoedaEntrada + " " + escolhaQuantidadeEntrada + " em " +  simboloMoedaSaida + " " + calculoSaida);			
		}
	}

	protected String getSaida() {
		return saida;
	}
}