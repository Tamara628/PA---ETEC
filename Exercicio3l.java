import java.util.Scanner;

public class Exercicio3l {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		Scanner ler = new Scanner(System.in);
		int vetorA[];
		int vetorB [];
		int i;
		
		
		vetorA = new int[10];
		vetorB = new int[10];
		
		for (i = 0; i < 5; i++) {

			System.out.println("Digite o " + (1 + i) + "º valor");
			vetorA[i] = ler.nextInt();

		}

		for (i = 4; i >= 0; i--) {

			vetorB[i] = vetorA[i];

			System.out.println( vetorB[i]);

		}
	}

	}


