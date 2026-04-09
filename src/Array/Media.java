package Array;
import java.util.Scanner;
public class Media {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] numero = new int[10];
		int soma = 0;
		double media;
		
		for(int i = 0; i < numero.length; i++) {
			System.out.println("Informe o número da posição " + i + ": ");
			numero[i] = sc.nextInt();
			soma += numero[i];
			
		}
		media = (double) soma / numero.length;
		
		
		System.out.println("\nMédia: " + media);
		System.out.println("Números acima da média: ");
		
		for(int i = 0; i < numero.length; i++) {
			if(numero[i] > media) {
				System.out.println(numero[i] + " ");
			}
		} 

	}

}
