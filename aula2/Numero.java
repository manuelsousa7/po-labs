class Numero {
	private int _value; 

	public int getValue() {
		return _value;
	}
  	public void changeValue(int newValue) {
    	_value = newValue;
  	}
  	public Boolean isEqual(Numero number) {
    	return getValue() == number.getValue();
  	}
  	public String getValueString() {
    	return "" + getValue();
  	}
	public static void main(String[] args) {
    	Numero n1 = new Numero();
    	Numero n2 = new Numero();
    	n2.changeValue(5);
    	System.out.println("getValue: " + n1.getValue());
    	n1.changeValue(5);
    	System.out.println("isEqual: " + n1.isEqual(n2));
  	}
}