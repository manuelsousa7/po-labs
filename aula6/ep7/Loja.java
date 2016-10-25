package loja;

public class Loja {
	private int _numeroVendas;
	private float _volumeVendas;
	private int _numeroReclamacoes;

	public void add(JogoGalo jogo) {
        _jogos.add(jogo);
    }

    public Loja() {
        _numeroVendas = _volumeVendas = _numeroReclamacoes = 0;
    }

    public int obtemNumeroVendas(){
    	return _numeroVendas;
    }

    public int obtemVolumeVendas(){
    	return _volumeVendas;
    }

    public int obtemNumeroReclamacoes(){
    	return _numeroReclamacoes;
    }

    public void registaVenda(float valor){
    	_numeroVendas++;
    	_volumeVendas += valor;
    }

    public void registaReclamacao(){
    	_numeroReclamacoes++;
    }

    public static void main(String[] args) {
        Loja shop = new Loja();
        Cliente[] a = new Cliente[20];
        for(int i=0;i<20;i++){

        }
    }

}

