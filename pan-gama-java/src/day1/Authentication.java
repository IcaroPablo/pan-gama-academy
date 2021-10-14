package day1;

//Escreva um programa que verifique a validade 
//de uma senha fornecida pelo usuário. A senha 
//válida é o número 1234.	Devem ser	impressas 
//as seguintes	mensagens: ACESSO	PERMITIDO	
//caso	a	senha	seja	válida. ACESSO	NEGADO	
//caso	a	senha	seja	inválida.

import java.util.Scanner;

public class Authentication {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a senha de acesso:");
		String typedPassword  = scan.nextLine();
		
		String systemPassword = "1234";
		
		if (typedPassword.equals(systemPassword) ) {
			System.out.println("ACESSO PERMITIDO");
		} else {
			System.out.println("ACESSO NEGADO");
		}
		
		scan.close();
	}

}
