public class Cliente
{
	private Loja _loja;
	private String _name;

	public Cliente (Loja loja, String name) {
		_loja = loja;
		_name = name;
	}

	public void consultaCatalogo() {
		System.out.println("Catalogo de vendas");
	}

	public void reclama() {
		_loja.registaReclamacao();
		System.out.println("Estou a reclamar");
	}

	public void compraProduto(double custo) {
		_loja.registaVenda(custo);
	}

	public String obtemNome() {
		return _name;
	}

	public Loja obtemLoja() {
		return _loja;
	}
}