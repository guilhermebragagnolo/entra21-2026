package DesvioCondicional;

import java.util.Scanner;

public class Lista2 {

	public static void main(String[] args) {
		// exercicio1();
		// exercicio2();
		exercicio3();

	}

	static void exercicio1() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe um número inteiro: ");
		int numero = sc.nextInt();

		if (numero % 2 == 0) {
			System.out.println("O número é par");

		} else {
			System.out.println("O número é impar");
		}
	}

	static void exercicio2() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe o primeiro número: ");
		int numero1 = sc.nextInt();

		System.out.println("Informe o segundo número: ");
		int numero2 = sc.nextInt();

		if (numero1 > numero2) {
			System.out.println("O número um é maior");

		} else {
			System.out.println("O número dois é maior");
		}
	}

	static void exercicio3() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe um número: ");
		int numero = sc.nextInt();

		if (numero > 0) {
			System.out.println("O número é positivo!");

		} else if (numero == 0) {
			System.out.println("O número é 0!");

		} else {
			System.out.println("O número é negativo");
		}

	}
}
