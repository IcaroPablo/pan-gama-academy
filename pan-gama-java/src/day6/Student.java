package day6;

//Crie de  uma classe Aluno com os seguintes atributos e métodos: -String nome,
//double[] notas,  aprovado(), maiorNota() e media() (além dos getters e setters
//necessários).
//dadas as notas: double[] notas = {10, 5.0, 7.0, 9.0, 10.0};, retorne as seguintes
//observações sobre o aluno: a maior nota, média e caso média maior que 7 =
//aprovado.

public class Student {

	public static void main (String[] args) {
		
		class Alumn {
			private String nome;
			private double[] notas;
			
			public Alumn (String nome, double[] notas) {
				this.notas = notas;
				this.nome = nome;
			}
			
			public String aprovado() {
				double average = media();
				if (average > 7) return nome + " foi aprovado";
				else return nome + " foi reprovado";
			}
			
			public double maiorNota() {
				double maior = 0;
				
				for (double nota : this.notas) {
					if (nota > maior) maior = nota;
				}
				
				return maior;
			}
			
			public double media () {
				double sum = 0;
				for (double nota : this.notas) {
					sum += nota;
				}
				return (sum/this.notas.length);
			}
			
		}
		
		double[] notas = {10, 5.0, 7.0, 9.0, 10.0};
		Alumn aluno = new Alumn("pedro", notas);
		
		System.out.println("A maior nota do aluno é " + aluno.maiorNota());
		System.out.println("A média do aluno é " + aluno.media());
		System.out.println(aluno.aprovado());
		
	}

}
