package Array;

import java.util.Scanner;

public class ArrayNumeros {
	
	public static void main(String[] args) {
		ArrayPI();
		
		Scanner sc = new Scanner(System.in);
			
	int[] numeros = new int[5];
	
		for(int i = 0; i < numeros.length; i++) {
			System.out.println("Digite um número: ");
			numeros[i] = sc.nextInt();
			
		}
		
		for(int i = 0; i < numeros.length; i++) {
			int dobro = numeros[i] * 2;
			System.out.println("O dobro do número na posição " + i +  ": " + dobro);
		}
		sc.close();
	}
	
	static void ArrayPI() {
		Scanner sc = new Scanner(System.in);
		
		int[] numeros = new int[10];
		
		for(int i = 0; i < numeros.length; i++) {
			System.out.println("Digite um número: ");
			numeros[i] = sc.nextInt();
			
		}
		
		for(int i = 0; 1 < numeros.length; i++) {
			if(numeros[i] % 2 == 0) {
				System.out.println(numeros[i] + " é par ");
			}else {
				System.out.println(numeros[i] + " é impar");
			}
			sc.close();
		}
	}
}