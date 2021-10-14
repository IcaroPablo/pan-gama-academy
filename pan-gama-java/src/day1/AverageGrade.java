//Faça um programa que pede duas notas de um aluno. Em seguida ele deve calcular 
//a média do aluno e dar o seguinte resultado:
//A mensagem "Aprovado", se a média alcançada for maior ou igual a sete;
//A mensagem "Reprovado", se a média for menor do que sete;
//A mensagem "Aprovado com Distinção", se a média for igual a dez.

package day1;

import java.util.Scanner;

public class AverageGrade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite suas tres notas: ");
		double n1  = sc.nextDouble();
		double n2  = sc.nextDouble();
		double n3  = sc.nextDouble();
		
		double media = (n1+n2+n3)/3;
		
		if (media >= 0 && media <= 10) {		
			if (media >= 7 && media < 10) {
				System.out.println("Aluno foi Aprovado!");
			} else if (media < 7){
				System.out.println("Aluno foi Reprovado!");
			} else {
				System.out.println("Aluno foi Aprovado com Distinção!");
			}
		} else {
			System.out.println("Valor inválido");
		}
		sc.close();
	}

}
