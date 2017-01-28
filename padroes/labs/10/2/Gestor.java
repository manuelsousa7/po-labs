public class Gestor implements Empregado{
	private int _ordenado;
	public Gestor(int ordenado){
		_ordenado = ordenado;
	}
	public void trabalho(){
		System.out.println("DEIXEM O GESTOR brincar");
	}
	public int ordenado(){
		return _ordenado;
	}
}