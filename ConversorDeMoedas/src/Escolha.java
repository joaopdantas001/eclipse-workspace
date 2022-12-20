import java.util.Scanner;

public class Escolha {

	private double quantidade;
	private int escolha;

	public int escolhaMoeda() {
	
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Digite 1 para converter em Euros e 2 para converter em Reais");
			
			this.escolha = sc.nextInt();
			
		while (escolha < 1 || escolha > 2) {
		
			System.out.println("Digite 1 para converter em Euros e 2 para converter em Reais");
				
			this.escolha = sc.nextInt();
	
		}
		
		return escolha;
	}
}

