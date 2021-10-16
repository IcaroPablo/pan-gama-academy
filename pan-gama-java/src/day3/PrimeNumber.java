package day3;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		System.out.println("Digite um número inteiro, direi se ele é primo ou não:");
		
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		boolean isPrime = false;
		
		scan.close();
		
		for (int i = 2; i < num; i++) {
			if (num == 2) {
				isPrime = true;
				break;
			} else if (num%i == 0) {
				isPrime = false;
				break;
			} else {
				isPrime = true;
			}
			
		}
		
		System.out.println(isPrime ? "é primo" : "não é primo");
	}

}
