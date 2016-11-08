package jogogalo.core.exceptions;

public class JogoGaloInvalidoException extends Exception {

  private String _mensagem;

  public JogoGaloInvalidoException(String mensagem) {
    _mensagem = mensagem;
  }

  public final String obtemMensagem() {
    return _mensagem;
  }
}