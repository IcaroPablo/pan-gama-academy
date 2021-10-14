/* 
While Exercise
Calcular média de X alunos.
Notas válidas: entre 0 e 10
Contar quantas notas válidas foram digitadas
Usuário deve digitar -1 para sair do programa e ser informado da sua média e quantidade de notas
*/

package day3;

import java.util.Scanner;

public class InfiniteGrades {

	public static void main(String[] args) {
		System.out.println("digite uma sequência de notas (-1 para sair)");
		Scanner sc = new Scanner(System.in);
		
		int num = 0;
		int validGradesCounter = 0;
		int totalGrades = 0;
		
		while (sc.hasNext()) {
			num = sc.nextInt();
			if (num == -1) break;
			if (num >= 0 && num <= 10) {
				validGradesCounter++;
				totalGrades += num;
			}
		}
		
		sc.close();
		
		System.out.println(validGradesCounter + " notas validas foram digitadas");
		System.out.println("a media de notas e " + (totalGrades/validGradesCounter));
		
	}

}
