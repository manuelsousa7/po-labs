package jogogalo;

/**
 * Usada para representar uma peça de um jogo do galo
 * @author Gonçalo Marques
 * @version 0.1
 */
abstract class Peca
{
	private String _piece;
	private String _name;

	public Peca(String newPiece, String newName) {
		_piece = newPiece;
		_name = newName;
	}

	public String getPiece() {
		return _piece;
	}

	public String GetName() {
		return _name;
	}

	public boolean samePlayerThan(Peca peca2) {
		return _name.equals(peca2.GetName());
	}

	public boolean isFree() {
		return false;
	}

}