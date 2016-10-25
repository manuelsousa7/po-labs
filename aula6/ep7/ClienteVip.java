public class ClienteVip extends Cliente
{
	private int _pontos;

	public ClienteVip (Loja loja, String name) {
		super(loja, name);
		_pontos = 0;
	}

	public void consultaCatalogo() {
		super.consultaCatalogo();
		System.out.println("Lista de promocoes");
	}

	public void compraProduto(double custo) {
		if (custo >= 10) {
			_pontos += 5;
		}
		Loja store = obtemLoja();
		store.registaVenda(custo - custo * 0.1);
	}
}