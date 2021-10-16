package day3;

import java.util.Scanner;

public class SplitWord {

	public static void main (String[] args) {
		System.out.println("digite uma palavra e eu a dividirei");
		Scanner scan = new Scanner(System.in);
		String word = scan.nextLine();
		
		char[] splitted = word.toCharArray();
		
		for (int i = 0; i < splitted.length; i++) {
			System.out.println(splitted[i]);
		}
		
		
	}

}
