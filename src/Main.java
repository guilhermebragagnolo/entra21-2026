import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nome do jogador 1: ");
        String nome1 = sc.nextLine();
        System.out.println("Nome do jogador 2: ");
        String nome2 = sc.nextLine();

        Jogador jogador1 = new Jogador(nome1, 'X');
        Jogador jogador2 = new Jogador(nome2, 'O');
        Jogador jogadorAtual = jogador1;

        Tabuleiro tabuleiro = new Tabuleiro();

        while (true) {
            tabuleiro.mostrarTabuleiro();

            System.out.println("Vez de " + jogadorAtual.getNome());
            System.out.println("Digite a linha (1 a 3): ");
            int linha = sc.nextInt();

            System.out.println("Digite a coluna (1 a 3): ");
            int coluna = sc.nextInt();

            linha = linha - 1;
            coluna = coluna - 1;

            if (tabuleiro.jogadaValida(linha, coluna)) {
                tabuleiro.marcarJogada(linha, coluna, jogadorAtual.getSimbolo());
                if (tabuleiro.verificarVitoria(jogadorAtual.getSimbolo())) {
                    tabuleiro.mostrarTabuleiro();
                    System.out.println("Jogador " + jogadorAtual.getNome() + " venceu!");
                    break;
                }
                if (tabuleiro.tabuleiroCheio()) {
                    tabuleiro.mostrarTabuleiro();
                    System.out.println("Empate!");
                    break;
                }

                if (jogadorAtual == jogador1) {
                    jogadorAtual = jogador2;
                } else {
                    jogadorAtual = jogador1;
                }
            } else {
                System.out.println("Jogada invalida!");
            }
        }
    }
}