package jogogalo;

/**
 * Short class summary description.
 * Longer description. <p>
 * More description if needed.  <p>
 * Possible use of HTML paragraph breaks. <p>
 * Possible use on in-line tags {@link JogoGalo}  <p>
 * First block tag ends description section.
 *
 * @author Manuel Goncalo
 * @version 1.0
 * @see <a href="http://docs.oracle.com/javase/7/docs/technotes/tools/windows/javadoc.html">javadocs documentation</a>
 * @see <a href="https://en.wikipedia.org/wiki/Javadoc">javadocs at Wikipedia</a>
 * @see <a href="http://docs.oracle.com/javase/tutorial/java/package/index.html">package documentation</a>
 */

public class JogoGalo {

    /**
    * Description of the instance variable here
    */
    private Peca[][] _tabuleiro;

    /**
     * Default constructor: false for all inputs.
     */

    /**
     * Overloaded constructor: Inputs receive same value.
     * 
     * @param v the input value.
     * @see #NameClass() NameClass
     */
    public JogoGalo(int tamanho) {
        _tabuleiro = new Peca[tamanho][tamanho];
        Peca peca = new PecaLivre();

        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                _tabuleiro[i][j] = peca;
            }
        }
    }

    /**
     * Short method summary description.
     * Longer description. 
     *
     * @param a variable description
     * @param b variable description
     * @return Description text
     */
    public boolean joga(Peca peca, int linha, int coluna) {
        if(temJogadasDisponiveis() && linha - 1 < _tabuleiro.length && coluna - 1 < _tabuleiro.length){
            _tabuleiro[linha - 1][coluna - 1] = peca;
            return true;
        } else {
            return false;
        }

    }

    public boolean temJogadasDisponiveis() {
        for (int i = 0; i < _tabuleiro.length; i++) {
            for (int ii = 0; ii < _tabuleiro.length; ii++) {
                if(_tabuleiro[i][ii].getPiece() == " ")
                    return true;
            }
        }
        return false;
    }

    public boolean ganhou(int linha, int coluna) {
        Peca jogada = _tabuleiro[--linha][--coluna];
        boolean resultado = true;
        int i;

        // verifica linha
        for (i = 0; i < _tabuleiro[linha].length; i++) {
            if (!_tabuleiro[linha][i].samePlayerThan(jogada)) {
                resultado = false;
                break;
            }
        }

        if (resultado)
            return true;

        resultado = true;
        // verifica coluna
        for (i = 0; i < _tabuleiro.length; i++) {
            if (!_tabuleiro[i][coluna].samePlayerThan(jogada)) {
                resultado = false;
                break;
            }
        }

        if (resultado)
            return true;

        // verifica diagonais.. Só é necessário se a peça estiver numa diagonal.
        if (linha == coluna) {             // verifica diagonal principal
            resultado = true;
            for (i = 0; i < _tabuleiro.length; i++) {
                if (!_tabuleiro[i][i].samePlayerThan(jogada)) {
                    resultado = false;
                    break;
                }
            }

            if (resultado)
                return true;
        }
        
        if (linha + coluna == _tabuleiro.length - 1) {             // verifica diagonal inversa
            resultado = true;
            int j;
            for (i = 0, j = _tabuleiro.length - 1; i < _tabuleiro.length; i++, j--) {
                if (!_tabuleiro[i][j].samePlayerThan(jogada)) {
                    resultado = false;
                    break;
                }
            }

            if (resultado)
                return true;
        }
        
        return false;
    }

    private String criaSeparadorLinha() {
        StringBuilder separador = new StringBuilder();

        for (int i = 0; i < _tabuleiro[0].length - 1; i++)
            separador.append("-+");

        separador.append("-\n");

        return separador.toString();
    }

    public String obtemEstadoJogo() {
        int dim = _tabuleiro.length;
        StringBuilder str = new StringBuilder();
        for(int i = 0; i < dim; i++){
            for(int ii = 0; ii < dim; ii++){
                str.append(_tabuleiro[i][ii].getPiece() + ((ii+1) != dim ? "|" : "\n"));
            }
            str.append((i+1) != dim ? "-+-+-\n" : "");
        }
        return str.toString();
    }

    public static void main(String[] args) {
        JogoGalo jogo = new JogoGalo(3);
        Peca p1 = new PecaJogador1();
        Peca p2 = new PecaJogador2();

        System.out.println("Estado Inicial\n" + jogo.obtemEstadoJogo());
        jogo.joga(p1, 1, 1);
        jogo.joga(p2, 1, 2);
        System.out.println("Após duas jogadas\n" + jogo.obtemEstadoJogo());
        
        System.out.println("P1 ganhou " + jogo.ganhou(1, 1));
        System.out.println("P2 ganhou " + jogo.ganhou(1, 2));

        jogo.joga(p1, 2, 2);
        jogo.joga(p2, 2, 3);
        System.out.println("Após 4  jogadas\n" + jogo.obtemEstadoJogo());
        System.out.println("P1 ganhou " + jogo.ganhou(2, 2));
        System.out.println("P2 ganhou " + jogo.ganhou(2, 3));

        jogo.joga(p1, 3, 1);
        jogo.joga(p2, 2, 1);
        System.out.println("Após 6  jogadas\n" + jogo.obtemEstadoJogo());
        System.out.println("P1 ganhou " + jogo.ganhou(3, 1));
        System.out.println("P2 ganhou " + jogo.ganhou(2, 1));

        jogo.joga(p1, 3, 3);
        System.out.println("Após 7  jogadas\n" + jogo.obtemEstadoJogo());
        System.out.println("P1 ganhou: " + jogo.ganhou(3, 3));
    }
}