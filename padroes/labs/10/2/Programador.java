public class Programador implements Empregado{
	private int _ordenado;
	public Programador(int ordenado){
		_ordenado = ordenado;
	}
	public void trabalho(){
		System.out.println("DEIXEM O PROGRAMADOR PROGRAMARRRRRR");
	}
	public int ordenado(){
		return _ordenado;
	}
}