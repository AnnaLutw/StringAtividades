package criarTextos;

import java.util.Scanner;

public class ativi2 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);


		System.out.println("nome: ");
		//criar um vetor de string com cada palavra digitada, separada pelo split
		String[] arrayTexto = ent.nextLine().trim().split(" ");
		//string vazia para salvar no final
		String resultado = "";
		
		for(int i=0;i<arrayTexto.length;i++){
			//se o i n?o for igual a vazio
				if(!arrayTexto[i].trim().equals("")) {
					
					//colocar apenas um espa?o entre cada palavra
					resultado=resultado + " " + arrayTexto[i].trim();
				}
		}
		//imprimir
		System.out.print(resultado.trim());
	}
}
