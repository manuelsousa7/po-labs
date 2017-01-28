public class Test {
	public static void main(String [] args) {
		TextItem ts = new TextSpan("manuel");
		ts = new BoldDecorator(ts);
		ts = new ItalicDecorator(ts);
		System.out.println(ts.render());
	}
}