package day2;

import java.util.Scanner;

public class Sides {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int side1, side2, side3;
		
        System.out.println("Digite o primeiro lado: ");
        side1 = sc.nextInt();

        System.out.println("Digite o segundo lado: ");
        side2 = sc.nextInt();

        System.out.println("Digite o terceiro lado: ");
        side3 = sc.nextInt();
        
        
        if(side1 == side2 && side2 == side3) {
        	System.out.println("Triângulo Equilátero.");
        } else if(side1 == side2 || side1 == side3 || side2 == side3) {
        	System.out.println("Triângulo Isóscele.");        	
        } else {
//        if (side1 != side2 && side1 != side3 && side2 != side3) {
        	System.out.println("Triângulo Escaleno."); 
        }     
        sc.close();
	}

}
