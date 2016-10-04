class AndGate {
  private Boolean _entrada1; 
  private Boolean _entrada2;
  
  public AndGate(Boolean entrada1,Boolean entrada2){
    _entrada1 = entrada1;
    _entrada2 = entrada2;
  }

  public void AndGate(){
    //_entrada1 = _entrada2 = false; NOT NECESSARY
  }

  public Boolean getEntrada1(){
    return _entrada1;
  }
  public Boolean getEntrada2(){
    return _entrada2;
  }

  public void changeEntrada2(Boolean novaEntrada){
    _entrada2 = novaEntrada;
  }

  public void changeEntrada1(Boolean novaEntrada){
    _entrada1 = novaEntrada;
  }

  public Boolean getOutput(){
    return _entrada1 && _entrada2;
  }

  public static void main(String[] args) {
    AndGate and = new AndGate(false, true);
    System.out.println(and.getEntrada2());
  }
}
