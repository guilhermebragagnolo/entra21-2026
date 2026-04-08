package Array;

import java.util.Scanner;

public class ArrayNumeros {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
			
	int[] numeros = new int[5];
	
		for(int i = 0; i < 5; i++) {
			System.out.println("Digite um número: ");
			numeros[i] = sc.nextInt();
			
		}
		
		for(int i = 0; i < 5; i++) {
			int dobro = numeros[i] * 2;
			System.out.println("O dobro do número na posição " + i +  ": " + dobro);
		}
		sc.close();
	}
}