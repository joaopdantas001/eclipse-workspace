import java.util.Scanner;

public class Entrada {

	private int escolhaMoeda;
	private double quantidadeMoeda;
	
	protected int getEscolha() {
		return escolhaMoeda;
	}
	
	protected double getQuantidade() {
		return quantidadeMoeda;
	}
	
	protected void escolhaMoeda(String nomesMoedaEur, String nomesMoedaBrl) {
	
		Scanner sc = new Scanner(System.in);
		
		while (escolhaMoeda != 1 && escolhaMoeda != 2) {
			
			double escolhaMoeda;
			
			System.out.println("Digite 1 para converter em " + nomesMoedaEur + "e 2 para converter em " + nomesMoedaBrl);
			
			escolhaMoeda = sc.nextDouble();
			
			this.escolhaMoeda = (int)escolhaMoeda;
		}
	}

	protected void quantidadeMoeda(String nomesMoedaEur, String nomesMoedaBrl) {
		
		Scanner sc = new Scanner(System.in);
		
		if (escolhaMoeda == 1) {
			
			System.out.println("Digite quantos " + nomesMoedaEur + " voce quer converter");
			
			this.quantidadeMoeda = sc.nextDouble();
			
		} else {
			
			System.out.println("Digite quantos " + nomesMoedaBrl + " voce quer converter");
			
			this.quantidadeMoeda = sc.nextDouble();
			
		}
	}
}