package jogogalo.core;

/**
 * Classe que representa uma peca generica do jogo do galo.
 *
 * @author Manuel e Goncalo
 * @version 1.0
 */
abstract class Peca
{
	/**
	 * Cadeia de caracteres que representa o simbolo da peca.
	 */
	private String _piece;
	/**
	 * Cadeia de caracteres que representa o nome do jogador.
	 */
	private String _name;

	/**
     * Construtor da classe.
     * 
     * @param newPiece O simbolo que representa esta peca.
     * @param newName O nome do jogador que jogou esta peca.
     */
	public Peca(String newPiece, String newName) {
		_piece = newPiece;
		_name = newName;
	}

	/**
     * Devolve o simbolo que representa esta peca.
     * 
     * @return String Retorna uma cadeia de caracteres que representa
     * o simbolo desta peca.
     */
	public String getPiece() {
		return _piece;
	}

	/**
     * Devolve o nome do jogador que jogou esta peca.
     * 
     * @return String Retorna uma cadeia de caracteres que representa
     * o nome do jogador que jogou desta peca.
     */
	public String devolveJogador() {
		return _name;
	}

	/**
     * Devolve true se o jogador que jogou ambas as pecas for o mesmo.
     * 
     * @param peca2 A peca com a qual esta vai ser comparada.
     * @return boolean Retorna true se o valor da comparacao entre os
     * nomes dos jogadores das duas pecas for verdadeiro, e false caso contrario.
     */
	public boolean samePlayerThan(Peca peca2) {
		return _name.equals(peca2.GetName());
	}

	/**
     * Devolve true se esta peca e livre.
     * 
     * @return boolean Retorna true se esta peca for da classe PecaLivre.
     */
	public boolean isFree() {
		return false;
	}

}