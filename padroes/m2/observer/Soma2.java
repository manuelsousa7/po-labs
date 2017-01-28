public class Soma2 extends Observer{
	public Soma2(Subject s){
		_subject = s;
		s.add(this);
	}
	@Override
	public void update(){
		System.out.println("Soma2 " + (_subject.getState() + 2));
	}
}