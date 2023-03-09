package jogo;

import java.io.PrintStream;
import java.util.Scanner;
import java.util.Random;
import java.util.Random.*;

public class Jogo {

	public static void main(String[] args) {

		PrintStream show = System.out;
		Scanner scan = new Scanner(System.in);
		Random gerador = new Random();
		
		int opcao;
		int escolha_computador;
		int escolha_usuario;
		
		show.println("Olá! Digite seu nome?");
		String nome = scan.nextLine();
		show.println ("Prazer em conhece-lo" + nome+"!");
		show.println (nome + ", Vamos jogar?");
		show.println ("\nInforme o número da sua opção.\n1");
		opcao = scan.nextInt();
	}

}
