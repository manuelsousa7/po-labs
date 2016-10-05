public class Ponto {

  private int _x;
  private int _y;

  public Ponto(int x, int y) {
    _x = x;
    _y = y;
  }

  public Ponto() {
  
  }

  public int getX() {
    return _x;
  }

  public int getY() {
    return _y;
  }

  public void setX(int x) {
    _x = x;
  }

  public void setY(int y) {
    _y = y;
  }
  
  public static void main(String[] args) {
    Ponto p = new Ponto();
    p.setX(5);
    p.setY(4);
    System.out.println(p.getX() + " : " + p.getY());
  }
}

