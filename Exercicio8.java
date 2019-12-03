import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		
		Scanner ler = new Scanner(System.in);

	      int [] vetorA = new int [10];
	      int [] vetorB = new int [vetorA.length];

	      for (int i=0; i<vetorA.length; i++){

	          System.out.println("Digite o "+(i+1)+"°"+" numero:");
	          vetorA[i] = ler.nextInt();
	        }
	      for (int i=0; i<vetorA.length; i++){
	         vetorB[i]=0;
	        for (int j=0; j<=vetorA[i]; j++){
	            vetorB[i] += j;
	        }
	       }
	         System.out.print("Vetor A =");
	       for (int i=0; i<vetorA.length; i++){
	              System.out.print(vetorA[i] +" ");
	        }
	         System.out.print("Vetor B =");
	       for (int i=0; i<vetorA.length; i++){
	              System.out.print(vetorB[i] +" ");
	        }
	         System.out.println();
	       }
	     
	



	

}
