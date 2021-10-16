package day3;

import java.util.Scanner;

public class BiggestNumber {

	public static void main (String[] args) {
		System.out.println("digite 10 números inteiros e eu direi qual o maior deles");
		Scanner scan = new Scanner(System.in);
		int biggest = 0;
		
		for (int i = 0; i < 10; i++) {
			int num = scan.nextInt();
			if (num > biggest) biggest = num; 
		}
		
		System.out.println("o maior número digitado é " + biggest);
	}

}
