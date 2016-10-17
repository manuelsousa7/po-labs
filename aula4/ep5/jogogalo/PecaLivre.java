package jogogalo;

/**
 * Classe que representa uma peca livre do jogo do galo.
 *
 * @author Manuel e Goncalo
 * @version 1.0
 */
public class PecaLivre extends Peca
{
	/**
     * Construtor da classe.
     * Atribui "" ao simbolo da peca e
     * "None" ao nome do jogador.
     */	public PecaLivre() {
		super(" ", "None");
	}

	/**
     * Devolve true se o jogador que jogou ambas as pecas for o mesmo.
     * 
     * @param peca2 A peca com a qual esta vai ser comparada.
     * @return boolean Retorna true se o valor da comparacao entre os.
     * nomes dos jogadores das duas pecas for verdadeiro, e false caso contrario.
     */
	public boolean samePlayerThan(Peca peca2) {
		return false;
	}

	/**
     * Devolve true se esta peca e livre.
     * 
     * @return boolean Retorna true se esta peca for da classe PecaLivre.
     */
	public boolean isFree() {
		return true;
	}
}