public abstract class AbstractFactory{
	abstract Shape getShape(String color);
	abstract Color getColor(String shape);
}