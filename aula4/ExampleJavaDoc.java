package nameclasspackage;
/**
 * Short class summary description.
 * Longer description. <p>
 * More description if needed.  <p>
 * Possible use of HTML paragraph breaks. <p>
 * Possible use on in-line tags {@link NameClass}  <p>
 * First block tag ends description section.
 *
 * @author Firstname Lastname
 * @version 1.0
 * @see <a href="http://docs.oracle.com/javase/7/docs/technotes/tools/windows/javadoc.html">javadocs documentation</a>
 * @see <a href="https://en.wikipedia.org/wiki/Javadoc">javadocs at Wikipedia</a>
 * @see <a href="http://docs.oracle.com/javase/tutorial/java/package/index.html">package documentation</a>
 */
public class NameClass {

	/**
	* Description of the instance variable here
	*/
	private int _a = 0;

	/**
	* Description of the instance variable here
	*/	
	private int _b = 0;
 
	/**
	 * Default constructor: false for all inputs.
	 */
	public NameClass() {
		// nothing to do
	}
 
	/**
	 * Overloaded constructor: Inputs receive same value.
	 * 
	 * @param v the input value.
	 * @see #NameClass() NameClass
	 */
	public NameClass(int v) {
		_a = _b = v;
	}
 
	/**
	 * Short method summary description.
	 * Longer description. 
	 *
	 * @param a variable description
	 * @param b variable description
	 * @return Description text
	 */
	public int methodName(int a, int b) {
		return  a + b;
	}
 
}
