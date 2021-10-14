package day2;

import java.util.Scanner;

public class Angles {

	public static void main(String[] args) {
		
		int angle1, angle2, angle3; 
			
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro angulo: ");
		angle1 = sc.nextInt();
		
		System.out.println("Digite o primeiro angulo: ");
		angle2 = sc.nextInt();
		
		System.out.println("Digite o primeiro angulo: ");
		angle3 = sc.nextInt();
		
		
		if(angle1 == 90 && angle2 == 90 && angle3 == 90) {
			System.out.println("Triângulo Retângulo!");
		} if( angle1 > 90 || angle2 > 90 || angle3 > 90 ) {
			System.out.println("Triângulo Obsutangulo!");
		} else if(angle1 < 90 && angle2 < 90 && angle3 < 90) {
			System.out.println("Triângulo Acutângulo!");
		}
		sc.close();
		
	}

}
