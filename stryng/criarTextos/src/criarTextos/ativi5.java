package criarTextos;

import java.util.Scanner;

public class ativi5 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);


		System.out.println("Numero: ");
		String numero = ent.nextLine();

		char[] array = numero.toCharArray();
		int tamanhoTel = array.length;
		int tamanhoFinal = 9;
		//se o numero tem a barrinha, o tamanho final é 10
		if(numero.contains("-")) {
			tamanhoFinal = 10;
		}
		//enquanto o tamanho do tel for menor que o tamanho final
		while(tamanhoTel< tamanhoFinal) {
			//vai adicionar 9 na frente quando o numero for menor
				numero = 9 + numero;				
				tamanhoTel++;
		}
		//imprimir esse numero
		System.out.println(numero);
	}
}
