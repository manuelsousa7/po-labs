public class ClienteVip extends Cliente
{
	private int _pontos;

	public void consultaCatalogo() {
		super.consultaCatalogo();
		System.out.println("Lista de promocoes");
	}

	public void compraProduto(double custo) {
		if (custo >= 10) {
			_pontos += 5;
		}
		_loja.registaVenda(custo - custo * 0.1);
	}
}