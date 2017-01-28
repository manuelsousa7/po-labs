public class Test{
	public static void main(String [] args){
		ShapeFactory asd = new ShapeFactory();
		Shape asdd = asd.getShape("Circle");
		asdd.draw();
	}
}