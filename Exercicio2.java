import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		
		Scanner ler = new Scanner(System.in);
		
		int[] vetorA = new int[5];
		
		for (int i=0; i<vetorA.length; i++) {
			System.out.print("Digite o "+i+" numero:");
			vetorA[i] = ler.nextInt();	
		}
		
		for (int i=0; i<vetorA.length; i++) {
			System.out.println("Tabuada de "+vetorA[i]);
			
			for (int j=1; j<11; j++) {
				System.out.println(j+"x"+vetorA[i]+" = "+(vetorA[i]*j));
			}
			System.out.println();
		}

		}
	
	}


