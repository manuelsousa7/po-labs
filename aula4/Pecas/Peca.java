package Pecas;

/**
 * Usada para representar uma peça de um jogo do galo
 * @author Gonçalo Marques
 */
abstract class Peca
{

	private String _piece;
	private String _name;

	/**
	* Construtor da classe
	* @param newPiece O simbolo desta peca
	* @param newName O nome do jogador que criou esta peca
	* @return Nada
	*/
	public Peca(String newPiece, String newName) {
		_piece = newPiece;
		_name = newName;
	}

	/**
	* Usado para saber o simbolo desta peca
	* @param Nenhum
	* @return String - Devolve o simbolo da peca
	*/
	public String getPiece() {
		return _piece;
	}

	/**
	* Usado para saber o nome do jogador desta peca
	* @param Nenhum
	* @return Devolve o nome do jogador que criou esta peca
	*/
	public String GetName() {
		return _name;
	}

	/**
	* Usado para saber se esta peca e a recebida foram criadas pelo mesmo jogador
	* @param peca2 Peca a comparar com a peca atual
	* @return boolean - Se as pecas foram criadas pelo mesmo jogador
	*/
	public boolean samePlayerThan(Peca peca2) {
		return _name.equals(peca2.GetName());
	}

	/**
	* Usado para saber se esta peca e livre
	* @param Nenhum
	* @return boolean - Se esta peca e livre
	*/
	public boolean isFree() {
		return false;
	}

}