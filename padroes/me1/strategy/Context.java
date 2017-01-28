public class Context {
	Stratergy s;
	public Context(Stratergy stratergy) {
		s = stratergy;
	}
	public int executeStrategy(int n1,int n2){
		return s.doOperation(n1,n2);
	}
}