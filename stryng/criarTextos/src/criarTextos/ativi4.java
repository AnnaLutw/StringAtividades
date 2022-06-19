package criarTextos;

import java.util.Scanner;

public class ativi4 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);


		System.out.println("Frase: ");
		String frase = ent.nextLine();
		//conveter frase para char
		char[] arrayCaracteres = frase.toCharArray();
		boolean ispalindromo = true;
		int indiceSemEspaco = 0;
		char[] arrayCaracteresSemEspaco = new char[arrayCaracteres.length];

		String resultado = frase;
		//ler caracter por caracter
		for(int i = 0; i< arrayCaracteres.length;i++) {
			//se i for diferente de espaço
			if(arrayCaracteres[i]!= ' ') {
				//salvar i na variavel indiceSemEspaco
				arrayCaracteresSemEspaco[indiceSemEspaco]= arrayCaracteres[i];
				//somar quando não tiver espaço
				indiceSemEspaco++;
			}
		}
		//ler todos os caracteres de indiceSemEspaco
		for(int i=0;i<indiceSemEspaco;i++){
			
				if(arrayCaracteresSemEspaco[i] != arrayCaracteresSemEspaco[indiceSemEspaco-i-1]) {
					ispalindromo= false;	
					break;
				}				
		}
		//se for palindromo salvar na variavel resultado
		if(ispalindromo) {
				resultado= resultado+" é um palíndromo " ;
		}
		//se não for palindromo salvar na variavel resultado
		else{
			resultado= resultado+" não é um palíndromo " ;
		}
		System.out.print(resultado);
	}
}
