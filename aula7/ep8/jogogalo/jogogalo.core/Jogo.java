package jogogalo.core;

/**
 * Ficheiro que contem o jogo do galo ({@link Jogo}).
 * Contem todas as funcoes relativas ao jogo e e onde se inicia o tabuleiro e suas jogadas.<p>
 *
 * @author Manuel e Goncalo
 * @version 1.0
 * @see <a href="http://docs.oracle.com/javase/7/docs/technotes/tools/windows/javadoc.html">javadocs documentation</a>
 * @see <a href="https://en.wikipedia.org/wiki/Javadoc">javadocs at Wikipedia</a>
 * @see <a href="http://docs.oracle.com/javase/tutorial/java/package/index.html">package documentation</a>
 */

public class Jogo {

    /**
    * Matriz bidimensional que representara o tabuleiro de jogo 
    */
    private Peca[][] _tabuleiro;

    /**
     * Contrutor Default: Inicia matriz bidimensional que representara o tabuleiro
     * 
     * @param tamanho Tamanho do tabuleiro que dá as Linhas e Colunas
     */
    public Jogo(int tamanho) {
        _tabuleiro = new Peca[tamanho][tamanho];
        Peca peca = new PecaLivre();

        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                _tabuleiro[i][j] = peca;
            }
        }
    }

    /**
     * Vai jogar uma peca se houver jogadas livres
     *
     * @param peca Peca a jogar
     * @param linha Linha da Peca
     * @param coluna Coluna da Peca
     * @return Retorna true se jogou a peca. Retorna false se não jogou
     */
    public boolean joga(Peca peca, int linha, int coluna) {
        if(temJogadasDisponiveis() && linha - 1 < _tabuleiro.length && coluna - 1 < _tabuleiro.length){
            _tabuleiro[linha - 1][coluna - 1] = peca;
            return true;
        } else {
            return false;
        }

    }

    /**
     * Verifica se ha jogadas livres (por jogar/posicoes vazias) no tabuleiro
     *
     * @return Retorna true se ha jogadas disponiveis. false se não ha
     */
    public boolean temJogadasDisponiveis() {
        Peca peca = new PecaLivre();
        for (int i = 0; i < _tabuleiro.length; i++) {
            for (int ii = 0; ii < _tabuleiro.length; ii++) {
                if(_tabuleiro[i][ii].getPiece() == peca.getPiece())
                    return true;
            }
        }
        return false;
    }

    /**
     * Verifica se com uma Peca jogada e possivel ganhar o jogo ou nao
     *
     * @param linha Linha da Peca jogada
     * @param coluna Coluna da Peca jogada
     * @return Retorna true ganhou o jogo. Retorna false se não ganhou
     */
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
    
    /**
     * Gera separadores entre as linhas com as jogadas, conforme as medidas do tabuleiro
     *
     * @return Retorna separador das linhas com jogadas
     */
    private String criaSeparadorLinha() {
        StringBuilder separador = new StringBuilder();

        for (int i = 0; i < _tabuleiro[0].length - 1; i++)
            separador.append("-+");

        separador.append("-\n");

        return separador.toString();
    }

    /**
     * Coloca caracteres entre cada jogada de uma linha
     *
     * @param linha Linha do tabuleiro com jogadas
     * @return Retorna uma string das jogadas divididas com caracteres
     */
    private String processaLinha(Peca[] linha) {
        StringBuilder res = new StringBuilder();
        int i;

        for(i = 0; i < linha.length - 1; i++) {
            res.append(linha[i].getPiece()).append("|");
        }

        res.append(linha[i].getPiece()).append("\n");
        return res.toString();
    }

    /**
     * Gera todo o tabuleiro visualmente
     *
     * @return Retorna uma string com o tabuleiro impresso
     */
    public String obtemEstadoJogo() {
        StringBuilder str = new StringBuilder();
        String separador = criaSeparadorLinha();
        int i;

        for (i = 0; i < _tabuleiro.length - 1; i++) {
            str.append(processaLinha(_tabuleiro[i]));
            str.append(separador);
        }

        str.append(processaLinha(_tabuleiro[i]));
        return str.toString();
    }
}