public class Loja {
	private int _numeroVendas;
	private double _volumeVendas;
	private int _numeroReclamacoes;

    public Loja() {
        _numeroVendas = _numeroReclamacoes = 0;
        _volumeVendas = 0;
    }

    public int obtemNumeroVendas(){
    	return _numeroVendas;
    }

    public double obtemVolumeVendas(){
    	return _volumeVendas;
    }

    public int obtemNumeroReclamacoes(){
    	return _numeroReclamacoes;
    }

    public void registaVenda(double valor){
    	_numeroVendas++;
    	_volumeVendas += valor;
    }

    public void registaReclamacao(){
    	_numeroReclamacoes++;
    }

    public static void main(String[] args) {
        Loja shop = new Loja();
        Cliente[] clienteNormais = new Cliente[22];
        int n=28%22;
        for(int i=0;i<22;i++){
        	n=(28+i)%22;
        	if(i<=6){
        		clienteNormais[i] = new Cliente(shop,"XPTO"+ ("" + n));
        	} else {
        		clienteNormais[i] = new ClienteVip(shop,"XPTO"+("" + n));
        	}
        }
        for(int i = 0;i < 22;i++){
        	System.out.println(clienteNormais[i].obtemNome());
        	clienteNormais[i].consultaCatalogo();
        	clienteNormais[i].compraProduto(15.0);
        }

    }

}

