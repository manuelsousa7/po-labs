public class Test{
	public static void main(String [] args){
		Subject s  = new Subject();
		s.setState(6);
		System.out.println(s.getState());
		Observer m = new Multiplica2(s);
		Observer so = new Soma2(s);
		s.setState(2);
	}
}