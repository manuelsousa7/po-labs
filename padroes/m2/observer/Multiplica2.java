public class Multiplica2 extends Observer{
	public Multiplica2(Subject s){
		_subject = s;
		s.add(this);
	}
	@Override
	public void update(){
		System.out.println("Multiplica2 " + _subject.getState() * 2);
	}
}