package criarTextos;

import java.util.Scanner;

public class ativi7 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);

		//pediu apenas para converter em maiustulo os caracteres
		System.out.println("Palavra: ");
		//só usar toUpperCase
		String palavra = ent.nextLine().toUpperCase();

		System.out.println(palavra);
		
		
	}
}
