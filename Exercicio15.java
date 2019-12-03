import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner ler = new Scanner(System.in);
		int vetorA[], vetorB[], vetorC[], maior = 0, menor = 0, i;
		vetorA = new int[10];
		vetorB = new int[10];
		vetorC = new int[10];

		for (i = 0; i < 10; i++) {
			System.out.println("Insira o " + (i + 1) + "º valor");
			vetorA[i] = ler.nextInt();
			vetorB[i] = vetorA[i];
			vetorC[i] = vetorA[i];
		}

		for (i = 0; i < vetorB.length; i++) {
			System.out.print(+vetorB	[i] + " ");

		}
		System.out.println(" ");
		for (int j = vetorC.length - 1; j >= 0; j--) {
			System.out.print(+vetorC[j] + " ");

		}

	}


	}


