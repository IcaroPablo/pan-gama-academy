package prov;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		
		String mensagem = "digite um número inteiro de 1 a 10 para que eu exiba a tabuada";
		
		while (true) {
			System.out.println(mensagem);
			Scanner resposta = new Scanner(System.in);
			
			int numero = 0;
			
			try {
				numero = Integer.parseInt(resposta.nextLine());	
				
				for (int i = 1; i < 11; i++) {
					System.out.println(numero + " x " + i + " = " + numero*i);
				}
				
				mensagem = "digite um número inteiro de 1 a 10 para que eu exiba a tabuada";
			} catch(NumberFormatException e) {
				mensagem = "digite apenas números";
			}
			
		}
		
	}

}
