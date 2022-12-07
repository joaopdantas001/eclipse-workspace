public class CriaConta {
	public static void main(String[] args) {
		Conta primeiraConta = new Conta ();
		primeiraConta.saldo = 200;
		System.out.println(primeiraConta.saldo);
		
		primeiraConta.saldo += 100;
		System.out.println(primeiraConta.saldo);
		
		Conta segundaConta = new Conta ();
		
		segundaConta.saldo = 50;
		
		System.out.println("primeira conta tem " + primeiraConta.saldo);
		System.out.println("segunda conta tem " + segundaConta.saldo);
		
		segundaConta.agencia = 11;
		
		System.out.println("numero da primeira agencia e " + primeiraConta.agencia);
		System.out.println("numero da segunda agencia e " + segundaConta.agencia);
		
		Conta contaDaMarcela = new Conta ();
		Conta contaDoPaulo = new Conta ();
		
		contaDaMarcela.deposita(1000);
		contaDaMarcela.transfere(300, contaDoPaulo);
		
		System.out.println(contaDaMarcela.saldo);
		System.out.println(contaDoPaulo.saldo);
	}
}