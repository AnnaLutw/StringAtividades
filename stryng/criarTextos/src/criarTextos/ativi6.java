package criarTextos;

import java.util.Scanner;

public class ativi6 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);


		System.out.println("Palavra: ");
		String palavra = ent.nextLine();

		char[] array = palavra.toCharArray();
		String espaco = "";
		
		//ler o nome ate o final
		for(int i = 0;i<array.length;i++) {
			//o pirmeiro caracter apenas imprimir
			System.out.println(espaco + array[i]);
			//ir adicionando espa�os na frente dos caracteres
			espaco = espaco + " ";
		}
		
		
	}
}
