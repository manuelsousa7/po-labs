package jogogalo.core.exceptions;

public class PosicaoOcupadaException extends JogadaInvalidaException {

	private String _mensagem;

	public PosicaoOcupadaException(String mensagem) {
		_mensagem = mensagem;
	}

	public final String obtemMensagem(){
		return _mensagem;
	}
}