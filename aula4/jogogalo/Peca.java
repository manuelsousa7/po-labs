package jogogalo;

/**
 * Short class summary description.
 * Longer description. <p>
 * More description if needed.  <p>
 * Possible use of HTML paragraph breaks. <p>
 * Possible use on in-line tags {@link Peca}  <p>
 * First block tag ends description section.
 *
 * @author Manuel e Goncalo
 * @version 1.0
 * @see <a href="http://docs.oracle.com/javase/7/docs/technotes/tools/windows/javadoc.html">javadocs documentation</a>
 * @see <a href="https://en.wikipedia.org/wiki/Javadoc">javadocs at Wikipedia</a>
 * @see <a href="http://docs.oracle.com/javase/tutorial/java/package/index.html">package documentation</a>
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