package day3;

import java.util.Scanner;

public class InifiniteSum {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int sum = 0;
		
		System.out.println("digite um inteiro possitivo para ser somado ao monte ou um negativo para parar");
		int num = scan.nextInt();
		
		while (num >= 0 ) {
			sum += num;
			System.out.println("a soma de todos os números positivos digitados somados é " + sum);
			num = scan.nextInt();
		}
		
		System.out.println("você saiu do loop, a soma final é " + sum);
		
	}

}
