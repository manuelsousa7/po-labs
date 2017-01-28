public class OctalObserver extends Observer {

	public OctalObserver(Subject subject) {
		_subject = subject;
		_subject.attach(this);
	}

	@Override
	public void update() {
		System.out.println( "Octal String: " + Integer.toOctalString( _subject.getState() ) );
	}
}