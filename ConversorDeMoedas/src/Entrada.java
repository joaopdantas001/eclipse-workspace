import java.util.Scanner;

public class Entrada 
{
	private int moedaOrigem;
	private int moedaDestino;
	private double moedaOrigemQuantidade;
	
	Scanner sc = new Scanner(System.in);
	
	protected void setSelecaoMoedaOrigem(String nomesBrl, String nomesEur, String nomesJpy, String nomesUsd)
	{
		
		System.out.println("Conversor de Moeda");
		System.out.println("Escolha a moeda de origem: ");
		
		while (moedaOrigem != 1 && moedaOrigem != 2 && moedaOrigem != 3 && moedaOrigem != 4 ) 
		{
			System.out.println("Digite 1 para " + nomesBrl);
			System.out.println("Digite 2 para " + nomesEur);
			System.out.println("Digite 3 para " + nomesJpy);
			System.out.println("Digite 4 para " + nomesUsd);
			
			this.moedaOrigem = sc.nextInt();
		}
	}
	
	public int getSelecaoMoedaOrigem() {
		return moedaOrigem;
	}

	protected void setSelecaoMoedaQuantidade(String nomesBrl, String simboloBrl, String nomesEur, String simboloEur, String nomesJpy, String simboloJpy, String nomesUsd, String simboloUsd)
	{
		switch(moedaOrigem) 
		{
			case 1: 
				System.out.println("Quantos " +  nomesBrl + " voce quer converter ?");
				System.out.print(simboloBrl + " ");
				this.moedaOrigemQuantidade = sc.nextDouble();
				break;
				
			case 2:
				System.out.println("Quantos " +  nomesEur + " voce quer converter ?");
				System.out.println(simboloEur + " ");
				this.moedaOrigemQuantidade = sc.nextDouble();
				break;
			case 3: 
				System.out.println("Quantos " +  nomesJpy + " voce quer converter ?");
				System.out.println(simboloJpy + " ");
				this.moedaOrigemQuantidade = sc.nextDouble();
				break;
			case 4: 
				System.out.println("Quantos " +  nomesUsd + " voce quer converter ?");
				System.out.println(simboloUsd + " ");
				this.moedaOrigemQuantidade = sc.nextDouble();
				break;
		}
	}
	
	public double getSelecaoMoedaQuantidade() {
		return moedaOrigemQuantidade;
	}
	
	protected void setSelecaoMoedaDestino(String nomesBrl, String nomesEur, String nomesJpy, String nomesUsd)
	{
		
		switch (moedaOrigem) {
			case 1:
				while (moedaDestino != 2 && moedaDestino != 3 && moedaDestino != 4 ) 
				{
					System.out.println("Escolha a moeda de destino: ");
					System.out.println("Digite 2 para " + nomesEur);
					System.out.println("Digite 3 para " + nomesJpy);
					System.out.println("Digite 4 para " + nomesUsd);
					moedaDestino = sc.nextInt();
				}
				break;
			case 2:
				while (moedaDestino != 1 && moedaDestino != 3 && moedaDestino != 4 ) 
				{
					System.out.println("Escolha a moeda de destino: ");
					System.out.println("Digite 1 para " + nomesBrl);
					System.out.println("Digite 3 para " + nomesJpy);
					System.out.println("Digite 4 para " + nomesUsd);
					moedaDestino = sc.nextInt();
				}
				break;
			case 3:
				while (moedaDestino != 1 && moedaDestino != 2 && moedaDestino != 4 ) 
				{
					System.out.println("Escolha a moeda de destino: ");
					System.out.println("Digite 1 para " + nomesBrl);
					System.out.println("Digite 2 para " + nomesEur);
					System.out.println("Digite 4 para " + nomesUsd);
					moedaDestino = sc.nextInt();
				}
				break;
			case 4:
				while (moedaDestino != 1 && moedaDestino != 2 && moedaDestino != 3 ) 
				{
					System.out.println("Escolha a moeda de destino: ");
					System.out.println("Digite 1 para " + nomesBrl);
					System.out.println("Digite 2 para " + nomesEur);
					System.out.println("Digite 3 para " + nomesJpy);
					moedaDestino = sc.nextInt();
				}
				break;
		}
	}
	
	public int getSelecaoMoedaDestino() {
		return moedaDestino;
	}
}