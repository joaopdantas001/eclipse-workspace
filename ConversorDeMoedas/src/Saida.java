
import java.util.Scanner;

public class Saida {
	
	private String origemNome;
	private String origemNomes;
	private String origemSimbolo;
	private double origemCambioDestino;
	private double origemQuantidade;
	private String destinoNome;
	private String destinoNomes;
	private String destinoSimbolo;
	
	private double calculoConversao;

	protected String getOrigemNome() {
		return origemNome;
	}

	protected void setOrigemNome(String origemNome) {
		this.origemNome = origemNome;
	}

	protected String getOrigemNomes() {
		return origemNomes;
	}

	protected void setOrigemNomes(String origemNomes) {
		this.origemNomes = origemNomes;
	}

	protected String getOrigemSimbolo() {
		return origemSimbolo;
	}

	protected void setOrigemSimbolo(String origemSimbolo) {
		this.origemSimbolo = origemSimbolo;
	}

	protected double getOrigemCambioDestino() {
		return origemCambioDestino;
	}

	protected void setOrigemCambioDestino(double origemCambioDestino) {
		this.origemCambioDestino = origemCambioDestino;
	}

	protected double getOrigemQuantidade() {
		return origemQuantidade;
	}

	protected void setOrigemQuantidade(double origemQuantidade) {
		this.origemQuantidade = origemQuantidade;
	}

	protected String getDestinoNome() {
		return destinoNome;
	}

	protected void setDestinoNome(String destinoNome) {
		this.destinoNome = destinoNome;
	}

	protected String getDestinoNomes() {
		return destinoNomes;
	}

	protected void setDestinoNomes(String destinoNomes) {
		this.destinoNomes = destinoNomes;
	}

	protected String getDestinoSimbolo() {
		return destinoSimbolo;
	}

	protected void setDestinoSimbolo(String destinoSimbolo) {
		this.destinoSimbolo = destinoSimbolo;
	}

	protected double getCalculoConversao() {
		return calculoConversao;
	}

	protected void setCalculoConversao(double calculoConversao) {
		this.calculoConversao = calculoConversao;
	}
	
	protected void getSaida() {
		System.out.println("Voce acabou de converter " + origemSimbolo + " " + origemQuantidade + " " + origemNome + " em " + destinoSimbolo + " " + calculoConversao + " " + destinoNomes);
	}
	
}