public class Test{
	public static void main(String [] args){
		Context c = new Context(new OperationMultiply());
		System.out.println(c.doOperation(1,2));
		c = new Context(new OperationAdd());
		System.out.println(c.doOperation(1,2));
	}
}