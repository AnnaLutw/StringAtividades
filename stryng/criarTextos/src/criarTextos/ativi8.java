package criarTextos;

import java.util.Scanner;

public class ativi8 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);


		System.out.println("Frase: ");
		String frase = ent.nextLine().toUpperCase();
		int quant = 3;
		//passei a frase para char
		char [] array = frase.toCharArray();
		
		String novaString ="";
		
		//coloquei todo o alfabeto na string
		String [] alfa = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
		
		//ir lendo a frase digitada
			for(int i=0;i<array.length;i++) {
			//nova string para comparar o alfabeto com a frase digitada
			String comparar = String.valueOf(array[i]);
			int posi=0;
			boolean encontrou = false;
			
			//ir lendo o alfabeto
			for(int b=0;b<alfa.length;b++) {
				if(comparar.equalsIgnoreCase(alfa[b])) {
					//pegar a posi??o desse caracter
					posi = b;
					encontrou = true;
					break;
				}
			}
			//a posi??o mais quantidade = 3
			posi+= quant;
			if(encontrou) {
				//se existe, pegar o caracter dessa posi??o e salvar na nova string
				novaString+= alfa[posi];
			}
			//se n?o colocar espa?o
			else {
				novaString+= " ";
			}
		}
			//imprimir a nova string
		System.out.println(novaString);
	}
}
