public class ProgramadorPerito implements Empregado{
	private int _ordenado;
	public ProgramadorPerito(int ordenado){
		_ordenado = ordenado;
	}
	public void trabalho(){
		System.out.println("DEIXEM O PROGRAMADOR PERITO XPTO PROGRAMARRRRRR");
	}
	public int ordenado(){
		return _ordenado;
	}
}