class TrenaryAndGate {
  private Boolean _entrada1; 
  private Boolean _entrada2;
  private Boolean _entrada3;
  private AndGate and1 = new AndGate(_entrada1,_entrada2);
  private Boolean asdd = and1.getEntrada1();
  private AndGate and2 = new AndGate(true,_entrada3);

  public TrenaryAndGate(Boolean entrada1,Boolean entrada2,Boolean entrada3){
    _entrada1 = entrada1;
    _entrada2 = entrada2;
    _entrada3 = entrada3;
  }

  public void TrenaryAndGate(){
    //_entrada1 = _entrada2 = _entrada3 = false; NOT NECESSARY
  }

  public Boolean getEntrada1(){
    return _entrada1;
  }

  public Boolean getEntrada2(){
    return _entrada2;
  }

  public Boolean getEntrada3(){
    return _entrada3;
  }

  public void changeEntrada1(Boolean novaEntrada){
    _entrada1 = novaEntrada;
    and1.changeEntrada1(novaEntrada);
  }

  public void changeEntrada2(Boolean novaEntrada){
    _entrada2 = novaEntrada;
    and1.changeEntrada2(novaEntrada);
  }

  public void changeEntrada3(Boolean novaEntrada){
    _entrada3 = novaEntrada;
    and2.changeEntrada2(novaEntrada);
  }

  public Boolean getOutput(){
    return and2.getOutput();
  }

  public static void main(String[] args) {
    TrenaryAndGate and = new TrenaryAndGate(true,true,true);
    System.out.println(and.getOutput());
  }
}
