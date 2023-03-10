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
		show.println ("Prazer em conhece-lo " + nome+"!");
		show.println (nome + ", Vamos jogar?");
		show.println ("\nInforme o número da sua opção.\n1 -> Sim \n2 -> Não.");
		opcao = scan.nextInt();
		
		if (opcao == 2) {
			
			show.println("Que pena, mas tudo bem, fica para próxima vez!");
		}else if (opcao == 1) {
			
			show.println("Ok! o jogo é assim...");
			show.println("Eu vou escolher um número de 0 a 10");
			show.println("Mas não vou falar para você qual foi.");
			show.println("Se você conseguir adivinhar qual foi...");
			show.println("Você será o vencedor!");
			
			escolha_computador = gerador.nextInt(11);
			
			show.println("Ok, "+nome+". Eu já escolhi");
			show.println("Agora tente adivinhar!");;
		}
	}

}
