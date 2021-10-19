package day6;

//Dado o seguinte array: int[] array = { 87, 68, 94, 100, 83, 78, 85, 91, 76, 87 };
//A. Retorno o valor total da soma de todos os elementos com foreach
//B. Retorne a média de todos os elementos
//C. Retorne o maior valor e o menor elemento

public class ForEach {

	public static void main (String[] args) {
		int[] array = { 87, 68, 94, 100, 83, 78, 85, 91, 76, 87 };
		double sum = 0;
		int maior = 0;
		int menor = 1000000;
		double average = 0.0;
		
		for (int element : array) {
			sum += element;
			if (element > maior) maior = element;
			if (element < menor) menor = element;
		}
		
		average = sum/array.length;
		
		System.out.println("a soma de todos os números é " + sum);
		System.out.println("a média é " + average);
		System.out.println("o maior número é " + maior);
		System.out.println("o menor número é " + menor);
	
	}

}
