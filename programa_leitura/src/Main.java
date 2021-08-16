

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) { 
		String nome;
		Scanner in = new Scanner(System.in);
		Random rand = new Random();
		System.out.println("Incira seu nome:");
		nome = in.nextLine();
		System.out.println("Seja bem-vindo(a) "+nome);
		System.out.println("Para qual direção deseja ir?(w, s, a, d)");
		String comando = in.nextLine();
		if(comando.equals("w")){
			System.out.println("Você foi em frente!");
			System.out.println("Você encontrou um inimigo! "
			+ "O que deseja fazer? (a=atacar, b=fugir)");
			comando = in.nextLine();
			if(comando.equals("a")) {
				if(rand.nextInt(100)<50) {
					System.out.println("Você atacou, ganhou o jogo!");
				}else {
				System.out.println("Você atacou, perdeu o jogo :/");
				}
			}else {
				System.out.println("Você correu, o jogo acabou.");
			}
		}else if(comando.equals("s")) {
			System.out.println("Você saiu do mapa, o jogo acabou!");
		}else if(comando.equals("a")) {
			System.out.println("Você está indo para esqueda. "
					+ "Você encontrou um amigo, o que deseja fazer? (a=dizer oi, b=ir embora)");
			comando = in.nextLine();
			if(comando.equals("a")) {
				System.out.println("Você disse oi para seu amigo!");
				}else {
				System.out.println("Você foi embora! O jogo acabou!");
				}
			
		}else if(comando.equals("d")) {
			System.out.println("Você foi para a direita."
					+ " Você encontrou um cogumelo, o que deseja fazer? (a=comer, b=ir embora)");
			comando = in.nextLine();
			if (comando.equals("a")) {
				System.out.println("Você comeu o cogumelo, você morreu!");
			}else {
				System.out.println("Você foi embora, o jogo acabou!");
			}
		}
	}
}
