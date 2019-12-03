import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner ler = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		
		for (int i=0; i<vetorA.length; i++) {
			System.out.print("Digite o "+i+" numero:");
			vetorA[i] = ler.nextInt();	
		}
		
		for (int i=0; i<vetorA.length; i++) {
			System.out.println("Analise do numero :"+vetorA[i]);
			
			for (int j=2; j<vetorA[i]; j++) {
				if(j % 2 == 0) {
					System.out.println(j+" é par");
				}
			}
			System.out.println();
				
		}
		
	}


		
	}


