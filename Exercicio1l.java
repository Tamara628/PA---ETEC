import java.util.Scanner;

public class Exercicio1l {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ler = new Scanner(System.in);
		int vetorA[], vetorB[], cont;
		vetorA = new int[10];
		vetorB = new int[10];

		for (cont = 0; cont < 10; cont++) {
			System.out.println("Digite o valor " + (1 + cont) + "º valor");
			vetorA[cont] = ler.nextInt();
			vetorB[cont] = (int) Math.sqrt(vetorA[cont]);

		}

		for (cont = 0; cont < 10; cont++) {
			System.out.println("O " + (1 + cont) + "º valor de B é " + vetorB[cont]);
		}

	}


	}


