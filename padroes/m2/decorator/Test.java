public class Test{
	public static void main(String [] args){
		Shape quadrado = new Square();
		Shape retangulo = new Rectangle();
		ShapeDecorator green = new GreenShapeDecorator(quadrado);
		green.desenhar();
		retangulo.desenhar();
	}
}