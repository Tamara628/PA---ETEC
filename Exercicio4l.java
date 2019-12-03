import java.util.Scanner;

public class Exercicio4l {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		Scanner ler = new Scanner(System.in);
		int vetorA[];
		int maior = 0;
		int menor = 0;
		int i;
		vetorA = new int[10];

		for (i = 0; i < 10; i++) {
			System.out.println("Insira o " + (i + 1) + "º valor");
			vetorA[i] = ler.nextInt();

			if (i == 0) {
				maior = vetorA[i];
				menor = vetorA[i];

			}
			if (vetorA[i] > maior) {
				maior = vetorA[i];

			}
			if (vetorA[i] < menor) {
				menor = vetorA[i];
			}

		}
		System.out.println("o maior é " + maior + ", e o menor é " + menor);

	}


		
	}


