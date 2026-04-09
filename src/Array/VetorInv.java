package Array;

import java.util.Scanner;

public class VetorInv {

	public static void main(String[] args) {
		 //Vetor();
		//MaiorValor();
		
	}

	static void Vetor() {
		Scanner sc = new Scanner(System.in);

		int[] vetor = new int[10];

		for (int i = 0; i < vetor.length; i++) {
			System.out.println("Informe o número entre 1 e 10: ");
			vetor[i] = sc.nextInt();

		}

		System.out.println("\nVetor invertido: ");
		for (int i = vetor.length - 1; i >= 0; i--) {
			System.out.println(vetor[i] + " ");
		}
		sc.close();
	}

	static void MaiorValor() {
		Scanner sc = new Scanner(System.in);

		int[] numeros = new int[16];

		for (int i = 0; i < numeros.length; i++) {
			System.out.println("\nInforme o número da posição " + i + ": ");
			numeros[i] = sc.nextInt();
		}
		
		int maior = numeros[0];
		for(int i = 1; i < numeros.length; i++) {
			if(numeros[i] > maior) {
				maior = numeros[i];
			}
		}
		System.out.println("\nMaior valor: " + maior);
		System.out.println("\nPosição onde aparece: ");
		
		for(int i = 0; i < numeros.length; i++) {
			if(numeros[i] == maior) {
			System.out.println(i + " ");
		}
			
		}
	}
}