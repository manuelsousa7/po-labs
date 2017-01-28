public class Context implements Strategy{
	private Strategy _s;
	public Context(Strategy s){
		_s = s;
	}
	public int doOperation(int a,int b){
		return _s.doOperation(a,b);
	}
}