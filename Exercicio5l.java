import java.util.Scanner;

public class Exercicio5l {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ler = new Scanner(System.in);
		int [] vetor;
        int i;
        int i2;
        int cont;
        int soma = 0;
        
   
		vetor = new int[10];
		for (i = 0; i < 10; i++) {
			System.out.println("Digite o " + (1 + i) + " valor");
			vetor[i] = ler.nextInt();
		}

		for (i = 0; i < 10; i++) {
			i2 = 0;
			for (cont = 1; cont <= vetor[i]; cont++) {

				if (vetor[i] % cont == 0) {
					i2++;
				}
			}

			if (i2 == 2) {
				System.out.println("O "+(i+1)+" número é primo");
				soma++;

			} else {
				System.out.println("O "+(i+1)+" número não é primo");
			}
		}
		System.out.println("O total de números primos é "+soma);

	}

	

		
	}


