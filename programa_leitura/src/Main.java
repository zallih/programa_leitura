

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
		System.out.println("Para qual dire��o deseja ir?(w, s, a, d)");
		String comando = in.nextLine();
		if(comando.equals("w")){
			System.out.println("Voc� foi em frente!");
			System.out.println("Voc� encontrou um inimigo! "
			+ "O que deseja fazer? (a=atacar, b=fugir)");
			comando = in.nextLine();
			if(comando.equals("a")) {
				if(rand.nextInt(100)<50) {
					System.out.println("Voc� atacou, ganhou o jogo!");
				}else {
				System.out.println("Voc� atacou, perdeu o jogo :/");
				}
			}else {
				System.out.println("Voc� correu, o jogo acabou.");
			}
		}else if(comando.equals("s")) {
			System.out.println("Voc� saiu do mapa, o jogo acabou!");
		}else if(comando.equals("a")) {
			System.out.println("Voc� est� indo para esqueda. "
					+ "Voc� encontrou um amigo, o que deseja fazer? (a=dizer oi, b=ir embora)");
			comando = in.nextLine();
			if(comando.equals("a")) {
				System.out.println("Voc� disse oi para seu amigo!");
				}else {
				System.out.println("Voc� foi embora! O jogo acabou!");
				}
			
		}else if(comando.equals("d")) {
			System.out.println("Voc� foi para a direita."
					+ " Voc� encontrou um cogumelo, o que deseja fazer? (a=comer, b=ir embora)");
			comando = in.nextLine();
			if (comando.equals("a")) {
				System.out.println("Voc� comeu o cogumelo, voc� morreu!");
			}else {
				System.out.println("Voc� foi embora, o jogo acabou!");
			}
		}
	}
}
