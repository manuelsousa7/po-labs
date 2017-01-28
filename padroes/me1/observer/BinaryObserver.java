public class BinaryObserver extends Observer {

	public BinaryObserver(Subject subject) {
		_subject = subject;
		_subject.attach(this);
	}

	@Override
	public void update() {
		System.out.println( "Binary String: " + Integer.toBinaryString( _subject.getState() ) );
	}
}