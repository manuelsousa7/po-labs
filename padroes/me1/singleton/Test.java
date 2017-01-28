public class Test{
	public static void main(String [] args){
		System.out.println("LALALAL");
		Singleton asd = Singleton.getInstance();
		asd.doStuff("asd");
		asd.setN(19);
		asd.printN();
		Singleton asdd = Singleton.getInstance();
		asdd.printN();
	}
}