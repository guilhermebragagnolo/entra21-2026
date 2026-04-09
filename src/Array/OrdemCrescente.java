package Array;
import java.util.Scanner;
public class OrdemCrescente {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] vetor = new int[8];
		
		for(int i = 0; i < vetor.length; i++) {
			System.out.println("Informe o número da posição: " + i + " ");
			vetor[i] = sc.nextInt();
			
		}
		
		for(int i = 0; i < vetor.length - 1; i++) {
			for(int j = i + 1; j < vetor.length; j++) {
				
				if(vetor[i] > vetor[j]);
				int aux = vetor[i];
				vetor[i] = vetor[j];
				vetor[j] = aux;
			}
		}
		
		System.out.println("\nVetor em ordem crescente: ");
		for(int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i] + " ");
		}
	}

}
