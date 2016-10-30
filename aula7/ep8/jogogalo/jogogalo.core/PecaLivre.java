package jogogalo.core;

/**
 * Usada para representar uma peca livre
 * @author Gonçalo Marques
 */
public class PecaLivre extends Peca
{
	/**
	* Construtor da peca livre
	*/
	PecaLivre() {
		super("", "None");
	}

	/**
	* @param peca2 Peca a comparar com a peca atual
	* @return boolean - Se as pecas foram criadas pelo mesmo jogador
	*/
	public boolean samePlayerThan(Peca peca2) {
		return false;
	}

	/**
	* @param Nenhum
	* @return boolean - Se esta peca e livre
	*/
	public boolean isFree() {
		return true;
	}
}