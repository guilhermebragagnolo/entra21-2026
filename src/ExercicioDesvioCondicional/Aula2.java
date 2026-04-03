package ExercicioDesvioCondicional;

import java.util.Scanner;

public class Aula2 {

	public static void main(String[] args) {
		// exercicio1();
		// exercicio2();
		// exercicio3();
		// exercicio4();
		// exercicio5();
		// exercicio6();
		// exercicio7();
		// exercicio8();
		// exercicio9();
		// exercicio10();
		// exercicio11();
		// exercicio12();
		// exercicio13();
		// exercicio14();
		// exercicio15();
		//exercicio16();
		//exercicio17();
		//exercicio18();
		//exercicio19();
		exercicio20();
		
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

			} else if (a == b && a == c && b == c) {
				System.out.println("Triângulo Isósceles");
			} else {
				System.out.println("Triângulo Escaleno");
			}
		} else {
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

		if (nome.equals(nomeCorreto) && senha.equals(senhaCorreta)) {
			System.out.println("Acesso autorizado!");
		} else {
			System.out.println("Acesso negado!");
		}
	}

	// Nível avançado
	static void exercicio11() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um ano: ");
		int ano = sc.nextInt();

		if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
			System.out.println("O ano é bissexto!");
		} else {
			System.out.println("O ano não é bissexto!");
		}
	}

	static void exercicio12() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe o primeiro número: ");
		int numero1 = sc.nextInt();

		System.out.println("Informe o segundo número: ");
		int numero2 = sc.nextInt();

		System.out.println("Informe a operação (+, -, *, /): ");
		char operacao = sc.next().charAt(0);

		if (operacao == '+') {
			System.out.println("Resultado: " + (numero1 + numero2));
		} else if (operacao == '-') {
			System.out.println("Resultado: " + (numero1 - numero2));
		} else if (operacao == '*') {
			System.out.println("Resultado: " + (numero1 * numero2));
		} else if (operacao == '/') {
			System.out.println("Resultado: " + (numero1 / numero2));
		}
	}

	static void exercicio13() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o seu salário:");
		double salario = sc.nextDouble();
		double imposto;

		if (salario <= 2000) {
			System.out.println("Isento");
			imposto = 0;
		} else if (salario <= 3000) {
			imposto = salario * 0.08;
			System.out.println("+8%");
		} else if (salario <= 4500) {
			imposto = salario * 0.18;
			System.out.println("+18%");
		} else {
			imposto = salario * 0.28;
			System.out.println("+28%");
		}

		System.out.println("Imposto de renda: R$ " + imposto);
	}

	static void exercicio14() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe o valor da sua compra: ");
		double valor = sc.nextDouble();

		if (valor <= 100) {
			System.out.println("Não recebe desconto");
		} else if (valor <= 500) {
			System.out.println("Recebe 10% de desconto");
		} else if (valor >= 500) {
			System.out.println("Recebe 20% de desconto");
		}
	}

	static void exercicio15() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe sua idade: ");
		int idade = sc.nextInt();

		if (idade <= 12) {
			System.out.println("Você é uma criança");
		} else if (idade <= 17) {
			System.out.println("Você é um adolescente");
		} else if (idade <= 59) {
			System.out.println("Você é um adulto");
		} else if (idade >= 60) {
			System.out.println("Você é idoso");
		}
	}

	// Nível desafio
	static void exercicio16() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe sua primeira nota: ");
		int nota1 = sc.nextInt();

		System.out.println("Informe sua segunda nota: ");
		int nota2 = sc.nextInt();

		System.out.println("Informe sua terceira nota: ");
		int nota3 = sc.nextInt();

		double media = (nota1 + nota2 + nota3) / 3.0;
		System.out.println("Sua média é: " + media);

		if (media < 5) {
			System.out.println("Reprovado");
		} else if (media < 7) {
			System.out.println("Recuperação");
		} else {
			System.out.println("Aprovado");
		}
	}

	static void exercicio17() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe seu salário: ");
		double salario = sc.nextDouble();
		
		System.out.println("Informe o valor da parcela");
		double parcela = sc.nextDouble();
		
		double limite = salario * 0.3;
		
		if (parcela <= limite) {
			System.out.println("Emprestimo aprovada!");
		}else {
			System.out.println("Emprestimo negado!");
		}
	}
	
	static void exercicio18() {
		Scanner sc = new Scanner(System.in);
		
		int numero;
		numero = 24;
		
		System.out.println("Adivinhe o número: ");
		int numeroA = sc.nextInt();
		
		if (numeroA <= 23) {
			System.out.println("É um número maior que este!");
		}else if (numeroA >= 25) {
			System.out.println("É um número menor que este!");
		}else {
			System.out.println("Você acertou!");
		}
	}
	
	static void exercicio19() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe seu peso: ");
		double peso = sc.nextDouble();
		
		System.out.println("Informe sua altura: ");
		double altura = sc.nextDouble();
		
		double imc = peso / (peso * altura);
		
		if (peso < 18.5) {
			System.out.println("Abaixo do peso");
		}else if (peso < 25) {
			System.out.println("Peso normal");
		}else if (peso < 30) {
			System.out.println("Sobrepeso");
		}else {
			System.out.println("Obesidade");
		}
	}
	
	static void exercicio20() {
		Scanner sc = new Scanner(System.in);
		
		String senhaCorreta = "12345";
		int tentativas = 0;
		boolean acesso = false;
		
		while (tentativas < 3) {
			System.out.println("Digite a senha: ");
			String senhaDigitada = sc.next();
			
			
			if (senhaDigitada.equals(senhaCorreta)) {
				System.out.println("Acesso permitido");
				acesso = true;
				break;
			}else {
				tentativas++;
				System.out.println("Senha incorreta. Ainda restam " + (3 - tentativas));
				
			}
		}
		if (!acesso) {
			System.out.println("Sistema bloqueado!");
		}
	}
}
