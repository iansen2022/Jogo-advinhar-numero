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
		
		show.println("Ol�! Digite seu nome?");
		String nome = scan.nextLine();
		show.println ("Prazer em conhece-lo " + nome+"!");
		show.println (nome + ", Vamos jogar?");
		show.println ("\nInforme o n�mero da sua op��o.\n1 -> Sim \n2 -> N�o.");
		opcao = scan.nextInt();
		
		if (opcao == 2) {
			
			show.println("Que pena, mas tudo bem, fica para pr�xima vez!");
		}else if (opcao == 1) {
			
			show.println("Ok! o jogo � assim...");
			show.println("Eu vou escolher um n�mero de 0 a 10");
			show.println("Mas n�o vou falar para voc� qual foi.");
			show.println("Se voc� conseguir adivinhar qual foi...");
			show.println("Voc� ser� o vencedor!");
			
			escolha_computador = gerador.nextInt(11);
			
			show.println("Ok, "+nome+". Eu j� escolhi");
			show.println("Agora tente adivinhar!");;
		}
	}

}
