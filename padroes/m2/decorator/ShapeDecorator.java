public abstract class ShapeDecorator implements Shape {
	protected Shape _shape;
	public ShapeDecorator(Shape shape) {
		_shape = shape;
	}
	public void desenhar() {
		_shape.desenhar();
	}

}