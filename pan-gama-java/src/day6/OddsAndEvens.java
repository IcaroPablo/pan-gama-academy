package day6;

//Dado o seguinte array:  int[] array2 = {13, 22, 35, 45, 54, 56, 12, 11, 27, 34, 89, 101,
//125};
//A. Retorne somente com números pares
//B. Retorne somente com os números ímpares * 2.

public class OddsAndEvens {

	public static void main(String[] args) {
		int[] array2 = {13, 22, 35, 45, 54, 56, 12, 11, 27, 34, 89, 101, 125};
		
		for (int element : array2) {
			if (element % 2 == 0) System.out.println(element + " é par");
			else System.out.println(element + " é ímpar, então " + element + " * 2 = " + element*2);
		}
		
	}

}
