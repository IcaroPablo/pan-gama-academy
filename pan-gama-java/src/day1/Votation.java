package day1;

//2. Escreva um programa para ler o ano de nascimento de uma pessoa e escrever
//uma mensagem que diga se ela poderá ou não votar este ano (não	é	necessário	
//considerar	o	mês	em	que	ela nasceu).

public class Votation {
	public static void main(String[] args) {

		int anoNascimento = 1990;
		int idade = (2021 - anoNascimento);
		
		if (idade < 16) {
			System.out.println("Você não pode votar, menor de 16 anos");
		} else if(idade >= 18 && idade < 70){
			System.out.println("Você pode votar, obrigatorio");
		} else if(idade > 70 || idade < 18 && idade >= 16) {
			System.out.println("Você pode votar, mas não é obrigatorio");
		} else {
			System.out.println("Idade invalida");
		}
		
	}
	
}
