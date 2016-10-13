package jogogalo;

public class PecaLivre extends Peca
{
	PecaLivre() {
		super(" ", "None");
	}

	public boolean samePlayerThan(Peca peca2) {
		return false;
	}

	public boolean isFree() {
		return true;
	}
}