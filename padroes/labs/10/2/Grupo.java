import java.util.*;

public class Grupo implements Empregado {
	List<Empregado> _grupos;
	public Grupo() {
		_grupos = new ArrayList<Empregado>();
	}
	public void add(Empregado e) {
		_grupos.add(e);
	}
	public void remove(Empregado e) {
		_grupos.remove(e);
	}
	public int ordenado() {
		int totalCost = 0;
		for (Empregado e : _grupos) {
			totalCost += e.ordenado();
		}
		return totalCost;
	}
	public void trabalho() {
		for (Empregado e : _grupos) {
			e.trabalho();
		}
	}
}