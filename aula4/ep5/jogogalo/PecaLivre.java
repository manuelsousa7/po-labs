package jogogalo;

/**
 * Classe que representa uma peca livre do jogo do galo.
 *
 * @author Manuel e Goncalo
 * @version 1.0
 * @see <a href="http://docs.oracle.com/javase/7/docs/technotes/tools/windows/javadoc.html">javadocs documentation</a>
 * @see <a href="https://en.wikipedia.org/wiki/Javadoc">javadocs at Wikipedia</a>
 * @see <a href="http://docs.oracle.com/javase/tutorial/java/package/index.html">package documentation</a>
 */
public class PecaLivre extends Peca
{
	/**
     * Construtor da classe.
     */
	public PecaLivre() {
		super(" ", "None");
	}

	/**
     * Devolve true se o jogador que jogou ambas as pecas for o mesmo.
     * 
     * @param peca2 A peca com a qual esta vai ser comparada
     * @return boolean Retorna true se o valor da comparacao entre os
     * nomes dos jogadores das duas pecas for verdadeiro, e false caso contrario
     */
	public boolean samePlayerThan(Peca peca2) {
		return false;
	}

	/**
     * Devolve true se esta peca e livre.
     * 
     * @param peca2 A peca com a qual esta vai ser comparada
     * @return boolean Retorna true se esta peca for da classe PecaLivre
     */
	public boolean isFree() {
		return true;
	}
}