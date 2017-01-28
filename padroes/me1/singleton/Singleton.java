public class Singleton {
	private static Singleton instancia = new Singleton();
	private static Integer asd;
	private Singleton() {}

	public void doStuff(String nome) {
		System.out.println("OLA CARO " + nome);
	}
	public static Singleton getInstance() {
		return instancia;
	}
	public void setN(Integer number){
		asd = number;
	}
	public void printN(){
		System.out.println(asd);
	}
}