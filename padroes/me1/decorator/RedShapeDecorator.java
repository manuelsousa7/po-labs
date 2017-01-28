public class RedShapeDecorator extends ShapeDecorator{
	public RedShapeDecorator(Shape shape){
		super(shape);
	}
	@Override
	public void draw(){
		_shape.draw();
		setRedBorder(_shape);
	}
	public void setRedBorder(Shape shape){
		System.out.println("Making red border");
	}
}