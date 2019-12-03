import java.util.Scanner;

public class Exercicio2l {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		  Scanner ler = new Scanner(System.in);
		int vetorA[], i, tester = 0, cont, soma = 0;

		vetorA = new int[10];
		for (i = 0; i < 10; i++) {
			System.out.println("Digite o " + (1 + i) + "º valor");
			vetorA[i] = ler.nextInt();
		}

		for (i = 0; i < 10; i++) {
			tester = 0;
			for (cont = 1; cont <= vetorA[i]; cont++) {

				if ( vetorA[i] % cont == 0) {
					tester++;
				}
			}

			if (tester == 2) {
				System.out.println("O "+(i+1)+"º número é primo");
				soma++;

			} else {
				System.out.println("O "+(i+1)+"º número não é primo");
			}
		}
		System.out.println("O total de números primos é "+soma);

	}

		
	}


