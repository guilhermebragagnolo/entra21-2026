public class Tabuleiro {
    private char[][] casas;
    public Tabuleiro() {
        casas = new char[3][3];
        inicializarTabuleiro();
    }
    public void inicializarTabuleiro() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                casas[i][j] = ' ';
            }
        }
    }
    public void mostrarTabuleiro() {
        for (int i = 0; i < 3; i++) {
            System.out.println(casas[i][0] + " | " + casas [i][1] + " | " + casas[i][2]);
            if (i < 2) {
                System.out.println("---------");
            }
        }
    }
    public void marcarJogada(int linha, int coluna, char simbolo) {
        casas[linha][coluna] = simbolo;
    }
    public boolean jogadaValida(int linha, int coluna) {
        // retorna true se puder jogar
        if (linha >= 0 && linha < 3 && coluna >= 0 && coluna < 3) {
            return casas[linha][coluna] == ' ';
        }
        return false;
    }
    public boolean verificarVitoria(char simbolo) {
        for (int i = 0; i < 3; i++) {
            if (casas[i][0] == simbolo && casas[i][1] == simbolo && casas[i][2] == simbolo) {
                return true;
            }
        }
        for (int j = 0; j < 3; j++) {
            if (casas[0][j] == simbolo && casas[1][j] == simbolo && casas[2][j] == simbolo) {
                return true;
            }
        }
        if (casas[0][0] == simbolo && casas[1][1] == simbolo && casas[2][2] == simbolo) {
            return true;
        }
        if (casas[0][2] == simbolo && casas[1][1] == simbolo && casas[2][0] == simbolo) {
            return true;
        }
        return false;
    }
    public boolean tabuleiroCheio() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (casas[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }
}