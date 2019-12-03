import java.util.Scanner;
public class Exercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
				Scanner ler = new Scanner (System.in);
				
				int[] vetorA = new int[20];
				int[] vetorB = new int [vetorA.length];
				
				for (int i=0; i<vetorA.length; i++) {
					System.out.print("Digite o "+i+" numero:");
					vetorA[i] = ler.nextInt();	
				}
				
				int i2 = 0;
					
		        for (int n = 0; n<vetorA.length; n++) {
		            if (vetorA[n] % 2 == 0) {
		            	vetorB[i2] = vetorB[n];
		            	i2++;
		            }
		           }
		            
		            for (int n = 0; n<vetorA.length; n++) {
		                if (vetorA[n] % 2 != 0) {
		                	vetorB[i2] = vetorA[n];
		                	i2++;
		                	}
		                }
		            
		            System.out.print("Vetor A =");
		            for (int i=0; i<vetorA.length; i++) {
		            	System.out.print(vetorA[i]+", ");
		            }
		            System.out.println();
		            
		            System.out.print("vetor B =");
		            for (int i=0; i<i2; i++) {
		            	System.out.print(vetorB[i]+", ");
		            }
		            }
			
		   
				
		
		
		
		
	}


