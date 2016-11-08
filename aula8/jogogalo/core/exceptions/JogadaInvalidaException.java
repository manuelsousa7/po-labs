package jogogalo.core.exceptions;

public class JogadaInvalidaException extends Exception {

	private String _mensagem;

	public JogadaInvalidaException(String mensagem) {
		mensagem = mensagem;
	}

	public final String obtemMensagem(){
		return _mensagem;
	}
}