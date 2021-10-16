package day3;

import java.util.Scanner;

public class GuessTheNumber {

	public static void main (String[] args) {
		int answer = (int)(Math.random()*100);
		int chances = 10;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("eu pensei em um número de 1 a 100, tente adivinhar ele!");
		for (int i = 1; i <= chances; i++) {
			System.out.println("digite um número inteiro");
			int guess = scan.nextInt();

			if (chances - i == 0 ) {
				System.out.println("você perdeu :(");
				break;
			}
			if (guess == answer) {
				System.out.println("você acertou!, o numero é " + answer);
				break;
			}
			else if (guess < answer) {
				System.out.println("tente um número maior, você ainda tem " + (chances - i) + " chances");
			} else if (guess > answer) {
				System.out.println("tente um número menor, você ainda tem " + (chances - i) + " chances");
			}
		}
	}

}
