//1. Faça um programa que receba três inteiros e diga qual deles é o maior e qual o menor.
//Conseguem criar mais de uma solução?

package day1;

public class Numbers {

	public static void main(String[] args) {

		int n1 = 30;
		int n2 = 40;
		int n3 = 10;
		
		int menor;
		int maior;
		
		if (n2 > n1) {
			if (n2 > n3) {
				maior = n2;
				
				if(n1>n3) {
					menor = n3;
				} else {
					menor = n1;
				}
			} else {
				maior = n3;
				
				if(n1>n3) {
					menor = n3;
				} else {
					menor = n1;
				}
			}
		} else {
			if(n1 > n3) {
				maior = n1;
				
				if(n2>n3) {
					menor = n3;
				} else {
					menor = n2;
				}
			} else {
				maior = n3;
				
				if(n1>n2) {
					menor = n2;
				} else {
					menor = n1;
				}
			}
		}
			System.out.println("Maior número é " + maior);
			System.out.println("Menor número é " + menor);
		}

}