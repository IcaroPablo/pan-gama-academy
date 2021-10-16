package day5;

public class InheritanceExercise {

	public static void main(String[] args) {
		
		abstract class Animal {
			public abstract void comunicar();
			public abstract void movimentar();
		}
		
		class Bird extends Animal {
			
			public Bird (String nome) {
				System.out.println("# criando um(a) " + nome + ", um objeto do tipo pássaro que herda da classe animal");
			}
			
			@Override
			public void comunicar() {
				System.out.println("# executando o método 'comunicar()' da classe pássaro");
				System.out.println("um pássaro canta");
			}
			
			@Override
			public void movimentar() {
				System.out.println("# executando o método 'movimentar()' da classe pássaro");
				System.out.println("um pássaro voa");
			}
		}
		
		class Reptile extends Animal {
			
			public Reptile (String nome) {
				System.out.println("# criando um(a) " + nome + ", um objeto do tipo réptil que herda da classe animal");
			}
			
			@Override
			public void comunicar() {
				System.out.println("# executando o método 'comunicar()' da classe réptil");
				System.out.println("um réptil sibila");
			}
			
			@Override
			public void movimentar() {
				System.out.println("# executando o método 'movimentar()' da classe réptil");
				System.out.println("um réptil rasteja");
			}
		}
		
		Bird eagle = new Bird("águia");
		eagle.comunicar();
		eagle.movimentar();
		
		System.out.println("----------------------");

		Reptile snake = new Reptile("cobra");
		snake.comunicar();
		snake.movimentar();
		
	}

}
