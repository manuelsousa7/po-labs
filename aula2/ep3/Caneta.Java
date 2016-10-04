class Caneta {
  private int _capacity; 
  private String _colour;
  
  Caneta(int value, String colour) {
    _capacity = value;
    _colour = colour;
  }

  public String getColour(){
    return _colour;
  }

  public int getCapacity(){
    return _capacity;
  }

  public void addCapacity(int newCapacity){
    _capacity += newCapacity;
  }

  public Boolean isEmpty(){
    return _capacity != 0;
  }

  public Boolean isEqual(Caneta pen){
    return _capacity == pen.getCapacity() && _colour.equals(pen.getColour());
  }

  public static void main(String[] args) {
    Caneta n1 = new Caneta(2, "asd");
    Caneta n2 = new Caneta(2, "asd");
    System.out.println(n1.isEqual(n2));
  }
}
