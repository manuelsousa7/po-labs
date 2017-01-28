public class GreenShapeDecorator extends ShapeDecorator{
	public GreenShapeDecorator(Shape shape){
		super(shape);
	}
	public void desenhar(){
		_shape.desenhar();
		this.makeGreen();
	}
	public void makeGreen(){
		System.out.println("Making Green");
	}
}