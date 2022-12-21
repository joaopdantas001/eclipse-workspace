import java.util.Scanner;

public class Entrada {

	private int escolha;
	private double quantidade;
	
	protected int getEscolha() {
		return escolha;
	}
	
	protected double getQuantidade() {
		return quantidade;
	}

	protected void escolhaMoeda() {
	
		Scanner sc = new Scanner(System.in);
			
		while (escolha < 1 || escolha > 2) {
		
			System.out.println("Digite 1 para converter em Euros e 2 para converter em Reais");
				
			this.escolha = sc.nextInt();
	
		}
		
	}
	
	protected void quantidadeMoeda() {
		
		Scanner sc = new Scanner(System.in);
		
		if (escolha == 1) {
			
			Cambio eur = new Cambio(); // objeto eur
			
			eur.setNome("Euro");
			eur.setNomes("Euros");
			
			System.out.println("Digite quantos " + eur.getNomes() + " voce quer converter");
			
			this.quantidade = sc.nextDouble();
			
		} else {
			
			Cambio brl = new Cambio(); // objeto brl
			
			brl.setNome("Real");
			brl.setNomes("Reais");
			
			System.out.println("Digite quantos " + brl.getNomes() + " voce quer converter");
			
			this.quantidade = sc.nextDouble();
			
		}
	}
}