package escolha;

import java.util.Random;
import java.util.Scanner;

public class Pokemon {
	
	public static Random rand = new Random();
	public static Scanner ler = new Scanner(System.in);
	public static int gen;
	public static int pokeEscolhido;
	
	public static String[] gen1 = {"Charmander", "Bulbasaur", "Squirtle"};
	public static String[] gen2 = {"Cyndaquill", "Chikorita", "Totodile"};
	public static String[] gen3 = {"Torchic", "Treecko", "Mudkip"};
	public static String[] gen4 = {"Chimchar", "Turtwig", "Piplup"};
	public static String[] gen5 = {"Tepig", "Snivy", "Oshawott"};
	public static String[] gen6 = {"Fennekin", "Chespin", "Froakie"};
	public static String[] gen7 = {"Litten", "Rowlet", "Popplio"};
	public static String[] gen8 = {"Scorbunny", "Grookey", "Sobble"};
	
	public static void main(String[] args) {
		System.out.println("Qual geração você está jogando no momento? \n 1-Kanto    4-Sinnoh\n 2-Jotho    5-Unova\n 3-Hoenn    6-Kalos\n 7-Alola    8-Galar");
		gen = ler.nextInt();
		
		if(gen ==1)
			g1();
		else if(gen == 2)
			g2();
		else if(gen == 3)
			g3();
		else if(gen == 4)
			g4();
		else if(gen == 5)
			g5();
		else if(gen == 6)
			g6();
		else if(gen == 7)
			g7();
		else if(gen == 8)
			g8();
		else
			System.out.println("Opção inválida");
	}
	
	public static void g1() {
		pokeEscolhido = rand.nextInt(3);
		System.out.println("Você deveria escolher: " + gen1[pokeEscolhido]);
	}
	public static void g2() {
		pokeEscolhido = rand.nextInt(3);
		System.out.println("Você deveria escolher: " + gen2[pokeEscolhido]);
	}
	public static void g3() {
		pokeEscolhido = rand.nextInt(3);
		System.out.println("Você deveria escolher: " + gen3[pokeEscolhido]);
	}
	public static void g4() {
		pokeEscolhido = rand.nextInt(3);
		System.out.println("Você deveria escolher: " + gen4[pokeEscolhido]);
	}
	public static void g5() {
		pokeEscolhido = rand.nextInt(3);
		System.out.println("Você deveria escolher: " + gen5[pokeEscolhido]);
	}
	public static void g6() {
		pokeEscolhido = rand.nextInt(3);
		System.out.println("Você deveria escolher: " + gen6[pokeEscolhido]);
	}
	public static void g7() {
		pokeEscolhido = rand.nextInt(3);
		System.out.println("Você deveria escolher: " + gen7[pokeEscolhido]);
	}
	public static void g8() {
		pokeEscolhido = rand.nextInt(3);
		System.out.println("Você deveria escolher: " + gen8[pokeEscolhido]);
	}
}
