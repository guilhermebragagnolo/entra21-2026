package DesvioCondicional;

import java.util.Scanner;

public class Lista2 {

	public static void main(String[] args) {
		// exercicio1();
		// exercicio2();
		// exercicio3();
		// exercicio4();
		// exercicio5();
		// exercicio6();
		// exercicio7();
		//exercicio8();
		//exercicio9();
		//exercicio10();
		exercicio11();
		
	}

	// Nível básico
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

	static void exercicio4() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe a sua nota do boletim: ");
		double nota = sc.nextDouble();

		if (nota >= 6) {
			System.out.println("Você foi aprovado!");
		} else {
			System.out.println("Você foi reprovado :(");
		}
	}

	static void exercicio5() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe sua idade: ");
		int idade = sc.nextInt();

		if (idade >= 16) {
			System.out.println("Você pode votar!");
		} else {
			System.out.println("Você ainda não pode votar!");
		}
	}

	static void exercicio6() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe o primeiro número: ");
		int numero1 = sc.nextInt();

		System.out.println("Informe o segundo número: ");
		int numero2 = sc.nextInt();

		System.out.println("Informe o terceiro número: ");
		int numero3 = sc.nextInt();

		if (numero1 > numero2 && numero1 > numero3) {
			System.out.println("O primeiro número é o maior");
		} else if (numero2 > numero1 && numero2 > numero3) {
			System.out.println("O segundo número é o maior");
		} else {
			System.out.println("O terceiro número é o maior");
		}
	}

	static void exercicio7() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe sua nota: ");
		int nota = sc.nextInt();

		if (nota <= 4) {
			System.out.println("Insuficiente");
		} else if (nota <= 6) {
			System.out.println("Regular");
		} else if (nota <= 8) {
			System.out.println("Bom");
		} else {
			System.out.println("Excelente!");
		}
	}

	static void exercicio8() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o tamanho do primeiro lado: ");
		int a = sc.nextInt();

		System.out.println("Digite o tamanho do segundo lado: ");
		int b = sc.nextInt();

		System.out.println("Digite o tamanho do terceiro lado: ");
		int c = sc.nextInt();

		if (a + b > c && a + c > b && b + c > a) {
			System.out.println("Os lados formam um triângulo!");
		} else {
			System.out.println("Os lados não formam um triângulo!");
		}
	}

	static void exercicio9() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o tamanho do primeiro lado: ");
		int a = sc.nextInt();

		System.out.println("Digite o tamanho do segundo lado: ");
		int b = sc.nextInt();

		System.out.println("Digite o tamanho do terceiro lado: ");
		int c = sc.nextInt();

		if (a + b > c && a + c > b && b + c > a) {
			System.out.println("Os lados formam um triângulo!");

			if (a == b && a == c) {
				System.out.println("Triângulo equilátero");

			}else if (a == b && a == c && b ==c) {
				System.out.println("Triângulo Isósceles");
			}else {
				System.out.println("Triângulo Escaleno");
			}
		}else {
			System.out.println("Os lados não formam um triângulo");
		}
	}
	
	static void exercicio10() {
		Scanner sc = new Scanner(System.in);
		
		String nomeCorreto = "Guilherme";
		String senhaCorreta = "1234";
		
		System.out.println("Informe seu nome de usuário: ");
		String nome = sc.next();
		
		System.out.println("Informe a senha: ");
		String senha = sc.next();
		
		if (nome.equals(nomeCorreto) && senha.equals(senhaCorreta) ) {
			System.out.println("Acesso autorizado!");
		}else {
			System.out.println("Acesso negado!");
		}
	}
	//Nível avançado
	static void exercicio11() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um ano: ");
		int ano = sc.nextInt();
		
		if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) { 
			System.out.println("O ano é bissexto!");
		}else {
			System.out.println("O ano não é bissexto!");
		}
	}
}